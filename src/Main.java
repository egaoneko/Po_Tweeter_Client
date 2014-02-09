/*
 * 프로그램 이름 : Po Tweeter
 * 버전 : Version 0.9
 * 파일명 : Main.java
 * 설명 : main 메소드를 통한 클라이언트 실행 및 주소 설정
 * 최종 수정 날짜 : 14.02.09
 */


public class Main {
	
	/* 설정 */
	final static String SERVER_ADDR="127.0.0.1";	// 서버 주소 
	final static int SERVER_PORT=9353; 				// 포트번호
	public static  final String DBIP="localhost"; //DB 접속 아이피 설정
	
	public static void main(String[] args) {

		Client client = new Client();
		client.setVisible(true);
		
	}

}
