<template>

  <div id="login-page">

    <!-- Everything below this is the NAV BAR -->
    <div class="nav-bar-area">
      <div class="the-logo">
        <p id="logo-font">What The Truck!</p>
        <div id="red-truck" class="fa-solid fa-truck-field"></div>
      </div>  

      <form id="nav-bar-search">
        <input id="nbs-input" type="text" name="q" placeholder="Search..." style="height: 20px"/>
        <button id="nbs-button">Search</button>
      </form>

      <!-- <div id="menu-bar" class="fas fa-bars"></div> -->
      <nav class="navbar-links">
        <a class="nav-bar-buttons" href="#home">Home</a>
        <a class="nav-bar-buttons" href="#gallery">Gallery</a>
        <a class="nav-bar-buttons" href="#signup">Login/Signup</a>
      </nav>
    </div>
    <!-- Everything above this is the NAV BAR -->

    <div id="login-area">
      <div class="wrapper fadeInDown">
        <div id="formContent">
          <!-- Tabs Titles -->
          <h2 class="inactive underlineHover"> Log In </h2>
          <h2 class="inactive underlineHover">Register</h2>

          <!-- Login Form -->
          <form @submit.prevent="login">
            <input type="text" id="login-input" class="input-text log-in-input fadeIn second" v-model="user.username"  placeholder="Enter Username">
            <input type="text" id="password-input" class="input-text log-in-input fadeIn third" v-model="user.password" placeholder="Enter Password">
            <input type="submit" id="submit-input" class="fadeIn fourth" value="Log In">
          </form>
          <!-- Remind Passowrd -->

          <div id="formFooter">
            <a class="underlineHover" href="#">Forgot Password?</a>
          </div>
        </div>
      </div>
    </div>

  </div>

</template>

<script>
import authService from "../services/AuthService";

export default {
  name: "login",
  components: {},
  data() {
    return {
      user: {
        username: "",
        password: ""
      },
      invalidCredentials: false
    };
  },
  methods: {
    login() {
      authService
        .login(this.user)
        .then(response => {
          if (response.status == 200) {
            console.log("login works")
            this.$store.commit("SET_AUTH_TOKEN", response.data.token);
            this.$store.commit("SET_USER", response.data.user);
            this.$router.push("/");
          }
        })
        .catch(error => {
          const response = error.response;
          console.log(response)

          if (response.status === 401) {
            console.log(response.status)
            this.invalidCredentials = true;
          }
        });
    }
  }
};
</script>

<style>
@import url("https://fonts.googleapis.com/css2?family=Nunito:wght@200;300;400;600;700&display=swap");
@import url("https://fonts.googleapis.com/css2?family=DynaPuff:wght@400;600;700&family=Nunito:wght@200;300;400;600;700&display=swap");
@import url('https://fonts.googleapis.com/css?family=Poppins');

#login-page {
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
  height: 100%;;
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
  font-size: .6rem;
}

.nav-bar-buttons {
  font-family: "Nunito", sans-serif;
  font-size: 1.2rem;
	margin-left: 2rem;
	color: #666;
  text-decoration: none;
}

/* Everything above this is the NAV BAR */

/* Log in form css below */


h2 {
  text-align: center;
  font-size: 16px;
  font-weight: 600;
  text-transform: uppercase;
  display:inline-block;
  margin: 40px 8px 10px 8px; 
  color: #cccccc;
}



/* STRUCTURE */

.wrapper {
  display: flex;
  align-items: center;
  flex-direction: column; 
  justify-content: center;
  width: 100%;
  min-height: 100%;
  padding: 20px;
}

#formContent {
  -webkit-border-radius: 10px 10px 10px 10px;
  border-radius: 10px 10px 10px 10px;
  background: #fff;
  padding: 30px;
  width: 90%;
  max-width: 450px;
  position: relative;
  padding: 0px;
  -webkit-box-shadow: 0 30px 60px 0 rgba(0,0,0,0.3);
  box-shadow: 0 30px 60px 0 rgba(0,0,0,0.3);
  text-align: center;
}

#formFooter {
  background-color: #f6f6f6;
  border-top: 1px solid #dce8f1;
  padding: 25px;
  text-align: center;
  -webkit-border-radius: 0 0 10px 10px;
  border-radius: 0 0 10px 10px;
}



/* TABS */

h2.inactive {
  color: #cccccc;
}

h2.active {
  color: #0d0d0d;
  border-bottom: 2px solid #ff3838;
}



/* FORM TYPOGRAPHY*/

input[type=button], input[type=submit], input[type=reset]  {
  background-color: #ff3838;
  border: none;
  color: white;
  padding: 15px 80px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  text-transform: uppercase;
  font-size: 13px;
  -webkit-box-shadow: 0 10px 30px 0 rgba(95,186,233,0.4);
  box-shadow: 0 10px 30px 0 rgba(95,186,233,0.4);
  -webkit-border-radius: 5px 5px 5px 5px;
  border-radius: 5px 5px 5px 5px;
  margin: 5px 20px 40px 20px;
  -webkit-transition: all 0.3s ease-in-out;
  -moz-transition: all 0.3s ease-in-out;
  -ms-transition: all 0.3s ease-in-out;
  -o-transition: all 0.3s ease-in-out;
  transition: all 0.3s ease-in-out;
}

input[type=button]:hover, input[type=submit]:hover, input[type=reset]:hover  {
  background-color: #ff7777;
}

input[type=button]:active, input[type=submit]:active, input[type=reset]:active  {
  -moz-transform: scale(0.95);
  -webkit-transform: scale(0.95);
  -o-transform: scale(0.95);
  -ms-transform: scale(0.95);
  transform: scale(0.95);
}

input[type=text] {
  background-color: #f6f6f6;
  border: none;
  color: #0d0d0d;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 5px;
  width: 85%;
  border: 2px solid #f6f6f6;
  -webkit-transition: all 0.5s ease-in-out;
  -moz-transition: all 0.5s ease-in-out;
  -ms-transition: all 0.5s ease-in-out;
  -o-transition: all 0.5s ease-in-out;
  transition: all 0.5s ease-in-out;
  -webkit-border-radius: 5px 5px 5px 5px;
  border-radius: 5px 5px 5px 5px;
}

input[type=text]:focus {
  background-color: #fff;
  border-bottom: 2px solid #ff3838;
}

input[type=text]:placeholder {
  color: #cccccc;
}



/* ANIMATIONS */

/* Simple CSS3 Fade-in-down Animation */
.fadeInDown {
  -webkit-animation-name: fadeInDown;
  animation-name: fadeInDown;
  -webkit-animation-duration: 1s;
  animation-duration: 1s;
  -webkit-animation-fill-mode: both;
  animation-fill-mode: both;
}

@-webkit-keyframes fadeInDown {
  0% {
    opacity: 0;
    -webkit-transform: translate3d(0, -100%, 0);
    transform: translate3d(0, -100%, 0);
  }
  100% {
    opacity: 1;
    -webkit-transform: none;
    transform: none;
  }
}

@keyframes fadeInDown {
  0% {
    opacity: 0;
    -webkit-transform: translate3d(0, -100%, 0);
    transform: translate3d(0, -100%, 0);
  }
  100% {
    opacity: 1;
    -webkit-transform: none;
    transform: none;
  }
}

/* Simple CSS3 Fade-in Animation */
@-webkit-keyframes fadeIn { from { opacity:0; } to { opacity:1; } }
@-moz-keyframes fadeIn { from { opacity:0; } to { opacity:1; } }
@keyframes fadeIn { from { opacity:0; } to { opacity:1; } }

.fadeIn {
  opacity:0;
  -webkit-animation:fadeIn ease-in 1;
  -moz-animation:fadeIn ease-in 1;
  animation:fadeIn ease-in 1;

  -webkit-animation-fill-mode:forwards;
  -moz-animation-fill-mode:forwards;
  animation-fill-mode:forwards;

  -webkit-animation-duration:1s;
  -moz-animation-duration:1s;
  animation-duration:1s;
}

.fadeIn.first {
  -webkit-animation-delay: 0.4s;
  -moz-animation-delay: 0.4s;
  animation-delay: 0.4s;
}

.fadeIn.second {
  -webkit-animation-delay: 0.6s;
  -moz-animation-delay: 0.6s;
  animation-delay: 0.6s;
}

.fadeIn.third {
  -webkit-animation-delay: 0.8s;
  -moz-animation-delay: 0.8s;
  animation-delay: 0.8s;
}

.fadeIn.fourth {
  -webkit-animation-delay: 1s;
  -moz-animation-delay: 1s;
  animation-delay: 1s;
}

/* Simple CSS3 Fade-in Animation */
.underlineHover:after {
  display: block;
  left: 0;
  bottom: -10px;
  width: 0;
  height: 2px;
  background-color: #ff3838;
  content: "";
  transition: width 0.2s;
}

.underlineHover:hover {
  color: #0d0d0d;
}

.underlineHover:hover:after{
  width: 100%;
}



/* OTHERS */

*:focus {
    outline: none;
} 

#icon {
  width:60%;
}

* {
  box-sizing: border-box;
}


</style>
