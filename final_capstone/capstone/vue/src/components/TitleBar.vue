/<template>
  <header>
            <title>What The Truck</title>
            <link
			rel="stylesheet"
			href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css"
		/>
			<a href="#" class="logo"><i class="fa-solid fa-truck-field">what the truck</i></a
			>
			<div id="menu-bar" class="fas fa-bars"></div>
			<nav class="navbar">
				<a href="#home">Home</a>
				<a href="#online">Online</a>
				<a href="#gallery">Photos</a>
				<a href="#signup">Login/SignUp</a>
			</nav>
		</header>
</template>

<script>
export default {
    name: "title-bar"
}
</script>

<style>
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
    justify-content: flex-start;
    align-items: flex-start
}

header .logo i {
    padding-right: 0.5rem;
    color: var(--red);
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
</style>