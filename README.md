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
* V3.1 Ajout d'un projet FRONT en LitElement qui consomme l'api GraphQL (sur les 2 projets back)
* V4.0 GraphQl avec interrogation BD optimisé (selon requête du front)
* V5.0 Sécuration des Query GraphQL ( cf https://quarkus.io/guides/security-authorization)

# Tags
## V1.0
* Version du projet intégrant les implementations quarkus/springboot équivalentes fonctionnellement. L'application est une api rest constituée d'une resource/controller et d'un service. Bref un HelloWorld !
* Le cicd associé lance le build d'image docker avec jib

## V2.0
* Projet Quarkus : 
   * Upgrade de Quarkus, passage à la version 2.5.1.Final
   * Ajout de GraphQl, implementation Smallrye
       * https://graphql.org/learn/queries/
       * https://www.redhat.com/fr/topics/api/what-is-graphql
       * https://quarkus.io/guides/smallrye-graphql
       * https://quarkus.io/blog/experimental_graphql/
       * https://piotrminkowski.com/2021/04/14/advanced-graphql-with-quarkus/
   * Ajout de D'une persistence H2 avec Panache
* Projet Spring :  
  * Upgrade de SpringBoot, passage en 2.6.1
  * Alimentation BD soit par
       * Fichier nommé 'data.sql'
          * https://docs.spring.io/spring-boot/docs/current/reference/html/howto.html#howto.data-initialization.using-basic-sql-scripts
       * CommandLineRunner (dans application)
  * Validation des requetes graphQL qui tournent sur quarkus et sur springboot
       * https://medium.com/@saurabh1226/getting-started-with-graphql-spqr-with-springboot-bb9d232053ec
       

# Version Spring Boot
* mvn clean spring-boot:run -pl springboot
* Url de la gui graphQL : http://localhost:8080/gui
* URL du schema: http://localhost:8080/graphql (uniquement par POST avec des parametre)


# Version Quarkus
* mvn clean quarkus:dev -pl quarkus
* URL du schema GraphQl : http://localhost:8080/graphql/schema.graphql
* URL de UI GraphQl : http://localhost:8080/q/graphql-ui/