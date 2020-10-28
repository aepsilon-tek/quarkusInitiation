# initiation-qwarkus project

Ce projet utilise Quarkus, the Supersonic Subatomic Java Framework.

Pour plus d'info sur Qwarkus: https://quarkus.io/ .

## Lancement de l'application en mode 'dev'

Vous pouvez lancer l'application en mode `dev` et bénéficier du hot reload :
```
./mvnw quarkus:dev
```

## Packaging et lancement  de l'application

L'application peut être packagée comme ceci : `./mvnw package`.
Cela gnénère un fichier `initiation-qwarkus-1.0-SNAPSHOT-runner.jar`dans le répertoire `/target`.
Ce n'est pas un _über-jar_ puisque les dépendances sont copiées dans le répertoire `target/lib`.

L'application est désormais executable comme ceci `java -jar target/initiation-qwarkus-1.0-SNAPSHOT-runner.jar`.

## Création d'un executable natif

La commande pour créer l'excutable natif est : `./mvnw package -Pnative`.

Ou si vous n'avez pas GraalVM installé, vous pouvez exécuter  le build de l'executable natif dans un container : `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

Vous pouvez désormais executé l'application: `./target/initiation-qwarkus-1.0-SNAPSHOT-runner`

Pour plus d'info sur le build d'executable natif :  https://quarkus.io/guides/building-native-image.

# Roadmap
* V2.0 Ajout graphQl (dans quarkus & springboot)
* V3.0 Ajout d'un accès bd (panache pour quarkus / springData pour springBoot)
* V4.0 GraphQl avec interrogation BD optimisé (selon requête du front)

# Tags
## V1.0
* Version du projet intégrant les implementations quarkus/springboot équivalentes fonctionnellement. L'application est une api rest constituée d'une resource/controller et d'un service. Bref un HelloWorld !
* Le cicd associé lance le build d'image docker avec jib