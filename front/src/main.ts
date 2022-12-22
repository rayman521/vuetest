import 'bootstrap' // 부트스트랩 설정 
import 'bootstrap/dist/css/bootstrap.min.css'
import { createApp } from 'vue'
import App from './App.vue'
import router from './router' // 라우터 설정
import store from '@/store/store'

createApp(App).use(router).use(store).mount('#app')
