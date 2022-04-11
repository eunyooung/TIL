package com.sist.dao;

import java.util.*;

import lombok.Getter;
import lombok.Setter;
/*
 *   1. ~VO : readonly (setter(x), getter(O)) → spring
 *   2. ~DTO : 컬럼외에 다른 변수 추가가 가능 (데이터를 모아서 전송) → mybatis
 *             → getter/setter
 *   3. ~Entity : 테이블 컬럼명과 일치가 (다른 변수를 사용할 수 없다) → JPA
 */
@Getter
@Setter
public class StudentVO {
    
    private int hakbun, kor, eng, math;
    private String name, dbday;
    private Date regdate;
}