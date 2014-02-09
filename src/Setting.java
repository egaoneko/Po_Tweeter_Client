/*
 * 프로그램 이름 : Po Tweeter
 * 버전 : Version 0.9
 * 파일명 : Setting.java
 * 설명 : 기능 관리
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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JTextPane;
import javax.swing.JCheckBox;

public class Setting extends JFrame {

	/* UI */
	private JPanel contentPane;
	private JCheckBox chckbxoffline;
	private JCheckBox chckbxAutoEmoticon;
	private JCheckBox chckbxMessage;
	private JLabel lbloffline;
	private JLabel lblAutoEmoticon;
	private JLabel lblMessage;
	
	private String id;
	
	/* 생성자 */
	public Setting(String id) {
		setTitle("Setting");
		setResizable(false);
		
		this.id=id;
		
		init();
		start();
	}

	/* 화면구성 메소드 */
	private void init() {
		
		/* UI */
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 221, 190);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension windowSize = this.getSize();
		int windowX = Math.max(0, (screenSize.width  - windowSize.width ) / 2);
		int windowY = Math.max(0, (screenSize.height - windowSize.height) / 2);
		this.setLocation(windowX+350, windowY);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		chckbxoffline = new JCheckBox("Offline State",MainView.offline);
		
		chckbxAutoEmoticon = new JCheckBox("Auto Emoticon",MainView.autoEmotFlag);
		
		chckbxMessage = new JCheckBox("Message",MainView.messageFlag);
		
		lbloffline = new JLabel();
		lbloffline.setOpaque(true);
		if(MainView.offline){
			lbloffline.setForeground(new Color(135, 206, 250));
			lbloffline.setText("ON");
		}
		else{
			lbloffline.setForeground(new Color(255, 165, 0));
			lbloffline.setText("OFF");
		}
		
		lblAutoEmoticon = new JLabel();
		lblAutoEmoticon.setOpaque(true);
		if(MainView.autoEmotFlag){
			lblAutoEmoticon.setForeground(new Color(135, 206, 250));
			lblAutoEmoticon.setText("ON");
		}
		else{
			lblAutoEmoticon.setForeground(new Color(255, 165, 0));
			lblAutoEmoticon.setText("OFF");
		}
		
		lblMessage = new JLabel();
		lblMessage.setOpaque(true);
		if(MainView.messageFlag){
			lblMessage.setForeground(new Color(135, 206, 250));
			lblMessage.setText("ON");
		}
		else{
			lblMessage.setForeground(new Color(255, 165, 0));
			lblMessage.setText("OFF");
		}
		
		GroupLayout groupLayout = new GroupLayout(contentPane);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(chckbxoffline)
							.addPreferredGap(ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
							.addComponent(lbloffline))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(chckbxAutoEmoticon)
							.addPreferredGap(ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
							.addComponent(lblAutoEmoticon))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(chckbxMessage)
							.addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
							.addComponent(lblMessage)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxoffline)
						.addComponent(lbloffline))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxAutoEmoticon)
						.addComponent(lblAutoEmoticon))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxMessage)
						.addComponent(lblMessage))
					.addContainerGap(41, Short.MAX_VALUE))
		);
		contentPane.setLayout(groupLayout);
		setVisible(true);
	}
	
	/* 이벤트 지정 메소드 */
	public void start() {
		chckbxoffline.addItemListener(new chckbxofflineItem());
		chckbxAutoEmoticon.addItemListener(new chckbxAutoEmoticonItem());
		chckbxMessage.addItemListener(new chckbxMessageItem());
	}
	
	/* 자동 이모티콘 이벤트 */
	class chckbxAutoEmoticonItem implements ItemListener
	{
		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getSource() == chckbxAutoEmoticon) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					MainView.autoEmotFlag=true;
					lblAutoEmoticon.setForeground(new Color(135, 206, 250));
					lblAutoEmoticon.setText("ON");
				}
				else{
					MainView.autoEmotFlag=false;
					lblAutoEmoticon.setForeground(new Color(255, 165, 0));
					lblAutoEmoticon.setText("OFF");
				}	
			}
		}
	}
	
	/* 메시지 이벤트 */
	class chckbxMessageItem implements ItemListener
	{
		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getSource() == chckbxMessage) 
			{
				if(e.getStateChange() == ItemEvent.SELECTED){
					MainView.messageFlag=true;
					lblMessage.setForeground(new Color(135, 206, 250));
					lblMessage.setText("ON");
				}
				else{
					MainView.messageFlag=false;
					lblMessage.setForeground(new Color(255, 165, 0));
					lblMessage.setText("OFF");
				}	
			}
		}
	}
	
	/* 로그오프 이벤트 */
	class chckbxofflineItem implements ItemListener
	{
		@Override
		public void itemStateChanged(ItemEvent e) {
			
			boolean flag;
			
			if (e.getSource() == chckbxoffline) 
			{
				if(e.getStateChange() == ItemEvent.SELECTED){
					flag=Logout.offline(id);
					MainView.offline=true;
					if(!flag){
						JOptionPane.showMessageDialog(null, "This function doesn't work.","Warning",JOptionPane.ERROR_MESSAGE);
						lbloffline.setForeground(new Color(255, 165, 0));
						lbloffline.setText("Fail");
						chckbxoffline.setSelected(false);
						return;
					}
				}
				else{
					flag=Logout.online(id);
					MainView.offline=false;
					if(!flag){
						JOptionPane.showMessageDialog(null, "This function doesn't work.","Warning",JOptionPane.ERROR_MESSAGE);
						lbloffline.setForeground(new Color(255, 165, 0));
						lbloffline.setText("Fail");
						chckbxoffline.setSelected(false);
						return;
					}
				}
				
				if(MainView.offline){
					lbloffline.setForeground(new Color(135, 206, 250));
					lbloffline.setText("ON");
				}
				else{
					lbloffline.setForeground(new Color(255, 165, 0));
					lbloffline.setText("OFF");
				}
			}
		}
	}
	
}
