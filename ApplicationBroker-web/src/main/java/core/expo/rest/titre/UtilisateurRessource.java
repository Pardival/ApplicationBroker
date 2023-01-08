


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package core.expo.rest.titre;
import com.google.gson.Gson;
import core.dataObject.IntroductionEnBourse;
import core.dataObject.Utilisateur;
import core.services.TitreServiceLocal;
import core.services.UtilisateurServiceLocal;
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
@Path("utilisateur")
@RequestScoped
public class UtilisateurRessource {

    UtilisateurServiceLocal utilisateurService = lookupBanqueBeanLocal();

    @Context
    private UriInfo context;


    // Convertisseur JSON
    private Gson gson;

    /**
     * Creates a new instance of ComptesResource
     */
    public UtilisateurRessource() {
        this.gson = new Gson();
        this.utilisateurService = this.lookupBanqueBeanLocal();
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

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String ajouterUtilisateur(Utilisateur utilisateur) {
        
        return this.gson.toJson(this.utilisateurService
                .ajouterUtilisateur(utilisateur.getNom(), utilisateur.getSolde()));
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/introduction-en-bourse")
    public String indtroductionEnBourse(IntroductionEnBourse datas) {
        
        return this.gson.toJson(this.utilisateurService
                .introductionEnBourse(datas.getNomEntreprise(),
                        datas.getMnemonique(), datas.getCours(), datas.getVariation(), datas.getDateCours()));
    }
    
    private UtilisateurServiceLocal lookupBanqueBeanLocal() {
        try {
            javax.naming.Context c = new InitialContext();
            return (UtilisateurServiceLocal) c.lookup("java:global/ApplicationBroker-web/UtilisateurService");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
    
}
