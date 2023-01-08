/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.dataObject;

import java.util.Date;

/**
 *
 * @author KevinDufour
 */
public class IntroductionEnBourse {
    private String nomEntreprise;
    private String mnemonique;
    private Double cours;
    private Integer variation;
    private Date dateCours;

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public String getMnemonique() {
        return mnemonique;
    }

    public void setMnemonique(String mnemonique) {
        this.mnemonique = mnemonique;
    }

    public Integer getQuantiteDisponible() {
        return variation;
    }

    public void setQuantiteDisponible(Integer variation) {
        this.variation = variation;
    }

    public Date getDateCours() {
        return dateCours;
    }

    public void setDateCours(Date dateCours) {
        this.dateCours = dateCours;
    }

    public Double getCours() {
        return cours;
    }

    public void setCours(Double cours) {
        this.cours = cours;
    }

    public Integer getVariation() {
        return variation;
    }

    public void setVariation(Integer variation) {
        this.variation = variation;
    }
    
    
}
