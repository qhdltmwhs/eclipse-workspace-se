package client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.awt.event.ActionEvent;

public class DayTimeClientFrame extends JFrame {

	private JPanel contentPane;
	private JButton requestServerTimeButton;
	private JLabel timeDisplayLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DayTimeClientFrame frame = new DayTimeClientFrame();
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
	public DayTimeClientFrame() {
		setTitle("DayTimeClient");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		requestServerTimeButton = new JButton("Request Server Time");
		requestServerTimeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Socket socket = new Socket("192.168.15.24", 8000);
					System.out.println(socket);
					InputStream in = socket.getInputStream();
					
					/*
					 *  byte stream ---> character stream 변경하는 브릿지 스트림
					 */
					InputStreamReader isr = new InputStreamReader(in);
					BufferedReader br = new BufferedReader(isr);
							
					String serverTime = br.readLine();
					timeDisplayLabel.setText(serverTime);
							
					socket.close();
			
				}catch(Exception e1) {
					System.out.println(e1.getMessage());
				}
				
				
				
			}
		});
		contentPane.add(requestServerTimeButton, BorderLayout.SOUTH);
		
		timeDisplayLabel = new JLabel("12:34");
		timeDisplayLabel.setOpaque(true);
		timeDisplayLabel.setFont(new Font("굴림", Font.BOLD, 30));
		timeDisplayLabel.setForeground(Color.BLUE);
		timeDisplayLabel.setBackground(Color.ORANGE);
		timeDisplayLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(timeDisplayLabel, BorderLayout.CENTER);
	}

}
