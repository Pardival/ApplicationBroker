package core.mdb;

import core.entities.Titre;
import javax.ejb.Local;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JordanLcq
 */
@Local
public interface IntegrationEnBourseProducerLocal {
    public void sendTitre(Titre titre);
}
