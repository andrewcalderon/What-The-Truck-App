import axios from "axios";

export default {
  list() {
    return axios.get("http:localhost:8080/api/foodtrucks");
  },

  get(id) {
    return axios.get(`http:localhost:8080/api/foodtrucks/${id}`);
  },

  // add a foodtruck to endpoint /addFoodtruck
  create(foodtruck) {
    return axios.post(
      "http://localhost:8080/api/addFoodtruck",
      foodtruck
    );
  },

  // update a foodtruck to endpoint /updateFoodtruck
  update(foodtruck) {
    console.log(foodtruck);
    return axios.put(
      `http://localhost:8080/api/updateFoodtruck/${foodtruck.id}`,
      foodtruck
    );
  },

  // delete a foodtruck to endpoint /deleteFoodtruck/id
  delete(id) {
    console.log(id);
    return axios.delete(
      `http://localhost:8080/api/deleteFoodtruck/${id}`
    );
  },
};
