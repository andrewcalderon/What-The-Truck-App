<template>
  <div id="app">
    <div id="nav">
      <title-bar></title-bar>
    </div>
    <router-view />
  </div>
</template>

<script>
import TitleBar from "@/components/TitleBar.vue"

export default {
  name: "app",
  components: {
    TitleBar
  },
  import: '@/assets/menu.js'
}
</script>

<style>
</style>
