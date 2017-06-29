<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
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
        <div>
            <h1>Créer/modifier une question (1/2)</h1>
            <form method="POST" action="">
                <table>
                    <tr>
                        <td>
                            ThÃ¨me/Catégorie :  
                        </td>
                        <td>
                            <select name="select">
                                <option>Java EE</option>
                                <option>C++</option>
                                <option>PHP</option>
                                <option>Perl</option>
                            </select> 
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Enoncé :  
                        </td>
                        <td>
                            <input type="text" name="qsenonce">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Image (facultative) : 
                        </td>
                        <td>
                            <input type="file" name="file">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Type de réponses :  
                        </td>
                        <td>
                            <select name="select">
                                <option>Boutons radio</option>
                                <option>Cases à cocher</option>
                                <option>Listes déroulantes à ordonner</option>
                                <option>Tableau de boutons radio</option>
                            </select> 
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span>Nombre de réponses :</span>  
                        </td>
                        <td>
                            <select name="select">
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                                <option>6</option>
                                <option>7</option>
                                <option>8</option>
                                <option>9</option>
                                <option>10</option>
                            </select>
                        </td>
                    </tr>
                </table>
                <input type="submit" value="Créer la question"><input type="button" value="Annuler">
            </form>
        </div>
    </body>
</html>
