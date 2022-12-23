<template>
     <div id="result-page">
        <img src="@/assets/lp02.png" id="rsimg">
        <h1>ESTP - 싸가지없는 루피</h1>
        <textarea id="result" cols="50" rows="10">
        분위기를 고조시키는 우호적인 성격.
        주로 FACT 폭격기 역활을 하면서 MZ세대의
        특징을 다가지고 있음. 재미는 있지만,
        사회생활은 잘모르겠음...
    </textarea>
    </div>
</template>

<script>
export default {
    component : 'TheResult'
}
</script>

<style>
#result-page {
    text-align: center;
    display: block;
}
#result {
  border-radius: 5px;
  border-width: 5px 5px;
  border-color: black black;
  font-weight: bolder;
  font-size: 16;
}
#rsimg {
    margin-bottom: 30px;
}
</style>