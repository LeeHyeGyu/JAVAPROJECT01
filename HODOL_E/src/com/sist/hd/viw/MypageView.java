package com.sist.hd.viw;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import com.sist.hd.ctrl.MyPageCtrl;
import java.awt.Color;
import java.awt.Font;

public class MypageView extends JPanel {
	private JTable adr_table;
	private DefaultTableModel tableModel;
	private MainFrame win;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private MyPageCtrl myPayList;
	private Object[][] data;
	private String[] contents = {"세탁소 이름","총액","픽업 시간","배달 시간"};

	/**
	 * Create the panel.
	 * @param win 
	 */
	public MypageView(MainFrame win) {
		setBackground(Color.WHITE);
		setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 13));
		this.win = win;
		setLayout(null);
		
		JButton btnNewButton = new JButton("정보 수정");
		btnNewButton.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 13));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(181, 467, 97, 23);
		add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				win.change("mypageEdit");
			}
		});
		
		JLabel label = new JLabel("마이페이지");
		label.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 20));
		label.setBounds(0, 0, 116, 23);
		add(label);
		
		JLabel label_1 = new JLabel("구매 내역");
		label_1.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 13));
		label_1.setBounds(12, 246, 57, 15);
		add(label_1);
		
		
		//table 맹글어보자
		myPayList = new MyPageCtrl();
		myPayList.CSV_TO_List(MainFrame.session.getId());
		data = myPayList.convertToData();
		tableModel = new DefaultTableModel(data, contents);
		
		
		
		
		JButton btnHome = new JButton("HOME");
		btnHome.setBackground(Color.DARK_GRAY);
		btnHome.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 13));
		btnHome.setForeground(Color.WHITE);
		btnHome.setBorderPainted(false);
		btnHome.setBounds(361, 0, 77, 30);
		add(btnHome);
		
		JLabel label_2 = new JLabel("내 정보");
		label_2.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 13));
		label_2.setBounds(189, 31, 47, 40);
		add(label_2);
		
		JLabel lblId = new JLabel("아이디 :");
		lblId.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 13));
		lblId.setBounds(132, 114, 57, 15);
		add(lblId);
		
		textField = new JTextField(MainFrame.session.getId());
		textField.setBounds(201, 111, 116, 21);
		add(textField);
		textField.setColumns(10);
		textField.setEnabled(false);
		
		JLabel lblNewLabel = new JLabel("생년월일 :");
		lblNewLabel.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 13));
		lblNewLabel.setBounds(132, 145, 57, 15);
		add(lblNewLabel);
		
		textField_1 = new JTextField(MainFrame.session.getBirth());
		textField_1.setBounds(201, 142, 116, 21);
		add(textField_1);
		textField_1.setColumns(10);
		textField_1.setEnabled(false);
		
		JLabel label_3 = new JLabel("주소 :");
		label_3.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 13));
		label_3.setBounds(132, 176, 57, 15);
		add(label_3);
		
		textField_2 = new JTextField(MainFrame.session.getAddress());
		textField_2.setBounds(201, 173, 116, 21);
		add(textField_2);
		textField_2.setColumns(10);
		textField_2.setEnabled(false);
		
		JLabel lblNewLabel_1 = new JLabel("이름 :");
		lblNewLabel_1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(132, 84, 57, 15);
		add(lblNewLabel_1);
		
		textField_3 = new JTextField(MainFrame.session.getName());
		textField_3.setBounds(201, 81, 116, 21);
		add(textField_3);
		textField_3.setColumns(10);
		textField_3.setEnabled(false);
		
		JLabel label_4 = new JLabel("전화번호 :");
		label_4.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 13));
		label_4.setBounds(132, 207, 57, 15);
		add(label_4);
		
		textField_4 = new JTextField(MainFrame.session.getTel());
		textField_4.setBounds(201, 204, 116, 21);
		add(textField_4);
		textField_4.setColumns(10);
		textField_4.setEnabled(false);
		
		adr_table = new JTable(tableModel);
		JScrollPane scrollpane = new JScrollPane(adr_table);
		scrollpane.setBounds(12, 271, 426, 186);
		add(scrollpane);
		adr_table.setBounds(36, 296, 391, 103);
		
		JPanel panel = new JPanel();
		scrollpane.setColumnHeaderView(panel);
	
		
		
		btnHome.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame mainFrame = new MainFrame();
				win.change("main");
			}
		});
		
		
	}
}
