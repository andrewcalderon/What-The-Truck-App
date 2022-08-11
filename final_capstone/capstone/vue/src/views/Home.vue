<template>
  <div class="home">
    <map-component />
    <title-bar/>
    <truck-list/>
  </div>
</template>

<script>
import MapComponent from "@/components/MapComponent.vue"
import TitleBar from "@/components/TitleBar.vue"
import TruckList from "@/components/TruckList.vue";
export default {
  name: "home-display",
  components: {
    MapComponent,
    TitleBar,
    TruckList
  }
};
</script>
