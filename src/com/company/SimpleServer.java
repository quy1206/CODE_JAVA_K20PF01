package com.company;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.spec.RSAOtherPrimeInfo;

public class server {
public static void main(String[] args){
            Socket socketofServer;
            try {
                ServerSocket serverSocket = new ServerSocket(65000);
                System.out.println("Server is waiting...");
                 while (true){
                     socketofServer = serverSocket.accept();
                     System.out.println("Finish...");
                 }
        }catch (IOException e){
                e.printStackTrace();
            }

     }
}
