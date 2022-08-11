<template>
	<body>

		<!-- Map section starts here -->
		<iframe
			src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3220.7924741247066!2d-115.14128868509069!3d36.17160431052994!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x1cc2474242c3a012!2zMzbCsDEwJzE3LjgiTiAxMTXCsDA4JzIwLjgiVw!5e0!3m2!1sen!2sus!4v1660200861406!5m2!1sen!2sus"
			width="800"
			height="500"
			style="border: 0"
			allowfullscreen=""
			loading="lazy"
			referrerpolicy="no-referrer-when-downgrade"
		></iframe>
		<!-- Map section ends here -->

		
	</body>
</template>

<script>
export default {
    name: "map-component"
}
</script>

<style>
:root {
    --red: #FF3838;
}
* {
    font-family: “Nunito”, sans-serif;
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
    background: #F7F7F7;
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

iframe {
    position: absolute;
    bottom: 10px;
    right: 10px;
    width: 80%;
    height: 100%;
    border: 3px solid #8AC007;
}
/* media queries */
@media (max-width: 991px) {
    html {
        font-size: 55%;
    }
    header {
        padding: 2rem;
    }
}
@media (max-width: 768px) {
    #menu-bar {
        display: initial;
    }
    header .navbar {
        position: absolute;
        top: 100%;
        left: 0;
        right: 0;
        background: #F7F7F7;
        border-top: 0.1rem solid rgba(0, 0, 0, 0.1);
        clip-path: polygon(0 0, 100% 0, 100% 0 0 0);
    }
    header .navbar.active {
        clip-path: polygon(0 0, 100% 0, 100% 0 0 0);
    }
    header .navbar a {
        margin: 1.5rem;
        padding: 1.5rem;
        display: block;
        border: 0.2rem solid rgba(0, 0, 0, 0.1);
        border-left: 5rem solid rgba(0, 0, 0, 0.1);
        background: #fff;
    }
    iframe {
        display: none;
    }
}
@media (max-width: 400px) {
    html {
        font-size: 50%;
    }
}
</style>