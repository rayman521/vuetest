<template>
 <footer>
    <p id="ft_P">문의 : rayman521@naver.com</p>
    
 </footer>
</template>

<script lang="ts">
import { Options, Vue } from 'vue-class-component';

@Options({
    name : 'CmmFooter'
})
export default class CmmFooter extends Vue {}

</script>

<style>
footer{
    margin-top: 10px;
    background-color: palevioletred; 
    height: 60px; 
    padding: 20px;
    text-align: center;
}
#ft_P {
    color: aliceblue;
}
</style>