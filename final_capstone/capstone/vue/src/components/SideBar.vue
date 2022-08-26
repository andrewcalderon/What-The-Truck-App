<template>
	<div id="side-bar-div">
		<div
			class="vertical-menu"
			v-for="foodtruck in foodtrucks"
			v-bind:key="foodtruck.name"
		>
			<!-- <a href="#" class="active"></a> -->
			<a href="#">
				<div class="truckdetails">
					<div class="td-words">
						<h6 class="foodtruck-name">{{ foodtruck.name }}</h6>
						<div class="food-type">
							<p class="food-type-p">Food Type:</p>
							<h6>{{ foodtruck.type }}</h6>
						</div>
						<button>Go Online</button>
						<button v-on:click="delete foodtruck.name">Delete</button>
					</div>

					<div class="td-icons">
						<font-awesome-icon icon="fa-solid fa-circle-check" />
					</div>
				</div>
			</a>
		</div>
	</div>
</template>

<script>
	import Foodtruck from "../services/FoodTruck.js"
	export default {
		name: "sidebar",
		data() {
			return { foodtrucks: [] }
		},
		created() {
			Foodtruck.list()
				.then((res) => {
					console.log(res)
					this.foodtrucks = res.data
				})
				.catch((err) => {
					console.error(err + " uh oh missing foodtrucks")
				})
		},
		methods: {
			delete(name) {
				Foodtruck.delete(name)
					.then((res) => {
						console.log(res)
					})
					.catch(function(error) {
						console.log(error.response)
					})
			},
		},
	}
</script>

<style>
	@import url("https://fonts.googleapis.com/css2?family=Nunito:wght@200;300;400;600;700&display=swap");

	#side-bar-div {
		position: relative;
		top: 77px;
	}

	.vertical-menu {
		font-family: "Nunito", sans-serif;
		width: 20%;
		height: 100%;
		/* margin-top: 86px; */
		overflow-y: scroll;
	}

	.vertical-menu a {
		background-color: #eee;
		color: black;
		display: block;
		padding: 12px;
		font-size: 1.3rem;
		text-decoration: none;
	}

	.truckdetails {
		display: flex;
	}

	.td-words {
		display: block;
		width: 100%;
		padding-left: 1vw;
	}

	.td-icons {
		display: flex;
		justify-content: flex-end;
		align-items: center;
		width: 100%;
		padding-right: 1vw;
	}

	.a-truckdetails {
		min-height: 76px;
	}

	.truckdetails i {
		color: green;
		font-size: 3rem;
		/* position: relative;
	left: 200px;
	bottom: 50px; */
		margin-bottom: 0px;
	}

	.vertical-menu a:hover {
		background-color: #ccc;
		color: var(--red);
	}

	.vertical-menu a.active {
		color: white;
	}

	.fa-solid {
		background: green;
		width: 20px;
		height: 20px;
	}

	.foodtruck-name {
		font-size: 1.11em;
	}

	.food-type {
		display: flex;
	}

	.food-type-p {
		font-size: 0.6em;
		margin-right: 4px;
		padding-right: 4px;
	}
</style>
