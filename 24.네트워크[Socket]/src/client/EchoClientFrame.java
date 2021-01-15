package client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class EchoClientFrame extends JFrame {

	private JPanel contentPane;
	private JTextField echoTF;
	private JScrollPane scrollPane;
	private JTextArea displayTA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EchoClientFrame frame = new EchoClientFrame();
					frame.setVisible(true);
					frame.echoTF.requestFocus();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EchoClientFrame() {
		setTitle("EchoClientFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		echoTF = new JTextField();
		echoTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					String echoStr = echoTF.getText();
					//문자를 담은 echoStr 참조변수가 null or 공백일경우 return 한다.
					if(echoStr == null || echoStr.trim().equals("")) {
						echoTF.requestFocus();
						echoTF.setText("");
						return;
					}
					//Socket 생성시 파라미터값, host(ip_address)와 port(number)을 알고있어야 한다.
					Socket socket = new Socket("192.168.15.24", 9999);
					
					/*
					 * 서버로 데이타 쓰기(OutputStream)
					 */
					//서버로 데이타 를 전송하기위해 socket으로부터 OutputStream(출력스트림)을 얻는다.
					OutputStream out = socket.getOutputStream();
					
					//브릿지 스트림적용 
					OutputStreamWriter ow = new OutputStreamWriter(out, "UTF-8");
					
					
					//아래 작업시 반드시 라인종결자를 포함하여 socket에 출력하여야 받을때 readLine() 메소드로 받는다.
					
					/*
					BufferedWriter bw = new BufferedWriter(ow);
					bw.write(echoStr);
					//라인종결자를 따로입력한 메소드
					bw.newLine();
					bw.flush();
					*/
					
					PrintWriter pw = new PrintWriter(ow);
					//라인종결자를 포함한 메소드
					pw.println(echoStr);
					pw.flush();
					
					//TextField 비운다
					echoTF.setText("");
					//TextField 포커스를 맞춘다.
					echoTF.requestFocus();
					
					/*
					 * 서버에서 전송되는 데이타 읽기
					 */
					
					
					/*
					 * - readLine()메소드를 사용하기위해 BufferedReader 작업
					 * - InputStream(byte) ---> Writer(char), 이때 인코딩 요구 
					 *		ex) InputStreamReader(socket.getInputStream(), "UTF-8")
					 */
					BufferedReader br = 
							new BufferedReader(
									new InputStreamReader(
											socket.getInputStream(), "UTF-8"));
					
					String serverEchoStr = br.readLine();
					displayTA.append(serverEchoStr + "\n");
					//br.close();
				
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}//actionPerformed 메소드의 끝
		});//anonymous inner class 의 끝
		
		contentPane.add(echoTF, BorderLayout.SOUTH);
		echoTF.setColumns(10);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		displayTA = new JTextArea();
		displayTA.setEditable(false);
		scrollPane.setViewportView(displayTA);
		echoTF.requestFocus();
		
		
		
	}
	
	

}