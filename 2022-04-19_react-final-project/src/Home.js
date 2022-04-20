import React, {Component, Fragment, useEffect, useState} from "react";
import axios from "axios"; // 서버에서 데이터를 읽어 온다
import {NavLink} from "react-router-dom";

/*
    JavaScript : 이벤트 구동 방식
      1. 화면 출력 (HTML 제어)
      2. 이벤트 처리
      3. React : MVC(View 역할 수행) → 화면 출력 담당
         데이터관리 : 지원하는 변수 (불변: props, 가변: axios,fetch → state)
         장점 : 속도가 빠르다 (HTML은 변경 → 전체가 메모리에서 변경, 변경된 부분만 처리)
                = 가상돔 → String VS StringBuffer
                = 단방향 (소스가 길다)
      → 클래스 호출
        class Abc extends Component → <Abc/>
        <Home/>
        → 클래스 → function : hooks (17버전 ~ 18버전)
        state / props → React / Vue → 상태 관리 프로그램
                                      ---- 데이터
                                    실무 프로그램 (네트워크, 데이터베이스:웹)
                                                = 모바일, 게임
        모든 프로그램은 Front, Back → 데이터 관리 프로그램, 화면 출력
                                   ----------
                                   메모리 저장 : List, 변수 ...
                                    File 저장 : IO
                                   RDBMS 저장 : JDBC
        props → <Home name="hong"/> → props.name(불변) → 상수
        state → 외부에서 데이터를 읽어서 저장하는 공간 → 변수
        ----- vue.js → data:{}

        class A extends Component {
            constructor(props) {

            }
        }

        function A(props) {

        }

        state 변수 설정 방법 → 데이터 저장 공간, 이벤트 처리, 화면 출력
        -------------------------------------------------------
        → 1. 객체 -→ {} : vo 단위 -→ JSON (자바스크립트 객체 표현법)
          2. 목록 -→ [{},{},{}...] : List 단위
          3. 일반 데이터 -→ '', 정수...

        1. 클래스형 state를 설정하는 방법 (16버전 이전)
           class A extends Component {
               constructor() {
                   this.state = {
                       category_list:[],
                       category_object:{},
                       page:1,
                       fd:''
                   }
               }
           }
        2. 함수형에서 state를 설정하는 방법 (16버전 이후) → 17버전 함수형만 중심
            → 호출시 <A/> : 일반 HTML 태그와 구분 (HTML는 소문자, 클래스와 함수는 대문자)
            → 1. 메모리 할당
              2. componentWilMount() → 가상메모리에 올라가기전에
              3. render() → HTML을 가상메모리 올려준다
              4. componentDidMount() → 변경된 내용을 반영 → 화면에 출력 (window.onload)
                 ------------------- $(function()) : 다른 프로그램과 연동
                                     → jQuery, Map, 다른 JavaScript
              5. 변경시
                 setState() → componentDidUpdate() → render() → componentDidMount()
                 → HTML이 메모리에 올라간다 → 가상메모리 ←-→ 실제 메모리
                                           비교해서 변경된 부분 반영 (diff)
            ------------------------------------------------------------------------
              componentDidMount() → useEffect() → 데이터를 읽어온다
              setState() → const [page, setPage] -→ state가 존재하지 않기 때문에
                                        ------- useState()
              render() → retrun
              componentDidUpdate() → setXxx() → return

            function A() {

            }

            useXxx → Hooks
            ----------------- 단점 : 단방향 → 필요한 데이터를 모아 놓고 어떤 함수도 가능하게 만들자
                                            ---------------------------------------------
                                             MVC (View / Model) 나눠서 처리한다 (Redux → Moxb,Sara)
                                                                              ------
                                             VueJs (View), vuex(Model)
                                                           -----------
 */
function Home() {
    // 변수 설정
    const [cateList, setCateList] = useState([]); // cateList:[] → 목록으로 전송을 받는다
    // state → 변수명, setter → setter를 이용해서 값을 채운다
    const [cateNo, setCateNo] = useState(1);
    /*
        ES5 → var
        ES6 → const, let (scope를 명확하게 만들었다)
              ----- 상수형 변수
     */
    // 데이터를 읽어 온다 -→ setCatelist
    // componentDidMount → 가상 메모리에 올려주는 함수명 -→ Hooks에서 역할 → useEffect()
    // → 함수
    /*
            function a() {}
            const a=()=>{} =>는 function, return을 제외하고 사용시에 → 함수 포인터 (람다식)
            useEffect(function(){})
     */
    useEffect(()=>{
        axios.get("http://localhost:8080/food/category",{
            params:{
                no:cateNo
            }
        }).then(res=>{
            console.log(res.data)
            setCateList(res.data)
        })
    },[])
    // 화면 출력
    // map → forEach → callback
    /*
        for(cate:cateList)
     */
    let html = cateList.map((cate)=>(
        <div className="col-md-4">
            <div className="thumbnail">
                <NavLink to={"/food/category_food_list/"+cate.cno}>
                    <img src={cate.poster} title={cate.subject} style={{"width":"100%"}}/>
                    <div className="caption">
                        <p>{cate.title}</p>
                    </div>
                </NavLink>
            </div>
        </div>
    ))
    // 이벤트 처리
    const changeCategory=(no)=>{
        axios.get("http://localhost:8080/food/category",{
            params:{
                no:no
            }
        }).then(res=>{
            console.log(res.data)
            setCateList(res.data)
        })
    }
    return (
        // <Fragment> : 루트 → XML → jsx → javascript + xml → XML을 html로 변경 후에 root에 출력 (render())
        <Fragment>
            <div className={"row"}>
                <div className={"text-center"}>
                    <button className={"btn btn-lg btn-danger"} onClick={()=>changeCategory(1)}>
                        믿고 보는 맛집 리스트
                    </button>{"  "}
                    <button className={"btn btn-lg btn-primary"} onClick={()=>changeCategory(2)}>
                        지역별 맛집 리스트
                    </button>{"  "}
                    <button className={"btn btn-lg btn-success"} onClick={()=>changeCategory(3)}>
                        메뉴별 맛집 리스트
                    </button>
                </div>
            </div>
            <div style={{"height":"50px"}}></div>
            <div className={"row"}>
                {html}
            </div>
        </Fragment>
    )
}

export default Home;