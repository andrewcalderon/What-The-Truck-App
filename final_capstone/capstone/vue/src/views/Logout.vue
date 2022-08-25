<template>
  <login></login>
</template>

<script>
import Login from "./Login.vue"
export default {
  name: "logout",
  components: {
    Login
  },
  methods: {
    logout() {
      this.$store.commit("LOGOUT");
    this.$router.push("/login");
    }
  },
  created() {
    this.logout();
  }
};
</script>
