/*
 * 프로그램 이름 : Po Tweeter
 * 버전 : Version 0.9
 * 파일명 : Login.java
 * 설명 : 로그인 (mySql)
 * 최종 수정 날짜 : 14.02.09
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Login {
	public static int loginCheck(String c_id, String c_pw) {
		
		Connection conn;
		final int OVERLAPLOGIN=0; //중복 로그인 될 경우
		final int WRONGPASSWORD=1; //잘못된 비밀번호일 경우
		final int SUCCESSLOGIN=2; //성공적인 로그인 경우
		final int NONEXISTENCEID=3; //아이디가 존재하지 않을 경우
		int logCheck=OVERLAPLOGIN;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://"+Main.DBIP+":3306/po_tweeter","POMA","9353");
			
			String sql="select log from member where id=?"; //물음표에는 동적으로 변화하는 값을 넣기 위함
            java.sql.PreparedStatement pstmt=conn.prepareStatement(sql); //매 검색시 변화하는 값을 검색하기 위한 PreparedStatement 클래스
            pstmt.setString(1, c_id); 
            java.sql.ResultSet result=pstmt.executeQuery();
            String logCh = null;
            
            while(result.next()){
            	logCh=result.getString("log"); //로그인 체크 여부 확인  //즉 중복 로그인 검사
            }
            if(logCh==null){
            	logCheck=NONEXISTENCEID;
            	return logCheck;
            }
        
            if(logCh.equals("logout")){
	            sql="select * from member where id=? and pw=?"; //물음표에는 동적으로 변화하는 값을 넣기 위함
	            pstmt=conn.prepareStatement(sql); //매 검색시 변화하는 값을 검색하기 위한 PreparedStatement 클래스
	            pstmt.setString(1,c_id); //동적으로 변화하는 값을 전달  만약 전달하는 값이 정수이면 setInt(index,정수) 이런 식으로 하면됨.
	            pstmt.setString(2, c_pw);
	            result=pstmt.executeQuery();
            
	            String data;
	        
				while (result.next()) {
					data = result.getString("id");
		
					if (data.equals(c_id)){ // ID와 검색한 ID가 동일할때
						logCheck = SUCCESSLOGIN;
						break;
					}
				}
				// 로그인시 로그인체크를 업데이트 시킴.
				if (logCheck == SUCCESSLOGIN) {
					sql = "update member set log='login' where id=?;";
					pstmt = conn.prepareStatement(sql); // 매 검색시 변화하는 값을 검색하기 위한 PreparedStatement 클래스
					pstmt.setString(1, c_id); // 동적으로 변화하는 값을 전달 만약 전달하는 값이 정수이면 setInt(index,정수) 이런 식으로 하면됨.
					pstmt.executeUpdate();
				} else {
					logCheck = WRONGPASSWORD; // 비밀번호를 잘못 입력한 경우.
				}
				conn.close(); //연결 끊기
            }
		} catch (SQLException e) {
			System.out.println("DB Access Error!!"+e);
		} catch (ClassNotFoundException e) {
			// TODO 자동 생성된 catch 블록
			System.out.println("Driver Load Error!!"+e);
		}
		return logCheck;
	}
}
