/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.projet_fin_annee.Gui;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import sn.ugb.ipsl.projet_fin_annee.entite.Etudiant;
import sn.ugb.ipsl.projet_fin_annee.service.etudiant_implemente;

/**
 *
 * @author mac
 */
public class EtudiantTableModelfiliere extends AbstractTableModel{
     private final List<Etudiant> etudiant;
    
    
     
     EtudiantTableModelfiliere(String f) {
      etudiant_implemente  etudiantservice = new etudiant_implemente();
      etudiant = etudiantservice.lister_etudiant(f);
      
    }

   
    @Override
    public int getRowCount() {
       return etudiant.size();
    }

    @Override
    public int getColumnCount() {
       return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Etudiant e=etudiant.get(rowIndex);
        Object res = null;
        switch(columnIndex){
            case 0:
                res=e.getID();
                break;
            case 1:
                res=e.getPrennon();
                break;
            case 2:
                res=e.getNom();
                break;
            case 3:
                res=e.getDatednaissance();
                break;
            case 4:
                res=e.getFiliere();
                break;
            case 5:
                res=e.getNiveau();
                break;    
        }
       
        return res;

}
    
}