/*
 * 프로그램 이름 : Po Tweeter
 * 버전 : Version 0.9
 * 파일명 : Address.java
 * 설명 : 전체 접속 유저
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
import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.DropMode;

//import User.listListSelection;

public class Address extends JFrame {

	/* UI */
	private JPanel contentPane;
	private JLabel lblID;
	private JLabel lblName;
	private JLabel lblEmail;
	private JLabel lblPhone;
	private JLabel lblPhoto;
	private JTextField txtID;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtPhone;
	private JTextField txtSearch;

	private JButton btnSearch;
	private JList list;
	private JScrollPane listscrollPane;
	
	
	/* 생성자 */
	public Address() {
		setTitle("Address");
		setResizable(false);
		
		init();
		start();
		txtSearch.requestFocus();
	}

	/* 화면구성 메소드 */
	private void init() {
		/* UI */
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 373, 342);	
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension windowSize = this.getSize();
		int windowX = Math.max(0, (screenSize.width  - windowSize.width ) / 2);
		int windowY = Math.max(0, (screenSize.height - windowSize.height) / 2);
		this.setLocation(windowX+350, windowY);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblID = new JLabel("ID");
		lblID.setFont(new Font("굴림", Font.BOLD, 12));
		txtID = new JTextField();
		txtID.setEditable(false);
		txtID.setFont(new Font("굴림", Font.BOLD, 12));
		txtID.setColumns(10);
		
		lblName = new JLabel("Name");
		lblName.setFont(new Font("굴림", Font.BOLD, 12));
		txtName = new JTextField();
		txtName.setEditable(false);
		txtName.setFont(new Font("굴림", Font.BOLD, 12));
		txtName.setColumns(10);
		
		lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("굴림", Font.BOLD, 12));
		txtEmail = new JTextField();
		txtEmail.setEditable(false);
		txtEmail.setFont(new Font("굴림", Font.BOLD, 12));
		txtEmail.setColumns(10);
		
		lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("굴림", Font.BOLD, 12));
		txtPhone = new JTextField();
		txtPhone.setEditable(false);
		txtPhone.setFont(new Font("굴림", Font.BOLD, 12));
		txtPhone.setColumns(10);
		
		lblPhoto = new JLabel("Photo");
		lblPhoto.setFont(new Font("굴림", Font.BOLD, 14));
		lblPhoto.setBackground(new Color(255, 250, 250));
		lblPhoto.setOpaque(true);
		lblPhoto.setHorizontalAlignment(SwingConstants.CENTER);
		txtSearch = new JTextField();
		txtSearch.setFont(new Font("굴림", Font.BOLD, 12));
		txtSearch.setColumns(10);
				
		btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("굴림", Font.BOLD, 12));
		
		
		String data[];
		data=Control_Data.outputListDay();
		list = new JList(data);
		listscrollPane = new JScrollPane(list);
		
		GroupLayout groupLayout = new GroupLayout(contentPane);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(listscrollPane, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(lblPhone)
									.addComponent(lblEmail)
									.addComponent(lblName))
								.addComponent(lblID, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtPhone, 152, 152, Short.MAX_VALUE)
								.addComponent(txtID)
								.addComponent(txtName)
								.addComponent(txtEmail)
								.addComponent(lblPhoto, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
							.addGap(112))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnSearch)
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(listscrollPane, GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSearch))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblID))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblName))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtPhone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPhone))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEmail))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblPhoto, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
					.addGap(163))
		);
		contentPane.setLayout(groupLayout);
		setVisible(true);
	}
	
	/* 이벤트 지정 메소드 */
	public void start() {
		btnSearch.addActionListener(new btnSearchAction());
		txtSearch.addActionListener(new txtSearchAction()); 
		list.addListSelectionListener(new listListSelection());
	}

	/* 검색 버튼 액션 이벤트 */
	class btnSearchAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnSearch) 
			{
				if(txtSearch.getText() == null || txtSearch.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Search blank is empty.","Warning",JOptionPane.ERROR_MESSAGE);
					return;
				}
				searchDate();
			}
		}
	}
	

	public void searchDate(){
		txtID.setText(""); txtName.setText(""); txtEmail.setText(""); txtPhone.setText("");
		lblPhoto.setText("Photo");lblPhoto.setIcon(null);
		
		String data[];
		if(!Control_Data.isSameID(txtSearch.getText())){
			JOptionPane.showMessageDialog(null, "There is't same ID.","Warning",JOptionPane.ERROR_MESSAGE);
			return;
		}
		data=Control_Data.outputID2(txtSearch.getText());
		txtID.setText(data[0]);
		txtName.setText(data[1]);
		txtEmail.setText(data[2]);
		txtPhone.setText(data[3]);
		
		String path;
		path=Control_Data.outputImage(txtSearch.getText());
		lblPhoto.setText("");
		lblPhoto.setIcon(new ImageIcon(path));	
	}
	
	
	
	class listListSelection implements ListSelectionListener
	{	
		@Override
		public void valueChanged(ListSelectionEvent e) {
			if (e.getSource() == list ) 
			{
				searchDateList(list.getSelectedValue().toString());
			}
		}
	}
	

	public void searchDateList(String str){
		txtID.setText(""); txtName.setText(""); txtEmail.setText(""); txtPhone.setText(""); 
		lblPhoto.setText("Photo");lblPhoto.setIcon(null);
		
		String data[];
		if(!Control_Data.isSameID(str)){
			JOptionPane.showMessageDialog(null, "There is't same ID.","Warning",JOptionPane.ERROR_MESSAGE);
			return;
		}
		txtSearch.setText(str);
		
		data=Control_Data.outputID2(str);
		txtID.setText(data[0]);
		txtName.setText(data[1]);
		txtEmail.setText(data[2]);
		txtPhone.setText(data[3]);
		
		String path;
		path=Control_Data.outputImage(str);
		lblPhoto.setText("");
		lblPhoto.setIcon(new ImageIcon(path));	
	}

	
	
	/* 검색 입력창 액션 이벤트 */
	class txtSearchAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == txtSearch) 
			{
				if(txtSearch.getText() == null || txtSearch.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Search blank is empty.","Warning",JOptionPane.ERROR_MESSAGE);
					return;
				}
				searchDate();
			}
		}
	}
}
