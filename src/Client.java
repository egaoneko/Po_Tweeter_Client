/*
 * ���α׷� �̸� : Po Tweeter
 * ���� : Version 0.9
 * ���ϸ� : Client.Java
 * ���� : Ŭ���̾�Ʈ ���� ȭ�� (�α��� ȭ��)
 * ���� ���� ��¥ : 14.02.09
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.JPasswordField;

public class Client extends JFrame {

	/* ���� */
	final static String SERVER_ADDR="127.0.0.1"; //�ڹ� ä�� ���� �ּ� 
	final static int SERVER_PORT=9353; //�ڹ� ä�ü��� ��Ʈ��ȣ
	
	/* UI */
	private JLabel lblLogo;
	private JPanel contentPane;
	private JLabel lblID;
	private JTextField txtfID;
	private JLabel lblPW;
	private JPasswordField txtfpPW;
	private JButton btnEnter;
	private JButton btnJoin;
	private JLabel lblLogoImage;
	private String id=null;
	private String pw=null;
	
	/* ������ */
	public Client() 
	{
		setResizable(false);
		setTitle("Po Tweeter");

		init();
		start();
		
		File file = new File("icon/profile");
		if(!file.exists())
			file.mkdir();
		file = new File("icon/data");
		if(!file.exists())
			file.mkdir();
	}

	/* ȭ�鱸�� �޼ҵ� */
	public void init() 
	{
		/* UI */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 286, 295);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension windowSize = this.getSize();
		int windowX = Math.max(0, (screenSize.width  - windowSize.width ) / 2);
		int windowY = Math.max(0, (screenSize.height - windowSize.height) / 2);
		this.setLocation(windowX, windowY);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		/* ID */
		lblID = new JLabel("ID");
		lblID.setFont(new Font("����", Font.BOLD, 17));
		lblID.setHorizontalAlignment(SwingConstants.CENTER);
		txtfID = new JTextField();
		txtfID.setFont(new Font("����", Font.BOLD, 17));
		txtfID.setHorizontalAlignment(SwingConstants.CENTER);
		txtfID.requestFocus();	// ��Ŀ�� �̵�

		/* PW */
		lblPW = new JLabel("PW");
		lblPW.setFont(new Font("����", Font.BOLD, 17));
		lblPW.setHorizontalAlignment(SwingConstants.CENTER);
		txtfpPW = new JPasswordField();
		txtfpPW.setFont(new Font("����", Font.BOLD, 17));
		txtfpPW.setEchoChar('*');
		txtfpPW.setHorizontalAlignment(SwingConstants.CENTER);

		/* Btn */
		btnEnter = new JButton("Enter");
		btnEnter.setFont(new Font("����", Font.BOLD, 12));
		btnEnter.setEnabled(false);
		btnJoin = new JButton("Join");
		btnJoin.setFont(new Font("����", Font.BOLD, 12));
		
		/* Logo */
		lblLogo = new JLabel("Po Tweeter");
		lblLogoImage = new JLabel(new ImageIcon("icon/ui32/bubbles4.png"));
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setFont(new Font("����", Font.PLAIN, 30));
		lblLogo.setForeground(new Color(255, 182, 193));
		lblLogo.setOpaque(true);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
									.addComponent(btnEnter, GroupLayout.PREFERRED_SIZE, 101, 

GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
									.addComponent(btnJoin, GroupLayout.PREFERRED_SIZE, 92, 

GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblID)
										.addComponent(lblPW))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(txtfpPW, GroupLayout.DEFAULT_SIZE, 178, 

Short.MAX_VALUE)
										.addComponent(txtfID, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
										.addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 168, 

GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblLogoImage, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
							.addGap(160)))
					.addGap(25))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(32, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblLogo)
						.addComponent(lblLogoImage, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblID, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtfID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, 

GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPW, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtfpPW, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, 

GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnJoin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnEnter, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
					.addGap(21))
		);
		contentPane.setLayout(gl_contentPane);
	}

	/* �̺�Ʈ ���� �޼ҵ� */
	public void start() { 
		btnEnter.addActionListener(new btnEnterAction()); // ����
		btnJoin.addActionListener(new btnJoinAction()); // ����
		txtfID.addActionListener(new txtfIDAction()); // ID -> PW ��Ŀ�� �̵�
		txtfpPW.addActionListener(new txtfpPWAction()); // ����
		txtfID.addKeyListener(new txtfIDKeyListener()); // ID �Է� üũ
		txtfpPW.addKeyListener(new txtfpPWKeyListener()); // PW �Է� üũ
	}

	/* ���� �׼� �̺�Ʈ */
	class btnEnterAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnEnter) 
			{
				login();		
			}
		}
	}
	
	/* ���� �׼� �̺�Ʈ */
	class btnJoinAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnJoin) 
			{
				Join join = new Join();
			}
		}
	}
	
	/* ID->PW ��Ŀ�� �̵� �׼� �̺�Ʈ */
	class txtfIDAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == txtfID) 
			{
				txtfpPW.requestFocus();				
			}
		}
	}
	
	/* PW->�α��� �׼� �̺�Ʈ */
	class txtfpPWAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == txtfpPW) 
			{
				login();		
			}
		}
	}
	
	/* ID �Է� Ȯ�� Ű �̺�Ʈ */
	class txtfIDKeyListener implements KeyListener
	{
        @Override
        public void keyTyped(KeyEvent e) {
        }
        @Override
        public void keyPressed(KeyEvent e) {
            if (txtfID.getText().length() >= 2 && txtfpPW.getText().length() >= 2) {
            	btnEnter.setEnabled(true);
            } else {
            	btnEnter.setEnabled(false);
            }
        }
        @Override
        public void keyReleased(KeyEvent e) {
        }

    };
    
    /* PW �Է� Ȯ�� Ű �̺�Ʈ */
    class txtfpPWKeyListener implements KeyListener
	{
        @Override
        public void keyTyped(KeyEvent e) {
        }
        @Override
        public void keyPressed(KeyEvent e) {
            if (txtfID.getText().length() >= 2 && txtfpPW.getText().length() >= 2) {
            	btnEnter.setEnabled(true);
            } else {
            	btnEnter.setEnabled(false);
            }
        }
        @Override
        public void keyReleased(KeyEvent e) {
        }

    };
	
    /* �α��� */
	private void login() {
		/* �α��� */
		final int OVERLAPLOGIN=0; //�ߺ� �α��� �� ���
		final int WRONGPASSWORD=1; //�߸��� ��й�ȣ�� ���
		final int SUCCESSLOGIN=2; //�������� �α��� ���
		final int NONEXISTENCEID=3; //���̵� �������� ���� ���
		int logCheck=OVERLAPLOGIN;
		
		id = txtfID.getText().trim(); // ������ ���� �𸣴� ���� ���� trim() ���
		pw = txtfpPW.getText().trim(); // ������ ������ �𸣹Ƿ� ��������
		
		logCheck=Login.loginCheck(id, pw);
		
		switch(logCheck){
		case OVERLAPLOGIN :
			JOptionPane.showMessageDialog(null, "It is already online.","Warning",JOptionPane.ERROR_MESSAGE);
			txtfID.setText(null);
			txtfpPW.setText(null);
			txtfID.requestFocus();
			break;
		case WRONGPASSWORD :
			JOptionPane.showMessageDialog(null, "You enter the wrong password.","Warning",JOptionPane.ERROR_MESSAGE);
			txtfID.setText(null);
			txtfpPW.setText(null);
			txtfID.requestFocus();
			break;
		case SUCCESSLOGIN :
			MainView view = new MainView(id,pw);
			setVisible(false);	
			break;
		case NONEXISTENCEID :
			JOptionPane.showMessageDialog(null, "This id doesn't exist.","Warning",JOptionPane.ERROR_MESSAGE);
			txtfID.setText(null);
			txtfpPW.setText(null);
			txtfID.requestFocus();
			break;
		}
	}
}
