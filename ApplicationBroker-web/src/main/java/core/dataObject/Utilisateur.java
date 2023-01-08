/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.dataObject;

/**
 *
 * @author KevinDufour
 */
public class Utilisateur {
    private String nom;
    private Double solde;

    public Utilisateur() {
        
    }
    public Utilisateur(String nom, Double solde) {
        this.nom = nom;
        this.solde = solde;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }  

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }
}