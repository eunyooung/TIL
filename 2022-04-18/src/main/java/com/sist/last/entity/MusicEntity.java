package com.sist.last.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/*
    cno int,
    title varchar(200) not null,
    singer varchar(300) not null,
    album varchar(300),
    state varchar(20),
    idcrement int,
    poster varchar(500),
    mkey varchar(100)
 */

@Entity(name="music")
@Setter
@Getter
// -→ save (insert, update), delete, findAll, findOne
public class MusicEntity {
    
    @Id
    private int no;
    private int cno,idcrement;
    private String title,singer,album,state,poster,mkey;
}