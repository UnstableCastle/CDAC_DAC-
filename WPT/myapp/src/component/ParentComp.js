import React, { Component } from "react";
import ChildComp from "./ChildComp";

class ParentComp extends Component {
    constructor(props) {
        super(props);
        this.state = {
            item: "abc",
            price: 10000
        };
    }

    // The arrow function correctly binds 'this' to the component instance
    changedata = () => {
        this.setState((prevState) => ({
            item: "__broken__",
            price: prevState.price + 10
        }));
    };

    render() {
        return (
            <div style={{ padding: "20px", border: "2px solid #333", marginBottom: "20px" }}>
                <h2>Parent Component</h2>
                <p> item : {this.state.item} and price : {this.state.price}</p>

                <button type='button' onClick={this.changedata}>
                    changedata
                </button>

                <p>imported inside ParentComp</p>

                <ChildComp 
                    item={this.state.item}
                    price={this.state.price}
                    myaction={this.changedata}
                />
            </div>
        );
    }
}

export default ParentComp;