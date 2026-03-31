import { render } from "@testing-library/react";
import React, { Component } from "react";

class MyFriendComp extends Component {

    constructor() {
        super();
        this.state = {
            name: "abc",
            lname: "def",
            city: "ghi",
            country: "klm",
            gender: "noq"
        }
    }


    render() {
        return (
            <div>
                <p> Name : <strong>{this.state.name} {this.state.lname}</strong> City: {this.state.city} Country: {this.state.country} Gender: {this.state.gender}</p>
                <br></br>
                <p>this is MyFriendComp Class</p>
                <hr></hr>

            </div>
        )
    }

}
export default MyFriendComp;