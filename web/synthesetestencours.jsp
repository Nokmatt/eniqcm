<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Synthèse test en cours</title>
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
        <div class="content">
            <h1>Synthèse test en cours</h1>
            <span><!--Nom & pr�nom candidat-->Marie Van Der Beek</span><br>
            <span><!--Type de test en cours-->Test de logique</span><br>
            <h2><!--Nom du test en cours-->Tests psychotechniques - Niveau 1</h2><br>
            <span>Temps restant : <!--temps restant--> 35:02:47</span><br>
            <br>
            <!--Statuts des questions du test en cours-->
            <form method="POST" action="">
                <table>
                    <tr>
                        <td>
                            <span><!--Section 1 du test-->Section Suites logiques</span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span><!--Statut question-->Valid�e</span>
                        </td>
                        <td>
                            <span><!--N° + �nonc� question --> 1. Remplissez ce carr� magique avec le bon num�ro :</span>
                        </td>
                        <td>
                            <span></span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span><!--Statut question-->Marqu�e</span>
                        </td>
                        <td>
                            <span><!--N° + �nonc� question --> 2. Terminez cette suite avec la bonne lettre :</span>
                        </td>
                        <td>
                            <span><input type="button" value="Modifier"></span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span><!--Statut question-->Marqu�e</span>
                        </td>
                        <td>
                            <span><!--N° + �nonc� question --> 3. S�lectionnez la figure qui complète cette suite :</span>
                        </td>
                        <td>
                            <span><input type="button" value="Modifier"></span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span><!--Statut question-->Valid�e</span>
                        </td>
                        <td>
                            <span><!--N° + �nonc� question --> 4. Replacez cette figure dans la bonne position pour compl�ter cette suite :</span>
                        </td>
                        <td>
                            <span></span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span><!--Statut question-->Non r�pondue</span>
                        </td>
                        <td>
                            <span><!--N° + �nonc� question --> 5. Trouvez la dernière figure de cette suite : </span>
                        </td>
                        <td>
                            <span><input type="button" value="Modifier"></span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span><!--Section 2 du test-->Section Enigmes litt�raires</span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span><!--Statut question-->Non r�pondue</span>
                        </td>
                        <td>
                            <span><!--N° + �nonc� question --> 1. Retrouvez le mot � partir de cet anagramme : </span>
                        </td>
                        <td>
                            <span><input type="button" value="Modifier"></span>
                        </td>
                    </tr>
                </table>
            </form>
            <br>
            <form method="POST" action="">
                <input type="submit" value="Mettre fin au test" onclick="etesvoussur()">
            </form>
        </div>
    </body>
</html>
