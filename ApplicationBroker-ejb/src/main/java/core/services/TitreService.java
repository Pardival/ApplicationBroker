/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.services;

import core.entities.Titre;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author KevinDufour
 */
@Stateless
public class TitreService implements TitreServiceLocal {

    @Override
    public Titre consulterTitre(String mnemonique) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Titre> rechercheMnemonique(String mnemonique) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mAjListTitre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
