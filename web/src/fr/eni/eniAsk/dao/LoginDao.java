package src.fr.eni.eniAsk.dao;



import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import src.fr.eni.eniAsk.dao.Connect;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ETY0002
 */
public class LoginDao {
    
    public Boolean validateLogin(String username, String password){
        try{
       
        Boolean connecté = null;
        Connect conn = new Connect();
       
        
        PreparedStatement pst = conn.connexionDb().prepareStatement("Select user,pass from login where user=? and pass=?");
        
        pst.setString(1, username);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();                        
        if(rs.next())           
          connecté = true;
        else
            connecté = false;           
   }
   catch(Exception e){       
            connecté = false; 
   }      
        return connecté;
    }
}
