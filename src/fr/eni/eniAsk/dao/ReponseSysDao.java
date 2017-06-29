package fr.eni.eniAsk.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import fr.eni.eniAsk.Model.ReponseSys;
import fr.eni.eniAsk.dao.Connect;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ETY0007
 */
public class ReponseSysDao {
    /**
        public static boolean insert(ReponseSys rep) {
        boolean ok = true;
        Connection cnx = null;
        //charger le driver en m�moire
        try {
            cnx = AccesBase.getConnection();
            String insert = "INSERT INTO Questions(id,enonce,date_creation, themes_id, lienImage, nbReponses, nbBonnesReponses, typeReponses) "
                            + "values(?,?,?,?,?,?,?,?);";
            PreparedStatement rqt = cnx.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            rqt.setInt(1, rep.getIdQuestion());
            rqt.setString(2, rep.getEnonce());
            rqt.setDate(3, new java.sql.Date(rep.getDateCreation().getTime()));
            rqt.setInt(4, rep.getIdTheme());
            rqt.setString(5, rep.getLienImage());
            rqt.setInt(6, rep.getNbReponse());
            rqt.setInt(7, rep.getNbBonnesReponses());
            rqt.setString(8, rep.getTypeReponse());
            rqt.executeUpdate();
            ResultSet key = rqt.getGeneratedKeys();
            key.next();
            rep.setIdQuestion(key.getInt(1));
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            ok = false;
        } finally {
            if (cnx != null) {
                try {
                    cnx.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        return ok;

    }

    public static void edit(ReponseSys rep) throws SQLException {
        Connection cnx = null;
        PreparedStatement rqt = null;
        try {
            cnx = AccesBase.getConnection();
            rqt = cnx.prepareStatement("UPDATE Questions SET enonce = ?, themes_id = ?, lienImage = ?, nbReponses = ?, nbBonnesReponses = ?, typeReponses = ? where id = ?");

            rqt.setString(1, rep.getEnonce());
            rqt.setInt(2, rep.getIdTheme());
            rqt.setString(3, rep.getLienImage());
            rqt.setInt(4, rep.getNbReponse());
            rqt.setInt(5, rep.getNbBonnesReponses());
            rqt.setString(6, rep.getTypeReponse());
            rqt.setInt(7, rep.getIdQuestion());
            rqt.executeUpdate();
        } finally {
            if (rqt != null) {
                rqt.close();
            }
            if (cnx != null) {
                cnx.close();
            }
        }
    }

    public static void delete(ReponseSys rep) throws SQLException {
        Connection cnx = null;
        PreparedStatement rqt = null;
        try {
            cnx = AccesBase.getConnection();
            rqt = cnx.prepareStatement("DELETE from Questions WHERE id = ?");
            rqt.setInt(1, rep.getIdQuestion());
            rqt.executeUpdate();
        } finally {
            if (rqt != null) {
                rqt.close();
            }
            if (cnx != null) {
                cnx.close();
            }
        }
    }
    ***/
}
