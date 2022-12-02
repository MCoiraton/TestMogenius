# Documentation rapide de déploiement Mogenius

## Relier un service Mogenius a un repository Github
Pour relier un repository Github a Mogenius et faire en sorte que notre outil se mette à jour automatiquement lorsque l'on push en Production, il faut tout d'abord créer un nouveau service.

Dans ce service, vous pouvez soit indiquer votre dépôt publique, ou lié votre compte Mognius a votre compte Github, et choisir où activer Mogenius. Si ce dépôt a plusieurs branches, précisez aussi la branche a utiliser.

Une fois le service créé, nous allons pouvoir faire notre premier push sur notre dépôt. Dans l'exemple, une page HTML "index.html" a été créé, ainsi qu'un Dockerfile pour pouvoir la lancer en tant qu'image. Dès que cette page est push, ou après toute modification, Mogenius détectera ces changements pour pull le dépôt et ainsi recréer l'image de notre application.

Lien pour accéder à la page en question : http://tcp-mo6.mogenius.io:11625/

## Aller plus loins : communication avec une Base de Donnée
