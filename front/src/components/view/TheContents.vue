<template>
  <table>
 <div id="no1">
    <h2>1/12</h2> 
      <br/>
       <h4>1. 루피가 당신에게 놀러가고 부탁한다. 나의 반응은?</h4>   
     <br/>
  <form name="form1">
    <input type="checkbox"  value="1" name="chk" v-model="checkedValues" @change="clickFunc" :true-value="yes" :false-value="no">1. 도망가장!
    <input type="checkbox"  value="2"  name="chk" v-model="checkedValues" @change="clickFunc">2. 따라간닷!
    <input type="checkbox"  value="3"  name="chk" v-model="checkedValues" @change="clickFunc">3. 도민준중....
  </form>
<button>다음</button>
  </div>
</table>
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
      //체크박스 중복체크
      clickFunc(event : any) {
          for(let i=0; i<this.checkedValues.length;i++){
            if(this.checkedValues[i] !== event.target.value){
            this.checkedValues.splice(i,1);
            }
          }
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