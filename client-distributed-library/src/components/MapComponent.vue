<script setup lang="ts">
import "leaflet"; //See https://github.com/vue-leaflet/vue-leaflet/issues/251#issuecomment-1356978564
import { LMap, LTileLayer, LControlLayers } from "@vue-leaflet/vue-leaflet";
import "leaflet/dist/leaflet.css";
import {onBeforeMount, ref} from "vue";
import VueGeolocation from "vue3-geolocation";

defineProps<{}>()
const zoom = ref(17);
const log = (it: any) => {
  console.log(it);
};
const location = ref({
  lat: 44.34850, lng: 9.23400
});
onBeforeMount(async () => {
  VueGeolocation.getLocation().then((coordinates: any) => {
    location.value = coordinates;
    console.log("User's location", coordinates);
  }).catch((error: any) => {
    console.log(error);
  });
});
</script>

<template>
  <div style="height: 75vh; width: 50vw;">
    <l-map
        v-model="zoom"
        v-model:zoom="zoom"
        :center="[location.lat, location.lng]"
        @move="log('move')"
    >
      <l-tile-layer
          url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
      ></l-tile-layer>
      <l-control-layers />
    </l-map>
  </div>
</template>

<style scoped>
h1 {
  font-weight: 500;
  font-size: 2.6rem;
  top: -10px;
}

h3 {
  font-size: 1.2rem;
}
</style>
