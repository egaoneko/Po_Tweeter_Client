/*
 * ���α׷� �̸� : Po Tweeter
 * ���� : Version 0.9
 * ���ϸ� : Main.java
 * ���� : main �޼ҵ带 ���� Ŭ���̾�Ʈ ���� �� �ּ� ����
 * ���� ���� ��¥ : 14.02.09
 */


public class Main {
	
	/* ���� */
	final static String SERVER_ADDR="127.0.0.1";	// ���� �ּ� 
	final static int SERVER_PORT=9353; 				// ��Ʈ��ȣ
	public static  final String DBIP="localhost"; //DB ���� ������ ����
	
	public static void main(String[] args) {

		Client client = new Client();
		client.setVisible(true);
		
	}

}
