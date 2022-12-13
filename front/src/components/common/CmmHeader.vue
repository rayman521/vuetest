<template>
  <header>
    <p id="lp_p">루피와 함께하는 MBTI</p>
    
  </header>
</template>

<script lang="ts">
import { Options, Vue } from 'vue-class-component';

@Options({
    name : 'CmmHeader'
})
export default class CmmHeader extends Vue {}

</script>

<style>
header {
  background-color: palevioletred;  
  height: 60px;
  margin-bottom: 10px;
  text-align: center;
  padding: 13px;
  font-size: 25px;
}
#lp_p {
    color: aliceblue;
    font-style: impact;
}
</style>