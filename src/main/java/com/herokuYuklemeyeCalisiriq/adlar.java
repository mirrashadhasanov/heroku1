package com.herokuYuklemeyeCalisiriq;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class adlar {
    @Id
    @GeneratedValue
    private Long id;
    private String ad;
    private String soyad;

    adlar(){}

    public adlar(String ad, String soyad){
        this.ad = ad;
        this.soyad = soyad;
    }
}
