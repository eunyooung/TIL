import React,{Component,Fragment,useState,useEffect} from "react";
// hook을 사용한 React 화면 출력
import axios from "axios";
import $ from "jquery";
import {NavLink} from "react-router-dom";
// 1. 서버 연결 후 데이터 읽기
// 2. 화면 출력 (HTML)
// 3. 프로그램시까지 유지하는 변수 → state
function Location(props) {
    const [locList,setLocList] = useState([]);
    const [page,setPage] = useState(1);
    const [total,setTotal] = useState(0);
    const [show,setShow] = useState(false);
    const [detail, setDetail] = useState({});
    // let locList = []
    // 목록을 읽어 온다
    useEffect(()=>{
        axios.get("http://localhost:8080/seoul/location",{
            params:{
                page:page
            }
        }).then(res=>{
            console.log(res.data)
            setLocList(res.data)
            setPage(res.data[0].curpage)
            setTotal(res.data[0].totalpage)
        })
    },[])
    useEffect(()=>{
        $('.posters').hover(function(){
            $(this).css("cursor","pointer")
        },function(){
            $(this).css("cursor","")
        })
    })
    let html = locList.map((loc)=>(
        <div className="col-md-4">
            <div className="thumbnail">
                <img src={loc.poster} title={loc.msg} style={{"width":"200px","height":"200px"}} className={"posters"} onClick={()=>showDetail(loc)}/>
                <div className="caption">
                    <p style={{"fontSize":"8px"}}>{loc.title}</p>
                </div>
            </div>
        </div>
    ))
    // 이벤트 처리
    const prev = ()=>{
        setPage(page>1?page-1:page)
        axios.get("http://localhost:8080/seoul/location",{
            params:{
                page:page
            }
        }).then(res=>{
            console.log(res.data)
            setLocList(res.data)
        })
    }
    const next = ()=>{
        setPage(page<total?page+1:page)
        axios.get("http://localhost:8080/seoul/location",{
            params:{
                page:page
            }
        }).then(res=>{
            console.log(res.data)
            setLocList(res.data)
        })
    }
    const showDetail = (m)=>{
        setDetail(m)
        setShow(true)
    }
    return (
        <Fragment>
            <div className={"col-sm-9"}>
                <div className={"row"}>
                    {html}
                </div>
                <div style={{"height":"30px"}}></div>
                <div className={"row"}>
                    <div className={"text-center"}>
                        <button className={"btn btn-sm btn-info"} onClick={prev}>이전</button>
                        {page} page / {total} pages
                        <button className={"btn btn-sm btn-success"} onClick={next}>다음</button>
                    </div>
                </div>
            </div>
            <div className={"col-sm-3"}>
                {show==true?<LocationDetail data={detail}/>:null}
            </div>
        </Fragment>
    )
}
function LocationDetail(props) {
    return (
        <Fragment>
            <table className={"table"}>
                <tbody>
                    <tr>
                        <td className={"text-center"}>{props.data.title}</td>
                    </tr>
                    <tr>
                        <td>
                            <img src={props.data.poster} style={{"width":"100%"}}/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            {props.data.msg}
                        </td>
                    </tr>
                    <tr>
                        <td>
                            {props.data.address}
                        </td>
                    </tr>
                </tbody>
            </table>
        </Fragment>
    )
}
export default Location;