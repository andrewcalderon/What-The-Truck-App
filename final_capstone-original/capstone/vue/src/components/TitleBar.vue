<template>
        <header>
            <title>What The Truck</title>
            <link
			rel="stylesheet"
			href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css"
		/>
			<a href="#" class="logo"><li class="logofont">What The Truck!<i class="fa-solid fa-truck-field"></i></li></a
			>
            <form id=“form”>
                <input type=“text” id=“query” name=“q” placeholder=Search... />
                <button>Search</button>
            </form>

			<div id="menu-bar" class="fas fa-bars"></div>
			<nav class="navbar">
				<router-link to="/">Home</router-link>
				<a href="#gallery">Photos</a>
				<router-link to="/login">Login/SignUp</router-link>
			</nav>
		</header>
</template>

<script>
export default {
    name: "title-bar",
    mounted() {
        let menu = document.querySelector("#menu-bar")

menu.onlicks = () => {
	menu.classList.toggle("fa-times")
	menu.classList.toggle("active")
}

window.onscroll = () => {
	menu.classList.remove("fa-times")
	menu.classList.remove("active")
}
    }
}
</script>

<style>
@import url("https://fonts.googleapis.com/css2?family=Nunito:wght@200;300;400;600;700&display=swap");
@import url("https://fonts.googleapis.com/css2?family=DynaPuff:wght@400;600;700&family=Nunito:wght@200;300;400;600;700&display=swap");
:root {
	--red: #ff3838;
}

* {
	font-family: "Nunito", sans-serif;
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	outline: none;
	border: none;
	text-decoration: none;
	text-transform: capitalize;
	transition: all 0.2s linear;
}

*::selection {
	background: var(--red);
	color: #fff;
}

html {
	font-size: 62.5%;
	overflow-x: hidden;
	scroll-behavior: smooth;
	scroll-padding-top: 6rem;
}

body {
	background: #f7f7f7;
}

header {
	position: fixed;
	top: 0;
	left: 0;
	right: 0;
	z-index: 1000;
	display: flex;
	align-items: center;
	justify-content: space-between;
	background: #fff;
	padding: 2rem 9%;
	box-shadow: 0 0.5rem 1rem rgba(0, 0, 0, 0.1);
}

header .logo {
	font-size: 2rem;
	font-weight: border;
	color: #666;
}

header .logo i {
	padding-right: 0.5rem;
	color: var(--red);
}

header .logofont {
	list-style-type: none;
	font-size: 4rem;
	font-family: "DynaPuff", cursive;
}

header .navbar a {
	font-size: 2rem;
	margin-left: 2rem;
	color: #666;
}

header .navbar a:hover {
	color: var(--red);
}

#menu-bar {
	font-size: 3rem;
	cursor: pointer;
	color: #333;
	border: 0.1rem solid #666;
	border-radius: 0.3rem;
	padding: 0.5rem 1.5rem;
	display: none;
}

form {
	background-color: rgb(208, 204, 204);
	width: 300px;
	height: 44px;
	border-radius: 5px;
	display: flex;
	flex-direction: row;
	align-items: center;
}

input {
	all: unset;
	font: 16px system-ui;
	height: 100%;
	width: 100%;
	padding: 6px 10px;
}

::placeholder {
	color: #fff;
	opacity: 0.9;
}

svg {
	color: #fff;
	fill: #fff;
	width: 24px;
	height: 24px;
	padding: 10px;
}

button {
	all: unset;
	cursor: pointer;
	width: 44px;
	height: 44px;
}

</style>