<template>
  <div class=“vertical-menu”>
            <a href=“#” ></a>
            <a href=“#”>Foodtruck 1</a>
            <a href=“#”>Foodtruck 2</a>
            <a href=“#”>Foodtruck 3</a>
            <a href=“#”>Foodtruck 4</a>
            <a href=“#”>Foodtruck 5</a>
            <a href=“#”>Foodtruck 6</a>
            <a href=“#”>Foodtruck 7</a>
            <a href=“#”>Foodtruck 8</a>
            <a href=“#”>Foodtruck 9</a>
            <a href=“#”>Foodtruck 10</a>
            <a href=“#”>Foodtruck 11</a>
            <a href=“#”>Foodtruck 12</a>
            <a href=“#”>Foodtruck 13</a>
            <a href=“#”>Foodtruck 14</a>
            <a href=“#”>Foodtruck 15</a>
        </div>
</template>

<script>
export default {
    name: 'truck-list',
    
}


</script>

<style>

.vertical-menu {
	width: 20%;
	height: 100vh;
	margin-top: 70px;
	overflow-y: auto;
}

.vertical-menu a {
	background-color: #eee;
	color: black;
	display: block;
	padding: 12px;
	font-size: 2rem;
	text-decoration: none;
}

.vertical-menu a:hover {
	background-color: #ccc;
	color: var(--red);
}

.vertical-menu a.active {
	background-color: #ccc;
	color: white;
}

</style>