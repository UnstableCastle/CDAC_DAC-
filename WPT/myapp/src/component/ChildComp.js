import React, { Component } from "react";

class ChildComp extends Component {
    render() {
        // Extracting properties from this.props makes them easier to use below
        const { item, price, myaction } = this.props;

        return (
            <div style={{ padding: "20px", border: "2px solid #007bff" }}>
                <p>child component</p>

                <div>
                    <div>menu: {item}</div>
                    <div>price: {price}</div>

                    <div>
                        {/* Now correctly referencing the destructured 'myaction' */}
                        <h2 onMouseOver={myaction} style={{ cursor: "pointer", color: "blue" }}>
                            hover on me 
                        </h2>
                    </div>
                </div>
            </div>
        );
    }
}

export default ChildComp;