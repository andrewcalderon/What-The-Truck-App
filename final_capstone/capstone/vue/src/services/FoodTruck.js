import axios from "axios"

export default {
	list() {
		return axios.get("/api/foodtrucks")
	},

	get(id) {
		return axios.get(`/api/foodtrucks/${id}`)
	},

	// add a foodtruck to endpoint /addFoodtruck
	create(foodtruck) {
		return axios.post("/api/addFoodtruck", foodtruck)
	},

	// update a foodtruck to endpoint /updateFoodtruck/id

	update(id) {
		console.log(id)
		return axios.put(`/api/updateFoodtruck/${id}`)
	},

	// delete a foodtruck to endpoint /deleteFoodtruck/id

	delete(id) {
		console.log(id)
		return axios.delete(`/api/deleteFoodtruck/${id}`)
	},
}
