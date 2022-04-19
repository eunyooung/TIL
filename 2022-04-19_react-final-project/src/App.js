import logo from './logo.svg';
import './App.css';
import React, {Component, Fragment} from "react";
import {BrowserRouter as Router,Route,Routes} from "react-router-dom";
import Header from "./Header";
import Home from "./Home";
import RecipeList from "./components/recipe/RecipeList";
import ChefList from "./components/recipe/ChefList";
import Location from "./components/seoul/Location";
import Nature from "./components/seoul/Nature";
import Hotel from "./components/seoul/Hotel";
import Footer from "./Footer";
/*
        Router : 전체 화면 관리
        Route  : 브라우저 화면
        Switch : 사용자 요청에 따라 Route를 찾아주는 역할
        -------------------------------------------- <jsp:include>, tiles
 */
class App extends Component {
    render() {
        return (
            <Router>
                <Fragment>
                    <Header/>
                    <div className={"container-fluid"}>
                        <Routes>
                            <Route exact path={"/"} element={<Home/>}/>
                            <Route path={"/recipe/list"} element={<RecipeList/>}/>
                            <Route path={"/recipe/chef"} element={<ChefList/>}/>
                            <Route path={"/seoul/location"} element={<Location/>}/>
                            <Route path={"/seoul/nature"} element={<Nature/>}/>
                            <Route path={"/seoul/hotel"} element={<Hotel/>}/>
                        </Routes>
                    </div>
                    <Footer/>
                </Fragment>
            </Router>
        )
    }
}
export default App;
