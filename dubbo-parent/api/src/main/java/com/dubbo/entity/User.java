package com.dubbo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : lgn
 * @date : 2022/3/23
 */
public class User implements Serializable {
    String id;
    String name;
    Date date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
