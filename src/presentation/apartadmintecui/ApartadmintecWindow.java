package presentation.apartadmintecui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ApartadmintecWindow extends JFrame {

	private JPanel contentPane;
	private JTable table_wait1_1;
	private JTable table_sure1_1;
	private JTable table_wait1_2;
	private JTable table_sure1_2;
	private JTable table_wait2_1;
	private JTable table_sure2_1;
	private JTable table_wait2_2;
	private JTable table_sure2_2;
	private JTable table_wait3_1;
	private JTable table_sure3_1;
	private JTable table_wait3_2;
	private JTable table_sure3_2;
	private JTable table_wait4_1;
	private JTable table_sure4_1;
	private JTable table_wait4_2;
	private JTable table_sure4_2;
	private JTable table_arrange1_1;
	private JTable table_arrange1_2;
	private JTable table_arrange2_1;
	private JTable table_arrange2_2;
	private JTable table_arrange3_1;
	private JTable table_arrange3_2;
	private JTable table_arrange4_1;
	private JTable table_arrange4_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApartadmintecWindow frame = new ApartadmintecWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ApartadmintecWindow() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\\u5934\u50CF&\u7B7E\u540D\\\u7F51\u4E0A\u90BB\u5C45.png"));
		setTitle("NJU\u9009\u8BFE\u7CFB\u7EDF-\u9662\u7CFB\u6559\u52A1\u8001\u5E08");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel welcome = new JLabel("Welcome\uFF0CXXX");
		welcome.setBounds(10, 20, 608, 38);
		welcome.setFont(new Font("楷体", Font.PLAIN, 15));
		contentPane.add(welcome);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 731, 21);
		contentPane.add(menuBar);
		
		JMenu help = new JMenu("");
		menuBar.add(help);
		
		JMenuItem mntmHelp = new JMenuItem("help");
		help.add(mntmHelp);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(0, 53, 731, 5);
		contentPane.add(separator);
		
		JPanel buttonzu = new JPanel();
		buttonzu.setBackground(Color.WHITE);
		buttonzu.setBounds(10, 63, 120, 465);
		contentPane.add(buttonzu);
		buttonzu.setLayout(null);
		buttonzu.setOpaque(false);
		
		JButton teacheringplan = new JButton("\u8F93\u5165\u6559\u5B66\u8BA1\u5212");
		teacheringplan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		teacheringplan.setVerticalAlignment(SwingConstants.BOTTOM);
		teacheringplan.setForeground(Color.BLUE);
		teacheringplan.setBounds(0, 0, 121, 120);
		buttonzu.add(teacheringplan);
		teacheringplan.setBackground(Color.WHITE);
		teacheringplan.setFont(new Font("楷体", Font.BOLD, 13));
		teacheringplan.setOpaque(false);
		teacheringplan.setBorderPainted(false);
		
		JLabel picture1 = new JLabel("");
		picture1.setBounds(0, 0, 121, 97);
		buttonzu.add(picture1);
		picture1.setHorizontalAlignment(SwingConstants.CENTER);
		picture1.setIcon(new ImageIcon("E:\\\u5934\u50CF&\u7B7E\u540D\\\u89C6\u9891\u64AD\u653E\u5668.png"));
		
		JButton publish = new JButton("\u8BFE\u7A0B\u53D1\u5E03");
		publish.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		publish.setVerticalAlignment(SwingConstants.BOTTOM);
		publish.setForeground(Color.BLUE);
		publish.setFont(new Font("楷体", Font.BOLD, 15));
		publish.setBorderPainted(false);
		publish.setBackground(Color.WHITE);
		publish.setBounds(0, 139, 121, 120);
		buttonzu.add(publish);
		publish.setOpaque(false);
		
		JLabel picture2 = new JLabel("");
		picture2.setIcon(new ImageIcon("E:\\\u5934\u50CF&\u7B7E\u540D\\\u7F51\u7EDC\u8FDE\u63A5.png"));
		picture2.setHorizontalAlignment(SwingConstants.CENTER);
		picture2.setBounds(0, 142, 121, 97);
		buttonzu.add(picture2);
		
		JButton arrange = new JButton("\u8BFE\u7A0B\u5B89\u6392");
		arrange.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		arrange.setVerticalAlignment(SwingConstants.BOTTOM);
		arrange.setForeground(Color.BLUE);
		arrange.setFont(new Font("楷体", Font.BOLD, 15));
		arrange.setBackground(Color.WHITE);
		arrange.setBounds(0, 281, 121, 120);
		buttonzu.add(arrange);
		arrange.setOpaque(false);
		arrange.setBorderPainted(false);
		
		JLabel picture3 = new JLabel("");
		picture3.setIcon(new ImageIcon("E:\\\u5934\u50CF&\u7B7E\u540D\\\u97F3\u4E50\u64AD\u653E\u5668.png"));
		picture3.setHorizontalAlignment(SwingConstants.CENTER);
		picture3.setBounds(0, 281, 121, 97);
		buttonzu.add(picture3);
		
		JButton exit = new JButton("\u9000\u51FA");
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		exit.setHorizontalAlignment(SwingConstants.LEFT);
		exit.setOpaque(false);
		exit.setForeground(Color.BLUE);
		exit.setFont(new Font("楷体", Font.BOLD, 14));
		exit.setBorderPainted(false);
		exit.setBackground(Color.WHITE);
		exit.setBounds(0, 408, 121, 26);
		buttonzu.add(exit);
		
		JLabel picture4 = new JLabel("");
		picture4.setIcon(new ImageIcon("E:\\\u5934\u50CF&\u7B7E\u540D\\\u672C\u5730\u78C1\u76D82.png"));
		picture4.setHorizontalAlignment(SwingConstants.CENTER);
		picture4.setBounds(0, 408, 121, 26);
		buttonzu.add(picture4);
		
		JPanel panel_cards = new JPanel();
		panel_cards.setBounds(152, 68, 569, 440);
		contentPane.add(panel_cards);
		panel_cards.setLayout(new CardLayout(0, 0));
		panel_cards.setOpaque(false);
		
		JPanel card_plan = new JPanel();
		panel_cards.add(card_plan, "name_40481146285902");
		card_plan.setOpaque(false);
		card_plan.setLayout(null);
		
		JLabel plan_head = new JLabel("\u8F93\u5165\u6559\u5B66\u8BA1\u5212\uFF1A");
		plan_head.setFont(new Font("宋体", Font.BOLD, 13));
		plan_head.setBounds(0, 0, 116, 26);
		card_plan.add(plan_head);
		
		JPanel card_publish = new JPanel();
		panel_cards.add(card_publish, "name_2143787274806");
		card_publish.setLayout(null);
		card_publish.setOpaque(false);
		
		JTabbedPane tab_publish = new JTabbedPane(JTabbedPane.TOP);
		tab_publish.setBounds(0, 21, 569, 248);
		card_publish.add(tab_publish);
		
		JPanel ppanel1_1 = new JPanel();
		ppanel1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		tab_publish.addTab("大一上", null, ppanel1_1, null);
		ppanel1_1.setLayout(null);
		
		JScrollPane wait1_1 = new JScrollPane();
		wait1_1.setBounds(0, 31, 254, 209);
		ppanel1_1.add(wait1_1);
		
		table_wait1_1 = new JTable();
		table_wait1_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"\u7F16\u53F7", "\u8BFE\u7A0B\u540D\u79F0", "\u7533\u8BF7\u4EBA", "\u5B66\u5206"
			}
		));
		wait1_1.setViewportView(table_wait1_1);
		
		JScrollPane sure1_1 = new JScrollPane();
		sure1_1.setBounds(310, 31, 254, 209);
		ppanel1_1.add(sure1_1);
		
		table_sure1_1 = new JTable();
		table_sure1_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"编号", "课程名称", "申请人", "学分"
			}
		));
		sure1_1.setViewportView(table_sure1_1);
		
		JLabel wait_label1_1 = new JLabel("\u2014\u2014\u2014\u2014\u2014\u2014\u5F85\u5BA1\u6838\u8BFE\u7A0B\u5217\u8868\u2014\u2014\u2014\u2014\u2014\u2014");
		wait_label1_1.setBounds(0, 0, 254, 31);
		ppanel1_1.add(wait_label1_1);
		
		JLabel sure_label1_1 = new JLabel("\u2014\u2014\u2014\u2014\u2014\u2014\u5DF2\u786E\u5B9A\u8BFE\u7A0B\u5217\u8868\u2014\u2014\u2014\u2014\u2014\u2014");
		sure_label1_1.setBounds(310, 0, 254, 31);
		ppanel1_1.add(sure_label1_1);
		
		JLabel add1_1 = new JLabel("\u2014\u2014\u2014>");
		add1_1.setBounds(264, 85, 46, 21);
		ppanel1_1.add(add1_1);
		
		JLabel delete1_1 = new JLabel("<\u2014\u2014\u2014");
		delete1_1.setBounds(254, 140, 46, 21);
		ppanel1_1.add(delete1_1);
		
		JButton buttonadd1_1 = new JButton("\u6DFB\u52A0");
		buttonadd1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		buttonadd1_1.setFont(new Font("楷体", Font.PLAIN, 11));
		buttonadd1_1.setBounds(254, 66, 56, 23);
		ppanel1_1.add(buttonadd1_1);
		
		JButton buttondelete1_1 = new JButton("\u5220\u9664");
		buttondelete1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		buttondelete1_1.setFont(new Font("楷体", Font.PLAIN, 11));
		buttondelete1_1.setBounds(254, 156, 56, 23);
		ppanel1_1.add(buttondelete1_1);
		
		JPanel ppanel1_2 = new JPanel();
		ppanel1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		tab_publish.addTab("大一下", null, ppanel1_2, null);
		ppanel1_2.setLayout(null);
		
		JScrollPane wait1_2 = new JScrollPane();
		wait1_2.setBounds(0, 31, 254, 209);
		ppanel1_2.add(wait1_2);
		
		table_wait1_2 = new JTable();
		table_wait1_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"\u7F16\u53F7", "\u8BFE\u7A0B\u540D\u79F0", "\u7533\u8BF7\u4EBA", "\u5B66\u5206"
			}
		));
		wait1_2.setViewportView(table_wait1_2);
		
		JScrollPane sure1_2 = new JScrollPane();
		sure1_2.setBounds(310, 31, 254, 209);
		ppanel1_2.add(sure1_2);
		
		table_sure1_2 = new JTable();
		table_sure1_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"编号", "课程名称", "申请人", "学分"
			}
		));
		sure1_2.setViewportView(table_sure1_2);
		
		JLabel wait_label1_2 = new JLabel("\u2014\u2014\u2014\u2014\u2014\u2014\u5F85\u5BA1\u6838\u8BFE\u7A0B\u5217\u8868\u2014\u2014\u2014\u2014\u2014\u2014");
		wait_label1_2.setBounds(0, 0, 254, 31);
		ppanel1_2.add(wait_label1_2);
		
		JLabel sure_label1_2 = new JLabel("\u2014\u2014\u2014\u2014\u2014\u2014\u5DF2\u786E\u5B9A\u8BFE\u7A0B\u5217\u8868\u2014\u2014\u2014\u2014\u2014\u2014");
		sure_label1_2.setBounds(310, 0, 254, 31);
		ppanel1_2.add(sure_label1_2);
		
		JLabel add1_2 = new JLabel("\u2014\u2014\u2014>");
		add1_2.setBounds(264, 85, 46, 21);
		ppanel1_2.add(add1_2);
		
		JLabel delete1_2 = new JLabel("<\u2014\u2014\u2014");
		delete1_2.setBounds(254, 140, 46, 21);
		ppanel1_2.add(delete1_2);
		
		JButton buttonadd1_2 = new JButton("\u6DFB\u52A0");
		buttonadd1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		buttonadd1_2.setFont(new Font("楷体", Font.PLAIN, 11));
		buttonadd1_2.setBounds(254, 66, 56, 23);
		ppanel1_2.add(buttonadd1_2);
		
		JButton buttondelete1_2 = new JButton("\u5220\u9664");
		buttondelete1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		buttondelete1_2.setFont(new Font("楷体", Font.PLAIN, 11));
		buttondelete1_2.setBounds(254, 156, 56, 23);
		ppanel1_2.add(buttondelete1_2);
		
		JPanel ppanel2_1 = new JPanel();
		ppanel2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		tab_publish.addTab("大二上", null, ppanel2_1, null);
		ppanel2_1.setLayout(null);
		
		JScrollPane wait2_1 = new JScrollPane();
		wait2_1.setBounds(0, 31, 254, 209);
		ppanel2_1.add(wait2_1);
		
		table_wait2_1 = new JTable();
		table_wait2_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"\u7F16\u53F7", "\u8BFE\u7A0B\u540D\u79F0", "\u7533\u8BF7\u4EBA", "\u5B66\u5206"
			}
		));
		wait2_1.setViewportView(table_wait2_1);
		
		JScrollPane sure2_1 = new JScrollPane();
		sure2_1.setBounds(310, 31, 254, 209);
		ppanel2_1.add(sure2_1);
		
		table_sure2_1 = new JTable();
		table_sure2_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"编号", "课程名称", "申请人", "学分"
			}
		));
		sure2_1.setViewportView(table_sure2_1);
		
		JLabel wait_label2_1 = new JLabel("\u2014\u2014\u2014\u2014\u2014\u2014\u5F85\u5BA1\u6838\u8BFE\u7A0B\u5217\u8868\u2014\u2014\u2014\u2014\u2014\u2014");
		wait_label2_1.setBounds(0, 0, 254, 31);
		ppanel2_1.add(wait_label2_1);
		
		JLabel sure_label2_1 = new JLabel("\u2014\u2014\u2014\u2014\u2014\u2014\u5DF2\u786E\u5B9A\u8BFE\u7A0B\u5217\u8868\u2014\u2014\u2014\u2014\u2014\u2014");
		sure_label2_1.setBounds(310, 0, 254, 31);
		ppanel2_1.add(sure_label2_1);
		
		JLabel add2_1 = new JLabel("\u2014\u2014\u2014>");
		add2_1.setBounds(264, 85, 46, 21);
		ppanel2_1.add(add2_1);
		
		JLabel delete2_1 = new JLabel("<\u2014\u2014\u2014");
		delete2_1.setBounds(254, 140, 46, 21);
		ppanel2_1.add(delete2_1);
		
		JButton buttonadd2_1 = new JButton("\u6DFB\u52A0");
		buttonadd2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		buttonadd2_1.setFont(new Font("楷体", Font.PLAIN, 11));
		buttonadd2_1.setBounds(254, 66, 56, 23);
		ppanel2_1.add(buttonadd2_1);
		
		JButton buttondelete2_1 = new JButton("\u5220\u9664");
		buttondelete2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		buttondelete2_1.setFont(new Font("楷体", Font.PLAIN, 11));
		buttondelete2_1.setBounds(254, 156, 56, 23);
		ppanel2_1.add(buttondelete2_1);
		
		JPanel ppanel2_2 = new JPanel();
		ppanel2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		tab_publish.addTab("大二下", null, ppanel2_2, null);
		ppanel2_2.setLayout(null);
		
		JScrollPane wait2_2 = new JScrollPane();
		wait2_2.setBounds(0, 31, 254, 209);
		ppanel2_2.add(wait2_2);
		
		table_wait2_2 = new JTable();
		table_wait2_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"\u7F16\u53F7", "\u8BFE\u7A0B\u540D\u79F0", "\u7533\u8BF7\u4EBA", "\u5B66\u5206"
			}
		));
		wait2_2.setViewportView(table_wait2_2);
		
		JScrollPane sure2_2 = new JScrollPane();
		sure2_2.setBounds(310, 31, 254, 209);
		ppanel2_2.add(sure2_2);
		
		table_sure2_2 = new JTable();
		table_sure2_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"编号", "课程名称", "申请人", "学分"
			}
		));
		sure2_2.setViewportView(table_sure2_2);
		
		JLabel wait_label2_2 = new JLabel("\u2014\u2014\u2014\u2014\u2014\u2014\u5F85\u5BA1\u6838\u8BFE\u7A0B\u5217\u8868\u2014\u2014\u2014\u2014\u2014\u2014");
		wait_label2_2.setBounds(0, 0, 254, 31);
		ppanel2_2.add(wait_label2_2);
		
		JLabel sure_label2_2 = new JLabel("\u2014\u2014\u2014\u2014\u2014\u2014\u5DF2\u786E\u5B9A\u8BFE\u7A0B\u5217\u8868\u2014\u2014\u2014\u2014\u2014\u2014");
		sure_label2_2.setBounds(310, 0, 254, 31);
		ppanel2_2.add(sure_label2_2);
		
		JLabel add2_2 = new JLabel("\u2014\u2014\u2014>");
		add2_2.setBounds(264, 85, 46, 21);
		ppanel2_2.add(add2_2);
		
		JLabel delete2_2 = new JLabel("<\u2014\u2014\u2014");
		delete2_2.setBounds(254, 140, 46, 21);
		ppanel2_2.add(delete2_2);
		
		JButton buttonadd2_2 = new JButton("\u6DFB\u52A0");
		buttonadd2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		buttonadd2_2.setFont(new Font("楷体", Font.PLAIN, 11));
		buttonadd2_2.setBounds(254, 66, 56, 23);
		ppanel2_2.add(buttonadd2_2);
		
		JButton buttondelete2_2 = new JButton("\u5220\u9664");
		buttondelete2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		buttondelete2_2.setFont(new Font("楷体", Font.PLAIN, 11));
		buttondelete2_2.setBounds(254, 156, 56, 23);
		ppanel2_2.add(buttondelete2_2);
		
		JPanel ppanel3_1 = new JPanel();
		ppanel3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		tab_publish.addTab("大三上", null, ppanel3_1, null);
		ppanel3_1.setLayout(null);
		
		JScrollPane wait3_1 = new JScrollPane();
		wait3_1.setBounds(0, 31, 254, 209);
		ppanel3_1.add(wait3_1);
		
		table_wait3_1 = new JTable();
		table_wait3_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"\u7F16\u53F7", "\u8BFE\u7A0B\u540D\u79F0", "\u7533\u8BF7\u4EBA", "\u5B66\u5206"
			}
		));
		wait3_1.setViewportView(table_wait3_1);
		
		JScrollPane sure3_1 = new JScrollPane();
		sure3_1.setBounds(310, 31, 254, 209);
		ppanel3_1.add(sure3_1);
		
		table_sure3_1 = new JTable();
		table_sure3_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"编号", "课程名称", "申请人", "学分"
			}
		));
		sure3_1.setViewportView(table_sure3_1);
		
		JLabel wait_label3_1 = new JLabel("\u2014\u2014\u2014\u2014\u2014\u2014\u5F85\u5BA1\u6838\u8BFE\u7A0B\u5217\u8868\u2014\u2014\u2014\u2014\u2014\u2014");
		wait_label3_1.setBounds(0, 0, 254, 31);
		ppanel3_1.add(wait_label3_1);
		
		JLabel sure_label3_1 = new JLabel("\u2014\u2014\u2014\u2014\u2014\u2014\u5DF2\u786E\u5B9A\u8BFE\u7A0B\u5217\u8868\u2014\u2014\u2014\u2014\u2014\u2014");
		sure_label3_1.setBounds(310, 0, 254, 31);
		ppanel3_1.add(sure_label3_1);
		
		JLabel add3_1 = new JLabel("\u2014\u2014\u2014>");
		add3_1.setBounds(264, 85, 46, 21);
		ppanel3_1.add(add3_1);
		
		JLabel delete3_1 = new JLabel("<\u2014\u2014\u2014");
		delete3_1.setBounds(254, 140, 46, 21);
		ppanel3_1.add(delete3_1);
		
		JButton buttonadd3_1 = new JButton("\u6DFB\u52A0");
		buttonadd3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		buttonadd3_1.setFont(new Font("楷体", Font.PLAIN, 11));
		buttonadd3_1.setBounds(254, 66, 56, 23);
		ppanel3_1.add(buttonadd3_1);
		
		JButton buttondelete3_1 = new JButton("\u5220\u9664");
		buttondelete3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		buttondelete3_1.setFont(new Font("楷体", Font.PLAIN, 11));
		buttondelete3_1.setBounds(254, 156, 56, 23);
		ppanel3_1.add(buttondelete3_1);
		
		JPanel ppanel3_2 = new JPanel();
		ppanel3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		tab_publish.addTab("大三下", null, ppanel3_2, null);
		ppanel3_2.setLayout(null);
		
		JScrollPane wait3_2 = new JScrollPane();
		wait3_2.setBounds(0, 31, 254, 209);
		ppanel3_2.add(wait3_2);
		
		table_wait3_2 = new JTable();
		table_wait3_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"\u7F16\u53F7", "\u8BFE\u7A0B\u540D\u79F0", "\u7533\u8BF7\u4EBA", "\u5B66\u5206"
			}
		));
		wait3_2.setViewportView(table_wait3_2);
		
		JScrollPane sure3_2 = new JScrollPane();
		sure3_2.setBounds(310, 31, 254, 209);
		ppanel3_2.add(sure3_2);
		
		table_sure3_2 = new JTable();
		table_sure3_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"编号", "课程名称", "申请人", "学分"
			}
		));
		sure3_2.setViewportView(table_sure3_2);
		
		JLabel wait_label3_2 = new JLabel("\u2014\u2014\u2014\u2014\u2014\u2014\u5F85\u5BA1\u6838\u8BFE\u7A0B\u5217\u8868\u2014\u2014\u2014\u2014\u2014\u2014");
		wait_label3_2.setBounds(0, 0, 254, 31);
		ppanel3_2.add(wait_label3_2);
		
		JLabel sure_label3_2 = new JLabel("\u2014\u2014\u2014\u2014\u2014\u2014\u5DF2\u786E\u5B9A\u8BFE\u7A0B\u5217\u8868\u2014\u2014\u2014\u2014\u2014\u2014");
		sure_label3_2.setBounds(310, 0, 254, 31);
		ppanel3_2.add(sure_label3_2);
		
		JLabel add3_2 = new JLabel("\u2014\u2014\u2014>");
		add3_2.setBounds(264, 85, 46, 21);
		ppanel3_2.add(add3_2);
		
		JLabel delete3_2 = new JLabel("<\u2014\u2014\u2014");
		delete3_2.setBounds(254, 140, 46, 21);
		ppanel3_2.add(delete3_2);
		
		JButton buttonadd3_2 = new JButton("\u6DFB\u52A0");
		buttonadd3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		buttonadd3_2.setFont(new Font("楷体", Font.PLAIN, 11));
		buttonadd3_2.setBounds(254, 66, 56, 23);
		ppanel3_2.add(buttonadd3_2);
		
		JButton buttondelete3_2 = new JButton("\u5220\u9664");
		buttondelete3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		buttondelete3_2.setFont(new Font("楷体", Font.PLAIN, 11));
		buttondelete3_2.setBounds(254, 156, 56, 23);
		ppanel3_2.add(buttondelete3_2);
		
		JPanel ppanel4_1 = new JPanel();
		ppanel4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		tab_publish.addTab("大四上", null, ppanel4_1, null);
		ppanel4_1.setLayout(null);
		
		JScrollPane wait4_1 = new JScrollPane();
		wait4_1.setBounds(0, 31, 254, 209);
		ppanel4_1.add(wait4_1);
		
		table_wait4_1 = new JTable();
		table_wait4_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"\u7F16\u53F7", "\u8BFE\u7A0B\u540D\u79F0", "\u7533\u8BF7\u4EBA", "\u5B66\u5206"
			}
		));
		wait4_1.setViewportView(table_wait4_1);
		
		JScrollPane sure4_1 = new JScrollPane();
		sure4_1.setBounds(310, 31, 254, 209);
		ppanel4_1.add(sure4_1);
		
		table_sure4_1 = new JTable();
		table_sure4_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"编号", "课程名称", "申请人", "学分"
			}
		));
		sure4_1.setViewportView(table_sure4_1);
		
		JLabel wait_label4_1 = new JLabel("\u2014\u2014\u2014\u2014\u2014\u2014\u5F85\u5BA1\u6838\u8BFE\u7A0B\u5217\u8868\u2014\u2014\u2014\u2014\u2014\u2014");
		wait_label4_1.setBounds(0, 0, 254, 31);
		ppanel4_1.add(wait_label4_1);
		
		JLabel sure_label4_1 = new JLabel("\u2014\u2014\u2014\u2014\u2014\u2014\u5DF2\u786E\u5B9A\u8BFE\u7A0B\u5217\u8868\u2014\u2014\u2014\u2014\u2014\u2014");
		sure_label4_1.setBounds(310, 0, 254, 31);
		ppanel4_1.add(sure_label4_1);
		
		JLabel add4_1 = new JLabel("\u2014\u2014\u2014>");
		add4_1.setBounds(264, 85, 46, 21);
		ppanel4_1.add(add4_1);
		
		JLabel delete4_1 = new JLabel("<\u2014\u2014\u2014");
		delete4_1.setBounds(254, 140, 46, 21);
		ppanel4_1.add(delete4_1);
		
		JButton buttonadd4_1 = new JButton("\u6DFB\u52A0");
		buttonadd4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		buttonadd4_1.setFont(new Font("楷体", Font.PLAIN, 11));
		buttonadd4_1.setBounds(254, 66, 56, 23);
		ppanel4_1.add(buttonadd4_1);
		
		JButton buttondelete4_1 = new JButton("\u5220\u9664");
		buttondelete4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		buttondelete4_1.setFont(new Font("楷体", Font.PLAIN, 11));
		buttondelete4_1.setBounds(254, 156, 56, 23);
		ppanel4_1.add(buttondelete4_1);
		
		JPanel ppanel4_2 = new JPanel();
		ppanel4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		tab_publish.addTab("大四下", null, ppanel4_2, null);
		ppanel4_2.setLayout(null);
		
		JScrollPane wait4_2 = new JScrollPane();
		wait4_2.setBounds(0, 31, 254, 209);
		ppanel4_2.add(wait4_2);
		
		table_wait4_2 = new JTable();
		table_wait4_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"\u7F16\u53F7", "\u8BFE\u7A0B\u540D\u79F0", "\u7533\u8BF7\u4EBA", "\u5B66\u5206"
			}
		));
		wait4_2.setViewportView(table_wait4_2);
		
		JScrollPane sure4_2 = new JScrollPane();
		sure4_2.setBounds(310, 31, 254, 209);
		ppanel4_2.add(sure4_2);
		
		table_sure4_2 = new JTable();
		table_sure4_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"编号", "课程名称", "申请人", "学分"
			}
		));
		sure4_2.setViewportView(table_sure4_2);
		
		JLabel wait_label4_2 = new JLabel("\u2014\u2014\u2014\u2014\u2014\u2014\u5F85\u5BA1\u6838\u8BFE\u7A0B\u5217\u8868\u2014\u2014\u2014\u2014\u2014\u2014");
		wait_label4_2.setBounds(0, 0, 254, 31);
		ppanel4_2.add(wait_label4_2);
		
		JLabel sure_label4_2 = new JLabel("\u2014\u2014\u2014\u2014\u2014\u2014\u5DF2\u786E\u5B9A\u8BFE\u7A0B\u5217\u8868\u2014\u2014\u2014\u2014\u2014\u2014");
		sure_label4_2.setBounds(310, 0, 254, 31);
		ppanel4_2.add(sure_label4_2);
		
		JLabel add4_2 = new JLabel("\u2014\u2014\u2014>");
		add4_2.setBounds(264, 85, 46, 21);
		ppanel4_2.add(add4_2);
		
		JLabel delete4_2 = new JLabel("<\u2014\u2014\u2014");
		delete4_2.setBounds(254, 140, 46, 21);
		ppanel4_2.add(delete4_2);
		
		JButton buttonadd4_2 = new JButton("\u6DFB\u52A0");
		buttonadd4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		buttonadd4_2.setFont(new Font("楷体", Font.PLAIN, 11));
		buttonadd4_2.setBounds(254, 66, 56, 23);
		ppanel4_2.add(buttonadd4_2);
		
		JButton buttondelete4_2 = new JButton("\u5220\u9664");
		buttondelete4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		buttondelete4_2.setFont(new Font("楷体", Font.PLAIN, 11));
		buttondelete4_2.setBounds(254, 156, 56, 23);
		ppanel4_2.add(buttondelete4_2);
		
		JButton back = new JButton("\u9000\u56DE");
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		back.setFont(new Font("楷体", Font.PLAIN, 14));
		back.setBounds(58, 279, 85, 34);
		card_publish.add(back);
		
		JButton add = new JButton("\u624B\u52A8\u6DFB\u52A0");
		add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		add.setFont(new Font("楷体", Font.PLAIN, 13));
		add.setBounds(329, 279, 93, 34);
		card_publish.add(add);
		
		JButton complete = new JButton("\u53D1\u5E03\u8BFE\u7A0B");
		complete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		complete.setFont(new Font("楷体", Font.PLAIN, 13));
		complete.setBounds(466, 279, 93, 34);
		card_publish.add(complete);
		
		JLabel information = new JLabel("\u2014\u2014\u8BFE\u7A0B\u4FE1\u606F\u2014\u2014");
		information.setFont(new Font("楷体", Font.PLAIN, 12));
		information.setBounds(0, 323, 114, 28);
		card_publish.add(information);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(0, 323, 559, 2);
		card_publish.add(separator_1);
		
		JLabel view1 = new JLabel("XXX");
		view1.setFont(new Font("宋体", Font.PLAIN, 13));
		view1.setVerticalAlignment(SwingConstants.TOP);
		view1.setBounds(10, 350, 549, 65);
		card_publish.add(view1);
		
		JLabel publish_head = new JLabel("\u53D1\u5E03\u8BFE\u7A0B\uFF1A");
		publish_head.setFont(new Font("宋体", Font.BOLD, 13));
		publish_head.setBounds(0, 0, 143, 25);
		card_publish.add(publish_head);
		
		JPanel card_arrange = new JPanel();
		panel_cards.add(card_arrange, "name_6414595421091");
		card_arrange.setOpaque(false);
		card_arrange.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 25, 569, 296);
		card_arrange.add(tabbedPane);
		
		JPanel apanel1_1 = new JPanel();
		apanel1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		tabbedPane.addTab("大一上", null, apanel1_1, null);
		apanel1_1.setLayout(null);
		
		JScrollPane arrange1_1 = new JScrollPane();
		arrange1_1.setBounds(0, 0, 564, 292);
		apanel1_1.add(arrange1_1);
		
		table_arrange1_1 = new JTable();
		table_arrange1_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"编号", "课程名称", "任课教师", "上课时间", "上课地点", "学分"
			}
		));
		arrange1_1.setViewportView(table_arrange1_1);
		
		JPanel apanel1_2 = new JPanel();
		apanel1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		tabbedPane.addTab("大一下", null, apanel1_2, null);
		apanel1_2.setLayout(null);
		
		JScrollPane arrange1_2 = new JScrollPane();
		arrange1_2.setBounds(0, 0, 564, 292);
		apanel1_2.add(arrange1_2);
		
		table_arrange1_2 = new JTable();
		table_arrange1_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"编号", "课程名称", "任课教师", "上课时间", "上课地点", "学分"
			}
		));
		arrange1_2.setViewportView(table_arrange1_2);
		
		JPanel apanel2_1 = new JPanel();
		apanel2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		tabbedPane.addTab("大二上", null, apanel2_1, null);
		apanel2_1.setLayout(null);
		
		JScrollPane arrange2_1 = new JScrollPane();
		arrange2_1.setBounds(0, 0, 564, 292);
		apanel2_1.add(arrange2_1);
		
		table_arrange2_1 = new JTable();
		table_arrange2_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"编号", "课程名称", "任课教师", "上课时间", "上课地点", "学分"
			}
		));
		arrange2_1.setViewportView(table_arrange2_1);
		
		JPanel apanel2_2 = new JPanel();
		apanel2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		tabbedPane.addTab("大二下", null, apanel2_2, null);
		apanel2_2.setLayout(null);
		
		JScrollPane arrange2_2 = new JScrollPane();
		arrange2_2.setBounds(0, 0, 564, 292);
		apanel2_2.add(arrange2_2);
		
		table_arrange2_2 = new JTable();
		table_arrange2_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"编号", "课程名称", "任课教师", "上课时间", "上课地点", "学分"
			}
		));
		arrange2_2.setViewportView(table_arrange2_2);
		
		JPanel apanel3_1 = new JPanel();
		apanel3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		tabbedPane.addTab("大三上", null, apanel3_1, null);
		apanel3_1.setLayout(null);
		
		JScrollPane arrange3_1 = new JScrollPane();
		arrange3_1.setBounds(0, 0, 564, 292);
		apanel3_1.add(arrange3_1);
		
		table_arrange3_1 = new JTable();
		table_arrange3_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"编号", "课程名称", "任课教师", "上课时间", "上课地点", "学分"
			}
		));
		arrange3_1.setViewportView(table_arrange3_1);
		
		JPanel apanel3_2 = new JPanel();
		apanel3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		tabbedPane.addTab("大三下", null, apanel3_2, null);
		apanel3_2.setLayout(null);
		
		JScrollPane arrange3_2 = new JScrollPane();
		arrange3_2.setBounds(0, 0, 564, 292);
		apanel3_2.add(arrange3_2);
		
		table_arrange3_2 = new JTable();
		table_arrange3_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"编号", "课程名称", "任课教师", "上课时间", "上课地点", "学分"
			}
		));
		arrange3_2.setViewportView(table_arrange3_2);
		
		JPanel apanel4_1 = new JPanel();
		apanel4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		tabbedPane.addTab("大四上", null, apanel4_1, null);
		apanel4_1.setLayout(null);
		
		JScrollPane arrange4_1 = new JScrollPane();
		arrange4_1.setBounds(0, 0, 564, 292);
		apanel4_1.add(arrange4_1);
		
		table_arrange4_1 = new JTable();
		table_arrange4_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"编号", "课程名称", "任课教师", "上课时间", "上课地点", "学分"
			}
		));
		arrange4_1.setViewportView(table_arrange4_1);
		
		JPanel apanel4_2 = new JPanel();
		apanel4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		tabbedPane.addTab("大四下", null, apanel4_2, null);
		apanel4_2.setLayout(null);
		
		JScrollPane arrange4_2 = new JScrollPane();
		arrange4_2.setBounds(0, 0, 564, 292);
		apanel4_2.add(arrange4_2);
		
		table_arrange4_2 = new JTable();
		table_arrange4_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"编号", "课程名称", "任课教师", "上课时间", "上课地点", "学分"
			}
		));
		arrange4_2.setViewportView(table_arrange4_2);
		
		JLabel information1 = new JLabel("\u2014\u2014\u8BFE\u7A0B\u4FE1\u606F\u2014\u2014");
		information1.setBounds(0, 332, 120, 27);
		information1.setFont(new Font("楷体", Font.PLAIN, 12));
		card_arrange.add(information1);
		
		JLabel view2 = new JLabel("XXX");
		view2.setBounds(10, 369, 549, 61);
		view2.setFont(new Font("宋体", Font.PLAIN, 13));
		view2.setVerticalAlignment(SwingConstants.TOP);
		card_arrange.add(view2);
		
		JButton modify = new JButton("\u4FEE\u6539\u8BFE\u7A0B");
		modify.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		modify.setBounds(309, 331, 120, 28);
		modify.setFont(new Font("楷体", Font.PLAIN, 13));
		card_arrange.add(modify);
		
			
			JLabel arrange_head = new JLabel("\u5B89\u6392\u8BFE\u7A0B\uFF1A");
			arrange_head.setFont(new Font("宋体", Font.BOLD, 13));
			arrange_head.setBounds(0, 0, 135, 27);
			card_arrange.add(arrange_head);
			
			JButton ok = new JButton("\u5B8C\u6210\u5B89\u6392");
			ok.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				}
			});
			ok.setFont(new Font("楷体", Font.PLAIN, 13));
			ok.setBounds(454, 331, 105, 28);
			card_arrange.add(ok);
		
		JLabel background = new JLabel("");
		background.setBounds(0, 0, 1024, 626);
		contentPane.add(background);
		background.setIcon(new ImageIcon("E:\\\u5934\u50CF&\u7B7E\u540D\\\u80CC\u666F1.jpg"));
		background.setVerticalAlignment(SwingConstants.TOP);
		background.setHorizontalAlignment(SwingConstants.CENTER);
	}
}
