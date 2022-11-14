<template>
<TheHeader></TheHeader>

<!-- router에서 보여지는 부분-->
<router-view></router-view>
<!-- router에서 보여지는 부분-->


 <!-- <button @click="getAxios()">API test 가져와</button>
<button>{{jsres[0].age}}</button>  -->

</template>


<script>
import axios from 'axios'
import TheHeader from './components/common/TheHeader.vue'
export default {
  name: 'App',
  components: {
    TheHeader,
  }, 
  data (){
    return{
      jsres : [{}]
    }
  },
  methods :{
    getAxios(){
      axios({
        url : 'http://localhost:8081/test',
        method : 'get',
        data : {
        }
      })
      .then(result=>{
        this.jsres =  result.data
          console.log(this.jsres);
      }).catch(errResult=> {
        alert(errResult)
      })
    }
  },
  
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
a {
  text-decoration: none;
  color: black;
}
</style>
