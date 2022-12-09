<template>
 
  <!-- 헤더 부분 -->
  <TheHeaderVue></TheHeaderVue>
  <!-- 헤더 부분 -->

  
  <!-- 풋터 부분 -->
  <TheFooterVue></TheFooterVue>
  <!-- 풋터 부분 -->
  
</template>

<script>
import TheHeaderVue from './components/common/TheHeader.vue';
import TheFooterVue from './components/common/TheFooter.vue';

export default {
  name: 'App',
  components: {
  TheHeaderVue,
  TheFooterVue
  }
}
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
