/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroes_projeto_mds;

import java.util.Scanner;

/**
 *
 * @author higor
 */ 
public class Singleton {
    private static final Singleton singleton = new Singleton();
    private String IP;
    private int porta;
    private Scanner reader = new Scanner(System.in);
    
    private Singleton(){
        this.IP = reader.next();
        this.porta = reader.nextInt();
        System.out.println("Singleton objeto criado");
    }
    
    public static Singleton getInstance(){
        return singleton;
    }
    
    public String getIP(){
        return this.IP;
    }
    
    public int getPorta(){
        return this.porta;
    }
}
