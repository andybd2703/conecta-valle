# Conecta Valle

Plataforma web de clasificados y comercio local orientada
a conectar compradores, vendedores y emprendimientos
del Valle del Cauca, Colombia.

## Estado del proyecto

En desarrollo — Sprint 0.

## Tecnologías

### Frontend

- Angular 21
- TypeScript
- SCSS
- Signals
- Standalone Components
- SSR
- RxJS

### Backend

- Java 21
- Spring Boot 4.2.0
- Spring Security
- Spring Data JPA
- Hibernate
- Maven
- Flyway

### Infraestructura

- PostgreSQL 17
- Docker Compose
- Git y GitHub

## Funcionalidades implementadas

- Arquitectura modular.
- Migraciones versionadas de base de datos.
- API REST de categorías.
- Configuración inicial de seguridad y CORS.
- Integración entre frontend y backend.
- Manejo de estados de carga y errores.

## Servicios locales

| Servicio    | Puerto |
| ----------- | ------ |
| Angular     | 4200   |
| Spring Boot | 8081   |
| PostgreSQL  | 5435   |

## Instalación

1. Copiar .env.example como .env y configurar las credenciales.
2. Ejecutar docker compose up -d.
3. Ejecutar bash scripts/start-backend.sh.
4. En frontend, ejecutar npm ci y npm start.

## API REST

GET /api/v1/categories

GET /actuator/health

## Próximas funcionalidades

- Registro y autenticación de usuarios.
- Autorización mediante roles.
- Publicación y gestión de anuncios.
- Búsquedas y filtros.
- Favoritos.
- Panel administrativo.
- Automatizaciones y notificaciones.

## Autor

Yeison Andrés Bedoya Díaz

Desarrollador Full Stack

GitHub: https://github.com/andybd2703
