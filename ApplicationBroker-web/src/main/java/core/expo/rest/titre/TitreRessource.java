/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.expo.rest.titre;

import core.services.TitreService;
import core.services.TitreServiceLocal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author KevinDufour
 */
@Path("titre")
public class TitreRessource {
    
    /**
     * EJB de l'exposition des services de la bourse.
     */
    TitreServiceLocal servicesBourse = lookupTitreServiceLocal();

    /**
     * This is a sample web service operation
     */
    @GET
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    /**
     * Méthode de recherche JNDI de l'EJB exposant les services de la bourse.
     *
     * @return EJB exposant le service s'il est trouvée. Null sinon
     */
    private TitreServiceLocal lookupTitreServiceLocal() {
        try {
            javax.naming.Context c = new InitialContext();
            return (TitreServiceLocal) c.lookup("java:global/ApplicationBroker-ear/ApplicationBroker-ejb-1.0/TitreService!core.services.TitreServiceLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
}
