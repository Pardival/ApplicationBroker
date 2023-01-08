/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.controllers;

import core.entities.Titre;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author KevinDufour
 */
@Stateless
public class TitreFacade extends AbstractFacade<Titre> implements TitreFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_ApplicationBroker-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;
    
    private List<Titre> titres = new ArrayList<Titre>();

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TitreFacade() {
        super(Titre.class);
    }

    ///////////////////Semble inutile //////////////////////
    
    public List<Titre> getTitres() {
        return titres;
    }

    public void setTitres(List<Titre> titres) {
        this.titres = titres;
    }   
    
    /////////////////////////////////////////
    
    @Override
    public List<Titre> ajouter(Titre aAjouter) {
        // TODO TitreExistException
        titres.add(aAjouter);
        return titres;
    }

    @Override
    public List<Titre> supprimer(Titre aSupprimer) {
        // TODO TitreInconnuxception ?
        for (int i = 0; i < titres.size(); i++) {
            if (titres.get(i).getMnemonique().equals(aSupprimer.getMnemonique())) {
                titres.remove(i);
            }
        }
        return titres;
    }
    
    @Override
    public List<Titre> modifier(Titre aModifier) {
        // TODO TitreInconnuxception ?
        for (int i = 0; i < titres.size(); i++) {
            if (titres.get(i).getMnemonique().equals(aModifier.getMnemonique())) {
                titres.set(i, aModifier);
            }
        }
        return titres;
    }

    @Override
    public Titre trouverParMnemonique(String mnemonique) {
        // TODO TitreInconnuxception ?
        for (int i = 0; i < titres.size(); i++) {
            if (titres.get(i).getMnemonique().equals(mnemonique)) {
                return titres.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Titre> afficherTitres() {
        return titres;
    }
}
