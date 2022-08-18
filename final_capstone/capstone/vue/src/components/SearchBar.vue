<template>
  <form id="form">
    <input type="text" id="query" name="q" placeholder="Search..." />
    <button>Search</button>
  </form>
</template>

<script>
export default { name: "search-bar" };
</script>

<style>
body {
  background: white;
  margin: 200px 40%;
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
