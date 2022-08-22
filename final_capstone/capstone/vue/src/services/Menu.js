import axios from "axios";

export default {
  list() {
    return axios.get("http:localhost:8080/api/menu");
  },

  get(id) {
    return axios.get(`http:localhost:8080/api/menu/${id}`);
  },

  // add a foodtruck to endpoint /addFoodtruck
  create(menu) {
    return axios.post("http://localhost:8080/api/addmenu", menu);
  },

  // update a foodtruck to endpoint /updateFoodtruck
  update(menu) {
    console.log(menu);
    return axios.put(
      `http://localhost:8080/api/updateFoodtruck/${menu.id}`,
      menu
    );
  },

  // delete a foodtruck to endpoint /deleteFoodtruck/id
  delete(id) {
    console.log(id);
    return axios.delete(`http://localhost:8080/api/deleteMenu${id}`);
  },
};
