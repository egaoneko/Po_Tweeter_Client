/*
 * ���α׷� �̸� : Po Tweeter
 * ���� : Version 0.9
 * ���ϸ� : Command_Manager.java
 * ���� : ��ɾ� ���� Ŭ���� ( ��� ���� - MainView.java �� ����)
 * ���� ���� ��¥ : 14.02.09
 */

/* 
 * Not Used
 */

/*
import java.util.StringTokenizer;

public class Command_Manager {

	public static int com_Ana(String str,String cmd[]){
		
		boolean flag=false;
		StringTokenizer st;
		
		for(int i=0;i<Command.COMMAND_NUM;i++){
			if(str.contains(Command.COMMAND_ARR[i])) {
				flag=true;
				st = new StringTokenizer(str,"<,>");
				
				int n = st.countTokens();
				cmd = new String[n];
				
				for(int j=0;j<n;j++) {
					String token = st.nextToken();
					cmd[j]=new String(token);
					System.out.println("##"+token+"##");
				}
			}
		}
		
		if(!flag)	return -1;

		for(int i=0;i<Command.COMMAND_NUM;i++){
			if((cmd[1].compareTo(Command.COMMAND_ARR[i])) == 0){
				System.out.println("##"+i+"##");
				return i;
			}
		}
		return -1;
	}	
}
*/