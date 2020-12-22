package davi.dsweb_exercicio01;

/* @author Davi Teixeira */

import java.net.*;
import java.io.*;

public class TCPClient{
    public static void main(String args[]){
        
        Socket s = null;
        try{
            
            int serverPort = 7896;
            s = new Socket("localhost", serverPort);
            DataInputStream in = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            out.writeUTF("localhost"); // UTF is a string encoding see Sn 4.3
            String data = in.readUTF();
            System.out.println("Received: " + data);
            
        }catch(UnknownHostException e){
            System.out.println("Sock:" + e.getMessage());
        }catch (EOFException e){
            System.out.println("EOF:" + e.getMessage());
        }catch(IOException e){
            System.out.println("CONECTADO COM SUCESSO: NO {localhost} e porta{7896}" + e.getMessage());
        }finally{
            if(s != null){
                try{
                    s.close();
                }catch(IOException e){
                    System.out.println("close:" + e.getMessage());
                }
            }
        }
    }
}