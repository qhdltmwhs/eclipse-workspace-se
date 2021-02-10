package windowBuilder.basic;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JButton;

public class ChildJFrame extends JFrame {

	private JPanel contentPane;
	private JButton confirmBtn;
	private JButton cancleBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChildJFrame frame = new ChildJFrame();
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
	public ChildJFrame() {
		setTitle("윈도우빌더를사용한프레임생성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		confirmBtn = new JButton("확인");
		confirmBtn.setBounds(50, 116, 97, 23);
		contentPane.add(confirmBtn);
		
		cancleBtn = new JButton("취소");
		cancleBtn.setBounds(232, 116, 97, 23);
		contentPane.add(cancleBtn);
	}
}
