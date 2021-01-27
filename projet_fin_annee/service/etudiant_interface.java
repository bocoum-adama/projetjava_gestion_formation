/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.projet_fin_annee.service;

import java.util.List;
import sn.ugb.ipsl.projet_fin_annee.entite.Etudiant;
import sn.ugb.ipsl.projet_fin_annee.entite.filieres;

/**
 *
 * @author mac
 */
public interface etudiant_interface {

    public void ajout_etudiant(Etudiant e);
    
    public void ajouter_etudiants(List<Etudiant> l);

    public List<Etudiant> lister_etudiant();

    public List<Etudiant> lister_etudiant(String f);
    
   

    public List<Etudiant> lister_etudiant_class(String niveau, String f);

}
