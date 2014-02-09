/*
 * 프로그램 이름 : Po Tweeter
 * 버전 : Version 0.9
 * 파일명 : Command.java
 * 설명 : 명령어 열거형
 * 최종 수정 날짜 : 14.02.09
 */

public enum Command {
	EMOT,IMAGE,FILE,LINK,NOTICE,MESSAGE;
	
	public static final int COMMAND_NUM = 6;
	public static final String[] COMMAND_ARR = {"EMOT","IMAGE","FILE","LINK","NOTICE","MESSAGE"};
	
	Command(){}
}
