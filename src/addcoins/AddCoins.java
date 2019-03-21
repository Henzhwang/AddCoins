/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addcoins;

/**
 *
 * @author HenryHwang
 */

import java.util.Scanner;
public class AddCoins {

    /**
     * @param args the command line arguments
     */
    
    public static double getDollarAmount(int quar, int dim, int nick, int pen)
    {
        double total;
        total = 0.25 * quar + 0.1 * dim + 0.05 * nick + 0.01 * pen;
        return total;
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Your Total Coins");
        
        System.out.println("Quarters:");
        int quart = input.nextInt();
        
        System.out.println("Dimes:");
        int dime = input.nextInt();
        
        System.out.println("Nickles:");
        int nicks = input.nextInt();
        
        System.out.println("Pennies:");
        int penn = input.nextInt();
        
        System.out.println("Total: " + getDollarAmount(quart, dime, nicks, penn));
        
    }
    
}
