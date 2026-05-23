# Petshop

API de gerenciamento de petshop construída com **Quarkus**, seguindo os princípios de **Clean Architecture**.

## Stack

- **Java 25** + **Quarkus 3.35.4**
- **PostgreSQL** — banco de dados relacional
- **Liquibase** — controle de migrações de banco
- **Hibernate ORM** — mapeamento objeto-relacional
- **REST** — interface HTTP (MVP)
- **gRPC** — comunicação entre serviços (em breve)
- **GraphQL** — API de consultas flexíveis (em breve)

## Arquitetura

Clean Architecture purista — dependências sempre apontando para dentro:

```
infrastructure → application → domain
```

```
src/main/java/org/study/petshop
├── domain/              # Entidades e contratos (zero dependência de framework)
│   ├── entity/
│   └── port/
│       ├── in/          # Contratos dos use cases
│       └── out/         # Contratos de repositório
├── application/         # Implementação dos use cases
│   └── usecase/
└── infrastructure/      # Detalhes técnicos (banco, HTTP, gRPC...)
    ├── adapter/
    │   └── rest/
    └── persistence/
```

## Pré-requisitos

- Java 25+
- Maven 3.9+
- PostgreSQL rodando na porta `5432`

### Subindo o banco com Docker

```bash
docker run --name petshop-db \
  -e POSTGRES_USER=petshop \
  -e POSTGRES_PASSWORD=petshop \
  -e POSTGRES_DB=petshop \
  -p 5432:5432 \
  -d postgres:16
```

## Rodando em dev

```bash
./mvnw quarkus:dev
```

O Liquibase roda as migrações automaticamente ao subir.
Dev UI disponível em: http://localhost:8080/q/dev/

## Migrações de banco

As migrações ficam em `src/main/resources/db/changelog/migrations/` no formato SQL.
O arquivo master `db.changelog-master.sql` indexa todas as migrações em ordem.

Para adicionar uma nova migração:
1. Cria o arquivo `NNN-descricao.sql` em `migrations/`
2. Adiciona o include no `db.changelog-master.sql`

## Build

```bash
# JAR padrão
./mvnw package

# Über-JAR
./mvnw package -Dquarkus.package.jar.type=uber-jar

# Native (requer GraalVM)
./mvnw package -Dnative
```
