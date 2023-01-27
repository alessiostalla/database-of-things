import { createApp } from 'vue'
import { createI18n } from 'vue-i18n'
import { createPinia } from 'pinia'

import App from './App.vue'
import router from './router'

import './assets/main.css'
import {messages} from "@/messages";
import VueGeolocation from "vue3-geolocation";

const app = createApp(App)

app.use(createPinia())
app.use(router)
app.use(VueGeolocation);
app.use(createI18n({
    locale: 'it',
    fallbackLocale: 'en',
    messages,
}));
app.mount('#app')
