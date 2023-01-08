


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package core.expo.rest.titre;
import com.google.gson.Gson;
import core.services.TitreServiceLocal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Kevin
 */
@Path("titre")
@RequestScoped
public class TitreRessource {

    TitreServiceLocal titreService = lookupBanqueBeanLocal();

    @Context
    private UriInfo context;


    // Convertisseur JSON
    private Gson gson;

    /**
     * Creates a new instance of ComptesResource
     */
    public TitreRessource() {
        this.gson = new Gson();
        this.titreService = this.lookupBanqueBeanLocal();
    }

    /**
     * Pas d'export de la liste des comptes
     *
     * @return une réponse HTTP avec le code d'erreur 403
     */
    @GET
    public String getJson() {
        return "oinoin";
    }

    private TitreServiceLocal lookupBanqueBeanLocal() {
        try {
            javax.naming.Context c = new InitialContext();
            return (TitreServiceLocal) c.lookup("java:global/ApplicationBroker-web/TitreService");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
    
}
