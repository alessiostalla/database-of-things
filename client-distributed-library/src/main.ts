import { createApp } from 'vue'
import { createI18n } from 'vue-i18n'
import { createPinia } from 'pinia'

import App from './App.vue'
import router from './router'

import './assets/main.css'
import {messages} from "@/messages";

const app = createApp(App)

app.use(createPinia())
app.use(router)
app.use(createI18n({
    locale: 'it',
    fallbackLocale: 'en',
    messages,
}));



app.mount('#app')
