/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import tp_solde_client.classes.Banque;
import tp_solde_client.classes.Client;
import tp_solde_client.classes.Compte;

/**
 *
 * @author sesame
 */
public class Stub {
    
    private ArrayList<Client> lesClients = new ArrayList<Client>();
    private final Compte unCompte = new Compte(1, 1000);
    private Client unClient = new Client(1, "Coco", "L'asticot", unCompte);
    private Banque b1 = new Banque(1, "Ecureuil", lesClients);

    public ArrayList<Client> getLesClients() {
        lesClients.add(unClient);

        return lesClients;
    }


    public Client getUnClient() {
        return unClient;
    }


    public Banque getB1() {
        return b1;
    }
        
}
