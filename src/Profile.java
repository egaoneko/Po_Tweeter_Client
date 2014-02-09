/*
 * 프로그램 이름 : Po Tweeter
 * 버전 : Version 0.9
 * 파일명 : Profile.java
 * 설명 : 프로필 처리
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

public class Profile extends JFrame {

	/* UI */
	private JPanel contentPane;
	private JLabel lblID;
	private JLabel lblName;
	private JLabel lblPW;
	private JLabel lblRePW;
	private JLabel lblEmail;
	private JLabel lblPhone;
	private JLabel lblPhoto;
	private JTextField txtID;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtPhone;
	private JTextField txtPhoto;
	private JPasswordField txtpPW;
	private JPasswordField txtpRePW;

	private JButton btnPhoto;
	private JButton btnEdit;
	private JButton btnCancle;
	
	private String id;
	
	/* 생성자 */
	public Profile(String id) {
		setTitle("Profile");
		setResizable(false);
		this.id=id;
		
		init();
		start();
	
	}

	/* 화면구성 메소드 */
	private void init() {
		/* UI */
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 383);	
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
		txtID = new JTextField(id);
		txtID.setEditable(false);
		txtID.setFont(new Font("굴림", Font.BOLD, 12));
		txtID.setColumns(10);
		
		lblName = new JLabel("Name");
		lblName.setFont(new Font("굴림", Font.BOLD, 12));
		txtName = new JTextField();
		txtName.setFont(new Font("굴림", Font.BOLD, 12));
		txtName.setColumns(10);
		
		lblPW = new JLabel("PW");
		lblPW.setFont(new Font("굴림", Font.BOLD, 12));
		txtpPW = new JPasswordField();
		txtpPW.setFont(new Font("굴림", Font.BOLD, 12));
		txtpPW.setEchoChar('*');
		
		lblRePW = new JLabel("Re PW");
		lblRePW.setFont(new Font("굴림", Font.BOLD, 12));
		txtpRePW = new JPasswordField();
		txtpRePW.setFont(new Font("굴림", Font.BOLD, 12));
		txtpRePW.setEchoChar('*');
		
		lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("굴림", Font.BOLD, 12));
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("굴림", Font.BOLD, 12));
		txtEmail.setColumns(10);
		
		lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("굴림", Font.BOLD, 12));
		txtPhone = new JTextField();
		txtPhone.setFont(new Font("굴림", Font.BOLD, 12));
		txtPhone.setColumns(10);
		
		lblPhoto = new JLabel("Photo");
		lblPhoto.setFont(new Font("굴림", Font.BOLD, 14));
		lblPhoto.setBackground(new Color(255, 250, 250));
		lblPhoto.setOpaque(true);
		lblPhoto.setHorizontalAlignment(SwingConstants.CENTER);
		txtPhoto = new JTextField();
		txtPhoto.setFont(new Font("굴림", Font.BOLD, 12));
		txtPhoto.setColumns(10);
				
		btnPhoto = new JButton("Search");
		btnPhoto.setFont(new Font("굴림", Font.BOLD, 12));
		btnEdit = new JButton("Edit");
		btnEdit.setFont(new Font("굴림", Font.BOLD, 12));
		btnCancle = new JButton("Cancle");
		btnCancle.setFont(new Font("굴림", Font.BOLD, 12));
		
		GroupLayout groupLayout = new GroupLayout(contentPane);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblID)
								.addComponent(lblPW)
								.addComponent(lblPhone)
								.addComponent(lblEmail))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtpPW)
								.addComponent(txtID)
								.addComponent(txtEmail)
								.addComponent(txtPhone))
							.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblRePW)
									.addGap(9)
									.addComponent(txtpRePW))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblName)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(txtPhoto, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
									.addGap(12)
									.addComponent(btnPhoto))
								.addComponent(lblPhoto, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
							.addGap(32))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(91)
					.addComponent(btnEdit, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addGap(42)
					.addComponent(btnCancle)
					.addContainerGap(92, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblID)
								.addComponent(txtID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPW)
								.addComponent(txtpPW, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblName)
								.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblRePW)
								.addComponent(txtpRePW, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(50)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEmail)
								.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(29)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPhone)
								.addComponent(txtPhone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(37)
							.addComponent(lblPhoto, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnPhoto)
						.addComponent(txtPhoto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancle, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
						.addComponent(btnEdit, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
		);
		contentPane.setLayout(groupLayout);
		setVisible(true);
	}
	
	/* 이벤트 지정 메소드 */
	public void start() { // 액션이벤트 지정 메소드
		btnPhoto.addActionListener(new btnPhotoAction()); // 검색 버튼
		btnCancle.addActionListener(new btnCancleAction()); // 가입 버튼
		btnEdit.addActionListener(new btnJoinAction()); // 취소 버튼
	}

	/* 가입 버튼 액션 이벤트 */
	class btnPhotoAction implements ActionListener
	{
		JFileChooser chooser;
		
		btnPhotoAction() {
			chooser = new JFileChooser();
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnPhoto) 
			{
				FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG&PNG","jpg","png");
				chooser.setFileFilter(filter);
				
				int ret = chooser.showOpenDialog(null);
				if(ret != JFileChooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(null, "You don't select a photo!","Warning",JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				String filePath = chooser.getSelectedFile().getPath();
				txtPhoto.setText(chooser.getSelectedFile().getPath());
				lblPhoto.setText(null);
				lblPhoto.setIcon(new ImageIcon(filePath));
			}
		}
	}
	
	/* 취소 버튼 액션 이벤트 */
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
	
	/* 검색 버튼 액션 이벤트 */
	class btnJoinAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnEdit) 
			{
				/* 공백 확인 */
				if(txtID.getText() == null || txtID.getText().equals("")){
					JOptionPane.showMessageDialog(null, "ID blank is empty.","Warning",JOptionPane.ERROR_MESSAGE);
					txtID.requestFocus();
					return;
				} else if(txtName.getText() == null || txtName.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Name blank is empty.","Warning",JOptionPane.ERROR_MESSAGE);
					txtName.requestFocus();
					return;
				} else if(txtpPW.getText() == null || txtpPW.getText().equals("")){
					JOptionPane.showMessageDialog(null, "PW blank is empty.","Warning",JOptionPane.ERROR_MESSAGE);
					txtpPW.requestFocus();
					return;
				} else if(txtpRePW.getText() == null || txtpRePW.getText().equals("")){
					JOptionPane.showMessageDialog(null, "RePW blank is empty.","Warning",JOptionPane.ERROR_MESSAGE);
					txtpRePW.requestFocus();
					return;
				} else if(txtEmail.getText() == null || txtEmail.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Email blank is empty.","Warning",JOptionPane.ERROR_MESSAGE);
					txtEmail.requestFocus();
					return;
				} else if(txtPhone.getText() == null || txtPhone.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Phone blank is empty.","Warning",JOptionPane.ERROR_MESSAGE);
					txtPhone.requestFocus();
					return;
				} else if(txtPhoto.getText() == null || txtPhoto.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Photo blank is empty.","Warning",JOptionPane.ERROR_MESSAGE);
					txtPhoto.requestFocus();
					return;
				}
				
				/* 길이 확인 */
				if(txtID.getText().length() < 4){
					JOptionPane.showMessageDialog(null, "ID blank is too short.","Warning",JOptionPane.ERROR_MESSAGE);
					txtID.requestFocus();
					return;
				} else if(txtName.getText().length() < 2){
					JOptionPane.showMessageDialog(null, "Name blank is too short.","Warning",JOptionPane.ERROR_MESSAGE);
					txtName.requestFocus();
					return;
				} else if(txtpPW.getText().length() < 4 ){
					JOptionPane.showMessageDialog(null, "PW blank is too short.","Warning",JOptionPane.ERROR_MESSAGE);
					txtpPW.requestFocus();
					return;
				} else if(txtpRePW.getText().length() < 4 ){				
					JOptionPane.showMessageDialog(null, "RePW blank is too short.","Warning",JOptionPane.ERROR_MESSAGE);
					txtpRePW.requestFocus();
					return;
				}
				
				/* PW 확인 */
				if(txtpPW.getText().compareTo(txtpRePW.getText())!=0){
					JOptionPane.showMessageDialog(null, "Re and RePW blanks aren't same.","Warning",JOptionPane.ERROR_MESSAGE);
					txtpRePW.requestFocus();
					return;
				}
				
				/* Email 확인 */
				if((!txtEmail.getText().contains("@"))||(!txtEmail.getText().contains("."))){
					JOptionPane.showMessageDialog(null, "Email blank is wrong.","Warning",JOptionPane.ERROR_MESSAGE);
					txtEmail.requestFocus();
					return;
				}
				
				/* Phone '-' 확인 */
				{
					int count=0;
					for(int i=0; i<txtPhone.getText().length();i++){
						if(txtPhone.getText().charAt(i)=='-')
							count ++;
					}
					if(count!=2){
						JOptionPane.showMessageDialog(null, "Phone blank has two hyphen(-).","Warning",JOptionPane.ERROR_MESSAGE);
						txtPhone.requestFocus();
						return;
					}
				}
				
				/* Phone 확인 */
				{
					boolean flag=true;
					StringTokenizer st = new StringTokenizer(txtPhone.getText(),"-");
					String cmp[];
					
					int n = st.countTokens();
					cmp = new String[n];
					
					for(int j=0;j<n;j++) {
						String token = st.nextToken();
						cmp[j]=new String(token);
					}
					if(cmp[0].length()==2 && cmp[1].length()<5 && cmp[1].length()>2 && cmp[2].length()==4){
						flag=false;
					} else if (cmp[0].length()==3 && cmp[1].length()==4 && cmp[2].length()==4){
						flag=false;
					}
					
					if(flag){
						JOptionPane.showMessageDialog(null, "Phone blank is wrong.","Warning",JOptionPane.ERROR_MESSAGE);
						txtPhone.requestFocus();
						return;
					}
				}
				
				/* Photo 확인 */
				{
					File file = new File(txtPhoto.getText());
					
					if(!file.exists()){
						JOptionPane.showMessageDialog(null, "The file doesn't exist.","Warning",JOptionPane.ERROR_MESSAGE);
						txtPhoto.requestFocus();
						return;
					}
					
					try {
							if(ImageIO.read(file)==null){
								JOptionPane.showMessageDialog(null, "The file isn't image.","Warning",JOptionPane.ERROR_MESSAGE);
								txtPhoto.requestFocus();
								return;
							}
					}catch(IOException e1){	}
				}
				
				/* ID 중복 확인 */
				if(Control_Data.isSameID(txtID.getText())){
					JOptionPane.showMessageDialog(null, "The ID is same with another ID.","Warning",JOptionPane.ERROR_MESSAGE);
					txtID.requestFocus();
					return;
				}
				
				Control_Data.insertData(txtID.getText(), txtpPW.getText(), txtName.getText(), txtEmail.getText(), txtPhone.getText(), txtPhoto.getText());
				setVisible(false);
			}
		}
	}
}
