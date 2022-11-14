<template>
<input style="width: 263px;" v-model="title">
<input style="width: 263px;" v-model="comment">
<button @click="insert()">gdgd</button>
</template>
<script>

import axios from 'axios'
export default {
    name : 'TheBDetail',
    components: {
    },
    data(){
    return {
      title : '',
      comment : ''
     }
    },
    methods : {
    insert(){

      axios.post('http://localhost:8081/insert',{
       title : this.title,
       comment : this.comment
      }
       )
      .then(result=>{
        console.log("success!!" + result)
      }).catch(errResult=> {
        alert("fail!!" + errResult)
      })
    

    }
}
}
</script>

<style>
a { 
    text-decoration: none;
    color: black;
    font-size: bold;
}
#boardTb {
    width: 750px;
    margin-left:auto;
    margin-right:auto;
}
#boardTy{
    border-color: black;
}

</style>