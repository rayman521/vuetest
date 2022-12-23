<template>
      <!-- 문제 페이지 1 -->
      <div id="main-page1">
        <h1>1/6</h1>
        <h2>안녕하세요. 혹시 무슨노래 들으세요?</h2>
        <div>
          <button id="lpbu" @click="startpageEnd('1','2')">뉴진스의 하입보이요~!</button>
        </div>
        <div>
          <button id="lpbu" @click="startpageEnd('1','2')">네...네?? 죄송해요 ㅠ</button>
        </div>
        <div>
          <button id="lpbu" @click="startpageEnd('1','2')">도민준중....</button>
        </div>
        <br/>
    </div>

      <!-- 문제 페이지 2 -->
      <div id="main-page2">
        <h1>2/6</h1>
        <h2>야 나 오늘 뽀로로랑 맞짱 깟음 ㅠㅠ</h2>
        <div>
          <button id="lpbu" @click="startpageEnd('2','3')">ㅄ</button>
        </div>
        <div>
          <button id="lpbu" @click="startpageEnd('2','3')">왜그랬닝...ㅠ</button>
        </div>
        <div>
          <button id="lpbu" @click="startpageEnd('2','3')">내가 자리한번 만들어볼테니 다시 애기해보자.</button>
        </div>
        <br/>
    </div>

      <!-- 문제 페이지 3 -->
      <div id="main-page3">
        <h1>3/6</h1>
        <h2>포비 이새끼 왜이리 둔하고 싸가지 없노 ㅇㅈ??</h2>
        <div>
          <button id="lpbu" @click="startpageEnd('3','4')">대신 귀엽잖아~</button>
        </div>
        <div>
          <button id="lpbu" @click="startpageEnd('3','4')">덩치크고 멋있기만 하던뎅 ㅎ</button>
        </div>
        <div>
          <button id="lpbu" @click="startpageEnd('3','4')">나도 좀 그런생각 있긴한디 ㅋ</button>
        </div>
        <br/>
    </div>

        <!-- 문제 페이지 4 -->
      <div id="main-page4">
        <h1>4/6</h1>
        <h2>아 쉬바 굿즈 존나 안팔리노... 해결방법 구하노 ㅇㄱㅇ</h2>
        <div>
          <button id="lpbu" @click="startpageEnd('4','5')">니가 발품을 팔아 등신루피년아</button>
        </div>
        <div>
          <button id="lpbu" @click="startpageEnd('4','5')">난 이런거에 끼고싶지않아..</button>
        </div>
        <div>
          <button id="lpbu" @click="startpageEnd('4','5')">요새 트렌드를 잘 연구해보자.</button>
        </div>
        <br/>
    </div>

     <!-- 문제 페이지 5 -->
      <div id="main-page5">
        <h1>5/6</h1>
        <h2>뽀로로한테 고백으로 혼쭐내고 싶은데 어떻게 할까?</h2>
        <div>
          <button id="lpbu" @click="startpageEnd('5','6')">나는솔로나 처 나가라</button>
        </div>
        <div>
          <button id="lpbu" @click="startpageEnd('5','6')">난 모솔이라 ㅠㅠ</button>
        </div>
        <div>
          <button id="lpbu" @click="startpageEnd('5','6')">데이트신청 ㄱㄱ</button>
        </div>
        <br/>
    </div>
 
    <!-- 문제 페이지 6 -->
      <div id="main-page6">
        <h1>6/6</h1>
              <h2>나 내일 약속좀 늦을거 같은데 ㄱㅊ?</h2>
              <div>
          <button id="lpbu" @click="resultEnd()"><router-link to="/result">코리안타임 ㅅㅂ</router-link></button>
        </div>
        <div>
          <button id="lpbu" @click="resultEnd()"><router-link to="/result">응... 알겠옹</router-link></button>
        </div>
        <div>
          <button id="lpbu" @click="resultEnd()"><router-link to="/result">약속은 지켜야지 루피야ㅠㅠ</router-link></button>
        </div>
        <br/>
    </div>
</template>

<script lang="ts">
import { Options, Vue } from 'vue-class-component';


@Options({
    name : 'TheContents',
    data (){
      return {
        checkedValues:[] //선택된 값 세팅
      }
    },
    methods: {
      //체크박스 중복체크방지
      clickFunc(event : any) {
          for(let i=0; i<this.checkedValues.length;i++){
            if(this.checkedValues[i] !== event.target.value){
            this.checkedValues.splice(i,1);
            }
          }
        },    

      //컨텐츠 변경 
      startpageEnd(fir : String, sec : String){
        let miPageFir = document.getElementById("main-page" + fir) as any;
        let miPageSec = document.getElementById("main-page" + sec) as any;
        miPageFir.style.display = "none";
        miPageSec.style.display = "block";
    },resultEnd(){
      let miPageFir = document.getElementById("main-page6") as any; 
      miPageFir.style.display = "none";
    }
        
    }
    
})
export default class TheContents extends Vue {}

</script>

<style>
#main-page1 {
    text-align: center;
    display: block;
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
h1{
  font-weight: bolder;
  margin-bottom: 50px;
}
h2{
  font-weight: bolder;
  margin-bottom: 50px;
}
input {
  text-align: right;
}
#lpbu{
  width: 500px;
  height: 80px;
  margin-bottom: 30px;
  font-size: 20px;
  font-weight: bolder;
  border-radius: 5px;
  border-width: 5px 5px;
  border-color: black black;
}

</style>