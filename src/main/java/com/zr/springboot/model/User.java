package com.zr.springboot.model;

/**
 * 描述
 *
 * @author nicaide
 * @date 2020年12月15日 14:51:00
 */
public class User {

    private String name;

    private String id;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
