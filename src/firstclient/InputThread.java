/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstclient;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class InputThread extends Thread{
    
    Scanner in;
    PrintWriter out;

    public InputThread(Scanner in, PrintWriter out) {
        this.in = in;
        this.out = out;
    }

    @Override
    public void run() {
        
        while(true){
            
            if(in.hasNext()){
                out.println(in.nextLine());
            }
            
        }
        
    }
    
    
    
}
