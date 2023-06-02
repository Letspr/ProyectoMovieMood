# ProyectoMovieMood
Proyecto de portal de películas SpringBoot - JPA - Thymeleaf con base de datos MySql y servicio consumiendo la API de IMDB

MovieMoodMySqlUltima necesita configurar previamente una conexión en MySql para mooviemood, con un usuario MM y password mm. El esquema de la BBDD se llamará mooviemood.

Éste es el application.properties del proyecto para configurar el servidor y la BBDD: 
  <tab>server.port:8083 
  <tab>spring.jpa.hibernate.ddl-auto=update 
  <tab>spring.datasource.url=jdbc:mysql://127.0.0.1:3306/moviemood 
  <tab>spring.datasource.username=MM 
  <tab>spring.datasource.password=mm 
  <tab>spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver 
  <tab>spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQLDialect

Hay dos scripts para la carga de datos iniciales en la siguiente ruta: /movieMoodMySqlUltima/src/main/resources/bbdd

Una vez lanzada la aplicación por primera vez las Entities crean automáticamente las tablas, pero los datos iniciales no se van a cargar ya que no está puesta la propiedad necesaria en el application.properties. Por ello una vez se hayan creado las tablas, hay que ejecutar en Workbench los archivos: generosdata.sql --> para tener los géneros de las películas peliculasdata.sql --> si se desean tener datos iniciales de películas en MovieMood. Si no se cargan, se puede llenar la BBDD con el servicio de búsqueda en IMDB.

