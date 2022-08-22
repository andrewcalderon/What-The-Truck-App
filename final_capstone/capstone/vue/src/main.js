import Vue from 'vue'
import App from './App.vue'
import router from './router/index'
import store from './store/index'
import axios from 'axios'
import VueGeoLocation from 'vue-browser-geolocation'
import * as VueGoogleMaps from 'vue2-google-maps'

Vue.config.productionTip = false
Vue.use(VueGeoLocation)
Vue.use(VueGoogleMaps, {
  load: {
    key: 'AIzaSyCuwoP51kexUiwZzaorjVurx77yup8wDJc',
    libraries: "places"
  },
  installCompenents: false
})

axios.defaults.baseURL = process.env.VUE_APP_REMOTE_API;


new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
