/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstclient;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class OutputThread extends Thread{
    
    Scanner out;

    public OutputThread(Scanner out) {
        this.out = out;
    }

    @Override
    public void run() {
        
        while(true){
            System.out.println(out.nextLine());
        }
    }
    
    
    
}
