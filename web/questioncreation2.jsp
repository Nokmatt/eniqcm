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
            <h1>Créer/modifier une question (2/2)</h1><br>
            <span>Question "(énoncé)"</span><br>
            <span>Type de réponses :"(type de réponses)"</span><br>
            <form method="POST" action="">
                <table>
                    <tr>
                        <td>
                            <span>Réponse 1</span> 
                        </td> 
                        <td></td>
                    </tr>
                    <tr>
                        <td>
                            <span>Enoncé :</span>   
                        </td>
                        <td>
                            <input type="text" name="qsenonce">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="file" name="file">
                        </td>                        
                    </tr>
                    <tr>
                        <td>
                            <span>Bonne réponse ?</span><input type="checkbox" name="qsrepok" value="Bonne réponse ?">
                        </td> 
                    </tr>
                   <tr>
                        <td>
                            <span>Réponse 2</span> 
                        </td> 
                        <td></td>
                    </tr>
                    <tr>
                        <td>
                            <span>Enoncé :</span>   
                        </td>
                        <td>
                            <input type="text" name="qsenonce">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="file" name="file">
                        </td>                        
                    </tr>
                    <tr>
                        <td>
                            <span>Bonne réponse ?</span><input type="checkbox" name="qsrepok" value="Bonne réponse ?">
                        </td> 
                    </tr>
                    <tr>
                        <td>
                            <span>Réponse 3</span> 
                        </td> 
                        <td></td>
                    </tr>
                    <tr>
                        <td>
                            <span>Enoncé :</span>   
                        </td>
                        <td>
                            <input type="text" name="qsenonce">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="file" name="file">
                        </td>                        
                    </tr>
                    <tr>
                        <td>
                            <span>Bonne réponse ?</span><input type="checkbox" name="qsrepok" value="Bonne réponse ?">
                        </td> 
                    </tr>
                </table>
                <input type="submit" value="Créer les réponses"><input type="button" value="Annuler">
            </form>
        </div>
    </body>
</html>
