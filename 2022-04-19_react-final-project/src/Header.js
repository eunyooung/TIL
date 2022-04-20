import React,{Component} from "react";
import {NavLink} from "react-router-dom";

class Header extends Component {
    render() {
        return (
            <nav className="navbar navbar-inverse">
                <div className="container-fluid">
                    <div className="navbar-header">
                        <NavLink className="navbar-brand" to={"/"}>Recipe & Food</NavLink>
                    </div>
                    <ul className="nav navbar-nav">
                        <li className="active"><NavLink to={"/"}>Home</NavLink></li>
                        <li><NavLink to={"/seoul/location"}>서울 명소</NavLink></li>
                        <li><NavLink to={"/seoul/nature"}>서울 자연</NavLink></li>
                        <li><NavLink to={"/seoul/hotel"}>서울 호텔</NavLink></li>
                        <li><NavLink to={"/recipe/list"}>레시피</NavLink></li>
                        <li><NavLink to={"/recipe/chef"}>쉐프</NavLink></li>
                    </ul>
                </div>
            </nav>
        )
    }
}


export default Header;