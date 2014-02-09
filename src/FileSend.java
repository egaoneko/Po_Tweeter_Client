/*
 * 프로그램 이름 : Po Tweeter
 * 버전 : Version 0.9
 * 파일명 : Open.java
 * 설명 : TXT 열기
 * 최종 수정 날짜 : 14.02.09
 */

import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataOutputStream;
//import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

public class FileSend extends JFrame {

	/* UI */
	private JPanel contentPane;
	private JTextField txtSearch;
	private JButton btnSearch;
	private JButton btnSend;
	private JButton btnCancle;
	private JScrollPane scrollPane;
	
	private DataOutputStream dos;
	private String id;
	private String c_name;
		
	/* 생성자 */
	public FileSend(String c_name,DataOutputStream dos,String id) {
		setTitle(c_name);
		this.c_name=c_name;
		setResizable(false);
		this.id=id;
		this.dos=dos;
		init();
		start();
	}

	/* 화면구성 메소드 */
	private void init() {
		
		/* UI */
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 318, 126);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension windowSize = this.getSize();
		int windowX = Math.max(0, (screenSize.width  - windowSize.width ) / 2);
		int windowY = Math.max(0, (screenSize.height - windowSize.height) / 2);
		this.setLocation(windowX+350, windowY);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		txtSearch = new JTextField();
		txtSearch.setColumns(10);
		btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("굴림", Font.BOLD, 12));
		
		btnSend = new JButton("Send");
		btnSend.setFont(new Font("굴림", Font.BOLD, 13));
		
		btnCancle = new JButton("Cancle");
		btnCancle.setFont(new Font("굴림", Font.BOLD, 13));
		
		GroupLayout groupLayout = new GroupLayout(contentPane);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnSearch))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(btnSend, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnCancle, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)))
					.addGap(30))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSearch))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSend, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCancle, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
					.addContainerGap())
		);
		contentPane.setLayout(groupLayout);
		setVisible(true);
	}
	
	/* 이벤트 지정 메소드 */
	public void start() {
		btnSearch.addActionListener(new btnSearchAction());
		btnCancle.addActionListener(new btnCancleAction());
	}
	

	class btnSearchAction implements ActionListener
	{
		JFileChooser chooser;
		
		btnSearchAction() {
			chooser = new JFileChooser();
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnSearch) 
			{
				String f_name=null;
				FileNameExtensionFilter filter=null;
				if(c_name.equals("IMAGE"))
					filter = new FileNameExtensionFilter("Images","jpg","png", "jpeg","gif","bmp");
				else
					filter = null;
				chooser.setFileFilter(filter);
				
				int ret = chooser.showOpenDialog(null);
				if(ret != JFileChooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(null, "You don't select a File!","Warning",JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				String filePath = chooser.getSelectedFile().getPath();
				txtSearch.setText(chooser.getSelectedFile().getPath());
				
				StringTokenizer st;
				
				st = new StringTokenizer(filePath,"\\");
				int n = st.countTokens();				
				for(int j=0;j<n;j++) {
					String token = st.nextToken();
					f_name=token;
				}
				
				Control_Data.inputSFile(id, f_name, filePath);
				
				if(c_name.equals("IMAGE"))
					send_Message("㎮IMAGE㎮"+id+"㎮"+f_name+"㎮");
				if(c_name.equals("FILE"))
					send_Message("㎮FILE㎮"+id+"㎮"+f_name+"㎮");
				
				setVisible(false);
			}
		}
	}
	
	class btnCancleAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnCancle) 
			{
				setVisible(false);
			}
		}
	}
	
	/* 송신 메소드 */
	public void send_Message(String str) { 
		try {
			dos.writeUTF(str);
		} catch (IOException e) {
			System.out.println("Message Send Error!!\n");
		}
	}
}
