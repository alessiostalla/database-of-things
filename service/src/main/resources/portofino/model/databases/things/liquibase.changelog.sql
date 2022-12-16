--liquibase formatted sql
--changeset Alessio Stalla:dot_001_postgis
create extension postgis;

--changeset Alessio Stalla:dot_002_thing
CREATE TABLE thing (id bigserial PRIMARY KEY);

--changeset Alessio Stalla:dot_003_placement
CREATE TABLE place (
    id bigserial,
    position geography,
    CONSTRAINT place_pk PRIMARY KEY (id)
);

create table placement (
    id bigserial,
    thing bigint NOT NULL,
    date_from timestamp with time zone NOT NULL,
    date_to timestamp with time zone,
    place bigint,
    CONSTRAINT placement_pk PRIMARY KEY (id),
    CONSTRAINT fk_placement_place FOREIGN KEY (place)
        REFERENCES place (id),
    CONSTRAINT fk_placement_thing FOREIGN KEY (thing)
        REFERENCES thing (id)
);
