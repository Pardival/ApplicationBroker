package core.entities;

import core.entities.Titre;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-01-08T15:44:31")
@StaticMetamodel(Compte.class)
public class Compte_ { 

    public static volatile ListAttribute<Compte, Titre> titres;
    public static volatile SingularAttribute<Compte, Double> solde;
    public static volatile SingularAttribute<Compte, Long> id;

}