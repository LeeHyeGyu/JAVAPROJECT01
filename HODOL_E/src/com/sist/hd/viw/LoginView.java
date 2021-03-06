package com.sist.hd.viw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.sist.hd.ctrl.UserCtrl;
import com.sist.hd.viw.MainFrame;
import com.sist.hd.vo.UserVO;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

@SuppressWarnings("serial")
public class LoginView extends JPanel implements ActionListener {

	public static HashMap<String, UserVO> map = new HashMap<String, UserVO>();
	private MainFrame win;
	private JLabel lblLogin;
	private JLabel id_label;
	private JLabel pw_label;
	private JTextField id_textField;
	private JTextField pw_textField;
	private JButton signup_btn;
	private JButton login_btn;

	public LoginView(MainFrame win) {
		setBackground(Color.WHITE);
		this.win = win;
		setLayout(null);

		lblLogin = new JLabel("로그인");
		lblLogin.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 20));
		lblLogin.setBounds(188, 135, 75, 33);
		add(lblLogin);

		id_label = new JLabel("아이디");
		id_label.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 13));
		id_label.setBounds(117, 210, 57, 15);
		add(id_label);

		pw_label = new JLabel("비밀번호");
		pw_label.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 13));
		pw_label.setBounds(117, 255, 57, 15);
		add(pw_label);

		id_textField = new JTextField();
		id_textField.setBounds(219, 207, 116, 21);
		add(id_textField);
		id_textField.setColumns(10);

		pw_textField = new JPasswordField();
		pw_textField.setBounds(219, 252, 116, 21);
		add(pw_textField);

		// 회원가입 버튼 추가
		signup_btn = new JButton("회원가입");
		signup_btn.setForeground(Color.WHITE);
		signup_btn.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 13));
		signup_btn.setBackground(Color.DARK_GRAY);
		signup_btn.setBorderPainted(false);
		signup_btn.setBounds(117, 306, 97, 23);
		add(signup_btn);

		// 로그인 버튼 추가
		login_btn = new JButton("로그인");
		login_btn.setForeground(Color.WHITE);
		login_btn.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 13));
		login_btn.setBackground(Color.DARK_GRAY);
		login_btn.setBorderPainted(false);
		login_btn.setBounds(238, 306, 97, 23);
		add(login_btn);

		// 이벤트 감지
		login_btn.addActionListener(this);// 로그인 버튼
		signup_btn.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == signup_btn) {
			win.change("signUp");

		} else if (e.getSource() == login_btn) {
			UserVO inVO = new UserVO();
			UserCtrl login = new UserCtrl();

			// 사용자 ID
			String id = id_textField.getText().trim();
			String pw = pw_textField.getText().trim();

			// ID 공백
			if (id.equals("")) {
				id_textField.requestFocus();
				JOptionPane.showMessageDialog(win, "ID를 입력하세요.");
				return;
			}

			// PW 공백
			if (pw.equals("")) {
				id_textField.requestFocus();
				JOptionPane.showMessageDialog(win, "비밀번호를 입력하세요.", "Message", JOptionPane.INFORMATION_MESSAGE);
				return;
			}

			inVO.setId(id);
			inVO.setPassword(pw);

			UserVO outVO = (UserVO) login.do_selectOne(inVO);

			// 로그인 성공
			if ("1".equals(outVO.getMsgId())) {
				MainFrame.session = outVO;
				outVO.setMsg(MainFrame.session.getId() + "님 환영합니다.");
				JOptionPane.showMessageDialog(win, outVO.getMsg(), "Message", JOptionPane.INFORMATION_MESSAGE);
				
				MainView main = new MainView(win);
				win.change("main", main);
			}

			else {
				JOptionPane.showMessageDialog(win, "로그인 정보를 확인해주세요.", "Message", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
		}
	}
}
