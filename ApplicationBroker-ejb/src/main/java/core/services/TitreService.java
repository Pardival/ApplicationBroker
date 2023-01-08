/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.services;

import com.google.gson.Gson;
import core.controllers.TitreFacade;
import core.controllers.TitreFacadeLocal;
import core.entities.Titre;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author KevinDufour
 */
@Stateless
public class TitreService implements TitreServiceLocal {

    @EJB
    private TitreFacadeLocal titreFacade;
    
    private Gson gson;
    
    @Override
    public String consulterTitre() {
        //TODO convertir en JSON
        return this.gson.toJson(titreFacade.afficherTitres());
    }

    @Override
    public String rechercheMnemonique(String mnemonique) {
        return this.gson.toJson(titreFacade.trouverParMnemonique(mnemonique));
    }

    @Override
    public void mAjListTitre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
