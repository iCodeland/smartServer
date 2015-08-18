package Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread { 
    private static ServerSocket skt;		// ServerSocket
    private Socket client;					// �������Ȥ��Socket
    private BufferedReader theInputStream;
    private PrintStream theOutputStream;
    private String message;
 
    public Server(int port) {
        try {
            skt = new ServerSocket(port);
        }catch (IOException e) {
        	System.out.print("Error: "+e+"\n");
        }
    }
    public String getMessage(){
    	return message;
    }
    public void run(){
        try{
        	System.out.print("Try to connect...\n");
            client = skt.accept();
            System.out.print("Client "+client.getInetAddress()+"/ Connected.\n");

            theInputStream = new BufferedReader(new InputStreamReader(client.getInputStream())); // �إ�Ū���w�İ�   
            theOutputStream = new PrintStream(client.getOutputStream());// �إ߸�ƥ�X����
    
            while((message = theInputStream.readLine()) != null){// �j��Ū�����
//                chatBox.update();								// ���o�T��
            }
            if(message == null){
                skt.close();
                System.out.print("Disconnect!\n");
            }
        }catch (IOException e){
        	System.out.print("Error: "+e+"\n");
        }
    }
    public void dataOutput(String data){
    	theOutputStream.println(data);
    }
}
/*
     private void startServer(int port) {			// ���A��
        serverSkt = new Server(port);
        serverSkt.setMessage(this);
        serverSkt.start();		
        isServer = true;
        jtfIP.setText("Server");
        setGUI(false);
    }

 */