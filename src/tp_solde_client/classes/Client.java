/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_solde_client.classes;

/**
 *
 * @author sesame
 */
public class Client {
    
    private int idClient;
    private String nomClient;
    private String preClient;
    private Compte compteClient;

    public Client(int idClient, String nomClient, String preClient, Compte compte ) {
        this.idClient = idClient;
        this.nomClient =  nomClient;
        this.preClient = preClient; 
        this.compteClient = compte;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setidClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPreClient() {
        return preClient;
    }

    public void setPreClient(String preClient) {
        this.preClient = preClient;
    }
    
    public int getSoldeClient() {
        return this.compteClient.getSolde();
    }
    
}
