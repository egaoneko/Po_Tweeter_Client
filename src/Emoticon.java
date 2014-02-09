/*
 * 프로그램 이름 : Po Tweeter
 * 버전 : Version 0.9
 * 파일명 : Emoticon.java
 * 설명 : 이모티콘
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
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JTextPane;

public class Emoticon extends JFrame implements ActionListener{

	/* UI */
	private JTabbedPane pane;
	private JPanel tabPane1;
	private JPanel tabPane2;
	private JPanel tabPane3;
	private JPanel tabPane4;
	private JPanel tabPane5;
	private JPanel tabPane6;
	private JPanel tabPane1_2;
	private JPanel tabPane2_2;
	private JPanel tabPane4_2;
	
	/* 송신 */
	private DataOutputStream dos;
	
	/* Tab 1 */
	private JButton btnt10;
	private JButton btnt11;
	private JButton btnt12;
	private JButton btnt13;
	private JButton btnt14;
	private JButton btnt15;
	private JButton btnt16;
	private JButton btnt17;
	private JButton btnt18;
	private JButton btnt19;
	private JButton btnt110;
	private JButton btnt111;
	private JButton btnt112;
	private JButton btnt113;
	private JButton btnt114;
	private JButton btnt115;
	private JButton btnt116;
	private JButton btnt117;
	private JButton btnt118;
	private JButton btnt119;
	private JButton btnt120;
	private JButton btnt121;
	private JButton btnt122;
	private JButton btnt123;
	private JButton btnt124;
	private JButton btnt125;
	private JButton btnt126;
	private JButton btnt127;
	private JButton btnt128;
	private JButton btnt129;
	private JButton btnt130;
	private JButton btnt131;
	private JButton btnt132;
	private JButton btnt133;
	private JButton btnt134;
	private JButton btnt135;
	private JButton btnt136;
	private JButton btnt137;
	private JButton btnt138;
	private JButton btnt139;
	private JButton btnt140;
	private JButton btnt141;
	private JButton btnt142;
	private JButton btnt143;
	private JButton btnt144;
	private JButton btnt145;
	private JButton btnt146;
	private JButton btnt147;
	private JButton btnt148;
	private JButton btnt149;
	private JButton btnt150;
	private JButton btnt151;
	private JButton btnt152;
	private JButton btnt153;
	private JButton btnt154;
	private JButton btnt155;
	private JButton btnt156;
	private JButton btnt157;
	private JButton btnt158;
	private JButton btnt159;
	private JButton btnt160;
	private JButton btnt161;
	private JButton btnt162;
	private JButton btnt163;
	private JButton btnt164;
	private JButton btnt165;
	private JButton btnt166;
	private JButton btnt167;
	private JButton btnt168;
	private JButton btnt169;
	private JButton btnt170;
	private JButton btnt171;
	private JButton btnt172;
	private JButton btnt173;
	private JButton btnt174;
	private JButton btnt175;
	private JButton btnt176;
	private JButton btnt177;
	private JButton btnt178;
	private JButton btnt179;
	private JButton btnt180;
	private JButton btnt181;
	private JButton btnt182;
	private JButton btnt183;
	private JButton btnt184;
	private JButton btnt185;
	private JButton btnt186;
	private JButton btnt187;
	
	/* Tab 2 */
	
	private JButton btnt20;
	private JButton btnt21;
	private JButton btnt23;
	private JButton btnt24;
	private JButton btnt25;
	private JButton btnt26;
	private JButton btnt22;
	private JButton btnt27;
	private JButton btnt28;
	private JButton btnt29;
	private JButton btnt210;
	private JButton btnt211;
	private JButton btnt212;
	private JButton btnt213;
	private JButton btnt214;
	private JButton btnt215;
	private JButton btnt216;
	
	private JButton btnt217;
	private JButton btnt218;
	private JButton btnt219;
	private JButton btnt220;
	private JButton btnt221;
	private JButton btnt222;
	private JButton btnt223;
	private JButton btnt224;
	private JButton btnt225;
	
	/* Tab 3 */
	private JButton btnt301;
	private JButton btnt302;
	private JButton btnt303;
	private JButton btnt304;
	private JButton btnt305;
	private JButton btnt306;
	private JButton btnt307;
	private JButton btnt308;
	private JButton btnt309;
	private JButton btnt310;
	private JButton btnt311;
	private JButton btnt312;
	private JButton btnt313;
	private JButton btnt314;
	private JButton btnt315;
	private JButton btnt316;
	private JButton btnt317;
	private JButton btnt318;
	private JButton btnt319;
	private JButton btnt320;
	private JButton btnt321;
	private JButton btnt322;
	private JButton btnt323;
	private JButton btnt324;
	private JButton btnt325;
	private JButton btnt326;
	private JButton btnt327;
	private JButton btnt328;
	private JButton btnt329;
	
	/* Tab 4 */
	private JButton btnt41;
	private JButton btnt42;
	private JButton btnt43;
	private JButton btnt44;
	private JButton btnt45;
	private JButton btnt46;
	private JButton btnt47;
	private JButton btnt48;
	private JButton btnt49;
	private JButton btnt410;
	private JButton btnt411;
	private JButton btnt412;
	private JButton btnt413;
	private JButton btnt414;
	private JButton btnt415;
	private JButton btnt416;
	private JButton btnt417;
	private JButton btnt418;
	private JButton btnt419;
	private JButton btnt420;
	private JButton btnt421;
	private JButton btnt422;
	private JButton btnt423;
	private JButton btnt424;
	private JButton btnt425;
	private JButton btnt426;
	private JButton btnt427;
	private JButton btnt428;
	private JButton btnt429;
	private JButton btnt430;
	private JButton btnt431;
	private JButton btnt432;
	private JButton btnt433;
	private JButton btnt434;
	private JButton btnt435;
	private JButton btnt436;
	private JButton btnt437;
	private JButton btnt438;
	private JButton btnt439;
	private JButton btnt440;
	private JButton btnt441;
	private JButton btnt442;
	private JButton btnt443;
	private JButton btnt444;
	private JButton btnt445;
	private JButton btnt446;
	private JButton btnt447;
	private JButton btnt448;
	private JButton btnt449;
	private JButton btnt450;
	
	/* Tab 5 */
	private JButton btnt51;
	private JButton btnt52;
	private JButton btnt53;
	private JButton btnt54;
	private JButton btnt55;
	private JButton btnt56;
	private JButton btnt57;
	private JButton btnt58;
	private JButton btnt59;
	private JButton btnt510;
	private JButton btnt511;
	private JButton btnt512;
	private JButton btnt513;
	private JButton btnt514;
	private JButton btnt515;
	private JButton btnt516;
	private JButton btnt517;
	
	/* Tab 6 */
	private JButton btnt601;
	private JButton btnt602;
	private JButton btnt603;
	private JButton btnt604;
	private JButton btnt605;
	private JButton btnt606;
	private JButton btnt607;
	private JButton btnt608;
	private JButton btnt609;
	private JButton btnt610;
	private JButton btnt611;
	private JButton btnt612;
	private JButton btnt613;
	private JButton btnt614;
	private JButton btnt615;
	private JButton btnt616;
	private JButton btnt617;
	private JButton btnt618;
	private JButton btnt619;

	
	/* 생성자 */
	public Emoticon(DataOutputStream dos) {
		setTitle("Emotican");
		setResizable(false);
		init();
		start();
		this.dos=dos;
	}

	/* 화면구성 메소드 */
	private void init() {
		
		/* UI */
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 385, 332);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension windowSize = this.getSize();
		int windowX = Math.max(0, (screenSize.width  - windowSize.width ) / 2);
		int windowY = Math.max(0, (screenSize.height - windowSize.height) / 2);
		this.setLocation(windowX+400, windowY);
		
		tabPane1 = new JPanel();
		tabPane2 = new JPanel();
		tabPane3 = new JPanel();
		tabPane4 = new JPanel();
		tabPane6 = new JPanel();
		
		
		pane = new JTabbedPane();
		pane.setTabPlacement(JTabbedPane.RIGHT);
		pane.setUI(new UI());
		setContentPane(pane);
		pane.addTab("tab1", tabPane1);
		
		btnt10 = new JButton("");
		btnt10.addActionListener(this);
		btnt10.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[0]));
		
		btnt11 = new JButton("");
		btnt11.addActionListener(this);
		btnt11.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[1]));
		
		btnt12 = new JButton("");
		btnt12.addActionListener(this);
		btnt12.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[2]));
		
		btnt13 = new JButton("");
		btnt13.addActionListener(this);
		btnt13.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[3]));
		
		btnt14 = new JButton("");
		btnt14.addActionListener(this);
		btnt14.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[4]));
		
		btnt15 = new JButton("");
		btnt15.addActionListener(this);
		btnt15.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[5]));
		
		btnt16 = new JButton("");
		btnt16.addActionListener(this);
		btnt16.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[6]));
		
		btnt17 = new JButton("");
		btnt17.addActionListener(this);
		btnt17.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[7]));
		
		btnt18 = new JButton("");
		btnt18.addActionListener(this);
		btnt18.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[8]));
		
		btnt19 = new JButton("");
		btnt19.addActionListener(this);
		btnt19.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[9]));
		
		btnt110 = new JButton("");
		btnt110.addActionListener(this);
		btnt110.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[10]));
		
		btnt111 = new JButton("");
		btnt111.addActionListener(this);
		btnt111.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[11]));
		
		btnt112 = new JButton("");
		btnt112.addActionListener(this);
		btnt112.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[12]));
		
		btnt113 = new JButton("");
		btnt113.addActionListener(this);
		btnt113.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[13]));
		
		btnt114 = new JButton("");
		btnt114.addActionListener(this);
		btnt114.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[14]));
		
		btnt115 = new JButton("");
		btnt115.addActionListener(this);
		btnt115.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[15]));
		
		btnt116 = new JButton("");
		btnt116.addActionListener(this);
		btnt116.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[16]));
		
		btnt117 = new JButton("");
		btnt117.addActionListener(this);
		btnt117.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[17]));
		
		btnt118 = new JButton("");
		btnt118.addActionListener(this);
		btnt118.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[18]));
		
		btnt119 = new JButton("");
		btnt119.addActionListener(this);
		btnt119.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[19]));
		
		btnt120 = new JButton("");
		btnt120.addActionListener(this);
		btnt120.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[20]));
		
		btnt121 = new JButton("");
		btnt121.addActionListener(this);
		btnt121.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[21]));
		
		btnt122 = new JButton("");
		btnt122.addActionListener(this);
		btnt122.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[22]));
		
		btnt123 = new JButton("");
		btnt123.addActionListener(this);
		btnt123.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[23]));
		
		btnt124 = new JButton("");
		btnt124.addActionListener(this);
		btnt124.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[24]));
		
		btnt125 = new JButton("");
		btnt125.addActionListener(this);
		btnt125.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[25]));
		
		btnt126 = new JButton("");
		btnt126.addActionListener(this);
		btnt126.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[26]));
		
		btnt127 = new JButton("");
		btnt127.addActionListener(this);
		btnt127.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[27]));
		
		btnt128 = new JButton("");
		btnt128.addActionListener(this);
		btnt128.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[28]));
		
		btnt129 = new JButton("");
		btnt129.addActionListener(this);
		btnt129.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[29]));
		
		btnt130 = new JButton("");
		btnt130.addActionListener(this);
		btnt130.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[30]));
		
		btnt131 = new JButton("");
		btnt131.addActionListener(this);
		btnt131.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[31]));
		
		btnt132 = new JButton("");
		btnt132.addActionListener(this);
		btnt132.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[32]));
		
		btnt133 = new JButton("");
		btnt133.addActionListener(this);
		btnt133.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[33]));
		
		btnt134 = new JButton("");
		btnt134.addActionListener(this);
		btnt134.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[34]));
		
		btnt135 = new JButton("");
		btnt135.addActionListener(this);
		btnt135.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[35]));
		
		btnt136 = new JButton("");
		btnt136.addActionListener(this);
		btnt136.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[36]));
		
		btnt137 = new JButton("");
		btnt137.addActionListener(this);
		btnt137.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[37]));
		
		btnt138 = new JButton("");
		btnt138.addActionListener(this);
		btnt138.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[38]));
		
		btnt139 = new JButton("");
		btnt139.addActionListener(this);
		btnt139.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[39]));
		
		btnt140 = new JButton("");
		btnt140.addActionListener(this);
		btnt140.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[40]));
		
		btnt141 = new JButton("");
		btnt141.addActionListener(this);
		btnt141.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[41]));
		
		btnt142 = new JButton("");
		btnt142.addActionListener(this);
		btnt142.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[42]));
		
		btnt143 = new JButton("");
		btnt143.addActionListener(this);
		btnt143.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[43]));
		
	
		btnt144 = new JButton("");
		btnt144.addActionListener(this);
		btnt144.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[44]));
		
		
		btnt145 = new JButton("");
		btnt145.addActionListener(this);
		btnt145.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[45]));
		
	
		btnt146 = new JButton("");
		btnt146.addActionListener(this);
		btnt146.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[46]));
		
		btnt187 = new JButton("");
		btnt187.addActionListener(this);
		btnt187.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[87]));
		
		GroupLayout gl_tabPane1 = new GroupLayout(tabPane1);
		gl_tabPane1.setHorizontalGroup(
			gl_tabPane1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabPane1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabPane1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabPane1.createSequentialGroup()
							.addComponent(btnt10, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt11, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt12, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt13, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt14, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt15, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt16, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt17, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane1.createSequentialGroup()
							.addComponent(btnt18, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt19, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt110, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt111, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt112, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt113, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt114, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt115, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane1.createSequentialGroup()
							.addComponent(btnt116, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt117, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt118, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt119, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt120, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt121, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt122, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt123, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane1.createSequentialGroup()
							.addComponent(btnt124, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt125, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt126, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt127, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt128, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt129, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt130, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt131, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane1.createSequentialGroup()
							.addComponent(btnt132, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt133, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt134, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt135, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt136, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt137, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt138, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt139, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane1.createSequentialGroup()
							.addComponent(btnt140, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt141, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt142, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt143, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt144, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt145, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt146, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt187, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(272, Short.MAX_VALUE))
		);
		gl_tabPane1.setVerticalGroup(
			gl_tabPane1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabPane1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabPane1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt16, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt15, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt14, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt13, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt12, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt11, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt10, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt17, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabPane1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt18, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt19, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt110, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt111, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt112, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt113, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt114, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt115, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_tabPane1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt116, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt117, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt118, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt119, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt120, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt121, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt122, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt123, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_tabPane1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt124, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt125, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt126, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt127, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt128, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt129, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt130, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt131, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_tabPane1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt132, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt133, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt134, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt135, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt136, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt137, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt138, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt139, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_tabPane1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt140, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt141, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt142, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt143, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt144, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt145, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt146, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt187, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(254))
		);
		tabPane1.setLayout(gl_tabPane1);
		tabPane1_2 = new JPanel();
		pane.addTab("tab1_2", tabPane1_2);
		
		btnt147 = new JButton("");
		btnt147.addActionListener(this);
		btnt147.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[47]));
		
	
		btnt148 = new JButton("");
		btnt148.addActionListener(this);
		btnt148.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[48]));
		
	
		btnt149 = new JButton("");
		btnt149.addActionListener(this);
		btnt149.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[49]));
		
	
		btnt150 = new JButton("");
		btnt150.addActionListener(this);
		btnt150.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[50]));
		
		
		btnt151 = new JButton("");
		btnt151.addActionListener(this);
		btnt151.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[51]));
		

		btnt152 = new JButton("");
		btnt152.addActionListener(this);
		btnt152.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[52]));
		
		
		btnt153 = new JButton("");
		btnt153.addActionListener(this);
		btnt153.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[53]));
		
	
		btnt154 = new JButton("");
		btnt154.addActionListener(this);
		btnt154.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[54]));
		
		
		btnt155 = new JButton("");
		btnt155.addActionListener(this);
		btnt155.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[55]));
		
		
		btnt156 = new JButton("");
		btnt156.addActionListener(this);
		btnt156.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[56]));
		
	
		btnt157 = new JButton("");
		btnt157.addActionListener(this);
		btnt157.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[57]));
		

		btnt158 = new JButton("");
		btnt158.addActionListener(this);
		btnt158.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[58]));
		
	
		btnt159 = new JButton("");
		btnt159.addActionListener(this);
		btnt159.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[59]));
		
	
		btnt160 = new JButton("");
		btnt160.addActionListener(this);
		btnt160.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[60]));
		
	
		btnt161 = new JButton("");
		btnt161.addActionListener(this);
		btnt161.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[61]));
		
	
		btnt162 = new JButton("");
		btnt162.addActionListener(this);
		btnt162.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[62]));
		
		
		btnt163 = new JButton("");
		btnt163.addActionListener(this);
		btnt163.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[63]));
		
	
		btnt164 = new JButton("");
		btnt164.addActionListener(this);
		btnt164.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[64]));
		
		
		btnt165 = new JButton("");
		btnt165.addActionListener(this);
		btnt165.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[65]));
		
		
		btnt166 = new JButton("");
		btnt166.addActionListener(this);
		btnt166.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[66]));
		
	
		btnt167 = new JButton("");
		btnt167.addActionListener(this);
		btnt167.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[67]));
		
		
		btnt168 = new JButton("");
		btnt168.addActionListener(this);
		btnt168.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[68]));
		
	
		btnt169 = new JButton("");
		btnt169.addActionListener(this);
		btnt169.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[69]));
		
	
		btnt170 = new JButton("");
		btnt170.addActionListener(this);
		btnt170.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[70]));
		
	
		btnt171 = new JButton("");
		btnt171.addActionListener(this);
		btnt171.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[71]));
		
	
		btnt172 = new JButton("");
		btnt172.addActionListener(this);
		btnt172.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[72]));
		
	
		btnt173 = new JButton("");
		btnt173.addActionListener(this);
		btnt173.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[73]));
		
	
		btnt174 = new JButton("");
		btnt174.addActionListener(this);
		btnt174.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[74]));
		
	
		btnt175 = new JButton("");
		btnt175.addActionListener(this);
		btnt175.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[75]));
		

		btnt176 = new JButton("");
		btnt176.addActionListener(this);
		btnt176.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[76]));
		
		
		btnt177 = new JButton("");
		btnt177.addActionListener(this);
		btnt177.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[77]));
		
	
		btnt178 = new JButton("");
		btnt178.addActionListener(this);
		btnt178.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[78]));
		
	
		btnt179 = new JButton("");
		btnt179.addActionListener(this);
		btnt179.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[79]));
		
		
		btnt180 = new JButton("");
		btnt180.addActionListener(this);
		btnt180.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[80]));
		
	
		btnt181 = new JButton("");
		btnt181.addActionListener(this);
		btnt181.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[81]));
		
	
		btnt182 = new JButton("");
		btnt182.addActionListener(this);
		btnt182.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[82]));
		
	
		btnt183 = new JButton("");
		btnt183.addActionListener(this);
		btnt183.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[83]));
		
	
		btnt184 = new JButton("");
		btnt184.addActionListener(this);
		btnt184.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[84]));
		
	
		btnt185 = new JButton("");
		btnt185.addActionListener(this);
		btnt185.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[85]));
		
	
		btnt186 = new JButton("");
		btnt186.addActionListener(this);
		btnt186.setIcon(new ImageIcon(Emot_Adr.emot_t[0]+Emot_Adr.emot_t1[86]));
		
		GroupLayout gl_tabPane1_2 = new GroupLayout(tabPane1_2);
		gl_tabPane1_2.setHorizontalGroup(
			gl_tabPane1_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabPane1_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabPane1_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabPane1_2.createSequentialGroup()
							.addComponent(btnt147, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt148, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt149, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt150, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt151, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt152, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt153, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt154, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane1_2.createSequentialGroup()
							.addComponent(btnt155, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt156, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt157, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt158, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt159, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt160, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt161, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt162, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane1_2.createSequentialGroup()
							.addComponent(btnt163, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt164, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt165, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt166, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt167, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt168, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt169, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt170, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane1_2.createSequentialGroup()
							.addComponent(btnt171, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt172, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt173, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt174, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt175, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt176, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt177, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt178, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane1_2.createSequentialGroup()
							.addComponent(btnt179, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt180, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt181, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt182, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt183, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt184, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt185, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt186, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(272, Short.MAX_VALUE))
		);
		gl_tabPane1_2.setVerticalGroup(
			gl_tabPane1_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabPane1_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabPane1_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt147, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt148, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt149, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt150, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt151, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt152, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt153, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt154, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabPane1_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt155, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt156, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt157, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt158, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt159, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt160, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt161, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt162, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabPane1_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt163, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt164, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt165, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt166, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt167, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt168, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt169, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt170, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabPane1_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt171, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt172, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt173, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt174, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt175, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt176, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt177, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt178, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabPane1_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt186, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt179, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt180, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt181, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt182, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt183, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt184, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt185, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(288, Short.MAX_VALUE))
		);
		tabPane1_2.setLayout(gl_tabPane1_2);
		
		pane.addTab("tab2", tabPane2);
		
		btnt20 = new JButton("");
		btnt20.addActionListener(this);
		btnt20.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[0]));
		
		btnt21 = new JButton("");
		btnt21.addActionListener(this);
		btnt21.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[1]));
		
		btnt22 = new JButton("");
		btnt22.addActionListener(this);
		btnt22.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[2]));
		
		btnt23 = new JButton("");
		btnt23.addActionListener(this);
		btnt23.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[3]));
		
		btnt24 = new JButton("");
		btnt24.addActionListener(this);
		btnt24.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[4]));
		
		btnt25 = new JButton("");
		btnt25.addActionListener(this);
		btnt25.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[5]));
		
		btnt26 = new JButton("");
		btnt26.addActionListener(this);
		btnt26.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[6]));
		
		btnt27 = new JButton("");
		btnt27.addActionListener(this);
		btnt27.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[7]));
		
		btnt28 = new JButton("");
		btnt28.addActionListener(this);
		btnt28.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[8]));
		
		btnt29 = new JButton("");
		btnt29.addActionListener(this);
		btnt29.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[9]));
		
		btnt210 = new JButton("");
		btnt210.addActionListener(this);
		btnt210.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[10]));
		
		btnt211 = new JButton("");
		btnt211.addActionListener(this);
		btnt211.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[11]));
		
		btnt212 = new JButton("");
		btnt212.addActionListener(this);
		btnt212.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[12]));
		
		btnt213 = new JButton("");
		btnt213.addActionListener(this);
		btnt213.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[13]));
		
		btnt214 = new JButton("");
		btnt214.addActionListener(this);
		btnt214.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[14]));
		
		btnt215 = new JButton("");
		btnt215.addActionListener(this);
		btnt215.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[15]));
		
		btnt216 = new JButton("");
		btnt216.addActionListener(this);
		btnt216.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[16]));
			
			GroupLayout gl_tabPane2 = new GroupLayout(tabPane2);
			gl_tabPane2.setHorizontalGroup(
				gl_tabPane2.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_tabPane2.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_tabPane2.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_tabPane2.createSequentialGroup()
								.addGroup(gl_tabPane2.createParallelGroup(Alignment.LEADING, false)
									.addComponent(btnt22, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(gl_tabPane2.createSequentialGroup()
										.addComponent(btnt20)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnt21, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_tabPane2.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_tabPane2.createSequentialGroup()
										.addComponent(btnt23, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnt24, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnt25, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnt26, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_tabPane2.createSequentialGroup()
										.addComponent(btnt27, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnt28, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))))
							.addGroup(gl_tabPane2.createSequentialGroup()
								.addGroup(gl_tabPane2.createParallelGroup(Alignment.TRAILING, false)
									.addGroup(gl_tabPane2.createSequentialGroup()
										.addComponent(btnt212, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnt213, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_tabPane2.createSequentialGroup()
										.addComponent(btnt29, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnt210, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_tabPane2.createParallelGroup(Alignment.LEADING)
									.addComponent(btnt211, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnt214, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
								.addGap(80))
							.addGroup(gl_tabPane2.createSequentialGroup()
								.addComponent(btnt215, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnt216, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
			gl_tabPane2.setVerticalGroup(
				gl_tabPane2.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_tabPane2.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_tabPane2.createParallelGroup(Alignment.LEADING)
							.addComponent(btnt26, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnt25, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnt24, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnt23, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnt21, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnt20, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_tabPane2.createParallelGroup(Alignment.LEADING)
							.addComponent(btnt22, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnt27, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnt28, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_tabPane2.createParallelGroup(Alignment.LEADING)
							.addComponent(btnt211, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnt210, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnt29, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_tabPane2.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_tabPane2.createSequentialGroup()
								.addGroup(gl_tabPane2.createParallelGroup(Alignment.LEADING)
									.addComponent(btnt212, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnt213, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_tabPane2.createParallelGroup(Alignment.LEADING)
									.addComponent(btnt215, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnt216, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)))
							.addComponent(btnt214, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(180, Short.MAX_VALUE))
			);
			tabPane2.setLayout(gl_tabPane2);
		tabPane2_2 = new JPanel();
		pane.addTab("tab2_2", tabPane2_2);
		
		btnt217 = new JButton("");
		btnt217.addActionListener(this);
		btnt217.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[17]));
		
		btnt218 = new JButton("");
		btnt218.addActionListener(this);
		btnt218.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[18]));
		
		btnt219 = new JButton("");
		btnt219.addActionListener(this);
		btnt219.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[19]));
		
		btnt220 = new JButton("");
		btnt220.addActionListener(this);
		btnt220.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[20]));
		
		btnt221 = new JButton("");
		btnt221.addActionListener(this);
		btnt221.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[21]));
		
		btnt222 = new JButton("");
		btnt222.addActionListener(this);
		btnt222.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[22]));
		
		btnt223 = new JButton("");
		btnt223.addActionListener(this);
		btnt223.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[23]));
		
		btnt224 = new JButton("");
		btnt224.addActionListener(this);
		btnt224.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[24]));
		
		btnt225 = new JButton("");
		btnt225.addActionListener(this);
		btnt225.setIcon(new ImageIcon(Emot_Adr.emot_t[1]+Emot_Adr.emot_t2[25]));
		
		GroupLayout gl_tabPane2_2 = new GroupLayout(tabPane2_2);
		gl_tabPane2_2.setHorizontalGroup(
			gl_tabPane2_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabPane2_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabPane2_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabPane2_2.createSequentialGroup()
							.addComponent(btnt217, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt218, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt219, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane2_2.createSequentialGroup()
							.addGroup(gl_tabPane2_2.createParallelGroup(Alignment.LEADING)
								.addComponent(btnt223, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnt220, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_tabPane2_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_tabPane2_2.createSequentialGroup()
									.addComponent(btnt221, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnt222, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_tabPane2_2.createSequentialGroup()
									.addComponent(btnt224, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnt225, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(107, Short.MAX_VALUE))
		);
		gl_tabPane2_2.setVerticalGroup(
			gl_tabPane2_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabPane2_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabPane2_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt219, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt217, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt218, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabPane2_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt221, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt222, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt220, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabPane2_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt223, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt224, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt225, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(224, Short.MAX_VALUE))
		);
		tabPane2_2.setLayout(gl_tabPane2_2);


		/* Tab 3 */
		pane.addTab("tab3", tabPane3);
		
		btnt301 = new JButton("");
		btnt301.addActionListener(this);
		btnt301.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[0]));
		btnt302 = new JButton("");
		btnt302.addActionListener(this);
		btnt302.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[1]));
		btnt303 = new JButton("");
		btnt303.addActionListener(this);
		btnt303.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[2]));
		btnt304 = new JButton("");
		btnt304.addActionListener(this);
		btnt304.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[3]));
		btnt305 = new JButton("");
		btnt305.addActionListener(this);
		btnt305.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[4]));
		btnt306 = new JButton("");
		btnt306.addActionListener(this);
		btnt306.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[5]));
		btnt307 = new JButton("");
		btnt307.addActionListener(this);
		btnt307.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[6]));
		btnt308 = new JButton("");
		btnt308.addActionListener(this);
		btnt308.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[7]));
		btnt309 = new JButton("");
		btnt309.addActionListener(this);
		btnt309.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[8]));
		btnt310 = new JButton("");
		btnt310.addActionListener(this);
		btnt310.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[9]));
		btnt311 = new JButton("");
		btnt311.addActionListener(this);
		btnt311.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[10]));
		btnt312 = new JButton("");
		btnt312.addActionListener(this);
		btnt312.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[11]));
		btnt313 = new JButton("");
		btnt313.addActionListener(this);
		btnt313.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[12]));
		btnt314 = new JButton("");
		btnt314.addActionListener(this);
		btnt314.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[13]));
		btnt315 = new JButton("");
		btnt315.addActionListener(this);
		btnt315.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[14]));
		btnt316 = new JButton("");
		btnt316.addActionListener(this);
		btnt316.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[15]));
		btnt317 = new JButton("");
		btnt317.addActionListener(this);
		btnt317.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[16]));
		btnt318 = new JButton("");
		btnt318.addActionListener(this);
		btnt318.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[17]));
		btnt319 = new JButton("");
		btnt319.addActionListener(this);
		btnt319.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[18]));
		btnt320 = new JButton("");
		btnt320.addActionListener(this);
		btnt320.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[19]));
		btnt321 = new JButton("");
		btnt321.addActionListener(this);
		btnt321.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[20]));
		btnt322 = new JButton("");
		btnt322.addActionListener(this);
		btnt322.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[21]));
		btnt323 = new JButton("");
		btnt323.addActionListener(this);
		btnt323.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[22]));
		btnt324 = new JButton("");
		btnt324.addActionListener(this);
		btnt324.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[23]));
		btnt325 = new JButton("");
		btnt325.addActionListener(this);
		btnt325.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[24]));
		btnt326 = new JButton("");
		btnt326.addActionListener(this);
		btnt326.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[25]));
		btnt327 = new JButton("");
		btnt327.addActionListener(this);
		btnt327.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[26]));
		btnt328 = new JButton("");
		btnt328.addActionListener(this);
		btnt328.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[27]));
		btnt329 = new JButton("");
		btnt329.addActionListener(this);
		btnt329.setIcon(new ImageIcon(Emot_Adr.emot_t[2]+Emot_Adr.emot_t3[28]));

		
		GroupLayout gl_tabPane3 = new GroupLayout(tabPane3);
		gl_tabPane3.setHorizontalGroup(
			gl_tabPane3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabPane3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabPane3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabPane3.createSequentialGroup()
							.addComponent(btnt319, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt320, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt321, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt322, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane3.createSequentialGroup()
							.addComponent(btnt301, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt302, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt303, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt304, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt305, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt306, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt307, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt308, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt309, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane3.createSequentialGroup()
							.addComponent(btnt310, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt311, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt312, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt313, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane3.createSequentialGroup()
							.addComponent(btnt314, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt315, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt316, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt317, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt318, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane3.createSequentialGroup()
							.addComponent(btnt323, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt324, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt325, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt326, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane3.createSequentialGroup()
							.addComponent(btnt327, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt328, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt329, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		gl_tabPane3.setVerticalGroup(
			gl_tabPane3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabPane3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabPane3.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt302, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
						.addComponent(btnt303, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
						.addComponent(btnt304, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
						.addComponent(btnt305, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
						.addComponent(btnt306, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
						.addComponent(btnt307, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
						.addComponent(btnt308, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
						.addComponent(btnt309, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
						.addComponent(btnt301, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabPane3.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt313, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
						.addComponent(btnt312, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
						.addComponent(btnt311, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
						.addComponent(btnt310, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabPane3.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt318, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
						.addComponent(btnt317, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
						.addComponent(btnt316, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
						.addComponent(btnt315, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
						.addComponent(btnt314, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabPane3.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt319, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt320, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt321, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt322, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabPane3.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt323, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt324, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt325, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt326, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabPane3.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt327, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt328, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt329, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
					.addGap(40))
		);

		tabPane3.setLayout(gl_tabPane3);
		
		/* Tab 5 */
		
		/* Tab4 */
		
		pane.addTab("tab4", tabPane4);
		
		btnt41 = new JButton("");
		btnt41.addActionListener(this);
		btnt41.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[0]));
		
		btnt42 = new JButton("");
		btnt42.addActionListener(this);
		btnt42.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[1]));
		
		btnt43 = new JButton("");
		btnt43.addActionListener(this);
		btnt43.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[2]));
		
		btnt44 = new JButton("");
		btnt44.addActionListener(this);
		btnt44.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[3]));
		
		btnt45 = new JButton("");
		btnt45.addActionListener(this);
		btnt45.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[4]));
		
		btnt46 = new JButton("");
		btnt46.addActionListener(this);
		btnt46.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[5]));
		
		btnt47 = new JButton("");
		btnt47.addActionListener(this);
		btnt47.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[6]));
		
		btnt48 = new JButton("");
		btnt48.addActionListener(this);
		btnt48.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[7]));
		
		btnt49 = new JButton("");
		btnt49.addActionListener(this);
		btnt49.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[8]));
		
		btnt410 = new JButton("");
		btnt410.addActionListener(this);
		btnt410.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[9]));
		
		btnt411 = new JButton("");
		btnt411.addActionListener(this);
		btnt411.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[10]));
		
		btnt412 = new JButton("");
		btnt412.addActionListener(this);
		btnt412.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[11]));
		
		btnt413 = new JButton("");
		btnt413.addActionListener(this);
		btnt413.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[12]));
		
		btnt414 = new JButton("");
		btnt414.addActionListener(this);
		btnt414.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[13]));
		
		btnt415 = new JButton("");
		btnt415.addActionListener(this);
		btnt415.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[14]));
		
		btnt416 = new JButton("");
		btnt416.addActionListener(this);
		btnt416.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[15]));
		
		btnt417 = new JButton("");
		btnt417.addActionListener(this);
		btnt417.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[16]));
		
		btnt418 = new JButton("");
		btnt418.addActionListener(this);
		btnt418.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[17]));
		
		btnt419 = new JButton("");
		btnt419.addActionListener(this);
		btnt419.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[18]));
		
		btnt420 = new JButton("");
		btnt420.addActionListener(this);
		btnt420.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[19]));
		
		btnt421 = new JButton("");
		btnt421.addActionListener(this);
		btnt421.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[20]));
		
		btnt422 = new JButton("");
		btnt422.addActionListener(this);
		btnt422.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[21]));
		
		btnt423 = new JButton("");
		btnt423.addActionListener(this);
		btnt423.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[22]));
		
		btnt424 = new JButton("");
		btnt424.addActionListener(this);
		btnt424.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[23]));
		
		btnt425 = new JButton("");
		btnt425.addActionListener(this);
		btnt425.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[24]));
		
		GroupLayout gl_tabPane4 = new GroupLayout(tabPane4);
		gl_tabPane4.setHorizontalGroup(
			gl_tabPane4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabPane4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabPane4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabPane4.createSequentialGroup()
							.addComponent(btnt41, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt42, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt43, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt44, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane4.createSequentialGroup()
							.addComponent(btnt45, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt46, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt47, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt48, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane4.createSequentialGroup()
							.addComponent(btnt49, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt410, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt411, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt412, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane4.createSequentialGroup()
							.addComponent(btnt413, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt414, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt415, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt416, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane4.createSequentialGroup()
							.addComponent(btnt417, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt418, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt419, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt420, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane4.createSequentialGroup()
							.addComponent(btnt421, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt422, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt423, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt424, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnt425, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(80, Short.MAX_VALUE))
		);
		gl_tabPane4.setVerticalGroup(
			gl_tabPane4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabPane4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabPane4.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt41, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt42, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt43, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt44, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_tabPane4.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt45, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt46, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt47, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt48, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_tabPane4.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt49, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt410, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt411, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt412, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_tabPane4.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt413, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt414, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt415, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt416, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_tabPane4.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt417, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt418, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt419, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt420, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_tabPane4.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt421, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt422, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt423, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt424, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(btnt425, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(102, Short.MAX_VALUE))
		);
		tabPane4.setLayout(gl_tabPane4);
		tabPane4_2 = new JPanel();
		pane.addTab("tab4_2", tabPane4_2);
		
		btnt426 = new JButton("");
		btnt426.addActionListener(this);
		btnt426.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[25]));
		
		btnt427 = new JButton("");
		btnt427.addActionListener(this);
		btnt427.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[26]));
		
		btnt428 = new JButton("");
		btnt428.addActionListener(this);
		btnt428.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[27]));
		
		btnt429 = new JButton("");
		btnt429.addActionListener(this);
		btnt429.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[28]));
		
		btnt430 = new JButton("");
		btnt430.addActionListener(this);
		btnt430.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[29]));
		
		btnt431 = new JButton("");
		btnt431.addActionListener(this);
		btnt431.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[30]));
		
		btnt432 = new JButton("");
		btnt432.addActionListener(this);
		btnt432.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[31]));
		
		btnt433 = new JButton("");
		btnt433.addActionListener(this);
		btnt433.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[32]));
		
		btnt434 = new JButton("");
		btnt434.addActionListener(this);
		btnt434.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[33]));
		
		btnt435 = new JButton("");
		btnt435.addActionListener(this);
		btnt435.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[34]));
		
		btnt436 = new JButton("");
		btnt436.addActionListener(this);
		btnt436.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[35]));
		
		btnt437 = new JButton("");
		btnt437.addActionListener(this);
		btnt437.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[36]));
		
		btnt438 = new JButton("");
		btnt438.addActionListener(this);
		btnt438.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[37]));
		
		btnt439 = new JButton("");
		btnt439.addActionListener(this);
		btnt439.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[38]));
		
		btnt440 = new JButton("");
		btnt440.addActionListener(this);
		btnt440.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[39]));
		
		btnt441 = new JButton("");
		btnt441.addActionListener(this);
		btnt441.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[40]));
		
		btnt442 = new JButton("");
		btnt442.addActionListener(this);
		btnt442.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[41]));
		
		btnt443 = new JButton("");
		btnt443.addActionListener(this);
		btnt443.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[42]));
		
		btnt444 = new JButton("");
		btnt444.addActionListener(this);
		btnt444.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[43]));
		
		btnt445 = new JButton("");
		btnt445.addActionListener(this);
		btnt445.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[44]));
		
		btnt446 = new JButton("");
		btnt446.addActionListener(this);
		btnt446.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[45]));
		
		btnt447 = new JButton("");
		btnt447.addActionListener(this);
		btnt447.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[46]));
		
		btnt448 = new JButton("");
		btnt448.addActionListener(this);
		btnt448.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[47]));
		
		btnt449 = new JButton("");
		btnt449.addActionListener(this);
		btnt449.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[48]));
		
		btnt450 = new JButton("");
		btnt450.addActionListener(this);
		btnt450.setIcon(new ImageIcon(Emot_Adr.emot_t[3]+Emot_Adr.emot_t4[49]));
		
		GroupLayout gl_tabPane4_2 = new GroupLayout(tabPane4_2);
		gl_tabPane4_2.setHorizontalGroup(
			gl_tabPane4_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabPane4_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabPane4_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabPane4_2.createSequentialGroup()
							.addComponent(btnt426, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt427, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt428, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt429, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane4_2.createSequentialGroup()
							.addComponent(btnt430, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt431, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt432, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt433, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane4_2.createSequentialGroup()
							.addComponent(btnt434, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt435, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt436, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt437, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane4_2.createSequentialGroup()
							.addComponent(btnt438, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt439, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt440, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt441, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane4_2.createSequentialGroup()
							.addComponent(btnt442, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt443, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt444, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt445, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane4_2.createSequentialGroup()
							.addComponent(btnt446, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt447, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt448, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt449, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnt450, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(75, Short.MAX_VALUE))
		);
		gl_tabPane4_2.setVerticalGroup(
			gl_tabPane4_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabPane4_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabPane4_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt426, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt427, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt428, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt429, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabPane4_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt430, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt431, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt432, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt433, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabPane4_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt434, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt435, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt436, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt437, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabPane4_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt438, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt439, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt440, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt441, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabPane4_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt442, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt443, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt444, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt445, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabPane4_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt446, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt447, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt448, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt449, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnt450, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(102))
		);
		tabPane4_2.setLayout(gl_tabPane4_2);
		tabPane5 = new JPanel();
		
		pane.addTab("tab5", tabPane5);
		
		btnt51 = new JButton("");
		btnt51.addActionListener(this);
		btnt51.setIcon(new ImageIcon(Emot_Adr.emot_t[4]+Emot_Adr.emot_t5[0]));
		
		btnt52 = new JButton("");
		btnt52.addActionListener(this);
		btnt52.setIcon(new ImageIcon(Emot_Adr.emot_t[4]+Emot_Adr.emot_t5[1]));
		
		btnt53 = new JButton("");
		btnt53.addActionListener(this);
		btnt53.setIcon(new ImageIcon(Emot_Adr.emot_t[4]+Emot_Adr.emot_t5[2]));
		
		btnt54 = new JButton("");
		btnt54.addActionListener(this);
		btnt54.setIcon(new ImageIcon(Emot_Adr.emot_t[4]+Emot_Adr.emot_t5[3]));
		
		btnt55 = new JButton("");
		btnt55.addActionListener(this);
		btnt55.setIcon(new ImageIcon(Emot_Adr.emot_t[4]+Emot_Adr.emot_t5[4]));
		
		btnt56 = new JButton("");
		btnt56.addActionListener(this);
		btnt56.setIcon(new ImageIcon(Emot_Adr.emot_t[4]+Emot_Adr.emot_t5[5]));
		
		btnt57 = new JButton("");
		btnt57.addActionListener(this);
		btnt57.setIcon(new ImageIcon(Emot_Adr.emot_t[4]+Emot_Adr.emot_t5[6]));
		
		btnt58 = new JButton("");
		btnt58.addActionListener(this);
		btnt58.setIcon(new ImageIcon(Emot_Adr.emot_t[4]+Emot_Adr.emot_t5[7]));
		
		btnt59 = new JButton("");
		btnt59.addActionListener(this);
		btnt59.setIcon(new ImageIcon(Emot_Adr.emot_t[4]+Emot_Adr.emot_t5[8]));
		
		btnt510 = new JButton("");
		btnt510.addActionListener(this);
		btnt510.setIcon(new ImageIcon(Emot_Adr.emot_t[4]+Emot_Adr.emot_t5[9]));
		
		btnt511 = new JButton("");
		btnt511.addActionListener(this);
		btnt511.setIcon(new ImageIcon(Emot_Adr.emot_t[4]+Emot_Adr.emot_t5[10]));
		
		btnt512 = new JButton("");
		btnt512.addActionListener(this);
		btnt512.setIcon(new ImageIcon(Emot_Adr.emot_t[4]+Emot_Adr.emot_t5[11]));
		
		btnt513 = new JButton("");
		btnt513.addActionListener(this);
		btnt513.setIcon(new ImageIcon(Emot_Adr.emot_t[4]+Emot_Adr.emot_t5[12]));
		
		btnt514 = new JButton("");
		btnt514.addActionListener(this);
		btnt514.setIcon(new ImageIcon(Emot_Adr.emot_t[4]+Emot_Adr.emot_t5[13]));
		
		btnt515 = new JButton("");
		btnt515.addActionListener(this);
		btnt515.setIcon(new ImageIcon(Emot_Adr.emot_t[4]+Emot_Adr.emot_t5[14]));
		
		btnt516 = new JButton("");
		btnt516.addActionListener(this);
		btnt516.setIcon(new ImageIcon(Emot_Adr.emot_t[4]+Emot_Adr.emot_t5[15]));
		
		btnt517 = new JButton("");
		btnt517.addActionListener(this);
		btnt517.setIcon(new ImageIcon(Emot_Adr.emot_t[4]+Emot_Adr.emot_t5[16]));
		
		
		GroupLayout gl_tabPane5 = new GroupLayout(tabPane5);
		gl_tabPane5.setHorizontalGroup(
			gl_tabPane5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabPane5.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabPane5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabPane5.createSequentialGroup()
							.addComponent(btnt51, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt52, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt53, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt54, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane5.createSequentialGroup()
							.addComponent(btnt55, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt56, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt57, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt58, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane5.createSequentialGroup()
							.addComponent(btnt59, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt510, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt511, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt512, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane5.createSequentialGroup()
							.addComponent(btnt513, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt514, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt515, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnt516, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnt517, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(80, Short.MAX_VALUE))
		);
		gl_tabPane5.setVerticalGroup(
			gl_tabPane5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabPane5.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabPane5.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt51, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt52, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt53, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt54, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_tabPane5.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt55, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt56, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt57, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt58, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_tabPane5.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt59, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt510, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt511, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt512, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_tabPane5.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt513, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt514, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt515, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt516, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(btnt517, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(154, Short.MAX_VALUE))
		);
		tabPane5.setLayout(gl_tabPane5);

		/* Tab 6 */
		pane.addTab("tab6", tabPane6);
		
		btnt601 = new JButton("");
		btnt601.addActionListener(this);
		btnt601.setIcon(new ImageIcon(Emot_Adr.emot_t[5]+Emot_Adr.emot_t6[0]));
		btnt602 = new JButton("");
		btnt602.addActionListener(this);
		btnt602.setIcon(new ImageIcon(Emot_Adr.emot_t[5]+Emot_Adr.emot_t6[1]));
		btnt603 = new JButton("");
		btnt603.addActionListener(this);
		btnt603.setIcon(new ImageIcon(Emot_Adr.emot_t[5]+Emot_Adr.emot_t6[2]));
		btnt604 = new JButton("");
		btnt604.addActionListener(this);
		btnt604.setIcon(new ImageIcon(Emot_Adr.emot_t[5]+Emot_Adr.emot_t6[3]));
		btnt605 = new JButton("");
		btnt605.addActionListener(this);
		btnt605.setIcon(new ImageIcon(Emot_Adr.emot_t[5]+Emot_Adr.emot_t6[4]));
		btnt606 = new JButton("");
		btnt606.addActionListener(this);
		btnt606.setIcon(new ImageIcon(Emot_Adr.emot_t[5]+Emot_Adr.emot_t6[5]));
		btnt607 = new JButton("");
		btnt607.addActionListener(this);
		btnt607.setIcon(new ImageIcon(Emot_Adr.emot_t[5]+Emot_Adr.emot_t6[6]));
		btnt608 = new JButton("");
		btnt608.addActionListener(this);
		btnt608.setIcon(new ImageIcon(Emot_Adr.emot_t[5]+Emot_Adr.emot_t6[7]));
		btnt609 = new JButton("");
		btnt609.addActionListener(this);
		btnt609.setIcon(new ImageIcon(Emot_Adr.emot_t[5]+Emot_Adr.emot_t6[8]));
		btnt610 = new JButton("");
		btnt610.addActionListener(this);
		btnt610.setIcon(new ImageIcon(Emot_Adr.emot_t[5]+Emot_Adr.emot_t6[9]));
		btnt611 = new JButton("");
		btnt611.addActionListener(this);
		btnt611.setIcon(new ImageIcon(Emot_Adr.emot_t[5]+Emot_Adr.emot_t6[10]));
		btnt612 = new JButton("");
		btnt612.addActionListener(this);
		btnt612.setIcon(new ImageIcon(Emot_Adr.emot_t[5]+Emot_Adr.emot_t6[11]));
		btnt613 = new JButton("");
		btnt613.addActionListener(this);
		btnt613.setIcon(new ImageIcon(Emot_Adr.emot_t[5]+Emot_Adr.emot_t6[12]));
		btnt614 = new JButton("");
		btnt614.addActionListener(this);
		btnt614.setIcon(new ImageIcon(Emot_Adr.emot_t[5]+Emot_Adr.emot_t6[13]));
		btnt615 = new JButton("");
		btnt615.addActionListener(this);
		btnt615.setIcon(new ImageIcon(Emot_Adr.emot_t[5]+Emot_Adr.emot_t6[14]));
		btnt616 = new JButton("");
		btnt616.addActionListener(this);
		btnt616.setIcon(new ImageIcon(Emot_Adr.emot_t[5]+Emot_Adr.emot_t6[15]));
		btnt617 = new JButton("");
		btnt617.addActionListener(this);
		btnt617.setIcon(new ImageIcon(Emot_Adr.emot_t[5]+Emot_Adr.emot_t6[16]));
		btnt618 = new JButton("");
		btnt618.addActionListener(this);
		btnt618.setIcon(new ImageIcon(Emot_Adr.emot_t[5]+Emot_Adr.emot_t6[17]));
		btnt619 = new JButton("");
		btnt619.addActionListener(this);
		btnt619.setIcon(new ImageIcon(Emot_Adr.emot_t[5]+Emot_Adr.emot_t6[18]));
		

		GroupLayout gl_tabPane6 = new GroupLayout(tabPane6);
		gl_tabPane6.setHorizontalGroup(
			gl_tabPane6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabPane6.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabPane6.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabPane6.createSequentialGroup()
							.addComponent(btnt601, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt602, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt603, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt604, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt605, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt606, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt607, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt608, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane6.createSequentialGroup()
							.addComponent(btnt609, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt610, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt611, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt612, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt613, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt614, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabPane6.createSequentialGroup()
							.addComponent(btnt615, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt616, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt617, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt618, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnt619, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(45, Short.MAX_VALUE))
		);
							
		gl_tabPane6.setVerticalGroup(
			gl_tabPane6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabPane6.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabPane6.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt608, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
						.addComponent(btnt607, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
						.addComponent(btnt606, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
						.addComponent(btnt605, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
						.addComponent(btnt604, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
						.addComponent(btnt603, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
						.addComponent(btnt602, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
						.addComponent(btnt601, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabPane6.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt614, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
						.addComponent(btnt613, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
						.addComponent(btnt612, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
						.addComponent(btnt611, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
						.addComponent(btnt610, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
						.addComponent(btnt609, GroupLayout.PREFERRED_SIZE, 15, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabPane6.createParallelGroup(Alignment.LEADING)
						.addComponent(btnt619, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt618, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt617, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt615, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnt616, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
	
					.addGap(178))
		);
		
				tabPane6.setLayout(gl_tabPane6);
		
		
		setVisible(true);
	}
	
	/* 이벤트 지정 메소드 */
	public void start() {
	}
	
	public void actionPerformed (ActionEvent e) {
		Object obj= e.getSource();
		JButton btn=(JButton)obj;
		
		send_Message("㎮EMOT㎮"+btn.getIcon().toString()+"㎮");
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

class UI extends BasicTabbedPaneUI {

	@Override
	protected void paintTabBorder(Graphics g, int tabPlacement, int tabIndex,
			int x, int y, int w, int h, boolean isSelected) {
		// TODO Auto-generated method stub
		// 보통 보이는 부분 여기서 그려주고
		g.setColor(Color.white);
		g.drawRoundRect(x, y, w, h, 10, 10);
		if (isSelected) {
			// 여기는 선택시 보여주는 부분을 그려주면 됩니다.
			g.setColor(Color.magenta);
			g.drawLine(x + 4, y + 4, x + w - 4, y + 4);

		}
	}
}
