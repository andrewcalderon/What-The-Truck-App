import axios from "axios"

export default {
	login(user) {
		return axios.post("/login", user)
	},

	register(newuser) {
		return axios.post("/login", newuser)
	},
}
