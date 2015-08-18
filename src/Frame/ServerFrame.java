package Frame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import Socket.*;

public class ServerFrame extends JFrame {
	Server serverSkt;
	Container contentPane;
	int Width = 300;
	int Height = 350;
	
	public ServerFrame () {
		Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds((int)((screenSize.getWidth()-Width)*0.5), (int)((screenSize.getHeight()-Height)*0.5), Width, Height);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("伺服器");
		contentPane = this.getContentPane();
		setLayout(null);
		
		JLabel jplIP = new JLabel("IP  :");
		jplIP.setBounds(65, 15, 100, 23);
		jplIP.setFont(new Font("標楷體", Font.PLAIN, 20));
		contentPane.add(jplIP);
		
		JLabel jplPORT = new JLabel("PORT :");
		jplPORT.setBounds(55, 55, 100, 23);
		jplPORT.setFont(new Font("標楷體", Font.PLAIN, 20));
		contentPane.add(jplPORT);
				
		JTextField jtfIP = new JTextField("127.0.0.1");
		jtfIP.setBounds(120, 15, 120, 25);
		jtfIP.setFont(new Font("標楷體", Font.PLAIN, 20));
		contentPane.add(jtfIP);
		
		JTextField jtfPORT = new JTextField("8765");
		jtfPORT.setBounds(120, 55, 120, 25);
		jtfPORT.setFont(new Font("標楷體", Font.PLAIN, 20));
		contentPane.add(jtfPORT);
		
		JButton jbtcon = new JButton("START");
		jbtcon.setBounds(80, 260, 120, 23);
		jbtcon.setFont(new Font("標楷體", Font.PLAIN, 20));
		contentPane.add(jbtcon);
		
		JTextArea jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);
		jsp.setBounds(25, 90, 240, 150);
		contentPane.add(jsp);
		
		setVisible(true);

		jbtcon.addActionListener(new ActionListener() {		//建立連線
	        public void actionPerformed(ActionEvent e) {
	        	int port = Integer.parseInt(jtfPORT.getText());
	        	startServer(port);
	        }
		});
	}
    private void startServer(int port) {			// 伺服端
        serverSkt = new Server(port);
//        serverSkt.setMessage(this);
        serverSkt.start();		
//        jta.setText("Server Start...");
    }
}
