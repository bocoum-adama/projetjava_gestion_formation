/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.projet_fin_annee.service;

import java.util.List;
import sn.ugb.ipsl.projet_fin_annee.dao.implemente_etudiant;
import sn.ugb.ipsl.projet_fin_annee.entite.Etudiant;
import sn.ugb.ipsl.projet_fin_annee.entite.filieres;
import sn.ugb.ipsl.projet_fin_annee.dao.interfaceEtudiant;

/**
 *
 * @author mac
 */
public class etudiant_implemente implements etudiant_interface{
    
    private final interfaceEtudiant etudiantdao= new implemente_etudiant(); 
    
    @Override
    public void ajout_etudiant(Etudiant e) {
        etudiantdao.ajout_etudiant(e);
    }

    @Override
    public void ajouter_etudiants(List<Etudiant> l) {
        for (Etudiant etudiant : l) {
             etudiantdao.ajout_etudiant(etudiant);
        }
    }

    @Override
    public List<Etudiant> lister_etudiant() {
       return etudiantdao.lister_etudiant();
    }

    @Override
    public List<Etudiant> lister_etudiant(String nomfiliere) {
        return etudiantdao.lister_etudiant(nomfiliere);
    }

    @Override
    public List<Etudiant> lister_etudiant_class(String niveau, String f) {
        return etudiantdao.lister_etudiant_class(niveau, f);
    }

    
}
