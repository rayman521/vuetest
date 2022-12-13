<template>
<CmmHeaderVue></CmmHeaderVue>
<div v-if="mainDelete == false">
<img alt="loopie" src="./assets/loopie.jpg">
<button @click="changeDelete()"><router-link to="/list">시작하기!</router-link></button>
</div>
<router-view></router-view>
<CmmFooterVue></CmmFooterVue>
</template>

<script lang="ts">


import { Options, Vue } from 'vue-class-component';
import CmmHeaderVue from './components/common/CmmHeader.vue';
import CmmFooterVue from './components/common/CmmFooter.vue';

@Options({
  components: {
    CmmHeaderVue,
    CmmFooterVue
  },data() {
    return {
      mainDelete : false
    }
  },methods :{
    changeDelete(){
      this.mainDelete = true;
    }
    //바운딩 순서... window.onload 의 역활 함 
  },created (){
    const crUrl = window.location.href; // 현재 url 
      const mainUrl = 'http://localhost:8080/'; // 메인화면 url
      
      if(crUrl != mainUrl){
        this.mainDelete = true;
      } 
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
</style>
