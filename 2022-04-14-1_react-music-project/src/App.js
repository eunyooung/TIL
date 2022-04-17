import logo from './logo.svg';
import './App.css';
import {Component} from "react";
import axios from "axios";
/*
    Component 상속 → class
    function App()
    ---------------------
    변수 : 멤버변수
           props : 속성 (고정) → 변경 할 수 없는 값
           state : 가변 → 수시로 변경
    생명주기
    1. 생성자
    2. componentDidMount → mounted(vue) → window.onload
        → 서버로부터 데이터를 읽어 올 때 사용
    3. render
        → 화면 출력 (HTML 변역)
    4. componentDidUpdate
        → 수정할때 호출
    5. componentDidDestroy
        → 메모리 해제 (페이지 바뀔 때)

    제어문 : map, foreach, 삼항 연산자

    → MVC (view 역할만 수행) → 화면만 출력 (jsp)

    Vue vs React
    공통 점 → 가상돔 (가상 메모리를 만든다)
    차이 점 → React(단방향), Vue(양방향)

    파일명과 동일 → 클래스명을 만든다
    Music → Music.js
    - 구분
      1) 클래스명, 함수명은 반드시 대문자 사용
      2) HTML은 소문자
      3) 클래스를 실행시에 반드시 <클래스명/>
      → <App/>
      → jsx 파일을 이용한다 → XML형식
      → 문법이 어렵다
        태그는 반드시 닫는다 <br> → 오류, <br/>
        태그 순서가 명확해야한다 <a><b></a></b> → 오류  <a><b></b></a>
        style={{"font-size":"10px"}} → 오류
                 ---------- fontSize → -가 없어야함
      → 데이터 출력: {}
 */
class App extends Component{
  // 멤버 변수 설정 → 서버에서 들어오는 데이터를 저장
  // 생성자 → 변수선언, 이벤트 등록
  // useState['music_list'] → funcion안에서 멤버 사용 = Hooks (17 버전부터 Hooks 사용 권장)
  constructor(props) {
    super(props);
    this.state={
      music_list:[],
      curpage:1,
      page_info:{}
      // 문자열: ''
    }
    // 이벤트 등록 (사용자 정의)
    this.prev=this.prev.bind(this)
    this.next=this.next.bind(this)
  }
  // 사용자 정의
  prev(){
    this.state.curpage=this.state.curpage>1?this.state.curpage-1:this.state.curpage
    axios.get("http://localhost:8080/music/list",{
      params:{
        page:this.state.curpage
      }
    }).then(response=>{
      console.log(response.data)
      this.setState({music_list:response.data})
    })

    axios.get("http://localhost:8080/music/totalpage",{
      params:{
        page:this.state.curpage
      }
    }).then(response=>{
      console.log(response.data)
      this.setState({page_info:response.data}) // render → 변경된 데이터를 화면에 출력
    })
  }
  next(){
    this.state.curpage=this.state.curpage<this.state.page_info.totalpage?this.state.curpage+1:this.state.curpage
    axios.get("http://localhost:8080/music/list",{
      params:{
        page:this.state.curpage
      }
    }).then(response=>{
      console.log(response.data)
      this.setState({music_list:response.data})
    })

    axios.get("http://localhost:8080/music/totalpage",{
      params:{
        page:this.state.curpage
      }
    }).then(response=>{
      console.log(response.data)
      this.setState({page_info:response.data}) // render → 변경된 데이터를 화면에 출력
    })
  }
  // 서버와 연결 → 멤버변수의 초기 값
  componentDidMount() {
    // 서버 연결 → 데이터 읽기
    axios.get("http://localhost:8080/music/list",{
      params:{
        page:this.state.curpage
      }
    }).then(response=>{
      console.log(response.data)
      this.setState({music_list:response.data})
    })

    axios.get("http://localhost:8080/music/totalpage",{
      params:{
        page:this.state.curpage
      }
    }).then(response=>{
      console.log(response.data)
      this.setState({page_info:response.data}) // render → 변경된 데이터를 화면에 출력
    })
  }

  // 멤버변수에 데이터를 출력 → <div class="root"></div>
  render() {
    /* for문 : map, foreach
    *
    * JS (Ajax, React, Node, Vue → Redux, Vuex) → 프론트
    * HTML, CSS → 디자이너
    * Spring, Spring-Boot, MyBatis, JPA, Java → 백엔드
    */
    let html=this.state.music_list.map((music)=>(
        <div className="col-md-3">
          <div className="thumbnail">
            <a href="#">
              <img src={music.poster} alt="Lights" style={{"width":"100%"}}/>
              <div className="caption">
                <p style={{"font-size":"8px"}}>{music.title}</p>
              </div>
            </a>
          </div>
        </div>
    ))
    return (
        <div className={"container"} style={{"marginTop":"50px"}}>
          <div className={"row"}>
            <div className={"text-center"}>
              <button className={"btn btn-sm btn-info"}>Top200</button>
              <button className={"btn btn-sm btn-warning"}>가요</button>
              <button className={"btn btn-sm btn-success"}>POP</button>
              <button className={"btn btn-sm btn-primary"}>OST</button>
              <button className={"btn btn-sm btn-danger"}>트롯</button>
              <button className={"btn btn-sm btn-dark"}>JAZZ</button>
            </div>
          </div>
          <div style={{"height":"20px"}}></div>
          <div className={"row"} style={{"margin":"0px auto","width":"960px"}}>
            {html}
          </div>
          <div style={{"height":"20px"}}></div>
          <div className={"row"}>
            <div className={"text-center"}>
              <button className={"btn btn-sm btn-info"} onClick={this.prev}>이전</button>
              {this.state.page_info.curpage} page / {this.state.page_info.totalpage} pages
              <button className={"btn btn-sm btn-success"} onClick={this.next}>다음</button>
            </div>
          </div>
        </div>
    )
  }

}
export default App;