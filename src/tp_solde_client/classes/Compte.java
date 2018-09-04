/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_solde_client.classes;

import java.util.ArrayList;

/**
 *
 * @author sesame
 */
public class Compte {
    
    private int idCompte;
    private int solde;

    public Compte(int idCompte, int solde ) {
        this.idCompte = idCompte;
        this.solde = solde;
    }

    public int getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }
    

}
