<template>
	<div id="gallery-page">
		<div class="nav-bar-area">
			<div class="the-logo">
				<p id="logo-font">What The Truck!</p>
				<div class="logo">
					<font-awesome-icon icon="fa-solid fa-truck-field" />
				</div>
				<!-- <div id="red-truck" class="fa-solid fa-truck-field"></div> -->
			</div>

			<!-- <div id="menu-bar" class="fas fa-bars"></div> -->
			<nav class="navbar-links">
				<router-link v-bind:to="{ name: 'home' }">
					<a class="nav-bar-buttons" href="#home">Home</a>
				</router-link>
				<router-link v-bind:to="{ name: 'gallery' }">
					<a class="nav-bar-buttons" href="#gallery">Gallery</a>
				</router-link>
				<router-link v-bind:to="{ name: 'FoodTruckForm' }">
					<a class="nav-bar-buttons" href="#MyTruck">My Truck</a>
				</router-link>
				<router-link v-bind:to="{ name: 'login' }">
					<a class="nav-bar-buttons" href="#signup">Login/Signup</a>
				</router-link>
			</nav>
		</div>
		<div class="container">
			<div class="image-container">
				<div class="image">
					<img src="../images/image1.jpeg" alt="" />
				</div>
				<div class="image">
					<img src="../images/foodimg-1.jpeg" alt="" />
				</div>
				<div class="image">
					<img src="../images/image2.jpeg" alt="" />
				</div>
				<div class="image">
					<img src="../images/foodimg-2.jpeg" alt="" />
				</div>
				<div class="image">
					<img src="../images/image3.jpeg" alt="" />
				</div>
				<div class="image">
					<img src="../images/foodimg-3.jpeg" alt="" />
				</div>
				<div class="image">
					<img src="../images/image4.jpeg" alt="" />
				</div>
				<div class="image">
					<img src="../images/foodimg-4.jpeg" alt="" />
				</div>
				<div class="image">
					<img src="../images/image5.jpeg" alt="" />
				</div>
				<div class="image">
					<img src="../images/foodimg-5.jpeg" alt="" />
				</div>
				<div class="image">
					<img src="../images/image6.jpeg" alt="" />
				</div>
				<div class="image">
					<img src="../images/foodimg-6.jpeg" alt="" />
				</div>
				<div class="image">
					<img src="../images/image7.jpeg" alt="" />
				</div>
				<div class="image">
					<img src="../images/foodimg-7.jpeg" alt="" />
				</div>
				<div class="image">
					<img src="../images/image8.jpeg" alt="" />
				</div>
				<div class="image">
					<img src="../images/foodimg-8.jpeg" alt="" />
				</div>
				<div class="image">
					<img src="../images/image9.jpeg" alt="" />
				</div>
				<div class="image">
					<img src="../images/foodimg-9.jpeg" alt="" />
				</div>
				<div class="image">
					<img src="../images/image10.jpeg" alt="" />
				</div>
				<div class="image">
					<img src="../images/foodimg-10.jpeg" alt="" />
				</div>
			</div>

			<div class="popup-imag">
				<span>&times;</span>
			</div>
		</div>
	</div>
</template>

<script>
	export default {
		name: "gallery",
	}
</script>

<style>
	* {
		margin: 0;
		padding: 0;
		box-sizing: border-box;
	}

	.nav-bar-area {
		background: white;
		height: 12%;
		position: fixed;
		top: 0;
		left: 0;
		right: 0;
		z-index: 10;
		display: flex;
		align-items: center;
		justify-content: space-between;
		box-shadow: 0 0.5rem 1rem rgba(0, 0, 0, 0.1);
		padding: 0 9vw;
	}

	#login-area {
		display: flex;
		align-items: center;
		flex-direction: column;
		justify-content: center;
		width: 100%;
		min-height: 100%;
		padding: 20px;
	}

	.the-logo {
		display: flex;
		height: 100%;
	}

	#logo-font {
		font-size: 2.4rem;
		text-decoration: none;
		text-transform: capitalize;
		font-weight: 400;
		color: #666;
		font-family: "DynaPuff", cursive;
		height: 100%;
		margin: 0;
		padding-top: 20px;
	}

	.logo {
		font-size: 2.5rem;
		color: red;
	}

	.logo svg {
		color: red;
		fill: #fff;
		padding-top: 25px;
		padding-left: 10px;
		/* width: 24px;
	height: 24px;
	padding: 10px; */
	}

	.td-icons svg {
		color: green;
		fill: white;
	}

	/* svg path {
    height: 100px;
} */

	#nav-bar-search {
		width: 300px;
		height: 44px;
		display: flex;
		text-align: center;
		flex-direction: row;
		align-items: center;
		border-radius: 5px;
		background-color: rgb(208, 204, 204);
	}

	#nbs-input {
		width: 80%;
		border: none;
		background-color: rgb(208, 204, 204);
	}

	#nbs-input::placeholder {
		color: white;
		font-size: 1.1rem;
		text-indent: 10px;
	}

	#nbs-button {
		width: 20%;
		border: none;
		background-color: rgb(208, 204, 204);
		font-size: 0.6rem;
	}

	.nav-bar-buttons {
		font-family: "Nunito", sans-serif;
		font-size: 1.2rem;
		margin-left: 2rem;
		color: #666;
		text-decoration: none;
	}

	.container {
		position: relative;
		min-height: 100vh;
		background-color: #ddd;
		margin-top: 75px;
	}

	.container h1 {
		font-size: 40px;
		font-family: Verdana, Geneva, Tahoma, sans-serif;
		font-weight: normal;
		padding: 15px;
		color: #333;
		text-align: center;
		text-transform: capitalize;
	}

	.container .image-container {
		display: flex;
		flex-wrap: wrap;
		gap: 15px;
		justify-content: center;
		padding: 10px;
	}

	.container .image-container .image {
		height: 250px;
		width: 350px;
		border: 10px solid #fff;
		box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);
		overflow: hidden;
		cursor: pointer;
	}

	.container .image-container .image img {
		height: 100%;
		width: 100%;
		object-fit: cover;
		transition: 0.2s linear;
	}

	.container .image-container .image:hover img {
		transform: scale(1.1);
	}

	.container .popup-image {
		position: fixed;
		top: 0;
		left: 0;
		background: rgba(0, 0, 0, 0.9);
		height: 100%;
		width: 100%;
		z-index: 100;
		display: none;
	}

	.container .popup-image span {
		position: absolute;
		top: 0;
		right: 10px;
		font-size: 40px;
		font-weight: bolder;
		color: #fff;
		cursor: pointer;
		z-index: 100;
	}

	.container .popup-image img {
		position: absolute;
		top: 50%;
		left: 50%;
		transform: translate(-50%, -50%);
		border: 5px solid #fff;
		border-radius: 5px;
		width: 750px;
		object-fit: cover;
	}

	@media (max-width: 768px) {
		.container .popup-image img {
			width: 95%;
		}
	}
</style>
