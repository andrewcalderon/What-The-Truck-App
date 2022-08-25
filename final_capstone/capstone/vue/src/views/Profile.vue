<template>
	<div id="profile-div">
		<!-- Everything below this is the NAV BAR -->
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
		<!-- Everything above this is the NAV BAR -->

		<!-- Everything below this is the PROFILE -->
		<br />

		<div id="truck-menu">
			<h1>My Truck</h1>
		</div>

		<div id="menu-img">
			<!-- <img src="../images/img-1.jpeg" alt="" />
			<img src="../images/img-2.jpeg" alt="" />
			<img src="../images/img-3.jpeg" alt="" />
			<img src="../images/img-6.jpeg" alt="" />
			<img src="../images/img-5.jpeg" alt="" /> -->
		</div>

		<div id="menu-info">
			<div class="profile-menu-head">
				<h2 class="profile-h2">Budae Jjigae (Army Stew)</h2>
				<h3 class="profile-h3">$12.99</h3>
			</div>
			<p class="profile-p">
				Budae-jjigae or spicy sausage stew is a type of Korean jjigae, made with
				ham, sausage, Spam, baked beans, kimchi, instant noodles, and gochujang.
				The dish was created shortly after the armistice that ended the Korean
				War, using the scrounged or smuggled surplus foods from U.S. military
				bases.
			</p>

			<div class="profile-menu-head">
				<h2 class="profile-h2">Budae Jjigae (Army Stew)</h2>
				<h3 class="profile-h3">$12.99</h3>
			</div>
			<p class="profile-p">
				Budae-jjigae or spicy sausage stew is a type of Korean jjigae, made with
				ham, sausage, Spam, baked beans, kimchi, instant noodles, and gochujang.
				The dish was created shortly after the armistice that ended the Korean
				War, using the scrounged or smuggled surplus foods from U.S. military
				bases.
			</p>

			<div class="profile-menu-head">
				<h2 class="profile-h2">Budae Jjigae (Army Stew)</h2>
				<h3 class="profile-h3">$12.99</h3>
			</div>
			<p class="profile-p">
				Budae-jjigae or spicy sausage stew is a type of Korean jjigae, made with
				ham, sausage, Spam, baked beans, kimchi, instant noodles, and gochujang.
				The dish was created shortly after the armistice that ended the Korean
				War, using the scrounged or smuggled surplus foods from U.S. military
				bases.
			</p>
		</div>

		<!-- Everything above this is PROFILE -->
	</div>
</template>

<script>
	export default {
		name: "profile",
		data() {},
	}
</script>

<style>
	#profile-div {
		padding-top: 50px;
		height: 100vh;
	}

	#truck-menu {
		text-align: center;
		font-size: 35px;
		position: relative;
		top: 4vh;
	}

	#menu-img {
		width: 85vw;
		overflow-x: scroll;
		text-align: center;
		position: relative;
		left: 7vw;
		display: flex;
		justify-content: space-between;
	}

	#menu-img img {
		width: 21.3vw;
	}

	.profile-h2 {
		color: black;
		font-size: 1.7em;
		margin-right: 5vw;
	}

	.profile-h3 {
		font-size: 1.5em;
		position: relative;
		left: 53vw;
	}

	.profile-p {
		font-size: 1.2em;
	}

	.profile-menu-head {
		display: flex;
	}

	#menu-info {
		padding: 10px;
		height: 45vh;
		width: 85vw;
		text-align: center;
		position: relative;
		left: 7vw;
		overflow: scroll;
	}
</style>
