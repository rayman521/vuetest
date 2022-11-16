<template>
  <img alt="Vue logo" src="./assets/logo.png">
 
  <TheHeaderVue></TheHeaderVue>

</template>

<script>
import TheHeaderVue from './components/common/TheHeader.vue';


export default {
  name: 'App',
  components: {
  TheHeaderVue
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
