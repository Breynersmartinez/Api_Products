# 📌 Descripción

Este proyecto es una API REST desarrollada en Spring Boot que permite la gestión de productos mediante operaciones CRUD (Crear, Leer, Actualizar y Eliminar) con una base de datos NoSQL en Firebase Firestore.

## 🛠️ Tecnologías Utilizadas

- 🚀 **Java 23**
- 🌱 **Spring Boot 3+**
- 🔥 **Firebase Firestore** (Base de datos NoSQL)
- 📦 **Maven** (Gestor de dependencias)
- 📜 **Swagger** (Documentación de la API)

## ✨ Características

- ✅ Operaciones CRUD para la gestión de productos.
- ✅ Conexión con Firebase Firestore.
- ✅ Manejo de excepciones y validaciones.
- ✅ Configuración de seguridad básica.

## 📥 Instalación y Configuración

### 🔹 Clonar el repositorio:
```bash
git clone https://github.com/tu_usuario/tu_repositorio.git
cd tu_repositorio
```

Configurar Firebase:
Descarga el archivo de credenciales dbproyecttest.json desde Firebase Console.

Coloca el archivo en src/main/resources/.

🔹 Configurar propiedades en application.properties:
```bash
server.port=8080
```

🔹 Compilar y ejecutar la aplicación:
```bash
mvn spring-boot:run
```


📡 Endpoints
Método	URL	Descripción
```bash
GET	/productos	Obtener todos los productos
GET	/productos/{id}	Obtener un producto por ID
POST	/productos	Crear un nuevo producto
PUT	/productos/{id}	Actualizar un producto
DELETE	/productos/{id}	Eliminar un producto
```



🤝 Contribuciones
Las contribuciones son bienvenidas. Si deseas mejorar este proyecto, por favor abre un issue o un pull request.

📝 Licencia
📜 Este proyecto está bajo la licencia MIT.




____________________________________________________________________________
# 1. Configurar la URL base
   Si estás ejecutando tu aplicación en localhost, la URL base será:


Copiar
Editar

```bash
http://localhost:8080/api/products
```
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

```bash
 {
    "name": " Blusa oversize mujer diseño ",
    "description": " Prenda tipo oversize",
       "price": 2500.00,
    "color": "black",
    "size":  "l "
}

```
   Respuesta esperada: Un timestamp de la actualización en Firebase.
   

# B) Obtener un Producto por Nombre (GET) 
   Método: GET
   URL: http://localhost:8080/api/products/Producto1
   Respuesta esperada (si existe en Firebase):
   json
   Copiar
   Editar

   ```bash
  {
    "name": " Blusa oversize mujer diseño ",
    "description": " Prenda tipo oversize",
       "price": 2500.00,
    "color": "black",
    "size":  "l "
}

```

   # C) Obtener Todos los Productos (GET)
   Método: GET
   URL: http://localhost:8080/api/products
   Respuesta esperada (ejemplo):
   json
   Copiar
   Editar

```bash
[
    {
        "name": " Blusa oversize mujer ",
        "description": " Prenda tipo oversize",
        "price": 2500.0,
        "color": "black",
        "size": "l "
    },
    {
        "name": "Producto1",
        "description": "Descripción del producto 1",
        "price": null,
        "color": null,
        "size": null
    },
    {
        "name": "Producto2",
        "description": "Descripción del producto 1",
        "price": null,
        "color": null,
        "size": null
    }
]
```

   # D) Actualizar un Producto (PUT)
   Método: PUT
   URL: http://localhost:8080/api/products
   Headers:
   Content-Type: application/json
   Body (JSON, formato raw):
   json
   Copiar
   Editar

```bash
 {
    "name": " Blusa oversize mujer diseño ",
    "description": " Prenda tipo oversize",
       "price": 2500.00,
    "color": "black",
    "size":  "l "
}

```

   Respuesta esperada: Un timestamp de la actualización.
   
# E) Eliminar un Producto (DELETE)
   Método: DELETE
   URL:
   ```bash
   http://localhost:8080/api/products/Producto1
```

   Respuesta esperada:
   csharp
   Copiar
   Editar


  ## NOTA:
# Si se corren varias apis en un mismo localhost se debn usar diferentes puertos

   Document with Product ID Producto1 has been deleted successfully
