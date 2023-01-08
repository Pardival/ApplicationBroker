/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package core.mdb;

import core.entities.Titre;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.JMSProducer;
import javax.jms.ObjectMessage;
import javax.jms.Topic;
 

/**
*
* @author Kev
*/
@Singleton
public class IntegrationEnBourseProducer {

    public enum JMSTypeMessage {
        EDIT("edit"),
        DELETE("delete"),
        ADD("add");

        private final String label;

        private JMSTypeMessage(String label) {
            this.label = label;
        }

        public String getLabel() {
            return this.label;
        }
    };

     /**
     * Nom du Topic recherché.
     */
    @Resource(mappedName = "IntegrationEnBourse")
    private Topic integrationEnBourse;
    /**
     * contexte JMS. Injection auto par serveur d'appli.
     */
    @Inject
    @JMSConnectionFactory("ConnectionFactory")
    private JMSContext context;

    public void sendTitre(Titre titre) {
        try {
            JMSProducer producer = context.createProducer();

            ObjectMessage mess = context.createObjectMessage();
            mess.setObject(titre);
            context.createProducer().send(integrationEnBourse, mess);

        } catch (JMSException ex) {
            Logger.getLogger(IntegrationEnBourseProducer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}