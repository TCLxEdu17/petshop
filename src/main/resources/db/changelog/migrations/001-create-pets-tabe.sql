--liquibase formatted sql
--changeset edu:001
CREATE TABLE pets (
                      id          UUID        NOT NULL,
                      name        VARCHAR(100) NOT NULL,
                      species     VARCHAR(50)  NOT NULL,
                      breed       VARCHAR(100),
                      age         INTEGER,
                      created_at  TIMESTAMP    NOT NULL DEFAULT now(),
                      updated_at  TIMESTAMP    NOT NULL DEFAULT now(),
                      CONSTRAINT pk_pets PRIMARY KEY (id)