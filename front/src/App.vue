<template>
<head>
    <link rel="stylesheet" href="style.css">
    <title>나만의 심리테스트 - 가이드</title>
</head>
<body>
    <!-- 시작 페이지 -->
    <div id="start-page">
        <h1>나만의 심리테스트 - 가이드</h1>
        <button @click="main1()">시작하기</button>
        <div id="looImg">
          <img src="./assets/loopie.jpg" alt="loopie">
        </div>
    </div>
 
    <!-- 문제 페이지 1 -->
    <div id="main-page1">
        <h1>1/6</h1>
        <h2>루피가 당신과 놀기를 원합니다. 이에 응하시겠습니까?</h2>
        <input type="checkbox"  value="1" name="chk" v-model="checkedValues" @change="clickFunc" :true-value="yes" :false-value="no">1. 도망가장!
        <input type="checkbox"  value="2"  name="chk" v-model="checkedValues" @change="clickFunc">2. 따라간닷!
        <input type="checkbox"  value="3"  name="chk" v-model="checkedValues" @change="clickFunc">3. 도민준중....
        <br/>
        <button @click="">선택</button>
    </div>

      <!-- 문제 페이지 2 -->
      <div id="main-page2">
        <h1>2/6</h1>
        <h2>루피가 당신과 놀기를 원합니다. 이에 응하시겠습니까?</h2>
        <input type="checkbox"  value="1" name="chk" v-model="checkedValues" @change="clickFunc" :true-value="yes" :false-value="no">1. 도망가장!
        <input type="checkbox"  value="2"  name="chk" v-model="checkedValues" @change="clickFunc">2. 따라간닷!
        <input type="checkbox"  value="3"  name="chk" v-model="checkedValues" @change="clickFunc">3. 도민준중....
        <br/>
        <button>선택 4</button>
    </div>

      <!-- 문제 페이지 3 -->
      <div id="main-page3">
        <h1>3/6</h1>
        <h2>루피가 당신과 놀기를 원합니다. 이에 응하시겠습니까?</h2>
        <input type="checkbox"  value="1" name="chk" v-model="checkedValues" @change="clickFunc" :true-value="yes" :false-value="no">1. 도망가장!
        <input type="checkbox"  value="2"  name="chk" v-model="checkedValues" @change="clickFunc">2. 따라간닷!
        <input type="checkbox"  value="3"  name="chk" v-model="checkedValues" @change="clickFunc">3. 도민준중....
        <br/>
        <button>선택 4</button>
    </div>

        <!-- 문제 페이지 4 -->
      <div id="main-page4">
        <h1>4/6</h1>
        <h2>루피가 당신과 놀기를 원합니다. 이에 응하시겠습니까?</h2>
        <input type="checkbox"  value="1" name="chk" v-model="checkedValues" @change="clickFunc" :true-value="yes" :false-value="no">1. 도망가장!
        <input type="checkbox"  value="2"  name="chk" v-model="checkedValues" @change="clickFunc">2. 따라간닷!
        <input type="checkbox"  value="3"  name="chk" v-model="checkedValues" @change="clickFunc">3. 도민준중....
        <br/>
        <button>선택 4</button>
    </div>

     <!-- 문제 페이지 5 -->
      <div id="main-page5">
        <h1>5/6</h1>
        <h2>루피가 당신과 놀기를 원합니다. 이에 응하시겠습니까?</h2>
        <input type="checkbox"  value="1" name="chk" v-model="checkedValues" @change="clickFunc" :true-value="yes" :false-value="no">1. 도망가장!
        <input type="checkbox"  value="2"  name="chk" v-model="checkedValues" @change="clickFunc">2. 따라간닷!
        <input type="checkbox"  value="3"  name="chk" v-model="checkedValues" @change="clickFunc">3. 도민준중....
        <br/>
        <button>선택 4</button>
    </div>
 
    <!-- 문제 페이지 5 -->
      <div id="main-page5">
        <h1>6/6</h1>
        <h2>루피가 당신과 놀기를 원합니다. 이에 응하시겠습니까?</h2>
        <input type="checkbox"  value="1" name="chk" v-model="checkedValues" @change="clickFunc" :true-value="yes" :false-value="no">1. 도망가장!
        <input type="checkbox"  value="2"  name="chk" v-model="checkedValues" @change="clickFunc">2. 따라간닷!
        <input type="checkbox"  value="3"  name="chk" v-model="checkedValues" @change="clickFunc">3. 도민준중....
        <br/>
        <button>선택 4</button>
    </div>
    <!-- 결과 페이지 -->
    <div id="result-page">
        <h1>결과</h1>
        <h2>결과 설명</h2>
    </div>
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
    //체크박스 중복체크
    clickFunc(event : any) {
       for(let i=0; i<this.checkedValues.length;i++){
          if(this.checkedValues[i] !== event.target.value){
              this.checkedValues.splice(i,1);
            }
          }
        },
    //시작버튼
    startpageEnd(){
      let stPage = document.getElementById("start-page") as any;
      let miPage = document.getElementById("main-page1") as any;
        stPage.style.display = "none";
        miPage.style.display = "block"
    },main1(){
      let store = useStore();
      console.log(store.state);
    }
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
    background-color: white;
    color: pink;
}
 
#start-page {
    text-align: center;
    margin: 0 auto;
}
 
#main-page1 {
    text-align: center;
    display: none;
}
#main-page2 {
    text-align: center;
    display: none;
}
#main-page3 {
    text-align: center;
    display: none;
}
#main-page4 {
    text-align: center;
    display: none;
}
#main-page5 {
    text-align: center;
    display: none;
}
#main-page6 {
    text-align: center;
    display: none;
}
 
#result-page {
    text-align: center;
    display: none;
}
#looImg {
  margin-top: 20px;
  border: 2ch;
}
</style>
