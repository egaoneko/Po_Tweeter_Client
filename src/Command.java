/*
 * ���α׷� �̸� : Po Tweeter
 * ���� : Version 0.9
 * ���ϸ� : Command.java
 * ���� : ��ɾ� ������
 * ���� ���� ��¥ : 14.02.09
 */

public enum Command {
	EMOT,IMAGE,FILE,LINK,NOTICE,MESSAGE;
	
	public static final int COMMAND_NUM = 6;
	public static final String[] COMMAND_ARR = {"EMOT","IMAGE","FILE","LINK","NOTICE","MESSAGE"};
	
	Command(){}
}
