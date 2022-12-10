/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.services;

import core.entities.Titre;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author KevinDufour
 */
@Local
public interface TitreServiceLocal {
    String consulterTitre();
    
    String rechercheMnemonique(String mnemonique);
    
    void mAjListTitre();
}
