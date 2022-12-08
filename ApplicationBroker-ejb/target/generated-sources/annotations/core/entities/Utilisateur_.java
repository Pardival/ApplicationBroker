package core.entities;

import core.entities.Compte;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-12-08T12:18:30")
@StaticMetamodel(Utilisateur.class)
public class Utilisateur_ { 

    public static volatile SingularAttribute<Utilisateur, Long> id;
    public static volatile SingularAttribute<Utilisateur, String> nom;
    public static volatile SingularAttribute<Utilisateur, Compte> compte;

}