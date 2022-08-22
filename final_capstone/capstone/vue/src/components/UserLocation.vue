<template>
	<!-- <section class="ui two column centered grid">
		<div class="column">
			<form class="ui segment large form">
				<div class="field">
					<div class="ui right icon input large">
						<input
							type="text"
							placeholder="Enter your location"
							v-model="address"
							ref="autocomplete"
						/>
						<i class="dot circle link icon" @click="locatorButtonPressed"></i>
					</div>
				</div>
			</form>
		</div>
	</section> -->
	<section class="container">
		<div class="ui icon big input" id="location-input-section">
			<input type="text" placeholder="Enter Your Address" id="autocomplete" />
			<i
				aria-hidden="true"
				class="dot circle outline link icon"
				id="location-button"
			></i>
		</div>
	</section>
</template>
<script>
	import axios from "axios"
	export default {
		data() {
			return {
				address: "",
			}
		},
		methods: {
			locatorButtonPressed() {
				navigator.geolocation.getCurrentPosition(
					(position) => {
						this.getStreetAddressFrom(
							position.coords.latitude,
							position.coords.longitude
						)
						console.log(position.coords.latitude)
						console.log(position.coords.longitude)
					},
					(error) => {
						console.log(error.message)
					},

					(lat, long) => {
						var xhttp = new XMLHttpRequest()
						xhttp.onreadystatechange = function() {
							if (this.readyState == 4 && this.status == 200) {
								var address = JSON.parse(this.responseText)
								console.log(address.results[0].formatted_address)
							}
						}
						xhttp.open(
							"GET",
							"https://maps.googleapis.com/maps/api/geocode/json?latlng=" +
								lat +
								"," +
								long +
								"&key=AIzaSyDhZ4QNDMLoTL1wZGs_Q15OxKKLWRJBUHA",
							true
						)
						xhttp.send()
					}
				)
			},
		},
		async getStreetAddressFrom(lat, long) {
			try {
				var { data } = await axios.get(
					"https://maps.googleapis.com/maps/api/geocode/json?latlng=" +
						lat +
						"," +
						long +
						"&key={AIzaSyDhZ4QNDMLoTL1wZGs_Q15OxKKLWRJBUHA}"
				)
				if (data.error_message) {
					console.log(data.error_message)
				} else {
					this.address = data.results[0].formatted_address
				}
			} catch (error) {
				console.log(error.message)
			}
		},
	}
</script>

<style>
	.container {
		min-height: 100vh;
		width: 100%;
		display: flex;
		justify-content: center;
		align-items: center;
		text-align: center;
	}
</style>
