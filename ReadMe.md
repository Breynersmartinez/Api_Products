Tecnologías Utilizadas

Java 17+

Spring Boot 3+

Firebase Firestore (Base de datos NoSQL)

Maven (Gestor de dependencias)

Swagger (Documentación de la API)

Características

Operaciones CRUD para la gestión de productos.

Conexión con Firebase Firestore.

Manejo de excepciones y validaciones.

Configuración de seguridad básica.

Instalación y Configuración

Clonar el repositorio:

git clone https://github.com/tu_usuario/tu_repositorio.git
cd tu_repositorio

Configurar Firebase:

Descarga el archivo de credenciales dbproyecttest.json desde Firebase Console.

Coloca el archivo en src/main/resources/.

Configurar propiedades en application.properties:

spring.application.name=api-productos
firebase.database.url=https://tu-proyecto.firebaseio.com

Compilar y ejecutar la aplicación:

mvn spring-boot:run

Endpoints

Método

URL

Descripción

GET

/productos

Obtener todos los productos

GET

/productos/{id}

Obtener un producto por ID

POST

/productos

Crear un nuevo producto

PUT

/productos/{id}

Actualizar un producto

DELETE

/productos/{id}

Eliminar un producto

Documentación de la API

La documentación generada por Swagger está disponible en:

http://localhost:8080/swagger-ui.html

Contribuciones

Las contribuciones son bienvenidas. Si deseas mejorar este proyecto, por favor abre un issue o un pull request.


____________________________________________________________________________
# 1. Configurar la URL base
   Si estás ejecutando tu aplicación en localhost, la URL base será:

bash
Copiar
Editar
http://localhost:8080/api/products
Si la ejecutas en otro servidor, cambia localhost:8080 por la IP o dominio correspondiente.
#

# 2. Pruebas en Postman 
   A) Crear un Producto (POST)
   Método: POST
   URL: http://localhost:8080/api/products
   Headers:
   Content-Type: application/json
   Body (JSON, formato raw):
   json
   Copiar
   Editar


   {
   "name": "Producto1",
   "description": "Descripción del producto 1"
   }

   Respuesta esperada: Un timestamp de la actualización en Firebase.
   

# B) Obtener un Producto por Nombre (GET) 
   Método: GET
   URL: http://localhost:8080/api/products/Producto1
   Respuesta esperada (si existe en Firebase):
   json
   Copiar
   Editar
   {
   "name": "Producto1",
   "description": "Descripción del producto 1"
   }

   # C) Obtener Todos los Productos (GET)
   Método: GET
   URL: http://localhost:8080/api/products
   Respuesta esperada (ejemplo):
   json
   Copiar
   Editar

   [
   {
   "name": "Producto1",
   "description": "Descripción del producto 1"
   },
   {
   "name": "Producto2",
   "description": "Descripción del producto 2"
   }
   ]

   # D) Actualizar un Producto (PUT)
   Método: PUT
   URL: http://localhost:8080/api/products
   Headers:
   Content-Type: application/json
   Body (JSON, formato raw):
   json
   Copiar
   Editar


   {
   "name": "Producto1",
   "description": "Nueva descripción del producto 1"
   }

   Respuesta esperada: Un timestamp de la actualización.
   
# E) Eliminar un Producto (DELETE)
   Método: DELETE
   URL: http://localhost:8080/api/products/Producto1

   Respuesta esperada:
   csharp
   Copiar
   Editar

   Document with Product ID Producto1 has been deleted successfully
