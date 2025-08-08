# API REST CRUD com Spring Boot e PostgreSQL

Projeto de API REST para gerenciamento de produtos, desenvolvido com Spring Boot e banco de dados PostgreSQL. Implementa operações CRUD (Create, Read, Update, Delete) utilizando boas práticas com DTOs, JPA Repository e versionamento do banco com Flyway.

---

## Tecnologias utilizadas

- Java 17+
- Spring Boot (Spring Web, Spring Data JPA)
- PostgreSQL
- Flyway (versionamento do banco)
- Maven ou Gradle (gerenciador de dependências)
- Postman ou Insomnia (testes das APIs)

---

## Instruções para configuração e execução

### 1. Configurar banco de dados PostgreSQL

- Instale e configure o PostgreSQL localmente ou utilize um banco remoto.
- Crie um banco de dados (exemplo: `product-api`).
- No arquivo `src/main/resources/application.properties`, configure a conexão com seu banco:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/product-api
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=validate
spring.flyway.enabled=true
spring.flyway.locations=classpath:db/migration´´´


Resumo do fluxo
Criar projeto e configurar dependências.
Definir entidades (model).
Criar DTOs para entrada e saída.
Criar interfaces repository para CRUD.
Criar controllers para expor a API.
Criar scripts SQL para migração com Flyway.
Testar e validar com Postman/Insomnia.
