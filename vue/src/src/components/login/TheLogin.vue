<template>
  <div >
  <h1>로그인 폼</h1>
  <form>
    <p><input  placeholder="아이디 혹은 이메일" v-model="id"></p>
    <p><input  placeholder="비밀번호"          v-model="password"></p>
  </form>
  <button @click="goLogin()">로그인</button>
</div>
<button>{{jsresult[0].id}}</button>
</template>

<script>
import axios from 'axios'
import router from '@/router'
export default {
    
    name : 'TheLogin',
    
    data(){
    return {
      id : '',
      password : '',
      jsresult : [{}],

      logSess : ''
      
     }
    },
    
    methods :{
      // 로그인 function 
      goLogin(){
        axios.post('http://localhost:8081/goLogin',{
          id : this.id, // 유저 아이디
          password : this.password //유저 비밀번호
            }
         )
        .then(result=>{ //성공 콜백
           console.log(result)
          this.jsresult = result.data
            alert('로그인성공!')
            //로그인 세션값
            sessionStorage.setItem()
            router.push("/") 
        }).catch(errResult=> { //실패 콜백
          alert("fail!!" + errResult)
       })
       }

    }
}
</script>

<style>
</style>