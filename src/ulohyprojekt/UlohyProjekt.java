/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulohyprojekt;


/**
 *
 * @author client
 */
public class UlohyProjekt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ConnectionProvider conn = new ConnectionProvider();
        System.out.println(conn.getTasks());
    }
    
}
