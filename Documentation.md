# Documentation rapide de déploiement Mogenius

## relier un service Mogenius a un repository Github
Pour relier un repository Github a Mogenius et faire en sorte que notre outils ce mette a jour automatiquement lorsque l'on push en Production, il faut tout d'abord créer un nouveau service.
Dans ce service, vous pouvez soit indiquer votre dépot publique, ou lié votre compte Mognius a votre compte Github, et choisir où activer Mogenius. Si ce dépot a plusieurs branches, précisez aussi la branche a utilser.

Une fois le service créer, nous allons pouvoir faire notre premier push sur notre dépot. Dans l'exemple, une page HTML "index.html" a été créé, ainsi qu'un Dockerfile pour pouvoir la lancer en tant qu'image.
