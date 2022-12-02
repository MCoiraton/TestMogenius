# Documentation rapide de déploiement Mogenius

## Relier un service Mogenius a un repository Github
Pour relier un repository Github a Mogenius et faire en sorte que notre outil se mette à jour automatiquement lorsque l'on push en Production, il faut tout d'abord créer un nouveau service.

Dans ce service, vous pouvez soit indiquer votre dépôt publique, ou lié votre compte Mognius a votre compte Github, et choisir où activer Mogenius. Si ce dépôt a plusieurs branches, précisez aussi la branche a utiliser.

Une fois le service créé, nous allons pouvoir faire notre premier push sur notre dépôt. Dans l'exemple, une page HTML "index.html" a été créé, ainsi qu'un Dockerfile pour pouvoir la lancer en tant qu'image. Dès que cette page est push, ou après toute modification, Mogenius détectera ces changements pour pull le dépôt et ainsi recréer l'image de notre application.

Lien pour accéder à la page en question : http://tcp-mo6.mogenius.io:11625/

## Aller plus loins : communication avec une Base de Donnée

La suite de cette documentation se base sur une autre image pour le Front, avec un autre DockerFile, trouvable dans la branche "dev" du dépôt. Cependant, je n'ai pas pu aller au bout de cette partie.

Le but est maintenant d'ajouter un bouton "like" sur notre page, et d'afficher le nombre de like total. La base de données nous servira à récupérer ce chiffre.
Pour cette partie, nous allons créer un nouveau service sur Mogenius, en utilisant un template pré fait de database Postgresql. Le template nous propose déjà des variables d'environnement qui nous serons utiles : le nom de l'utilisateur de la DB ainsi que son mdp, nous en ajouterons d'autres plus tard. Pour le mdp, nous pouvons créer un new "secret" qui nous permettra d'avoir une clef secrète stockée par Mogenius.
Une fois le service créé, nous allons ajouter les variables d'environnements HOST et le nom de la DB.

Ensuite, dans le fichier "application.properties" se trouvant dans "/src/main/ressource", nous allons mettre les paramètres de notre base de données. Au lieu de mettre directement ces paramètres, nous allons les remplacer par nos variables d'environnement. Pour ce faire, il suffit d'écrire ${NOM_VARIABLE}.

Ex:
spring.datasource.password=${DB_PASSWORD}
