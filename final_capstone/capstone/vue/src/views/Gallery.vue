<template>
  <div id="gallery-page">
    <div class="container">
      <h1>Grab a Look</h1>

      <div class="image-container">
        <div class="image">
          <img src="../images/image1.jpeg" alt="" />
        </div>
        <div class="image">
          <img src="../images/foodimg-1.jpeg" alt="" />
        </div>
        <div class="image">
          <img src="../images/image2.jpeg" alt="" />
        </div>
        <div class="image">
          <img src="../images/foodimg-2.jpeg" alt="" />
        </div>
        <div class="image">
          <img src="../images/image3.jpeg" alt="" />
        </div>
        <div class="image">
          <img src="../images/foodimg-3.jpeg" alt="" />
        </div>
        <div class="image">
          <img src="../images/image4.jpeg" alt="" />
        </div>
        <div class="image">
          <img src="../images/foodimg-4.jpeg" alt="" />
        </div>
        <div class="image">
          <img src="../images/image5.jpeg" alt="" />
        </div>
        <div class="image">
          <img src="../images/foodimg-5.jpeg" alt="" />
        </div>
        <div class="image">
          <img src="../images/image6.jpeg" alt="" />
        </div>
        <div class="image">
          <img src="../images/foodimg-6.jpeg" alt="" />
        </div>
        <div class="image">
          <img src="../images/image7.jpeg" alt="" />
        </div>
        <div class="image">
          <img src="../images/foodimg-7.jpeg" alt="" />
        </div>
        <div class="image">
          <img src="../images/image8.jpeg" alt="" />
        </div>
        <div class="image">
          <img src="../images/foodimg-8.jpeg" alt="" />
        </div>
        <div class="image">
          <img src="../images/image9.jpeg" alt="" />
        </div>
        <div class="image">
          <img src="../images/foodimg-9.jpeg" alt="" />
        </div>
        <div class="image">
          <img src="../images/image10.jpeg" alt="" />
        </div>
        <div class="image">
          <img src="../images/foodimg-10.jpeg" alt="" />
        </div>
      </div>

      <div class="popup-imag">
        <span>&times;</span>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "gallery",
};
</script>

<style>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

.container {
  position: relative;
  min-height: 100vh;
  background-color: #ddd;
}

.container h1 {
  font-size: 40px;
  font-family: Verdana, Geneva, Tahoma, sans-serif;
  font-weight: normal;
  padding: 15px;
  color: #333;
  text-align: center;
  text-transform: capitalize;
}

.container .image-container {
  display: flex;
  flex-wrap: wrap;
  gap: 15px;
  justify-content: center;
  padding: 10px;
}

.container .image-container .image {
  height: 250px;
  width: 350px;
  border: 10px solid #fff;
  box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);
  overflow: hidden;
  cursor: pointer;
}

.container .image-container .image img {
  height: 100%;
  width: 100%;
  object-fit: cover;
  transition: 0.2s linear;
}

.container .image-container .image:hover img {
  transform: scale(1.1);
}

.container .popup-image {
  position: fixed;
  top: 0;
  left: 0;
  background: rgba(0, 0, 0, 0.9);
  height: 100%;
  width: 100%;
  z-index: 100;
  display: none;
}

.container .popup-image span {
  position: absolute;
  top: 0;
  right: 10px;
  font-size: 40px;
  font-weight: bolder;
  color: #fff;
  cursor: pointer;
  z-index: 100;
}

.container .popup-image img {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  border: 5px solid #fff;
  border-radius: 5px;
  width: 750px;
  object-fit: cover;
}

@media (max-width: 768px) {
  .container .popup-image img {
    width: 95%;
  }
}
</style>
