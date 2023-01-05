<template>
<head>
    <link rel="stylesheet" href="style.css">
    <title>나만의 심리테스트 - 가이드</title>
</head>
<body>
    <!-- 시작 페이지 -->
    <div id="start-page">
        <h1 style="font-weight: bolder;">루피와 함께하는 심리테스트</h1>
        
        <div id="looImg">
          <img src="./assets/loopie.jpg" alt="loopie" id="loopieImg">
        </div>
        <button id="mibu" @click="startpageEnd()"><router-link to="/content/1">시작하기</router-link></button>
    </div>

    <!-- routerView 출력 위치 -->
    <router-view></router-view>
 
</body>
</template>

<script lang="ts">

import { Options, Vue } from 'vue-class-component';
import { useStore } from 'vuex';

@Options({
  components: {
  },data() {
    return {
      mainDelete : false,
      checkedValues:[] //선택된 값 세팅
    }
  },methods :{
    //시작버튼
    startpageEnd(){
      let stPage = document.getElementById("start-page") as any;
      //let miPage = document.getElementById("main-page1") as any;
        stPage.style.display = "none";
        //miPage.style.display = "block"
    },
    //바운딩 순서... window.onload 의 역활 함 
  },mounted (){
   
  }
})
export default class App extends Vue {}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
body {
    background-color: pink;
    font-weight: bolder;
 border: 5px black;
}
#start-page {
    text-align: center;
    margin: 0 auto;
}
 
#looImg {
  margin-top: 30px;
  margin-bottom: 30px;
  border: 2ch;
}
#mibu{
  border-radius: 50%;
  border-radius: 5px;
  background-color: white;
  width: 200px;
  height: 50px;
  font-size: 25px;
  border-width: 5px 5px;
  border-color: black black;

}
a{
  text-decoration: none;
  color: black;
  font-weight: bolder;
}

#loopieImg {
border: 5px solid black;
border-radius: 7px;
-moz-border-radius: 7px;
-khtml-border-radius: 7px;
-webkit-border-radius: 7px;
}
</style>
