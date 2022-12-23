import { createWebHistory, createRouter } from "vue-router";

import TheContents from './components/view/TheContents.vue'
import TheResult from './components/view/TheResult.vue'
const routes = [
  {
    // 컨텐츠 뷰
    path: "/content",
    component: TheContents,
  },
  {
    // Result View 
    path: "/result",
    component: TheResult,
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router; 