package com.sist.last.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

/*
    no int auto_increment,
    name varchar(20) not null,
    subject varchar(1000) not null,
    content text not null,
    pwd varchar(10) not null,
    regdate datetime default now(),
    hit int default 0,
 */
@Entity(name = "board")
@Getter
@Setter
// insert, update, delete
// jpa → 검색 (조건 = @Query)
public class BoardEntity {

    @Id
    private int no;
    private String name, subject, content, pwd;
    private LocalDateTime regdate;
    private int hit;

    @PrePersist
    public void regdate() {
        this.regdate = LocalDateTime.now();
    }
}