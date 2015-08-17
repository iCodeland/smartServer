import java.awt.*;

import javax.swing.*;

public class Start extends JFrame {

	Container contentPane;
	
	Start () {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = this.getContentPane();
		
		setBounds(500,500,250,180);
		
		setLayout(null);
		
		JLabel jplIP = new JLabel("IP  :");
		jplIP.setBounds(25, 15, 100, 23);
		jplIP.setFont(new Font("標楷體", Font.PLAIN, 20));
		contentPane.add(jplIP);
		
		JLabel jplPORT = new JLabel("PORT :");
		jplPORT.setBounds(15, 55, 100, 23);
		jplPORT.setFont(new Font("標楷體", Font.PLAIN, 20));
		contentPane.add(jplPORT);
		
		JTextField jtfIP = new JTextField();
		jtfIP.setBounds(80, 15, 120, 25);
		jtfIP.setFont(new Font("標楷體", Font.PLAIN, 20));
		contentPane.add(jtfIP);
		
		JTextField jtfPORT = new JTextField();
		jtfPORT.setBounds(80, 55, 120, 25);
		jtfPORT.setFont(new Font("標楷體", Font.PLAIN, 20));
		contentPane.add(jtfPORT);
		
		JButton jbtcon = new JButton("START");
		jbtcon.setBounds(60, 96, 120, 23);
		jbtcon.setFont(new Font("標楷體", Font.PLAIN, 20));
		contentPane.add(jbtcon);
		
		
		setTitle("Server");
		setVisible(true);
		
	}
}
