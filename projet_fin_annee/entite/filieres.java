/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.projet_fin_annee.entite;

/**
 *
 * @author mac
 */
public class filieres {

    public static String getNiveau1() {
        return niveau1;
    }

    public static String getNiveau2() {
        return niveau2;
    }

    public static String getNiveau3() {
        return niveau3;
    }

    public static String getNiveau4() {
        return niveau4;
    }

    public static String getNiveau5() {
        return niveau5;
    }

    private String nomf;
    private static final String niveau1="licence1";
    private static final String niveau2="licence2";
    private static final String niveau3="licence3";
    private static final String niveau4="master1";
    private static final String niveau5="master2";

    public filieres(String nomf) {
        this.nomf = nomf;
    }

    public filieres() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public String getNomf() {
        return nomf;
    }

    public void setNomf(String nomf) {
        this.nomf = nomf;
    }

    
    
    
}
