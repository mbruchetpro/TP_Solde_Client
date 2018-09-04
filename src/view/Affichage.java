/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author sesame
 */
public class Affichage {
    private Scanner sc = new Scanner(System.in);
    public void getAffichage() {
        System.out.print("Bonjour ! Veuillez saisir votre numéro de compte.");
    }
    
    public void getClientLogin(){
        System.out.println("\nnum :");
        String id = this.sc.nextLine();
        
        
    }
}
