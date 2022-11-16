<!-- Header -->
<template>

  <ul id="title" class="nav nav-tabs">
   <li class="nav-item">
      <a class="nav-link" href="#"><router-link to="/">IT blog</router-link></a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#"><router-link to="/board">공부 게시판</router-link></a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#"><router-link to="/qanda">Q & A</router-link></a>
    </li>
    <li class="nav-item">
      <a class="nav-link disabled">추억 게시판</a>
    </li>
    <li class="nav-item" >
      <a class="nav-link" href="#"><router-link to="/Login">로그인</router-link></a>
    </li>
  </ul>
  
      <!-- <form class="d-flex" style="margin-top: 100px; margin-bottom: 30px; margin-left: 32%;">
          <input class="form-control me-sm-2" type="text" placeholder="검색하세요!" style="width: 50%;">
          <button class="btn btn-secondary my-2 my-sm-0" type="submit">검색</button>
        </form> -->
  </template>
  
  <script>
  export default {
      name : 'TheHeader'
  }
  </script>
  
  <style>
  #title{
    text-decoration: none;
    color: black;
    font-weight: bold;
   position: fixed;
    top: 0;
    left: 0;
    right: 0; 
  }
  </style>