package fr.eni.eniAsk.dao;

import java.sql.Connection;
import static java.lang.System.out;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Connect {

    private static DataSource ds;

    static {
        try {
            //atteindre une ressource serveur de type pool de connexions
            InitialContext ic = new InitialContext();
            ds = (DataSource) ic.lookup("java:comp/env/jdbc/eniAskProjekt");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    public static Connection connexionDb() throws SQLException {

        Connection connexion = ds.getConnection();

        return connexion;
    }

}
