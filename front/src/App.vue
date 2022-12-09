<template>
  <Cmmheader></Cmmheader>
   <img id="img_loopie" alt="Vue logo" src="./assets/loopie.jpg">
   <button id="bt_loopie" type="button" class="btn btn-secondary btn-lg">시작!</button>
   <Cmmfooter></Cmmfooter>
</template>

<script>
import Cmmheader from './components/CmmHeader.vue'
import Cmmfooter from './components/CmmFooter.vue'

export default {
  name: 'App',
  components: {
    Cmmheader,
    Cmmfooter
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
  
}
#bt_loopie {
  margin-top: 10px;
 background-color : palevioletred;
}
#img_loopie {
 background-color : palevioletred;
 height: 470px;
}
</style>
