<template>
<div>
<table id="boardQa" class="table table-bordered border-primary">
    <strong style="margin-top: 30px;">공부 게시판</strong>
        <colgroup>
            <col width=20%>
            <col width=60%>
            <col width=30%>
        </colgroup>
        <tbody id="boardTy">
        <tr>
            <th>순서</th>
            <th>제목</th>
            <th>날짜</th>
        </tr>
        <tr>
            <th>1</th>
            <td>석봉</td>
            <td>29</td>
        </tr>
        <tr>
            <th>2</th>
            <td>시봉</td>
            <td>29</td>
        </tr>
        <tr>
            <th>2</th>
            <td>시봉</td>
            <td>29</td>
        </tr>
        <tr>
            <th>2</th>
            <td>시봉</td>
            <td>29</td>
        </tr>
        <tr>
            <th>2</th>
            <td>시봉</td>
            <td>29</td>
        </tr>
        <tr>
            <th>2</th>
            <td>시봉</td>
            <td>29</td>
        </tr>
        <tr>
            <th>2</th>
            <td>시봉</td>
            <td>29</td>
        </tr>
        <tr>
            <th>2</th>
            <td>시봉</td>
            <td>29</td>
        </tr>

    </tbody>
    </table>
    <nav aria-label="Page navigation example">
  <ul class="pagination" style="justify-content: center;">
    <li class="page-item"><a class="page-link" href="#">이전</a></li>
    <li class="page-item"><a class="page-link" href="#">1</a></li>
    <li class="page-item"><a class="page-link" href="#">2</a></li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item"><a class="page-link" href="#">다음</a></li>
  </ul>
    </nav>
</div>
</template>
<script>


export default {
    name : 'TheBoard',
    components: {
},
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