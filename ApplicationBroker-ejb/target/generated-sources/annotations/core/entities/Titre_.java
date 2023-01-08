package core.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-01-08T15:44:31")
@StaticMetamodel(Titre.class)
public class Titre_ { 

    public static volatile SingularAttribute<Titre, Date> dateCours;
    public static volatile SingularAttribute<Titre, String> mnemonique;
    public static volatile SingularAttribute<Titre, String> nomEntreprise;
    public static volatile SingularAttribute<Titre, Long> id;
    public static volatile SingularAttribute<Titre, Boolean> error;
    public static volatile SingularAttribute<Titre, Double> cours;
    public static volatile SingularAttribute<Titre, Integer> variation;

}