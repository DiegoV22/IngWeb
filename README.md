
# 🏆 Sistema de Gestión de Torneos y Usuarios - Aplicación Web con Spring Boot

Este proyecto es una aplicación web desarrollada en Java con Spring Boot. Permite la **gestión de torneos deportivos** y de **usuarios autenticados**, implementando funcionalidades CRUD y un sistema de login seguro con Spring Security y BCrypt. La aplicación sigue el patrón de diseño MVC, utiliza Thymeleaf para renderizar vistas HTML y Bootstrap 5 para lograr una interfaz moderna y responsiva.

## 🚀 Motivación
Este proyecto fue desarrollado como parte del aprendizaje en desarrollo web con Spring Boot, aplicando buenas prácticas de arquitectura, seguridad y experiencia de usuario.

---

## 📖 Tabla de Contenidos

- [Características](#características)
- [Tecnologías](#tecnologías)
- [Instalación y Ejecución](#instalación-y-ejecución)
- [Uso del Proyecto](#uso-del-proyecto)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Autor](#autor)
- [Futuras Mejoras](#futuras-mejoras)

---

## ✅ Características

### Torneos
- ✅ Listar torneos registrados
- ✅ Crear nuevos torneos
- ✅ Editar torneos existentes
- ✅ Eliminar torneos

### Usuarios
- ✅ Registrar nuevos usuarios con contraseña segura (mín. 8 caracteres, mayúscula, minúscula, número y símbolo)
- ✅ Validación personalizada de contraseñas
- ✅ Encriptación de contraseñas con BCrypt
- ✅ Listar, editar y eliminar usuarios registrados

### Autenticación
- ✅ Sistema de login con Spring Security
- ✅ Protege rutas privadas como `/usuarios` o `/torneos`
- ✅ Página personalizada de login con validación de credenciales

---

## 🧰 Tecnologías

- Java 17
- Spring Boot 3.4.4
- Spring Data JPA
- Spring Security
- Thymeleaf
- Bootstrap 5
- H2 Database (soporte preparado para SQL Server)
- BCrypt

---

## 🛠️ Instalación y Ejecución

1. Clona el repositorio:

```bash
git clone https://github.com/DiegoV22/IngWeb.git
Abre el proyecto en Visual Studio Code o tu IDE favorito.

Asegúrate de tener instalado:

Java 17

Maven

Ejecuta el proyecto:

bash
Copiar
Editar
./mvnw spring-boot:run
Abre en el navegador:

bash
Copiar
Editar
http://localhost:8080/login
📌 Uso del Proyecto
Módulo de Torneos
Cada torneo incluye:

Nombre del torneo

Categoría

Ubicación

Costo

Fecha de inicio y final

Vistas:

lista.html: muestra todos los torneos

formulario.html: para registrar o editar

Módulo de Usuarios
Cada usuario incluye:

Nombre y Apellido

Email (utilizado como username)

Contraseña encriptada (usando BCrypt)

Fecha de registro

Vistas:

lista.html: muestra todos los usuarios registrados

formulario.html: para registrar o editar usuarios

Login
Ruta protegida /usuarios y /torneos

Login en /login

Credenciales incorrectas muestran un mensaje personalizado

🗂 Estructura del Proyecto
css
Copiar
Editar
src/main/java/
└── com.diego.curso.springboot.webapp.springboot_web
    ├── controllers/
    │   ├── TorneoController.java
    │   ├── UsuarioController.java
    │   └── LoginController.java
    ├── models/
    │   ├── Torneo.java
    │   └── Usuario.java
    ├── repositories/
    │   ├── TorneoRepository.java
    │   └── UsuarioRepository.java
    ├── services/
    │   ├── TorneoService.java / Impl
    │   ├── UsuarioService.java / Impl
    │   └── UsuarioDetailsService.java (Spring Security)
    └── config/
        └── SecurityConfig.java (configuración de seguridad)

src/main/resources/
├── templates/
│   ├── torneos/
│   │   ├── lista.html
│   │   └── formulario.html
│   └── usuarios/
│       ├── lista.html
│       ├── formulario.html
│       └── login.html
└── application.properties
👨‍💻 Autor
Diego V.
Estudiante de Ingeniería de Software
GitHub: @DiegoV22

🌱 Futuras Mejoras
 Conexión con SQL Server (implementado ✅)

 Validaciones personalizadas de formulario (implementado ✅)

 Autenticación segura con BCrypt y Spring Security (implementado ✅)

 Registro con confirmación por email

 Sistema de roles (admin/usuario)

 Exportación de datos (PDF, Excel)

 Deploy en Render o Railway

¡Gracias por revisar este proyecto! Si te gustó o tienes sugerencias, no dudes en abrir un issue o hacer un PR 🙌

