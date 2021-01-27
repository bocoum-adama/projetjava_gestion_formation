
package sn.ugb.ipsl.projet_fin_annee.Gui;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import sn.ugb.ipsl.projet_fin_annee.entite.filieres;
import sn.ugb.ipsl.projet_fin_annee.service.filiere_implemente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mac
 */
public class filiereTableModel extends AbstractTableModel{
    private final List<filieres> filiere;
    public filiereTableModel() {
      filiere_implemente  etudiantservice = new filiere_implemente();
      filiere = etudiantservice.lister_filiere();
      
    }
    String res;
   
    @Override
    public int getRowCount() {
       return filiere.size();
    }

    @Override
    public int getColumnCount() {
       return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        filieres e=filiere.get(rowIndex);
        Object res = null;
        res=e.getNomf();
        return res;
               
       
    }
}
