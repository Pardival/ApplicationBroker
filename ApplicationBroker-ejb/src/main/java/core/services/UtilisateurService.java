/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.services;

import com.google.gson.Gson;
import core.controllers.UtilisateurFacade;
import core.controllers.UtilisateurFacadeLocal;
import core.entities.Compte;
import core.entities.Titre;
import core.entities.Utilisateur;
import core.mdb.IntegrationEnBourseProducer;
import java.util.Date;
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
    private UtilisateurFacadeLocal utilisateurFacade;
    
    @EJB
    private IntegrationEnBourseProducer integrationEnBourseProducer;
    
    private Gson gson;
    
    @Override
    public Utilisateur ajouterUtilisateur(String nom, Double solde) {
        try {
            Utilisateur aAjouter = new Utilisateur();
            Compte compte = new Compte();
            compte.setSolde(solde);
            aAjouter.setNom(nom);
            aAjouter.setCompte(compte);
            return utilisateurFacade.ajouter(aAjouter);
        } catch (Exception e) {
            System.out.println("Erreur durant l'ajout de l'utilisateur");Utilisateur aAjouter = new Utilisateur();
            Utilisateur aRetourner = new Utilisateur();
            aRetourner.setError(true);
            return aRetourner;
        }
    }
    
    @Override
    public Titre introductionEnBourse(String nomEntreprise, 
            String mnemonique, Double cours, Integer variation, Date dateCours) {
        try {    
            // Utilisateur existe t-il ?
            utilisateurFacade.aTrouverParId(nomEntreprise);
            
            // Création du titre boursier
            Titre aIntroduire = new Titre();
            aIntroduire.setNomEntreprise(nomEntreprise);
            aIntroduire.setDateCours(dateCours);
            aIntroduire.setMnemonique(mnemonique);
            aIntroduire.setPrix(cours);
            aIntroduire.setQuantiteDisponible(variation);
            
            // Envoyer message au market place
            integrationEnBourseProducer.sendTitre(aIntroduire);
            
            // Retour REST
            return aIntroduire;
        } catch (Exception ex) {
            Logger.getLogger(UtilisateurService.class.getName()).log(Level.SEVERE, null, ex);
            Titre aRetourner = new Titre();
            aRetourner.setError(true);
            return aRetourner;
        }
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
