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
             <h1> Liste de tests </h1>

             <span><input type="button" value="Créer une nouveau test"></span>

            <table>
                <thead>
                    <tr>
                        <th>
                            <span>Id</span>
                        </th> 
                        <th>
                            <span>Date de création</span>
                        </th> 
                        <th>
                            <span>Nom du test</span> 
                        </th>
                        <th>
                            <span>Seuil minimum de bonnes réponses (en %) : niveau "En cours d'acquisition"</span>
                        </th>
                        <th>
                            <span>Seuil minimum de bonnes réponses (en %) : niveau  "Acquis"</span>
                        </th>
                        <th>
                            <span>Nombre de questions</span>
                        </th>
                        <th>
                            <span>Temps de passage</span>
                        </th>
                        <th>
                            <span>Modifier</span>
                        </th>
                        <th>
                            <span>Supprimer</span>
                        </th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            <span><!--Champ Id--></span>
                        </td>
                        <td>
                            <span><!--Champ Date de création--></span>
                        </td>
                        <td>
                            <span><!--Champ nom du test--></span>
                        </td>
                        <td>
                            <span><!--Champ seuil min ECA--></span>
                        </td>
                        <td>
                            <span><!--Champ seuil min Acquis--></span>
                        </td>
                        <td>
                            <span><!--Nombre de questions--></span>
                        </td>
                        <td>
                            <span><!--Temps de passage--></span>
                        </td>
                        <td>
                            <span><!--Input Modifier--></span>
                        </td>
                        <td>
                            <span><!--Input Supprimer--></span>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>
