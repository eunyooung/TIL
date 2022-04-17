package com.sist.music.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Entity(name = "music")
@Setter
@Getter
public class MusicEntity {
    
    @Id
    private int no;
    private int cno, idcrement;
    private String title, singer, album, state, poster, mkey;
}