<template>
  <div>
    <div v-if="step == 0">
  <ThePost :poList="poList[i]" v-for="(a,i) in poList" :key="i"/>
  </div>
  
  <div v-if="step == 1">
<div style="height:380px;" class="upload-image" :style="{ backgroundImage : `url(${imgUrl})`}">파일업로드시1</div>
  <div class="filters">
    <div class="filter-1"></div>
    <div class="filter-1"></div>
    <div class="filter-1"></div>
    <div class="filter-1"></div>
    <div class="filter-1"></div>
  </div>
</div>

<div v-if="step == 2">
    <div class="upload-image" style="height:380px;" :style="{ backgroundImage : `url(${imgUrl})`}"></div>
      <div class="write">
        <textarea class="write-box" @change="addpost($event.target.value)">wirte!</textarea>
      </div>
    </div>

</div>
</template>

<script>
import ThePost from './ThePost.vue';

export default {
    name : 'TheContainer',
    components :{
    ThePost
    },
    props : {
        poList : Array,
        step : Number,
        imgUrl : String
    },
    data(){
      return{
        
      }
    },methods : {
      //글추가
      addpost(rs){
        this.$emit('content',rs)
      }
    }
}
</script>

<style>

</style>