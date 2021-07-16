Proyecto DEMO para Digital Harvor
Requisitos
    - Angular 12
    - NPM 6.14
    - Spring boot (2.5.2)
    - Mysql 8
    - Java 11
    - Maven 3.6 (o superior)

1. En la carpeta base del proyecto se encuentra el script de la base de datos, que contiene el DDL de los objetos y DML de los datos.
2. El puerto de escucha para la base de datos debe ser 52000
3. El backend se deshabilito CORS para que acepte las peticiones del frontend

GIT del proyecto: https://github.com/oscorp54/dh_medic.git

BACKEND
    Para ejecutar el proyecto Back-End, ir hasta la carpeta base y desde una consola ejecutar el siguiente comando:
        ./mvnw spring-boot:run
FRONTEND
    Para ejecutar el proyecto Fron-End, ir hasta la carpeta base y desde una consola ejecutar el siguiente comando:
        .ng serve

El proyecto cumple con las siguientes tareas:
    - Lista de medicos con paginado
    - Lista de Pacientes con paginado
    - Lista de consultas con paginado
    - Adicion de nueva consulta