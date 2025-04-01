#  Sistema de Gestión de Torneos - CRUD Web con Spring Boot

Este proyecto es una aplicación web desarrollada en Java con **Spring Boot**. Implementa un sistema CRUD (Crear, Leer, Actualizar, Eliminar) para gestionar torneos deportivos. El sistema sigue el patrón de diseño **MVC** y utiliza **Thymeleaf** para renderizar vistas HTML y **Bootstrap 5** para lograr una interfaz moderna, limpia y responsiva.

---

##  Motivación

Este proyecto fue desarrollado como parte del aprendizaje y aplicación práctica de desarrollo web con Spring Boot. Busca aplicar buenas prácticas en arquitectura de software y experiencia de usuario.

---

## 📖 Tabla de Contenidos

1. [Características](#características)
2. [Tecnologías](#tecnologías)
3. [Instalación y Ejecución](#instalación-y-ejecución)
4. [Uso del Proyecto](#uso-del-proyecto)
5. [Estructura del Proyecto](#estructura-del-proyecto)
6. [Autor](#autor)
7. [Futuras Mejoras](#futuras-mejoras)
8. [Licencia](#licencia)

---

##  Características

-  Listar torneos registrados
-  Crear nuevos torneos
-  Editar torneos existentes
-  Eliminar torneos
-  Vistas con diseño responsivo y profesional
-  Arquitectura clara basada en MVC
-  Persistencia con base de datos H2 en memoria (preparado para SQL Server)

---

##  Tecnologías

- Java 17
- Spring Boot 3.4.4
- Spring Data JPA
- Thymeleaf
- Bootstrap 5
- H2 Database

---

##  Instalación y Ejecución

1. Clona este repositorio:
   ```bash
   git clone https://github.com/DiegoV22/IngWeb.git
   ```

2. Abre el proyecto en Visual Studio Code (o tu IDE preferido).

3. Asegúrate de tener instalado:
   - Java 17
   - Maven

4. Ejecuta el proyecto:
   ```bash
   ./mvnw spring-boot:run
   ```

5. Abre el navegador en:
   ```
   http://localhost:8080/torneos
   ```

---

##  Uso del Proyecto

El sistema permite administrar una lista de torneos deportivos con los siguientes campos:

- Nombre del torneo
- Categoría
- Ubicación
- Costo
- Fecha de inicio
- Fecha final

### Vistas:
- `lista.html`: muestra todos los torneos registrados.
- `formulario.html`: permite registrar o editar un torneo.

---

##  Estructura del Proyecto

```
src/main/java/
└── com.diego.curso.springboot.webapp.springboot_web
    ├── controllers/        # Controladores (TorneoController.java)
    ├── models/             # Entidades (Torneo.java)
    ├── repositories/       # Interfaces de acceso a datos (TorneoRepository.java)
    ├── services/           # Lógica de negocio (TorneoService.java, TorneoServiceImpl.java)
    └── SpringbootWebApplication.java

src/main/resources/
├── templates/torneos/      # Vistas Thymeleaf (lista.html, formulario.html)
└── application.properties  # Configuración
```

---

##  Autor

**Diego V.**  
Estudiante de Ingeniería de Software  
GitHub: [@DiegoV22](https://github.com/DiegoV22)

---

##  Futuras Mejoras

- Conexión a base de datos SQL Server
- Validaciones de formularios
- Autenticación de usuarios
- Exportación de datos (PDF, Excel)
- Pruebas automatizadas
- Deploy en servidor cloud (Render, Heroku, etc.)

---


¡Gracias por revisar este proyecto! Si tienes sugerencias o quieres contribuir, no dudes en abrir un issue o pull request 🙌
