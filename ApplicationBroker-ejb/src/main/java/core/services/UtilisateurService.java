/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.services;

import com.google.gson.Gson;
import core.controllers.UtilisateurFacade;
import core.entities.Titre;
import core.entities.Utilisateur;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author KevinDufour
 */
@Stateless
public class UtilisateurService implements UtilisateurServiceLocal {

    @EJB
    private UtilisateurFacade utilisateurFacade;
    
    private Gson gson;
    
    @Override
    public String ajouterUtilisateur(Utilisateur aAjouter) {
        try {
            return this.gson.toJson(utilisateurFacade.ajouter(aAjouter));
        } catch (Exception e) {
            System.out.println("Erreur durant l'ajout de l'utilisateur");
            return this.gson.toJson(null);
        }
    }
    
    @Override
    public String introductionEnBourse(String nomUtilisateur, Titre aIntroduire) {
        try {
            // TODO
            
            // Utilisateur existe t-il ?
            utilisateurFacade.aTrouverParId(nomUtilisateur);
            
            // Créer le message
            
            // Mettre dans la queue 
        } catch (Exception ex) {
            Logger.getLogger(UtilisateurService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "nok";
    }

    @Override
    public Utilisateur supprimerUtilisateur(Utilisateur aSupprimer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Titre acheterAction(Titre idTitre, Double prixAchat, Double prixVente, Long idUtilisateur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String consulterPosition(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Utilisateur debiter(Integer aDebiter, Utilisateur aModifier) {
        return null;
    }
    
    private Utilisateur crediter(Integer aCrediter, Utilisateur aModifier) {
        return null;
    }
    
    private Utilisateur ajouterTitre(Titre aAjouter, Utilisateur aModifier) {
        return null;
    }
    
    private Utilisateur supprimerTitre(Titre aSupprimer, Utilisateur aModifier) {
        return null;
    }
}
