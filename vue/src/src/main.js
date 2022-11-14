import 'bootstrap'
import 'bootstrap/dist/css/bootstrap.min.css'
import { createApp } from 'vue'
import App from './App.vue'
import router from './router.js' // 라우터 사용

createApp(App).use(router).mount('#app')
