<%-- 
    Document   : Login

--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>ENI ASK - CHOIX DU TEST</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
          <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    </head>
    <body>

        <div class="header">
            <span><!--Nom & prénom utilisateur-->Marie Van Der Beek</span><br>
            <span><!--Profil utilisateur-->Candidat</span><br>
        </div>
        <div>
            <p>Choisissez votre test : </p>
            <form method="POST" action="ecranquestion.jsp">
                <!-- Choix type de test sous forme d'une liste items-->
                <table>
                    <tr>
                        <td>
                            <span><!-- Type de test -->Tests de logique </span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span><!-- Nom du test -->Tests psychotechniques - Niveau 1 </span>
                        </td>
                        <td>
                            <span><input type="submit" value="Commencer le test"></span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span><!-- Type de test -->Tests de positionnement </span>  
                        </td>  
                    </tr>
                    <tr>
                        <td>
                            <span><!-- Nom du test -->Java EE - Niveau débutant </span>
                        </td>
                        <td>
                            <span><input type="submit" value="Commencer le test"></span>
                        </td>
                    </tr>
                </table>
            </form>

        </div>
    </body>
</html>
