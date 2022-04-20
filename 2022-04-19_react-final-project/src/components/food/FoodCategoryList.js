import React,{Fragment,useState,useEffect} from "react";
import {NavLink,useParams} from "react-router-dom";
import axios from "axios";

function FoodCategoryList(props) {
    const [foodList, setFoodList] = useState([])
    const [info, setInfo] = useState({})
    // router 6
    // router 5 → Switch, router 6 → Routes
    let{cno} = useParams(); // → router(5) props.match.params → 사라졌다 (경고)
    useEffect(()=>{
        axios.get("http://localhost:8080/food/food_list",{
            params:{
                cno:cno
            }
        }).then(res=>{
            console.log(res.data) // res.data = spring boot를 통해서 가지고 오는 데이터
            setFoodList(res.data)
        })
    },[])
    useEffect(()=>{
        axios.get("http://localhost:8080/food/cate_info",{
            params:{
                cno:cno
            }
        }).then(res=>{
            console.log(res.data) // res.data = spring boot를 통해서 가지고 오는 데이터
            setInfo(res.data)
        })
    },{})
    let html = foodList.map((food)=>(
        <table className={"table"}>
            <tbody>
                <tr>
                    <td className={"text-center"} width={"30%"} rowSpan={"4"}>
                       <NavLink to={"/food/detail/"+food.no}>
                          <img src={food.poster} style={{"width":"270px","height":"180px"}}/>
                       </NavLink>
                    </td>
                    <td width={"70%"} colSpan={"2"}>
                        <NavLink to={"/food/detail/"+food.no}>
                            <h3>{food.name}</h3>
                        </NavLink>
                    </td>
                </tr>
                <tr>
                    <td width={"20%"} className={"text-left"}>주소</td>
                    <td width={"50%"}>{food.address}</td>
                </tr>
                <tr>
                    <td width={"20%"} className={"text-left"}>전화</td>
                    <td width={"50%"}>{food.tel}</td>
                </tr>
                <tr>
                    <td width={"20%"} className={"text-left"}>음식종류</td>
                    <td width={"50%"}>{food.type}</td>
                </tr>
            </tbody>
        </table>
    ))
    return (
        <Fragment>
            <div className={"jumbotron"}>
                <h2 className={"text-center"}>{info.title}</h2>
                <h3 className={"text-center"}>{info.subject}</h3>
            </div>
            <div className={"row"}>
                <table className={"table"}>
                    <tbody>
                        <tr>
                            <td>
                                {html}
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </Fragment>
    )
}

export default FoodCategoryList;