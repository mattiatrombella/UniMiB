import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class senderServerSocket{
    final static String message = "This is a not so short text to test the reading capability of clients";
    
    public static void main(String[] args){

        try{
            Socket clientSocket;
            ServerSocket listenSocket;
           
            
            listenSocket = new ServerSocket(53535);
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println(inetAddress + "Running Server: "+ "Host = " + listenSocket.getInetAddress() + " Port = " + listenSocket.getLocalPort());

            while(true){
                clientSocket = listenSocket.accept();

                System.out.println("Connected to client at aa port: " + clientSocket.getPort());
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                System.out.println("I am sending the message: \n" + message);
                System.out.println("message length: " + message.length());

                out.write(message);
                out.flush();
            }
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}