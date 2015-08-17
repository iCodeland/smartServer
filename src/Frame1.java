import java.awt.*;

import javax.swing.*;

public class Frame1 extends JFrame {

	Container contentPane;
	int Width = 300;
	int Height = 350;
	
	
	Frame1 () {
		
		Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds((int)((screenSize.getWidth()-Width)*0.5), (int)((screenSize.getHeight()-Height)*0.5), Width, Height);
				
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		contentPane = this.getContentPane();
		
//		setBounds(400, 400, 300, 300);
		setLayout(null);
		
		JLabel jplIP = new JLabel("IP  :");
		jplIP.setBounds(65, 15, 100, 23);
		jplIP.setFont(new Font("標楷體", Font.PLAIN, 20));
		contentPane.add(jplIP);
		
		JLabel jplPORT = new JLabel("PORT :");
		jplPORT.setBounds(55, 55, 100, 23);
		jplPORT.setFont(new Font("標楷體", Font.PLAIN, 20));
		contentPane.add(jplPORT);
				
		JTextField jtfIP = new JTextField();
		jtfIP.setBounds(120, 15, 120, 25);
		jtfIP.setFont(new Font("標楷體", Font.PLAIN, 20));
		contentPane.add(jtfIP);
		
		JTextField jtfPORT = new JTextField();
		jtfPORT.setBounds(120, 55, 120, 25);
		jtfPORT.setFont(new Font("標楷體", Font.PLAIN, 20));
		contentPane.add(jtfPORT);
		
		JButton jbtcon = new JButton("連線");
		jbtcon.setBounds(80, 260, 120, 23);
		jbtcon.setFont(new Font("標楷體", Font.PLAIN, 20));
		contentPane.add(jbtcon);
		
		JTextArea jta = new JTextArea();
//		jta.setBounds(25, 90, 240, 150);
//		contentPane.add(jta);
		
		JScrollPane jsp = new JScrollPane(jta);
		jsp.setBounds(25, 90, 240, 150);
		contentPane.add(jsp);
		
		setVisible(true);
		
	}
	
	

}
