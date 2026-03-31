import React, { Component } from "react";
import staticData from "../shared/constant/constantData";

class MyImagesComp extends Component {
  render() {
    return (
      <div>
        <hr/>
        My images <br />
        <img src={staticData.lambo} alt="Lambo"width="200px" height="200px" />
        <img src={staticData.c63} alt="C63" width="200px" height="200px"/>
        <img src={staticData.hura} alt="Hura"width="200px" height="200px" />
        <br />
        <video controls width="200px" height="200px">
          <source src={staticData.i} type="video/mp4" />
        </video>
      </div>
    );
  }
}

export default MyImagesComp;