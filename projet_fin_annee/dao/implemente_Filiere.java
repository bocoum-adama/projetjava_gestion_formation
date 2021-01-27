/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.projet_fin_annee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sn.ugb.ipsl.projet_fin_annee.entite.filieres;

/**
 *
 * @author mac
 */
public class implemente_Filiere implements interfaceFiliere{

    @Override
    public void ajout_filiere(filieres f) {
        String nom =f.getNomf();
        
        String requete="insert into filieres(nom_filiere) values('"+nom+"')";
        
        try {
            Statement st = dbUtils.getConnection().createStatement();
            st.executeUpdate(requete);
        } catch (Exception ex) {
            Logger.getLogger(implemente_etudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modiffier_filiere(String ancien_nom, String nouveau_nom) {
      
        String requete="update filieres set nom_filiere='"+nouveau_nom+"' where nom_filiere='"+ancien_nom+"' ";
        
        try {
            Statement st = dbUtils.getConnection().createStatement();
            st.executeUpdate(requete);
        } catch (Exception ex) {
            Logger.getLogger(implemente_etudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void supprimer_filiere(String f) {
        String requete="DELETE FROM filieres WHERE nom_filiere='"+f+"' ";
        
        try {
            Statement st = dbUtils.getConnection().createStatement();
            st.executeUpdate(requete);
        } catch (Exception ex) {
            Logger.getLogger(implemente_etudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     *
     * @return
     */
   
    @Override
    public List<filieres> lister_filiere() {
        
        
        String requete = "select * from filieres";
        ResultSet lst = null;
        List <filieres> listfiliere = new ArrayList<>();
        try {
            Statement st = dbUtils.getConnection().createStatement();
            lst = st.executeQuery(requete);
        } catch (Exception ex) {
            Logger.getLogger(implemente_Filiere.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (lst.next()) {
              listfiliere.add(new filieres(lst.getString("nom_filiere")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(implemente_Filiere.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        

        return listfiliere;
    
    }
    
    
    
   
}
