CREATE DATABASE proyecto2;

CREATE TABLE `datos` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `años` int (11) NOT NULL,
    `dato1` decimal(6,3) NOT NULL,
    `dato2` int (11) NOT NULL,
    `dato3` decimal(6,3) NOT NULL,
    `dato4` int (11) NOT NULL,
    `dato5` decimal(6,3) NOT NULL,
    `dato6` int (11) NOT NULL,

    PRIMARY KEY (`id`)
    );

    INSERT INTO `datos` (id, dato1, dato2, dato3, dato4, dato5, dato6, dato7) VALUES
        (id ,dato1, dato2, dato3, dato4, dato5, dato6, dato7);