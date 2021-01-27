/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.projet_fin_annee.entite;

import java.util.Date;

/**
 *
 * @author mac
 */
public class Etudiant {
    private String ID ;
    private String prenon;
    private String nom;
    private String datednaissance;
    private String niveau;
    private String nom_filiere;

    public Etudiant(String ID, String prennon, String nom, String datednaissance, String niveau, String filiere) {
        this.ID = ID;
        this.prenon = prennon;
        this.nom = nom;
        this.datednaissance = datednaissance;
        this.niveau = niveau;
        this.nom_filiere = filiere;
    }

   

    
    
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPrennon() {
        return prenon;
    }

    public void setPrennon(String prennon) {
        this.prenon = prennon;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDatednaissance() {
        return datednaissance;
    }

    public void setDatednaissance(String datednaissance) {
        this.datednaissance = datednaissance;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getFiliere() {
        return nom_filiere;
    }

    public void setFiliere(String filiere) {
        this.nom_filiere = filiere;
    }

    
    
    
}
