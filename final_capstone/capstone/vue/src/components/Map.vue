<template>
  <div>
    <!-- <div style="display: flex; align-items: center; justify-content: space-between">
        <div>
            <h1>Your coordinates:</h1>
            <p>{{ myCoordinates.lat }} Latitude, {{ myCoordinates.lng }} Longitude</p>
        </div>
        <div>
            <h1>Map coordinates:</h1>
            <p>{{ mapCoordinates.lat }} Latitude, {{ mapCoordinates.lng}} Longitude</p>
        </div>
    </div> -->
    <!-- <button @click="addMarker">
        add markers
    </button> -->
    <GmapMap
        :center="myCoordinates"
        :zoom="zoom"
        style="width:640px; height:360px; margin: 32px auto;"
        ref="mapRef"
        @dragend="handleDrag"
        >
        <gmap-marker
        :key="index"
        v-for="(m, index) in markers"
        :position="m.position"

        >
        </gmap-marker>
        </GmapMap>
</div>
</template>

<script>

export default {
    name: 'Map',
    data() {
        return {
            map: null,
            myCoordinates: {
                lat: 10,
                lng: 10
            },
            zoom: 7,
            currentPlace: null,
            markers: [],
            // places: []
        }
    },

    created() {
        //check if user has saved center
        if(localStorage.center) {
            this.myCoordinates = JSON.parse(localStorage.center)
        } else {
        //get user's coordinates
        this.$getLocation({})
        .then(coordinates => {
            this.myCoordinates = coordinates;
        })
        .catch(error => alert(error));
        }

        //check if user has saved zoom
        if(localStorage.zoom) {
            this.zoom = parseInt(localStorage.zoom);
        }  
    },
    mounted() {
      //add the map to a data object
      this.$refs.mapRef.$mapPromise.then(map => this.map = map);
    //   this.geolocate();
      this.addMarker()
    },
    methods: {
        addMarker() {
            const marker = {
                lat: this.myCoordinates.lat, 
                lng: this.myCoordinates.lng};
            this.markers.push({position: marker});
            this.center = marker;
            // this.currentPlace = null;
        },
        // geolocate: function() {
        //     navigator.geolcation.getCurrentPostion(this.myCoordinates)
        //},
        // setPlace(place) {
        //     this.currentPlace = place;
        //},
        //get center and zoom level, store that info
        handleDrag() {
            let center = {
                lat: this.map.getCenter().lat(),
                lng: this.map.getCenter().lng()
            };
            let zoom = this.map.getZoom();

            localStorage.center = JSON.stringify(center);
            localStorage.zoom = zoom;
        },

    },
    computed: {
        mapCoordinates() {
            if(!this.map) {
                return {
                    lat: 0,
                    lng: 0
                };

            }

            return {
                lat: this.map.getCenter().lat().toFixed(4),
                lng: this.map.getCenter().lng().toFixed(4)
            }
        }
    },


}
</script>

<style>

</style>