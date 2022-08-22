<template>
  <div id="home-page">
    <!-- Everything below this is the NAV BAR -->
    <div class="nav-bar-area">
      <div class="the-logo">
        <p id="logo-font">What The Truck!</p>
        <div id="red-truck" class="fa-solid fa-truck-field"></div>
      </div>

      <form id="nav-bar-search">
        <input
          id="nbs-input"
          type="text"
          name="q"
          placeholder="Search..."
          style="height: 20px"
        />
        <button id="nbs-button">Search</button>
      </form>

      <!-- <div id="menu-bar" class="fas fa-bars"></div> -->
      <nav class="navbar-links">
        <a class="nav-bar-buttons" href="#home">Home</a>
        <router-link v-bind:to="{ name: 'gallery' }">
          <a class="nav-bar-buttons" href="#gallery">Gallery</a>
        </router-link>
        <a class="nav-bar-buttons" href="#signup">Login/Signup</a>
      </nav>
    </div>
    <!-- Everything above this is the NAV BAR -->
   <Map></Map>
<!-- =======
>>>>>>> fb83eeb72a9613415f7e9418b0878d32f2991d26 -->
  </div>
</template>

<script>
import Map from "../components/Map.vue";
export default {
// <<<<<<< HEAD
    name: "home",
    components: Map,
// =======
//   name: "home",
// >>>>>>> fb83eeb72a9613415f7e9418b0878d32f2991d26
};
</script>

<style>
#home-page {
  height: 100vh;
}

/* Everything below this is the NAV BAR */

.nav-bar-area {
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

#red-truck {
  background: red;
  width: 100px;
  height: 100%;
}

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

/* Everything above this is the NAV BAR */
</style>
