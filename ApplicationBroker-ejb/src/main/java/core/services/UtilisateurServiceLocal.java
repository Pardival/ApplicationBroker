/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.services;

import core.entities.Titre;
import core.entities.Utilisateur;
import java.util.Date;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author KevinDufour
 */
@Local
public interface UtilisateurServiceLocal {
    Utilisateur ajouterUtilisateur(String nom, Double solde);
    
    public Titre introductionEnBourse(String nomEntreprise, 
            String mnemonique, Double cours, Integer variation, Date dateCours);
    
    Utilisateur supprimerUtilisateur(Utilisateur aSupprimer);
    
    Titre acheterAction(Titre idTitre, Double prixAchat, Double prixVente, Long idUtilisateur);
    
    String consulterPosition(String nom);
}
