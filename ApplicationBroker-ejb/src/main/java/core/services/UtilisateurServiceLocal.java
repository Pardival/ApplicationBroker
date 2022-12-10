/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.services;

import core.entities.Titre;
import core.entities.Utilisateur;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author KevinDufour
 */
@Local
public interface UtilisateurServiceLocal {
    String ajouterUtilisateur(Utilisateur aAjouter);
    
    String introductionEnBourse(String nomUtilisateur, Titre aIntroduire);
    
    Utilisateur supprimerUtilisateur(Utilisateur aSupprimer);
    
    Titre acheterAction(Titre idTitre, Double prixAchat, Double prixVente, Long idUtilisateur);
    
    String consulterPosition(String nom);
}
