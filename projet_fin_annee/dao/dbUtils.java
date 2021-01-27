/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.projet_fin_annee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

/**
 *
 * @author mac
 */
public class dbUtils {

    private static Connection cnn;
    public static final SimpleDateFormat SQL_FORMAT=new SimpleDateFormat("yyyy-MM-dd");

    public static Connection getConnection() throws Exception {
       
        //connetion a la base
        if (cnn == null) {

            Class.forName ("org.postgresql.Driver").newInstance();
            cnn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/ipsl", "postgres", "a1998bocoum");

        }
        return cnn;
    }

    public static void disconnect() throws SQLException {
        if (cnn != null) {
            cnn.close();
            cnn = null;
        }
    }

    public static void main(String[] args) throws Exception {
        Connection conn = dbUtils.getConnection();
        System.out.println("connexion ok");
        dbUtils.disconnect();
        System.out.println("deconnexion ok");
       
    }

}

