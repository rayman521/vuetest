<template>
  <table>
    <div id="no1">
     <h2>1/12</h2> 
     <br/>
    <h4>1. 루피가 당신에게 놀러가고 부탁한다. 나의 반응은?</h4>   
    <br/>
<form name="form1">
<div class="form-check form-check-inline">
  <input class="form-check-input" type="checkbox" id="chk1" value="1" v-model="checkedValues1"  @click="setCheckBoxAsRadio(this);">
  <label class="form-check-label" for="chk">a. 좋아 좋아!</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="checkbox" id="chk2" value="2" v-model="checkedValues1"  @click="setCheckBoxAsRadio(this);">
  <label class="form-check-label" for="chk">b. 시른디....</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="checkbox" id="chk3" value="3" v-model="checkedValues1"  @click="setCheckBoxAsRadio(this);">
  <label class="form-check-label" for="chk">c. 도민준좀...</label>
</div>
</form>
</div>

</table>
</template>

<script lang="ts">
import { Options, Vue } from 'vue-class-component';


@Options({
    name : 'TheContents',
    data (){
      return {
        checkedValues1:[] //선택된 값 세팅
      }
    },
    methods: {
      setCheckBoxAsRadio(event : Element) {
         const checkbox1 =  document.getElementById('chk1') as HTMLInputElement;
        // const checkbox2 =  document.getElementById('chk2') as HTMLInputElement ;
        // const checkbox3 =  document.getElementById('chk3') as HTMLInputElement ;
         
         for(var i=0; i<checkbox1.length; i++){
            if(checkbox1[i] != event){
                checkbox1[i].checked = false;
            }
         }

        //console.log(checkbox1.checked)
          
          
        },
    }
    
})
export default class TheContents extends Vue {}

</script>

<style>
#no1{
  margin-top: 10px;
    padding: 170px;
    text-align: center;
    margin-left: 180px;
    background-color: white;
}

</style>