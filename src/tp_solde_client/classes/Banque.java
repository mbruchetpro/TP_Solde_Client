/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_solde_client.classes;

import data.Stub;
import java.util.ArrayList;

/**
 *
 * @author sesame
 */
public class Banque {
    
    private int numBanque;
    private String nomBanque;
    private final ArrayList<Client> CLIENTS = new Stub().getLesClients();
    
    public Banque(int numBanque, String nomBanque, ArrayList<Client> lesClients){
        this.numBanque = numBanque;
        this.nomBanque = nomBanque;
    }
    
    public void setNumBanque(int numBanque) {
        this.numBanque = numBanque;
    }

    public void setNomBanque(String nomBanque) {
        this.nomBanque = nomBanque;
    }

    public int getNumBanque() {
        return numBanque;
    }

    public String getNomBanque() {
        return nomBanque;
    }
    
    public int getSoldeClient(int numClient) {
        
      for( Client unClient : this.CLIENTS){
          if(unClient.getIdClient() == numClient) {
              Client client = unClient;
              return client.getSoldeClient();
          }
      }
      return 0;
    }
    
}
