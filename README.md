# 🧩 Primer programa con Camunda


Aplicación de ejemplo para el primer acercamiendo con camunda

API REST que expone endpoints: 

```plaintext

| Método HTTP | Endpoint                                     | Descripción                   |
|-------------|----------------------------------------------|-------------------------------|
|  POST       |http://localhost:8080/api/proceso/iniciar     | Muestra mensaje hola mundo    | 

```

## 🚀 Características

- Utiliza archivo bpmn sin la parte visual


## 🛠️ Tecnologías

- Java 17
- Spring Boot 3.4.4
- Spring Web
- Spring Data JPA
- H2



## ▶️ Cómo ejecutar la aplicación
### Prerrequisitos
- Java 17
- Maven 3.8+

### 🔧 Construcción

Abrir una terminal y realizar los siguiente pasos.
* crear carpeta (mkdir camunda-holamundo)
* cd camunda-holamundo
* git clone https://github.com/camunda-labs/camunda-holamundo.git



### Ejecución aplicacion local
```bash
mvn spring-boot:run
```
La aplicación se ejecutará en:

📍 http://localhost:8080/api/proceso/iniciar
```


##🌐 Pruebas Con Postman




##🗃️ Base de datos en memoria (H2)
Posee una configuracio con H2 ya que Camunda 7 requiere una 
fuente de datos (Datasource) para funcionar, incluso si no 
usas base de datos explícitamente. Y al no haber una definida, 
Spring Boot no puede crear el PlatformTransactionManager necesario 
para las transacciones.


##📘 Documentación 
   Como es una prueba simple aun no tiene documentacion 

**Swagger disponible en:**
Aun no implementado


## 👤 Autor
  Álvaro Vergara Cortés  
  alvaro.vergara.cl@gmail.com



