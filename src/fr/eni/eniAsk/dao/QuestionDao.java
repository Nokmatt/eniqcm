package fr.eni.eniAsk.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import fr.eni.eniAsk.Model.Question;
import fr.eni.eniAsk.dao.Connect;
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ETY0007
 */
public class QuestionDao {

    public static boolean insert(Question qs) {
        boolean ok = true;
        Connect conn = new Connect();
        //charger le driver en m�moire
        try {
           
            
            String insert = "INSERT INTO Questions(id,enonce,date_creation, themes_id, lienImage, nbReponses, nbBonnesReponses, typeReponses) "
                            + "values(?,?,?,?,?,?,?,?);";
            PreparedStatement rqt = conn.connexionDb().prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            rqt.setInt(1, qs.getIdQuestion());
            rqt.setString(2, qs.getEnonce());
            rqt.setDate(3, new java.sql.Date(qs.getDatecreation().getTime()));
            rqt.setInt(4, qs.getIdTheme());
            rqt.setString(5, qs.getLienImage());
            rqt.setInt(6, qs.getNbReponse());
            rqt.setInt(7, qs.getNbBonnesReponses());
            rqt.setString(8, qs.getTypeReponse());
            rqt.executeUpdate();
            ResultSet key = rqt.getGeneratedKeys();
            key.next();
            qs.setIdQuestion(key.getInt(1));
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            ok = false;
        } finally {
            if (conn != null) {
                try {
                    conn.connexionDb().close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        return ok;

    }

    public static void edit(Question qs) throws SQLException {
        Connect conn = new Connect();
        PreparedStatement rqt = null;
        try {
            rqt = conn.connexionDb().prepareStatement("UPDATE Questions SET enonce = ?, themes_id = ?, lienImage = ?, nbReponses = ?, nbBonnesReponses = ?, typeReponses = ? where id = ?");

            rqt.setString(1, qs.getEnonce());
            rqt.setInt(2, qs.getIdTheme());
            rqt.setString(3, qs.getLienImage());
            rqt.setInt(4, qs.getNbReponse());
            rqt.setInt(5, qs.getNbBonnesReponses());
            rqt.setString(6, qs.getTypeReponse());
            rqt.setInt(7, qs.getIdQuestion());
            rqt.executeUpdate();
        } finally {
            if (rqt != null) {
                rqt.close();
            }
            if (conn != null) {
                 conn.connexionDb().close();
            }
        }
    }

    public static void delete(Question qs) throws SQLException {
        Connect conn = new Connect();
        PreparedStatement rqt = null;
        try {
            rqt = conn.connexionDb().prepareStatement("DELETE from Questions WHERE id = ?");
            rqt.setInt(1, qs.getIdQuestion());
            rqt.executeUpdate();
        } finally {
            if (rqt != null) {
                rqt.close();
            }
            if (conn != null) {
                 conn.connexionDb().close();
            }
        }
    }
    
    public Question getQuestionByid(int id) {
         Question questions = new Question();
        try {

            Connect conn = new Connect();
           
            PreparedStatement pst = conn.connexionDb().prepareStatement("Select * from Questions where id=?");

            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
           if (rs.next()) {
                
                String enonce = rs.getString("enonce");
                questions.setEnonce(enonce);
                Date dateCreation = rs.getDate("date_creation");
                questions.setDatecreation(dateCreation);
                int themeId = rs.getInt("themes_id");
                questions.setIdTheme(themeId);
            } 
           
        } catch (Exception e) {
            }
        
        return questions;
    }
}
