/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroes_projeto_mds;

/**
 *
 * @author higor
 */
public class TesteSingleton {
    public static void main(String args[]){
        Singleton obj1;
        
        obj1 = Singleton.getInstance();
        System.out.println("IP: " + obj1.getIP());
        System.out.println("Porta: " + obj1.getPorta());
    }    
}
