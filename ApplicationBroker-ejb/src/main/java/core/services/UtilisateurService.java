/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.services;

import core.entities.Titre;
import core.entities.Utilisateur;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author KevinDufour
 */
@Stateless
public class UtilisateurService implements UtilisateurServiceLocal {

    @Override
    public Utilisateur ajouterUtilisateur(Utilisateur aAjouter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public List<Titre> consulterPosition(Long idUtilisateur) {
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
