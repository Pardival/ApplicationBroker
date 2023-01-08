/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.controllers;

import core.entities.Utilisateur;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author KevinDufour
 */
@Stateless
public class UtilisateurFacade extends AbstractFacade<Utilisateur> implements UtilisateurFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_ApplicationBroker-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;
    
    List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UtilisateurFacade() {
        super(Utilisateur.class);
    }
    
    /////////////////////////////////////////

    @Override
    public Utilisateur ajouter(Utilisateur aAjouter) throws Exception {
        for (int i = 0; i < utilisateurs.size(); i++) {
            if (utilisateurs.get(i).getNom().equals(aAjouter.getNom())) {
                throw new Exception();
            }
        }
        utilisateurs.add(aAjouter);
        return aAjouter;
    }

    @Override
    public Utilisateur supprimer(Utilisateur aSupprimer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Utilisateur modifier(Utilisateur aModifier) throws Exception  {        
        for (int i = 0; i < utilisateurs.size(); i++) {
            if (utilisateurs.get(i).getNom().equals(aModifier.getNom())) {
                utilisateurs.set(i, aModifier);
                return aModifier;
            }
        }
        throw new Exception();
    }

    @Override
    public Utilisateur aTrouverParId(String nom) throws Exception {
        for (int i = 0; i < utilisateurs.size(); i++) {
            if (utilisateurs.get(i).getNom().equals(nom)) {
                return utilisateurs.get(i);
            }   
        }
        throw new Exception();
    }
}
