import logo from './logo.svg';
import './App.css';
import axios from "axios";
import React, {userState, useEffect, useState} from "react";
// 18버전 -→ class (x) → function() 권장
// Vue, React → 상태(데이터) 관리 프로그램 → 데이터
function App()
{
  // render → Hooks
  const [musicList,setMusicList]=useState([]); // list
  const [curpage,setCurpage]=useState(1);
  const [totalpage,setTotalpage]=useState(0);
  const [cno,setCno]=useState(1);
  /*
      class App extends Component{
          constructor(){
              this.state={
                  musicList:[],
                  curpage:1,
                  totalpage:0,
                  cno:0
              }
          }
          componentDidMount()
          → useEffect(()=>{
          },[])
      }
   */
  // 데이터 읽기 (서버 = Spring-Boot)
  useEffect(()=>{
    axios.get("http://localhost:8080/music/list",{
      params:{
        page: curpage,
        cno: cno
      }
    }).then(res=>{
      console.log(res.data);
      setMusicList(res.data);
    })
  },[])
  useEffect(()=>{
    axios.get("http://localhost:8080/music/totalpage",{
      params:{
        page: curpage,
        cno: cno
      }
    }).then(res=>{
      console.log(res.data);
      setCurpage(res.data.curpage);
      setTotalpage(res.data.totalpage);
    })
  })
  const handlerPrev=(e)=>{
    setCurpage(curpage>1?curpage-1:curpage)
    axios.get("http://localhost:8080/music/list",{
      params:{
        page: curpage,
        cno: cno
      }
    }).then(res=>{
      console.log(res.data);
      setMusicList(res.data);
    })
  }
  const handlerNext=(e)=>{
    setCurpage(curpage<totalpage?curpage+1:curpage)
    axios.get("http://localhost:8080/music/list",{
      params:{
        page: curpage,
        cno: cno
      }
    }).then(res=>{
      console.log(res.data);
      setMusicList(res.data);
    })
  }
  const musicChange=(no)=>{
    setCurpage(1)
    setCno(no)
    axios.get("http://localhost:8080/music/list",{
      params:{
        page: curpage,
        cno: cno
      }
    }).then(res=>{
      console.log(res.data);
      setMusicList(res.data);
    })
    axios.get("http://localhost:8080/music/totalpage",{
      params:{
        page: curpage,
        cno: cno
      }
    }).then(res=>{
      console.log(res.data);
      setCurpage(res.data.curpage);
      setTotalpage(res.data.totalpage);
    })
  }
  let html=musicList.map((m)=>(
      <div className="col-md-3">
        <div className="thumbnail">
          <a href="#">
            <img src={m.poster} alt="Lights" style={{"width":"100%"}}/>
            <div className="caption">
              <p style={{"font-size":"8px"}}>{m.title}</p>
            </div>
          </a>
        </div>
      </div>
  ))
  return (
      <div>
        <div className={"container"} style={{"marginTop":"50px"}}>
          <div className={"row"}>
            <div className={"text-center"}>
              <button className={"btn btn-sm btn-info"} onClick={()=>musicChange(1)}>Top200</button>
              <button className={"btn btn-sm btn-warning"} onClick={()=>musicChange(2)}>가요</button>
              <button className={"btn btn-sm btn-success"} onClick={()=>musicChange(3)}>POP</button>
              <button className={"btn btn-sm btn-primary"} onClick={()=>musicChange(4)}>OST</button>
              <button className={"btn btn-sm btn-danger"} onClick={()=>musicChange(5)}>트롯</button>
              <button className={"btn btn-sm btn-dark"} onClick={()=>musicChange(6)}>JAZZ</button>
            </div>
          </div>
          <div style={{"height":"20px"}}></div>
          <div className={"row"} style={{"margin":"0px auto","width":"960px"}}>
            {html}
          </div>
          <div className={"row"}>
            <div className={"text-center"}>
              <button className={"btn btn-sm btn-danger"} onClick={handlerPrev}>이전</button>
              {curpage} page / {totalpage} page
              <button className={"btn btn-sm btn-danger"} onClick={handlerNext}>다음</button>
            </div>
          </div>
        </div>
      </div>
  )
}

export default App;
