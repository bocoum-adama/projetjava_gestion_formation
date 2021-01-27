/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.projet_fin_annee.service;

import java.util.List;
import sn.ugb.ipsl.projet_fin_annee.dao.implemente_Filiere;
import sn.ugb.ipsl.projet_fin_annee.entite.filieres;

/**
 *
 * @author mac
 */
public class filiere_implemente implements filiere_interface{
    
    private final implemente_Filiere  filiere= new implemente_Filiere();
    
    @Override
    public void ajout_filiere(filieres f) {
       filiere.ajout_filiere(f);
    }

    @Override
    public void modiffier_filiere(String ancien_nom, String nouveau_nom) {
        filiere.modiffier_filiere(ancien_nom, nouveau_nom);
    }

    @Override
    public void supprimer_filiere(String f) {
        filiere.supprimer_filiere(f);
    }

    @Override
    public List<filieres> lister_filiere() {
        return filiere.lister_filiere();
    }
    
}
