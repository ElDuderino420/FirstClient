/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstclient;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class FirstClient {

    static String ip;
    static int port;
    
    
    public void startClient() throws IOException{
        
        Scanner inClient = new Scanner(System.in);
        System.out.print("Enter ip: ");
        ip = inClient.nextLine();
        System.out.print("Enter port number: ");
        port = inClient.nextInt();
        Socket clientSocket = new Socket(ip,port);
        Scanner inServ = new Scanner(clientSocket.getInputStream());
        PrintWriter toServ = new PrintWriter(clientSocket.getOutputStream(),true);
        
        InputThread it = new InputThread(inClient, toServ);
        OutputThread ot = new OutputThread(inServ);
        it.start();
        ot.start();
        
        
        
        
    }
    
    public static void main(String[] args) throws IOException {

        new FirstClient().startClient();
    
    }
    
}
