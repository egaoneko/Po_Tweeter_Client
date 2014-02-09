/*
 * ���α׷� �̸� : Po Tweeter
 * ���� : Version 0.9
 * ���ϸ� : Login.java
 * ���� : �α��� (mySql)
 * ���� ���� ��¥ : 14.02.09
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Login {
	public static int loginCheck(String c_id, String c_pw) {
		
		Connection conn;
		final int OVERLAPLOGIN=0; //�ߺ� �α��� �� ���
		final int WRONGPASSWORD=1; //�߸��� ��й�ȣ�� ���
		final int SUCCESSLOGIN=2; //�������� �α��� ���
		final int NONEXISTENCEID=3; //���̵� �������� ���� ���
		int logCheck=OVERLAPLOGIN;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://"+Main.DBIP+":3306/po_tweeter","POMA","9353");
			
			String sql="select log from member where id=?"; //����ǥ���� �������� ��ȭ�ϴ� ���� �ֱ� ����
            java.sql.PreparedStatement pstmt=conn.prepareStatement(sql); //�� �˻��� ��ȭ�ϴ� ���� �˻��ϱ� ���� PreparedStatement Ŭ����
            pstmt.setString(1, c_id); 
            java.sql.ResultSet result=pstmt.executeQuery();
            String logCh = null;
            
            while(result.next()){
            	logCh=result.getString("log"); //�α��� üũ ���� Ȯ��  //�� �ߺ� �α��� �˻�
            }
            if(logCh==null){
            	logCheck=NONEXISTENCEID;
            	return logCheck;
            }
        
            if(logCh.equals("logout")){
	            sql="select * from member where id=? and pw=?"; //����ǥ���� �������� ��ȭ�ϴ� ���� �ֱ� ����
	            pstmt=conn.prepareStatement(sql); //�� �˻��� ��ȭ�ϴ� ���� �˻��ϱ� ���� PreparedStatement Ŭ����
	            pstmt.setString(1,c_id); //�������� ��ȭ�ϴ� ���� ����  ���� �����ϴ� ���� �����̸� setInt(index,����) �̷� ������ �ϸ��.
	            pstmt.setString(2, c_pw);
	            result=pstmt.executeQuery();
            
	            String data;
	        
				while (result.next()) {
					data = result.getString("id");
		
					if (data.equals(c_id)){ // ID�� �˻��� ID�� �����Ҷ�
						logCheck = SUCCESSLOGIN;
						break;
					}
				}
				// �α��ν� �α���üũ�� ������Ʈ ��Ŵ.
				if (logCheck == SUCCESSLOGIN) {
					sql = "update member set log='login' where id=?;";
					pstmt = conn.prepareStatement(sql); // �� �˻��� ��ȭ�ϴ� ���� �˻��ϱ� ���� PreparedStatement Ŭ����
					pstmt.setString(1, c_id); // �������� ��ȭ�ϴ� ���� ���� ���� �����ϴ� ���� �����̸� setInt(index,����) �̷� ������ �ϸ��.
					pstmt.executeUpdate();
				} else {
					logCheck = WRONGPASSWORD; // ��й�ȣ�� �߸� �Է��� ���.
				}
				conn.close(); //���� ����
            }
		} catch (SQLException e) {
			System.out.println("DB Access Error!!"+e);
		} catch (ClassNotFoundException e) {
			// TODO �ڵ� ������ catch ���
			System.out.println("Driver Load Error!!"+e);
		}
		return logCheck;
	}
}
