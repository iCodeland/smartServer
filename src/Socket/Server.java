package Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread { 
    private static ServerSocket skt;		// ServerSocket
    private Socket client;					// 接收的客戶端Socket
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

            theInputStream = new BufferedReader(new InputStreamReader(client.getInputStream())); // 建立讀取緩衝區   
            theOutputStream = new PrintStream(client.getOutputStream());// 建立資料丟出物件
    
            while((message = theInputStream.readLine()) != null){// 迴圈讀取資料
//                chatBox.update();								// 取得訊息
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
     private void startServer(int port) {			// 伺服端
        serverSkt = new Server(port);
        serverSkt.setMessage(this);
        serverSkt.start();		
        isServer = true;
        jtfIP.setText("Server");
        setGUI(false);
    }

 */