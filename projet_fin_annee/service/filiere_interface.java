/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.projet_fin_annee.service;

import java.util.List;
import sn.ugb.ipsl.projet_fin_annee.entite.filieres;

/**
 *
 * @author mac
 */
public interface filiere_interface {

    public void ajout_filiere(filieres f);

    public void modiffier_filiere(String ancien_nom, String nouveau_nom);

    public void supprimer_filiere(String f);
    public List<filieres> lister_filiere();
}
