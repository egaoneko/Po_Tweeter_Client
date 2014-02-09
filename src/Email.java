/*
 * 프로그램 이름 : Po Tweeter
 * 버전 : Version 0.9
 * 파일명 : Email.java
 * 설명 : 개선 제안 메일
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

public class Email extends JFrame {

	/* UI */
	private JPanel contentPane;
	private JButton btnReply;
	private JScrollPane scrollPane;
	private JTextArea txtArea;
	private JTextField txtName;
	private String id;
	private JTextField txtEmail;

		
	/* 생성자 */
	public Email(String id) {
		setTitle("Recv Message");
		setResizable(false);

		this.id=id;
		
		init();
		start();
	}

	/* 화면구성 메소드 */
	private void init() {
		
		/* UI */
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 293, 336);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension windowSize = this.getSize();
		int windowX = Math.max(0, (screenSize.width  - windowSize.width ) / 2);
		int windowY = Math.max(0, (screenSize.height - windowSize.height) / 2);
		this.setLocation(windowX+350, windowY);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		btnReply = new JButton("Send");
		btnReply.setFont(new Font("굴림", Font.BOLD, 12));
		
		JScrollPane txtAreaScroll = new JScrollPane();
		txtArea = new JTextArea();
		txtAreaScroll.setViewportView(txtArea);
		
		txtName = new JTextField(id);
		txtName.setEditable(false);
		txtName.setColumns(10);
		
		String email=Control_Data.outputEmail(id);
		
		txtEmail = new JTextField(email);
		txtEmail.setEditable(false);
		txtEmail.setColumns(10);
		
		GroupLayout groupLayout = new GroupLayout(contentPane);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtAreaScroll, Alignment.LEADING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnReply, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtEmail, GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnReply))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtAreaScroll, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
		);
		contentPane.setLayout(groupLayout);
		setVisible(true);
	}
	
	/* 이벤트 지정 메소드 */
	public void start() {
		btnReply.addActionListener(new btnReplyAction());
	}
	
	/* 전송 버튼 액션 이벤트 */
	class btnReplyAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnReply) 
			{
				if( txtArea.getText() == null || txtArea.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Message is empty.","Warning",JOptionPane.ERROR_MESSAGE);
					return;
				} 
				Control_Data.insertDataEmail(id, txtEmail.getText(), txtArea.getText());
				setVisible(false);
			}
		}
	}
}
