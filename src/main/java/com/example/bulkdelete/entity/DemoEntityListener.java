package com.example.bulkdelete.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.PreRemove;

public class DemoEntityListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoEntityListener.class);

    @PreRemove
    public void preRemove(Object obj) {
        LOGGER.info("preRemove " + obj);
    }
}
