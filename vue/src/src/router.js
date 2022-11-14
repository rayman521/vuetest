import { createWebHistory, createRouter } from "vue-router";
import TheBoard from './components/board/TheBoard.vue'
import TheQandA from './components/board/TheQandA.vue'
import TheMain from './components/TheMain.vue'
import TheBDetail from './components/board/TheBDetail.vue'
import TheLogin from './components/login/TheLogin.vue'


const routes = [
  {
    path: "/",
    component: TheMain,
  },
  {
    path: "/board",
    component: TheBoard,
  },
  {
    path: "/qanda",
    component: TheQandA,
  },
  {
    path: "/bdetail",
    component: TheBDetail,
  },
  {
    path: "/Login",
    component: TheLogin,
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router; 