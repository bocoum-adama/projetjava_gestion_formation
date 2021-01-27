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
import sn.ugb.ipsl.projet_fin_annee.entite.Etudiant;
import sn.ugb.ipsl.projet_fin_annee.entite.filieres;

/**
 *
 * @author mac
 */
public class implemente_etudiant implements interfaceEtudiant {
    @Override
    public void ajout_etudiant(Etudiant e) {

        String prenom = e.getPrennon();
        String nom = e.getNom();
        String datedenaissance = e.getDatednaissance();
        String id = e.getID();
        String niveau = e.getNiveau();
        String filiere = e.getFiliere();

        String requete = "insert into etudiant(ID, PRENOM, NOM, DATE_DE_NAISSANCE, NIVEAU, FILIERE ) values('" + id + "', '" + prenom + "', '" + nom + "', '" + datedenaissance + "', '" + niveau + "', '" + filiere + "');";
        try {
            Statement st = dbUtils.getConnection().createStatement();
            st.executeUpdate(requete);
        } catch (Exception ex) {
            Logger.getLogger(implemente_etudiant.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Etudiant> lister_etudiant() {
        String requete = "select * from etudiant";
        ResultSet lst = null;
        List <Etudiant> f = new ArrayList<>();
        try {
            Statement st = dbUtils.getConnection().createStatement();
            lst = st.executeQuery(requete);
        } catch (Exception ex) {
            Logger.getLogger(implemente_etudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (lst.next()) {
                String id = lst.getString("ID");
                String prenom = lst.getString("prenom");
                String nom = lst.getString("nom");
                String date_de_naissance = lst.getString("date_de_naissance");
                String filiere = lst.getString("filiere");
                String niveau = lst.getString("niveau");
                
                f.add(new Etudiant(id, prenom, nom, date_de_naissance, niveau, filiere));
            }
        } catch (SQLException ex) {
            Logger.getLogger(implemente_etudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        

        return f;
    }

    @Override
    public List<Etudiant> lister_etudiant(String nomFiliere) {
        String requete = "select * from etudiant where filiere='"+nomFiliere+"'";
        ResultSet lst = null;
        List <Etudiant> fe = new ArrayList<>();
        try {
            Statement st = dbUtils.getConnection().createStatement();
            lst = st.executeQuery(requete);
        } catch (Exception ex) {
            Logger.getLogger(implemente_etudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (lst.next()) {
                String id = lst.getString("ID");
                String prenom = lst.getString("prenom");
                String nom = lst.getString("nom");
                String date_de_naissance = lst.getString("date_de_naissance");
                String filiere = lst.getString("filiere");
                String niveau = lst.getString("niveau");
                fe.add(new Etudiant(id, prenom, nom, date_de_naissance, niveau, filiere));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(implemente_etudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        

        return fe;
    }

    @Override
    public List<Etudiant> lister_etudiant_class(String niveau, String f) {

        String requete = "select * from etudiant where filiere='" + f + "' and niveau='" + niveau + "'";
        ResultSet lst = null;
        List <Etudiant> fee = new ArrayList<>();
        try {
            Statement st = dbUtils.getConnection().createStatement();
            lst = st.executeQuery(requete);
        } catch (Exception ex) {
            Logger.getLogger(implemente_etudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (lst.next()) {
                String id = lst.getString("ID");
                String prenom = lst.getString("prenom");
                String nom = lst.getString("nom");
                String date_de_naissance = lst.getString("date_de_naissance");
                String filiere = lst.getString("filiere");
                String Niveau = lst.getString("niveau");
                
                fee.add(new Etudiant(id, prenom, nom, date_de_naissance, Niveau, filiere));
            }
        } catch (SQLException ex) {
            Logger.getLogger(implemente_etudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        

        return fee;
    }
    
}
