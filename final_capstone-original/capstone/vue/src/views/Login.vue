<template>
  <div id="login" class="text-center">
    <form class="form-signin" @submit.prevent="login">
      <h1 class="h3 mb-3 font-weight-normal">Please Sign In</h1>
      <div
        class="alert alert-danger"
        role="alert"
        v-if="invalidCredentials"
      >Invalid username and password!</div>
      <div
        class="alert alert-success"
        role="alert"
        v-if="this.$route.query.registration"
      >Thank you for registering, please sign in.</div>
      <div class="login-box">
      <label for="username" >Username</label>
      <input
        type="text"
        id="username"
        class="form-control"
        placeholder="Enter Username"
        v-model="user.username"
        required
        autofocus
      />
      <label for="password" >Password</label>
      <input
        type="password"
        id="password"
        class="form-control"
        placeholder="Enter Password"
        v-model="user.password"
        required
      />
      <button type="submit">Sign in</button>
      <br/>
      <router-link class="signup_link" :to="{ name: 'register' }">Need an account?</router-link>
      </div>
      
    </form>
  </div>
</template>

<script>
import authService from "../services/AuthService";

export default {
  name: "login",
  components: {
  },
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
            this.$store.commit("SET_AUTH_TOKEN", response.data.token);
            this.$store.commit("SET_USER", response.data.user);
            this.$router.push("/");
          }
        })
        .catch(error => {
          const response = error.response;

          if (response.status === 401) {
            this.invalidCredentials = true;
          }
        });
    }
  }
};
</script>

<style>
body { 
  margin: 0;
  padding: 0;
  background-color: rgb(255, 255, 255);
  background-size: cover;
  background-position: center;
  font-family: sans-serif;
}

#login {
  width: 320px;
  height: 420px;
  background: #000;
  color: #fff;
  top: 50%;
  left: 50%;
  position: absolute;
  transform: translate(-50%, -50%);
  box-sizing: border-box;
  padding: 70px 30px;
}

h1 {
  margin: 0;
  padding: 0 0 20px;
  text-align: center;
  font-size: 22px;

}

.login-box label {
  margin: 0;
  padding: 0;
  font-weight: bold;
}

.login-box input {
  width: 500px;
  margin-bottom: 20px;
}

.login-box input[type="text"], input[type="password"] {
  border: none;
  border-bottom: 1px solid #fff;
  background: transparent;
  outline: none;
  height: 40px;
  color: #fff;
  font-size: 16px;
}

button[type = "submit"] {
  border: none;
  outline: none;
  height: 40px;
  background: #fb2525;
  color: #fff;
  font-size: 18px;
  border-radius: 20px;
}

button[type="submit"]:hover {
  cursor: pointer;
  background: #ffc107;
  color: #000;
}

.login-box a {
  text-decoration: none;
  font-size: 12px;
  line-height: 20 px;
  color: darkgrey;
}

.signup_link {
  align-items: center;
}
</style>
