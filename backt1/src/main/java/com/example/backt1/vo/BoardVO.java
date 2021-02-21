package com.example.backt1.vo;

import java.util.Date;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
 
@Data
public class BoardVO {
    int number;
    String title;
    String content;
    String id;
    Date data;
    String passwrod;
    int hit;

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getPasswrod() {
        return this.passwrod;
    }

    public void setPasswrod(String passwrod) {
        this.passwrod = passwrod;
    }

    public int getHit() {
        return this.hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }


}
