import React,{Fragment,useState,useEffect} from "react";
import {useParams} from "react-router-dom";
import axios from "axios";
/*global kakao*/
// 클릭 → 화면 변경 시 전송될 변수를 읽어 올 때
function FoodDetail(props) {

    const [foodDetail,setFoodDetail] = useState({}) // vo 한개를 읽어 온다
    let {no} = useParams(); // PathVariable → react-router-dom(6.3.0)
    // react-router-dom(5.x.x) = props.match.params.no
    // no에 해당되는 데이터 서버로부터 읽기 시작
    // no → ?no=10
    useEffect(()=>{
        axios.get("http://localhost:8080/food/detail",{
            params:{
                no:no
            }
        }).then(res=>{
            console.log(res.data)
            setFoodDetail(res.data)
        })
    },{})

    useEffect(()=>{
        const script = document.createElement("script")
        script.async = true;
        script.src = "https://dapi.kakao.com/v2/maps/sdk.js?appkey=&libraries=services"
        document.head.appendChild(script)
        script.onload = ()=>{
            kakao.maps.load(()=>{
                var mapContainer = document.getElementById('map'), // 지도를 표시할 div
                    mapOption = {
                        center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
                        level: 3 // 지도의 확대 레벨
                    };

                // 지도를 생성합니다
                var map = new kakao.maps.Map(mapContainer, mapOption);

                // 주소-좌표 변환 객체를 생성합니다
                var geocoder = new kakao.maps.services.Geocoder();

                // 주소로 좌표를 검색합니다
                geocoder.addressSearch(foodDetail.address, function(result, status) {

                    // 정상적으로 검색이 완료됐으면
                    if (status === kakao.maps.services.Status.OK) {

                        var coords = new kakao.maps.LatLng(result[0].y, result[0].x);

                        // 결과값으로 받은 위치를 마커로 표시합니다
                        var marker = new kakao.maps.Marker({
                            map: map,
                            position: coords
                        });

                        // 인포윈도우로 장소에 대한 설명을 표시합니다
                        var infowindow = new kakao.maps.InfoWindow({
                            content: '<div style="width:150px;text-align:center;padding:6px 0;">'+foodDetail.name+'</div>'
                        });
                        infowindow.open(map, marker);

                        // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
                        map.setCenter(coords);
                    }
                });
            })
        }
    })
    let poster = String(foodDetail.poster);
    const img = poster.split("^");
    let html = img.map((m)=>(
        <td><img src={m} style={{"width":"100%"}}/></td>
    ))
    let menu = String(foodDetail.menu);
    let html2 = '';
    const m = menu.split("원");
    if(menu!='no') {
        html2 = m.map((k)=>(
            <li>{k}</li>
        ))
    } else {
        html2 = '등록이 안됨'
    }
    return (
        <Fragment>
            <div className={"row"}>
                <table className={"table"}>
                    <tbody>
                        <tr>
                            {html}
                        </tr>
                    </tbody>
                </table>
            </div>
            <div className={"col-sm-8"}>
                <table className={"table"}>
                    <tbody>
                        <tr>
                            <td colSpan={"2"}>
                                <h4>{foodDetail.name+" "}<span style={{"color":"orange"}}>{foodDetail.score}</span></h4>
                            </td>
                        </tr>
                        <tr>
                            <td width={"15%"} style={{"color":"gray"}}>주소</td>
                            <td width={"85%"}>{foodDetail.address}</td>
                        </tr>
                        <tr>
                            <td width={"15%"} style={{"color":"gray"}}>전화</td>
                            <td width={"85%"}>{foodDetail.tel}</td>
                        </tr>
                        <tr>
                            <td width={"15%"} style={{"color":"gray"}}>음식종류</td>
                            <td width={"85%"}>{foodDetail.type}</td>
                        </tr>
                        <tr>
                            <td width={"15%"} style={{"color":"gray"}}>가격대</td>
                            <td width={"85%"}>{foodDetail.price}</td>
                        </tr>
                        <tr>
                            <td width={"15%"} style={{"color":"gray"}}>주차</td>
                            <td width={"85%"}>{foodDetail.parking}</td>
                        </tr>
                        <tr>
                            <td width={"15%"} style={{"color":"gray"}}>영업시간</td>
                            <td width={"85%"}>{foodDetail.time}</td>
                        </tr>
                        <tr>
                            <td width={"15%"} style={{"color":"gray"}}>메뉴</td>
                            <td width={"85%"}>
                                <ul style={{"listStyleType":"none"}}>
                                    {html2}
                                </ul>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div className={"col-sm-4"}>
                <div id="map" style={{"width":"100%","height":"350px"}}></div>
            </div>
        </Fragment>
    )
}
export default FoodDetail;