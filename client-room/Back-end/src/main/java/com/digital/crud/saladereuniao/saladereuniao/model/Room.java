package com.digital.crud.saladereuniao.saladereuniao.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_room")
public class Room {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "date", nullable = false)
    private String date;

    @Column(name="startHour", nullable = false)
    private String startHour;

    @Column(name="endHour", nullable = false)
    private String endHour;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return date;
    }

    public void setData(String data) {
        this.date = data;
    }

    public String getStarHour() {
        return startHour;
    }

    public void setStarHour(String starHour) {
        this.startHour = starHour;
    }

    public String getEndHour() {
        return endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }
    @Override
    public String toString()
    {
        return "ROOM [id#"+id+" name: "+name+" Start Hour: "+startHour+" End Hour: "+endHour+"]";
    }
}
