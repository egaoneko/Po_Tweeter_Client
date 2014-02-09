/*
 * 프로그램 이름 : Po Tweeter
 * 버전 : Version 0.9
 * 파일명 : RecvMessage.java
 * 설명 : 쪽지 받기
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

public class RecvMessage extends JFrame {

	/* UI */
	private JPanel contentPane;
	private JButton btnReply;
	private JScrollPane scrollPane;
	private JTextArea txtArea;
	private DataOutputStream dos;
	
	
	private String send_ID=null;
	private JTextField txtName;
	
	private String m_id;
	private String r_id;
	private String message;
	private SendMessage sm;
		
	/* 생성자 */
	public RecvMessage(DataOutputStream dos,String m_id, String r_id,String message) {
		setTitle("Recv Message");
		setResizable(false);
		
		this.dos=dos;
		this.m_id=m_id;
		this.r_id=r_id;
		this.message=message;
		
		init();
		start();
	}

	/* 화면구성 메소드 */
	private void init() {
		
		/* UI */
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 293, 281);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension windowSize = this.getSize();
		int windowX = Math.max(0, (screenSize.width  - windowSize.width ) / 2);
		int windowY = Math.max(0, (screenSize.height - windowSize.height) / 2);
		this.setLocation(windowX+350, windowY);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		btnReply = new JButton("Reply");
		btnReply.setFont(new Font("굴림", Font.BOLD, 12));
		
		JScrollPane txtAreaScroll = new JScrollPane();
		txtArea = new JTextArea(message);
		txtAreaScroll.setViewportView(txtArea);
		
		
		txtName = new JTextField(r_id);
		txtName.setEditable(false);
		txtName.setColumns(10);
		
		GroupLayout groupLayout = new GroupLayout(contentPane);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(txtAreaScroll, Alignment.LEADING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnReply, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(141, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnReply))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtAreaScroll, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
		);
		contentPane.setLayout(groupLayout);
		setVisible(true);
	}
	
	/* 이벤트 지정 메소드 */
	public void start() {
		btnReply.addActionListener(new btnReplyAction());
	}
	
	/* 답장 버튼 액션 이벤트 */
	class btnReplyAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnReply) 
			{
				sm=new SendMessage(dos,m_id);
				setVisible(false);
			}
		}
	}
}
