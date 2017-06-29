<%-- 
    Document   : Login
    Created on : 28 Feb, 2015, 8:50:26 AM
    Author     : Lahaul Seth
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources\css\css.css">
        <title>Login Demo with JSP</title>
    </head>
    <body>

        <div class="container">
            <h1 class="white-text">ENI ASK - CONNEXION</h1>
            <div class="card card-container">

                <!-- <img class="profile-img-card" src="//lh3.googleusercontent.com/-6V8xOA6M7BA/AAAAAAAAAAI/AAAAAAAAAAA/rzlHcD0KYwo/photo.jpg?sz=120" alt="" /> -->
                <img id="profile-img" class="profile-img-card" src="//ssl.gstatic.com/accounts/ui/avatar_2x.png" />
                <p id="profile-name" class="profile-name-card"></p>
                <form  method="post" action="DoLogin" class="form-signin">
                    <span id="reauth-email" class="reauth-email"></span>
                    <input type="email" id="inputEmail"  name="username" class="form-control" placeholder="Adresse e-mail" required autofocus>
                    <input type="password" name="password" id="inputPassword" class="form-control" placeholder="Mot de passe" required>

                    <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Sign in</button>
                </form><!-- /form -->

            </div><!-- /card-container -->
        </div><!-- /container -->

    </body>
</html>


