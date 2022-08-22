let menu = document.querySelector("#menu-bar");
let navbar = document.querySelector(".navbar");

menu.onlicks = () => {
  menu.classList.toggle("fa-times");
  menu.classList.toggle("active");
};

window.onscroll = () => {
  menu.classList.remove("fa-times");
  menu.classList.remove("active");
};

document
  .querySelectorAll(" .image-container img")
  .forEach((image) => {
    image.onclick = () => {
      document.querySelector(".popup-image").style.display = "block";
      document.querySelector(".popup-image img").scr =
        image.getAttribute("scr");
    };
  });

document.querySelector(".popup-image span").onclick = () => {
  document.querySelector(".popup-image").style.display = "none";
};

