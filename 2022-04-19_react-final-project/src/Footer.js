import React,{Component} from "react";

class Footer extends Component {
    render() {
        return (
            <footer className="container-fluid text-center">
                <a href="#myPage" title="To Top">
                    <span className="glyphicon glyphicon-chevron-up"></span>
                </a>
                <p>React  Project Made By <a href="https://www.w3schools.com"
                                              title="Visit w3schools">강남 쌍용 교육 센터</a></p>
            </footer>
        )
    }
}

export default Footer;