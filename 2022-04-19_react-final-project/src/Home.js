import React,{Component} from "react";
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
 */
class Home extends Component {
    render() {
        return (
            <div>
                <div className={"text-center"}><h1>Home</h1></div>
            </div>
        )
    }
}

export default Home;