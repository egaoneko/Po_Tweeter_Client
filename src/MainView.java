/*
 * 프로그램 이름 : Po Tweeter
 * 버전 : Version 0.9
 * 파일명 : MainView.java
 * 설명 : 채팅 본문 구성
 * 최종 수정 날짜 : 14.02.09
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;

import say.swing.JFontChooser;
import javax.swing.ScrollPaneConstants;




public class MainView extends JFrame {

	/* 로그인 */
	private String id;
	private String pw;

	/* 소켓 */
	private Socket socket;			// 연결소켓
	private InputStream is;
	private OutputStream os;
	private DataInputStream dis;
	private DataOutputStream dos;
	
	/* UI */
	private JPanel contentPane;
	private JTextField txtField;	// 입력창
	private JButton btnSend;		// 전송버튼
	private JTextPane txtArea;		// 수신된 메세지를 나타낼 변수
	private JTextPane txtNotice;	// 공지
	private JLabel lblAlarm;		// 경고
	private JComboBox cbbMenu;		// 콤보박스
	private JScrollPane txtAreaScroll;
	private JScrollPane txtNoticeScroll;
	
	/* 메뉴바 */
	private JMenuBar mnBar;
	private JMenu mnFile;
	private JMenu mnOption;
	private JMenu mnHelp;
	private JMenuItem mntmSave;
	private JMenuItem mntmOpen;
	private JMenuItem mntmStatus;
	private JMenuItem mntmFont;
	private JMenuItem mntmColor;
	private JMenuItem mntmProfile;
	private JMenuItem mntmSetting;
	private JMenuItem mntmLeave;
	private JMenuItem mntmAddress;
	private JMenuItem mntmHelp;
	private JMenuItem mntmInfo;
	private JMenu mnReport;
	private JMenuItem mntmBug;
	private JMenuItem mntmEmail;
	private JMenuItem mntmHomepage;
	
	/* 메세지 수신 */
	private Recv_Message recv_Message;
	
	/* Timer */
	private boolean flag_T=false;
	private JMenuItem mntmExit;
	
	/* Color & Font */
	private Color clr;
	private int font_Checker;
	private Font font;
	public static final int CANCEL_OPTION = 1;
	public static final int ERROR_OPTION = -1;
	public static final int OK_OPTION = 0;
	
	/* 이모티콘 */
	private Emoticon emot;
	
	/* 쪽지 */
	private SendMessage sm;
	private RecvMessage	rm;
	
	/* Setting 값 */
	static boolean messageFlag=true;
	static boolean autoEmotFlag=false;
	static boolean offline=false;

	/* 생성자 */
	public MainView(String id, String pw)// 생성자
	{
		setTitle("Po Tweeter");
		setResizable(false);
		this.id = id;
		this.pw = pw;

		init();
		start();
		txtField.requestFocus();		// 시작 포커스
		clr=new Color(255, 115, 184);	// 기본 컬러 세팅
		
		font_Checker=3;
		
		Thread tm= new Thread(new TimeView());
		tm.start();
		network();
	}

	/* 서버에 접속 메소드 */
	public void network() {
		try {
			socket = new Socket(Main.SERVER_ADDR, Main.SERVER_PORT);
			if (socket != null) // socket이 null값이 아닐때 즉! 연결되었을때
			{
				Connection(); // 연결 메소드를 호출
			}
		} catch (UnknownHostException e) {
		} catch (IOException e) {
			lblAlarm.setText("Socket Access Error!!\n");
			flag_T=true;
		}
	}

	/* 스트림 연결 메소드 */
	public void Connection() {
		try { // 스트림 설정
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
		} catch (IOException e) {
			lblAlarm.setText("Stream Set Error!!\n");
			flag_T=true;
		}
		send_Message(id); // 정상적으로 연결되면 나의 id를 전송
		recv_Message = new Recv_Message(); // 서버에서 받은 메시지를 출력할 컴퍼넌트
		Thread t = new Thread(recv_Message); // 서버에서 메시지 수신을 위한 스레드 생성
		t.start();
	}

	/* 화면구성 메소드 */
	public void init() { 
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// X버튼 종료 => 이벤트 핸들러로 재구현 (Why? Logout 필요함 )
		setBounds(100, 100, 363, 641);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension windowSize = this.getSize();
		int windowX = Math.max(0, (screenSize.width  - windowSize.width ) / 2);
		int windowY = Math.max(0, (screenSize.height - windowSize.height) / 2);
		this.setLocation(windowX, windowY);
		
		/* 메뉴바 */
		mnBar = new JMenuBar();
		setJMenuBar(mnBar);
		
		/* File */
		mnFile = new JMenu("File");
		mnFile.setIcon(new ImageIcon("icon/ui24/file3.png"));
		mnBar.add(mnFile);
		
		mntmOpen = new JMenuItem("Open");
		mntmOpen.setIcon(new ImageIcon("icon/ui24/folder-open.png"));
		mnFile.add(mntmOpen);
		
		mntmSave = new JMenuItem("Save");
		mntmSave.setIcon(new ImageIcon("icon/ui24/disk.png"));
		mnFile.add(mntmSave);
		
		mnFile.addSeparator();
		
		mntmStatus = new JMenuItem("Status");
		mntmStatus.setIcon(new ImageIcon("icon/ui24/stats.png"));
		mnFile.add(mntmStatus);
		
		mntmAddress = new JMenuItem("Address");
		mntmAddress.setIcon(new ImageIcon("icon/ui24/address-book.png"));
		mnFile.add(mntmAddress);
		
		mnFile.addSeparator();
		
		mntmExit = new JMenuItem("Exit");
		mntmExit.setIcon(new ImageIcon("icon/ui24/switch.png"));
		mnFile.add(mntmExit);
		
		/* Option */
		mnOption = new JMenu("Option");
		mnOption.setIcon(new ImageIcon("icon/ui24/cogs.png"));
		mnBar.add(mnOption);
		
		mntmFont = new JMenuItem("Font");
		mntmFont.setIcon(new ImageIcon("icon/ui24/pencil.png"));
		mnOption.add(mntmFont);
		
		mntmColor = new JMenuItem("Color");
		mntmColor.setIcon(new ImageIcon("icon/ui24/droplet.png"));
		mnOption.add(mntmColor);
		
		mntmProfile = new JMenuItem("Profile");
		mntmProfile.setIcon(new ImageIcon("icon/ui24/profile.png"));
		mnOption.add(mntmProfile);
		
		mntmSetting = new JMenuItem("Setting");
		mntmSetting.setIcon(new ImageIcon("icon/ui24/wrench.png"));
		mnOption.add(mntmSetting);
		
		mntmLeave = new JMenuItem("Leave");
		mntmLeave.setIcon(new ImageIcon("icon/ui24/remove.png"));
		mnOption.add(mntmLeave);
		
		/* Help */
		mnHelp = new JMenu("Help");
		mnHelp.setIcon(new ImageIcon("icon/ui24/book.png"));
		mnBar.add(mnHelp);
		
		mntmHelp = new JMenuItem("Help");
		mntmHelp.setIcon(new ImageIcon("icon/ui24/question.png"));
		mnHelp.add(mntmHelp);
		
		mnReport = new JMenu("Report");
		mnReport.setIcon(new ImageIcon("icon/ui24/feed3.png"));
		mnHelp.add(mnReport);
		
		mntmBug = new JMenuItem("Bug");
		mntmBug.setIcon(new ImageIcon("icon/ui24/bug.png"));
		mnReport.add(mntmBug);
		
		mntmEmail = new JMenuItem("Email");
		mntmEmail.setIcon(new ImageIcon("icon/ui24/mail4.png"));
		mnReport.add(mntmEmail);
		
		mntmHomepage = new JMenuItem("Homepage");
		mntmHomepage.setIcon(new ImageIcon("icon/ui24/github.png"));
		mnHelp.add(mntmHomepage);
			
		mntmInfo = new JMenuItem("Info");
		mntmInfo.setIcon(new ImageIcon("icon/ui24/info.png"));
		mnHelp.add(mntmInfo);
		
		/* UI */
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		txtAreaScroll = new JScrollPane();

		txtArea = new JTextPane();
		txtArea.setEditable(false);
		txtAreaScroll.setViewportView(txtArea);

		txtField = new JTextField();
		txtField.setColumns(10);

		btnSend = new JButton(new ImageIcon("icon/ui24/envelope.png"));
		
		txtNoticeScroll = new JScrollPane();
		
		/* 공지 */
		txtNotice = new JTextPane();
		txtNotice.setEditable(false);
		txtNoticeScroll.setViewportView(txtNotice);
		
		txtNotice.setEditable(false);
		txtNotice.setForeground(new Color(255, 0, 0));
		txtNotice.setBackground(new Color(255, 228, 181));
		txtNotice.setFont(new Font("굴림", Font.BOLD, 14));
		txtNotice.setOpaque(true);
		
		/* 알림창 */
		lblAlarm = new JLabel();
		lblAlarm.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAlarm.setForeground(new Color(221, 160, 221));
		lblAlarm.setFont(new Font("굴림", Font.BOLD, 14));
		lblAlarm.setOpaque(true);
		
		/* 추가 기능 */
		ImageIcon [] images = {
				new ImageIcon("icon/ui24/finder.png"),		// 이모티콘
				new ImageIcon("icon/ui24/images.png"),		// 이미지
				new ImageIcon("icon/ui24/attachment.png"),	// 파일전송
				new ImageIcon("icon/ui24/link.png"),		// 링크
				new ImageIcon("icon/ui24/warning.png"),		// 공지
				new ImageIcon("icon/ui24/mail.png")			// 쪽지
				};
		cbbMenu = new JComboBox(images);		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(txtField, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSend, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cbbMenu, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
				.addComponent(txtNoticeScroll, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
				.addComponent(txtAreaScroll, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
				.addComponent(lblAlarm, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(txtNoticeScroll, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtAreaScroll, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(cbbMenu)
						.addComponent(btnSend, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
						.addComponent(txtField, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAlarm, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
		setVisible(true);
	}

	/* 이벤트 지정 메소드 */
	public void start() { 
		btnSend.addActionListener(new btnSendAction());		// 버튼 클릭 송신
		txtField.addActionListener(new txtFieldAction()); 	// 엔터 송신
		cbbMenu.addActionListener(new cbbMenuAction());		// 기능 부분
		this.addWindowListener(new WindowEventHandler());
		
		/* 메뉴바 이벤트 처리 */
		
		/* mnFile 이벤트 처리 */
		mntmOpen.addActionListener(new mntmOpenAction());
		mntmSave.addActionListener(new mntmSaveAction());
		mntmStatus.addActionListener(new mntmStatusAction());
		mntmAddress.addActionListener(new mntmAddressAction());
		mntmExit.addActionListener(new mntmExitAction(this));
		
		/* mnOption 이벤트 처리 */
		mntmFont.addActionListener(new mntmFontAction());
		mntmColor.addActionListener(new mntmColorAction());
		mntmProfile.addActionListener(new mntmProfileAction());
		mntmSetting.addActionListener(new mntmSettingAction());
		mntmLeave.addActionListener(new mntmLeaveAction());
		
		/* mnHelp 이벤트 처리 */
		mntmHelp.addActionListener(new mntmHelpAction());
		/* mnHelp - mnReport 이벤트 처리 */
		mntmBug.addActionListener(new mntmBugAction());
		mntmEmail.addActionListener(new mntmEmailAction());
		
		mntmHomepage.addActionListener(new mntmHomepageAction());
		mntmInfo.addActionListener(new mntmInfoAction());
	}

	/* 송신 액션 이벤트 */
	class btnSendAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnSend) 
			{
				send_Message(txtField.getText());
				txtField.setText(null); // 메세지를 보내고 나면 메세지 쓰는창을 비운다.
				txtField.requestFocus(); // 메세지를 보내고 커서를 다시 텍스트 필드로 위치시킨다				
			}
		}
	}
	
	/* 채팅 입력창 액션 이벤트 */
	class txtFieldAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == txtField) 
			{
				send_Message(txtField.getText());
				txtField.setText(null); // 메세지를 보내고 나면 메세지 쓰는창을 비운다.
				txtField.requestFocus(); // 메세지를 보내고 커서를 다시 텍스트 필드로 위치시킨다				
			}
		}
	}
	
	/* 채팅 기능 액션 이벤트 */
	class cbbMenuAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == cbbMenu) 
			{
				if(cbbMenu.getSelectedIndex() == 0)
					emot = new Emoticon(dos);
				if(cbbMenu.getSelectedIndex() == 1)
					send_Message("㎮IMAGE㎮test1㎮test2㎮");
				if(cbbMenu.getSelectedIndex() == 2)
					send_Message("㎮FILE㎮test1㎮test2㎮");
				if(cbbMenu.getSelectedIndex() == 3){
					String url= JOptionPane.showInputDialog("Input URL.");
					if(url!=null)
						send_Message("㎮LINK㎮"+id+"㎮"+url+"㎮");
				}			
				if(cbbMenu.getSelectedIndex() == 4){
					String notice= JOptionPane.showInputDialog("Input a notice.");
					if(notice!=null)
						send_Message("㎮NOTICE㎮"+notice+" -by "+id+"㎮");
				}
				if(cbbMenu.getSelectedIndex() == 5)
					sm= new SendMessage(dos,id);
			}
		}
	}
	
	/* 종료 이벤트 */
	class WindowEventHandler implements WindowListener{
		public WindowEventHandler(){}	
		public void windowActivated(WindowEvent e){}	
		public void windowClosed(WindowEvent e){}	
		public void windowClosing(WindowEvent e){
			Logout.logoutCheck(id);
			JFrame frm=(JFrame)e.getWindow();
			frm.dispose();
			System.exit(0);
		}
		public void windowDeactivated(WindowEvent e){}	
		public void windowDeiconified(WindowEvent e){}	
		public void windowIconified(WindowEvent e){}	
		public void windowOpened(WindowEvent e){} 
	}

	/*
	 * 
	 * 메뉴바 이벤트 처리
	 * 
	 */
	
	/* 
	 * mnFile 이벤트 처리
	 */
	class mntmOpenAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == mntmOpen ) 
			{
				Open open = new Open();
			}
		}
	}

	class mntmSaveAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == mntmSave ) 
			{
				Save save = new Save(txtArea.getText());
			}
		}
	}

	class mntmStatusAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == mntmStatus ) 
			{
				Status sta = new Status();
			}
		}
	}

	class mntmAddressAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == mntmAddress ) 
			{
				Address adr = new Address();
			}
		}
	}

	class mntmExitAction implements ActionListener
	{
		JFrame frm;
		
		mntmExitAction(JFrame frm){
			this.frm=frm;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == mntmExit ) 
			{
				Logout.logoutCheck(id);
				System.exit(0);
			}
		}
	}
	
	
	/* 
	 * mnOption 이벤트 처리
	 */
	class mntmFontAction implements ActionListener
	{
		JFontChooser chooser = new JFontChooser(null);

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == mntmFont ) 
			{
				font_Checker = chooser.showDialog(null);
				// get the selected font
				if(font_Checker == JFontChooser.OK_OPTION) {
				    font = chooser.getSelectedFont();
				}
			}
		}
	}

	class mntmColorAction implements ActionListener
	{
		JColorChooser chooser = new JColorChooser();
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == mntmColor ) 
			{
				Color selectedColor = chooser.showDialog(null, "Color", Color.MAGENTA);
				
				if(selectedColor != null )
					clr=selectedColor;
			}
		}
	}

	class mntmProfileAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == mntmProfile ) 
			{
				Profile prf = new Profile(id);
			}
		}
	}

	class mntmSettingAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == mntmSetting ) 
			{
				Setting set = new Setting(id);
			}
		}
	}
	
	class mntmLeaveAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == mntmLeave ) 
			{
				int result = JOptionPane.showConfirmDialog(null, "If you press \"Yes\", you apply to cancel your membership and exit.","Member Leave",JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.CLOSED_OPTION || result == JOptionPane.NO_OPTION ){
					return;
				} else if(result == JOptionPane.YES_OPTION){
					Control_Data.delID(id);
					System.exit(0);
				}
			}
		}
	}
	
	
	/* 
	 * mnHelp 이벤트 처리
	 */
	class mntmHelpAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == mntmHelp ) 
			{
				Help hlp = new Help();
			}
		}
	}

	
	/* 
	 * mnHelp - mnReport 이벤트 처리
	 */
	class mntmBugAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == mntmBug ) 
			{
				Bug bug = new Bug(id);
			}
		}
	}

	class mntmEmailAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == mntmEmail ) 
			{
				Email email = new Email(id);
			}
		}
	}

	class mntmHomepageAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == mntmHomepage ) 
			{
				OpenBrowser.openURL("https://github.com/egaoneko");
			}
		}
	}

	class mntmInfoAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == mntmInfo ) 
			{
				Info inf = new Info();
			}
		}
	}
	
	
	/* 송신 메소드 */
	public void send_Message(String str) { 
		try {
			dos.writeUTF(str);
		} catch (IOException e) {
			lblAlarm.setText("Message Send Error!!\n");
		}
	}
	
	/* 수신 메소드 */
	private class Recv_Message implements Runnable {
		
		String[] cmd=null;
		int flag=0;
		Command cmdOut;
		@Override
		public void run() {
			boolean ret=false;
			while (true) {
				try {
					String msg = dis.readUTF(); // 메세지를 수신한다
					
					flag=com_Ana2(msg);	// 명령어 판독
					if(flag != -1)	// 명령어 수행
						cmdOut = Command.valueOf(cmd[1]);
					else{			// 비명령어 수행
						if(autoEmotFlag){
							ret=com_Ana22(msg);
							if(!ret){
								if(msg.contains(id))
									appendC(msg + "\n");
								else
									append(msg + "\n");
							}
						}	
						else {
							if(msg.contains(id))
								appendC(msg + "\n");
							else
								append(msg + "\n");
						}
					}
					/* 명령어 수행 */
					if(flag!=-1){
						switch(cmdOut){
						case EMOT:
							appendC(cmd[0]);
							appendI(cmd[2]);
							break;
						case IMAGE:
							/* 이미지 구현 후 주소값 반환을 통해 수행 */
							appendC(cmd[0]);
							append("\n");
							appendI2("icon/test.jpg");
							break;
						case FILE:
							break;
						case LINK:
							Link link = new Link(cmd[2],cmd[3]);
							break;
						case NOTICE:
							txtNotice.setText(cmd[2]);
							break;
						case MESSAGE:
							if(id.equals(cmd[2])&&messageFlag)
								rm = new RecvMessage(dos,id,cmd[3],cmd[4]);
							break;
						default:
						}
						/*
						for(int i=0; i<cmd.length;i++){
							append("##"+cmd[i] +"##"+ "\n");
						}
						*/
					}
					
					
				} catch (IOException e) {
					lblAlarm.setText("Messave Recv Error!!\n");
					flag_T=true;
					// 서버와 소켓 통신에 문제가 생겼을 경우 소켓을 닫는다
					try {
						os.close(); is.close();
						dos.close(); dis.close();
						socket.close();
						break; // 에러 발생하면 while문 종료
					} catch (IOException e1) {
					}
				}
			} // while문 끝
		}
		
		/*
		 * 명령어 분석기
		 */
		public int com_Ana2(String str){
			
			boolean flag=false;
			StringTokenizer st;
				
			for(int i=0;i<Command.COMMAND_NUM;i++){
				if(str.contains(Command.COMMAND_ARR[i])) {
					flag=true;
					st = new StringTokenizer(str,"㎮");
					
					int n = st.countTokens();
					cmd = new String[n];
					
					for(int j=0;j<n;j++) {
						String token = st.nextToken();
						cmd[j]=new String(token);
						//System.out.println("##"+token+"##");
					}
				}
			}
			
			if(!flag)	return -1;

			for(int i=0;i<Command.COMMAND_NUM;i++){
				if((cmd[1].compareTo(Command.COMMAND_ARR[i])) == 0){
					//System.out.println("##"+i+"##");
					return i;
				}
			}
			return -1;
		}	
		
		/*
		 * 명령어 분석기2
		 */
		public boolean com_Ana22(String str){
			
			String temp;
			Vector vc = new Vector(); 
			int cnt=0;
			boolean flag = false;
			boolean whoami=false;
			
			if(str.contains(id))
				whoami=true;
			
			for(int i=0;i<Emot_Adr.autoEmot.length;i++)
				for(int j=0;j<Emot_Adr.autoEmot[i].length;j++)
					if(str.contains(Emot_Adr.autoEmot[i][j])){
						vc.add("㎮㎯"+i+"㎯㎮");
						temp = str.replace(Emot_Adr.autoEmot[i][j], "㎮㎯"+i+"㎯㎮");
						str=temp;
						cnt++;
					}
			
			if(cnt==0)
				return flag;
			else
				flag=true;
						
			
			StringTokenizer st;
			
			st = new StringTokenizer(str,"㎮");
			int n = st.countTokens();
										
			for(int j=0;j<n;j++) {
				String token = st.nextToken();
				
				if(!token.contains("㎯")){
					if(whoami)
						appendC(token);
					else
						append(token);
				}
				else {
					StringTokenizer st2;
					st2 = new StringTokenizer(token,"㎯");
					
					String token2 = st2.nextToken();
					int num = Integer.parseInt(token2);
					
					appendI3(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[num]);
				}
			}
			append("\n");
			return flag;
		}
			
	}
	
	/* 입력 함수 */
	public void append(String s) {
		try {
			Document doc = txtArea.getDocument();
			doc.insertString(doc.getLength(), s, null);
			setEndline();
		} catch (BadLocationException exc) {
			exc.printStackTrace();
		}
	}
	
	/* 색상 입력 함수 */
	public void appendC(String s) {
		StyledDocument doc = txtArea.getStyledDocument();
		Style style = txtArea.addStyle(s, null);
		
        StyleConstants.setForeground(style, clr);
        
        if(font_Checker == JFontChooser.OK_OPTION ){
        	StyleConstants.setBold(style, font.isBold());
        	StyleConstants.setItalic(style, font.isItalic());
        	StyleConstants.setFontFamily(style, font.getFamily());
        	StyleConstants.setFontSize(style, font.getSize());
        }
        
        try {
        	doc.insertString(doc.getLength(), s,style);
        	setEndline();
        }
        catch (BadLocationException e){}	
	}
	
	/* 이미지 입력 함수 */
	public void appendI(String filePath) {
		txtArea.insertComponent(new JLabel(new ImageIcon(filePath)));
		setEndIcon();
		append("\n");
	}
	
	/* 이미지 입력 함수 */
	public void appendI3(String filePath) {
		txtArea.insertComponent(new JLabel(new ImageIcon(filePath)));
		setEndIcon();
	}
	
	/* 이미지 크기 조절 입력 함수 */
	public void appendI2(String filePath) {
		File file = new File(filePath);
		Image img=null;
		int weight,height;
		double dis;
		
		try {
			img = ImageIO.read(file);
		} catch (IOException e) {
			lblAlarm.setText("Image File Open Error!!\n");
			flag_T=true;
			return;
		}
		
		weight=img.getWidth(null);
		height=img.getHeight(null);
		
		while(true){
			if(weight<=330 && height<=450)
				break;
			if(weight>330){
				dis=(weight-330)/(double)weight;
				weight=330;
				height-=height*dis;
			}
			if(height>450){
				dis=(height-450)/(double)height;
				height=450;
				weight-=weight*dis;
			}
			
		}
		
		Image resizedImage = img.getScaledInstance(weight, height,  Image.SCALE_SMOOTH );
		txtArea.insertComponent(new JLabel(new ImageIcon(resizedImage)));
		setEndIcon();
		append("\n");
	}
	
	/* 이미지 입력 부가 함수 */
	private void setEndline() {
		txtArea.selectAll();
		//문장의 끝에 무조건 커서 이동하게 설정
		txtArea.setSelectionStart(txtArea.getSelectionEnd());
	}
	
	/* 이미지 입력 부가 함수 */
	private void setEndIcon() {
		setEndline();
		txtArea.replaceSelection("\n");
		setEndline();
	}
	
	/* 시간 표시 */
	private class TimeView implements Runnable{
		private int count;
		TimeView(){
			count=0;
		}
		public void run(){
			while(true){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(flag_T==false && count == 0)
					lblAlarm.setText(Date.getdateSD() + id +" <online>");
				else if(flag_T==true && count == 0){
					count=120;
				}
				else{
					count--;
					if(count==0)
						flag_T=false;
				}
			}
		}
	}
}

