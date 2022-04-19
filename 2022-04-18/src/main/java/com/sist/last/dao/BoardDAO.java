package com.sist.last.dao;

import java.util.*;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sist.last.entity.*;

@Repository
public interface BoardDAO extends JpaRepository<BoardEntity, Integer> {
    
    // 목록
    @Query(value = "SELECT no,name,subject,content,pwd,regdate,hit "
            + "FROM board "
            + "ORDER BY no ASC "
            + "limit :start,10", nativeQuery = true)
    // MySQL, MariaDB
    public List<BoardEntity> boardListData(@Param("start") Integer start);
    
    // 총페이지
    @Query(value = "SELECT CEIL(COUNT(*)/10.0) FROM board", nativeQuery = true)
    public int boardTotalPage();
    
    /*
       @Query(value="UPDATE board SET " +"hit=hit+1 " +"WHERE no=:no",nativeQuery =
       true) public void hitIncrement(@Param("no") Integer no);
     */
    // 내용 보기
    public BoardEntity findByNo(@Param("no") Integer no);
    // hit 증가
    // 수정 (자체 지원 메소드)
    // 수정 데이터 읽기
    // 삭제
    // 데이터 추가 (자체 지원 메소드)
    //@Query(value="INSERT INTO board(name,subject,content,pwd,regdate,hit) "
                //+ "VALUES(:#{#vo.name},:#{#vo.subject},:#{#vo.content},"
                //+ ":#{#vo.pwd},now(),0)", nativeQuery = true)
    //public void boardInsert(@Param("vo") BoardEntity vo);
}