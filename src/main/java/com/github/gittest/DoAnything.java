package com.github.gittest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*Создать мавен-проект, добавить в pom.xml зависимость slf4j-log4j12,
добавить конфигурационный файл для логера (log4j.properties). Вывести
в консоль и в файл сообщения уровня ERROR, WARN, INFO, TRACE*/

public class DoAnything {
    private static final Logger LOG = LoggerFactory.getLogger(DoAnything.class);

    public void greeting(){
        LOG.error("Сообщение уровня ERROR");
        LOG.warn("Сообщение уровня WARN");
        LOG.info("Сообщение уровня INFO");
        LOG.trace("Сообщение уровня TRACE");
    }

    public static void main(String[] args) {
        DoAnything doAnything = new DoAnything();
        doAnything.greeting();
    }

}
