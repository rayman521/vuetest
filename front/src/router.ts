import { createWebHistory, createRouter } from "vue-router";

import TheContents from './components/view/TheContents.vue'

const routes = [
  {
    // 컨텐츠 뷰
    path: "/list",
    component: TheContents,
  }
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router; 