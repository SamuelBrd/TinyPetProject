# Projet Web and Cloud

**Projet réalisé par : Paul-Adrien LECOQ, PERRIN Maxime, BRIAND Samuel**

**Ce projet universitaire avait pour but de nous initier à la plateforme cloud de Google. À travers ce projet, nous avons créé un site référençant des pétitions. Il devait notamment être possible d'ajouter des pétitions et d'en signer en se connectant avec un compte Google**

**Ce fichier Readme fait état des lieux des fonctionnalités disponibles ou non sur l'application, ainsi que les "Kinds" Google datastore utilisés sur notre application**

#
# Lien de l'application : 

Notre application est disponible à l'adresse suivante : https://stone-notch-350213.oa.r.appspot.com/ 
#

# Screenshot des "Kinds" Google datastore utilisés : 

Pour notre application, nous avons créé 3 entités : les pétitions, les utilisateurs, et les signatures des utilisateurs sur des pétitions
![image](https://user-images.githubusercontent.com/80095833/170881484-5f7da7c0-8b5c-4710-9f5a-a99b0d8b3f96.png)

Une petition créée comporte donc ces attributs : 
![image](https://user-images.githubusercontent.com/80095833/170881582-6925216d-08a5-4904-a5d9-9fa8cb222f9b.png)

Un utilisateur est donc référencé avec ces informations : 

![image](https://user-images.githubusercontent.com/80095833/170881623-2f63b7c2-e7ad-4182-805c-5c820fcd9dbe.png)

Et enfin, une signature comporte les informations suivantes : 
![image](https://user-images.githubusercontent.com/80095833/170881684-94955588-2f2b-40cd-afe7-406aa9cd60db.png)
#

# Fonctionnement du site : 
Lors du lancement de l'application, l'écran d'accueil est le suivant :
![image](https://user-images.githubusercontent.com/80095833/170881859-fcdd1ba8-84c8-4981-b8ad-006a897ecf07.png)

Il est donc possible à partir de cette page, de générer des pétitions de manière aléatoire (des users et des signatures sont aussi générés). Il est donc possible d'accéder au site de pétitions en cliquant sur le bouton "TINY PET"

![image](https://user-images.githubusercontent.com/80095833/170882028-39e2cf89-2468-408f-bf47-a24277d34035.png)

# A partir de cettte page il est donc possible :

- de revenir à la page d'accueil 
- de voir les pétitions (page initial lors de l'ouverture du site)
- de voir les pétitions les plus signées
- pour une pétition, il est possible de cliquer sur cette dernière pour voir les détails (screenshot ci-dessous)
- en cliquant sur "Voir la pétition" pour voir les détails, il est possible de signer la pétition (mais il n'est pas possible de la signer plusieurs fois). Il faut aussi être connecté à un compte Google pour signer une pétition
- de créer une pétition, mais pour cela, il faut se connecter avec un compte Google via le bouton "Sign in"
- de voir ses pétitions créés, ainsi que les supprimer, les modifier ou les voir

Détails d'une pétition : 

![image](https://user-images.githubusercontent.com/80095833/170882327-1605f5c9-6a35-46ed-abf3-2db55c434b2e.png)

# Cependant, il n'est pas possible de : 

- voir l'ensemble de nos pétitions signées
- trouver des pétitions par une fonction de recherche
