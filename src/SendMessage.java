/*
 * 프로그램 이름 : Po Tweeter
 * 버전 : Version 0.9
 * 파일명 : SendMessage.java
 * 설명 : 쪽지 보내기
 * 최종 수정 날짜 : 14.02.09
 */

import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.JList;
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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JTextPane;

public class SendMessage extends JFrame {

	/* UI */
	private JPanel contentPane;
	private JButton btnSend;
	private JScrollPane scrollPane;
	private JTextArea txtArea;
	private JList list;
	private JScrollPane listscrollPane;
	private DataOutputStream dos;
	
	
	private String send_ID=null;
	private String id;
		
	/* 생성자 */
	public SendMessage(DataOutputStream dos, String id) {
		setTitle("Send Message");
		setResizable(false);
		
		this.dos=dos;
		this.id=id;
		
		init();
		start();
	}

	/* 화면구성 메소드 */
	private void init() {
		
		/* UI */
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 281);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension windowSize = this.getSize();
		int windowX = Math.max(0, (screenSize.width  - windowSize.width ) / 2);
		int windowY = Math.max(0, (screenSize.height - windowSize.height) / 2);
		this.setLocation(windowX+350, windowY);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		btnSend = new JButton("Send");
		btnSend.setFont(new Font("굴림", Font.BOLD, 12));
		
		JScrollPane txtAreaScroll = new JScrollPane();
		txtArea = new JTextArea();
		txtAreaScroll.setViewportView(txtArea);
		
		String data[];
		data=Control_Data.outputListNameOnline();
		list = new JList(data);
		listscrollPane = new JScrollPane(list);
		
		GroupLayout groupLayout = new GroupLayout(contentPane);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnSend, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(listscrollPane, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtAreaScroll, GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(txtAreaScroll, Alignment.LEADING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(listscrollPane, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSend)))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		contentPane.setLayout(groupLayout);
		setVisible(true);
	}
	
	/* 이벤트 지정 메소드 */
	public void start() {
		btnSend.addActionListener(new btnSendAction());
		list.addListSelectionListener(new listListSelection());
	}
	
	/* 전송 버튼 액션 이벤트 */
	class btnSendAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnSend) 
			{
				if(send_ID == null || send_ID.equals("")){
					JOptionPane.showMessageDialog(null, "Id is't selected.","Warning",JOptionPane.ERROR_MESSAGE);
					return;
				} else if (txtArea.getText() == null || txtArea.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Message is empty.","Warning",JOptionPane.ERROR_MESSAGE);
					return;
				}
				send_Message("㎮MESSAGE㎮"+send_ID+"㎮"+id+"㎮"+txtArea.getText()+"㎮");
			}
		}
	}
	
	class listListSelection implements ListSelectionListener
	{	
		@Override
		public void valueChanged(ListSelectionEvent e) {
			if (e.getSource() == list ) 
			{
				send_ID=list.getSelectedValue().toString();
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
