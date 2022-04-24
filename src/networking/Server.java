package networking;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements IServer{
    private ServerSocket serverSocket;
    private DataInputStream dataInputStream;
    private DataOutputStream dataOutputStream;
    private Socket socket;
    
    private String totalString="";
    private int port;

    public Server(int port){
        this.port = port;
    }
    public void startConnection(){
        try {
            this.serverSocket = new ServerSocket(this.port);
            System.out.println("\nServer has started. Waiting for connection..");
            this.socket = serverSocket.accept();
            this.dataInputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            this.dataOutputStream = new DataOutputStream(socket.getOutputStream());
            System.out.println("Connection established!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void receiveData(){
        String line = "";
        while(!line.equals("Over")){
            System.out.println("Client: "+line);
            try {
                totalString+=line;
                line = this.dataInputStream.readUTF();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        // Close connection
    }
    public void closeConnection(){
        try {
            this.socket.close();
            this.dataOutputStream.close();
            this.dataInputStream.close();
            this.serverSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Connection has been closed.");
    }

    public String getTotalString(){
        return this.totalString;
    }
    /*public static void main(String[] args) {
        Server server = new Server(20234);
        server.start();
        server.receiveData();
        server.closeConnection();

        System.out.println(server.getTotalString());
    }*/
    public static String startServerAndGetString() {
    	Server server = new Server(IServer.DEFAULT_PORT);
        server.startConnection();
        server.receiveData();
        server.closeConnection();
        
        return server.getTotalString();
    }
}
