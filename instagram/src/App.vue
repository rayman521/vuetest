<template>
<div class="header">
    <ul class="header-button-left">
      <li>Cancel</li>
    </ul>
    <ul class="header-button-right">
      <li v-if="step == 1" @click="step++">Next</li>
      <li v-if="step == 2" @click="step = 0;">발행</li>
    </ul>
    <img src="./assets/logo.png" class="logo" />
  </div>

  <TheContainer v-bind:poList ="postList" v-bind:step="step" v-bind:imgUrl="imgUrl" @content="publish"/>

  <button @click="addContents()">더보기</button>
  <div class="footer">
    <ul class="footer-button-plus">
      <input type="file" accept="image/*" @change="upload" id="file" class="inputfile" />
      <label for="file" class="input-plus">+</label>
    </ul>
 </div>

<!-- <div v-if="step == 1">내용1</div>
<div v-if="step == 2">내용2</div>
<div v-if="step == 3">내용3</div>
<button @click="gostep(1)">버튼1</button>
<button @click="gostep(2)">버튼2</button>
<button @click="gostep(3)">버튼3</button>
<div></div>
<div style="margin-top: 500px;"></div> -->

</template>
<script>
import TheContainer from './components/TheContainer.vue';
import axios from 'axios';
import postdata from './postdata'

export default {
  name: 'App',
  components: {
    TheContainer,
  },
  data() {
    return {
      imgUrl : "",
      step : 0,
      postList : postdata,
      getPost : ''
    }
  },methods : {
    addContents(){
        axios.get(`https://codingapple1.github.io/vue/more`+this.int+`.json`)
      .then( result => {
        console.log('성공 : ' + result.data)
        this.postList.push(result.data)
        this.int++;
       }).catch(fail=>{
        alert('실패 : ' + fail)
       })
    },
    gostep(num){
      this.step = num;
    },upload(event){
      let file = event.target.files;
      console.log(file[0]);
      let url = URL.createObjectURL(file[0]);
      console.log(url);
      this.imgUrl = url;
      this.step++;
    },
    publish(rs){
      console.log(rs);
      let addPost = {
        name: "Kim Hyun",
          userImage: "https://placeimg.com/100/100/arch",
          postImage: this.imgUrl,
          likes: 36,
          date: "May 15",
          liked: false,
          content: rs,
          filter: "perpetua"
      };
      this.postList.unshift(addPost);
      this.step = 0;
    },

  }
}
</script>

<style>
body {
  margin: 0;
}
ul {
  padding: 5px;
  list-style-type: none;
}
.logo {
  width: 22px;
  margin: auto;
  display: block;
  position: absolute;
  left: 0;
  right: 0;
  top: 13px;
}
.header {
  width: 100%;
  height: 40px;
  background-color: white;
  padding-bottom: 8px;
  position: sticky;
  top: 0;
}
.header-button-left {
  color: skyblue;
  float: left;
  width: 50px;
  padding-left: 20px;
  cursor: pointer;
  margin-top: 10px;
}
.header-button-right {
  color: skyblue;
  float: right;
  width: 50px;
  cursor: pointer;
  margin-top: 10px;
}
.footer {
  width: 100%;
  position: sticky;
  bottom: 0;
  padding-bottom: 10px;
  background-color: white;
}
.footer-button-plus {
  width: 80px;
  margin: auto;
  text-align: center;
  cursor: pointer;
  font-size: 24px;
  padding-top: 12px;
}
.sample-box {
  width: 100%;
  height: 600px;
  background-color: bisque;
}
.inputfile {
  display: none;
}
.input-plus {
  cursor: pointer;
}
#app {
  box-sizing: border-box;
  font-family: "consolas";
  margin-top: 60px;
  width: 100%;
  max-width: 460px;
  margin: auto;
  position: relative;
  border-right: 1px solid #eee;
  border-left: 1px solid #eee;
}
</style>
