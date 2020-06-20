package com.centinem.dbconnection.ColorEntity;



import javax.persistence.Table;
import javax.persistence.Id;

import javax.persistence.Entity;
import java.time.LocalDateTime;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;



@Entity()
@Table(name="color")
public class Color {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Integer parentId;
    private String  name;
    private String color;
    private LocalDateTime createdOn;

    public Color() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }




    public Color(int id, Integer parentId, String name, String color, LocalDateTime createdOn) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.color = color;
        this.createdOn = createdOn;
    }


}
