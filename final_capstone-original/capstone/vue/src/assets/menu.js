let menu = document.querySelector("#menu-bar")

menu.onlicks = () => {
	menu.classList.toggle("fa-times")
	menu.classList.toggle("active")
}

window.onscroll = () => {
	menu.classList.remove("fa-times")
	menu.classList.remove("active")
}

