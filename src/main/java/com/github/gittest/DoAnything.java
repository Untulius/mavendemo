package com.github.gittest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DoAnything {
    private static final Logger LOG = LoggerFactory.getLogger(DoAnything.class);

    public void greeting(String name){
        LOG.info("Привет, {}!", name);
    }

}
