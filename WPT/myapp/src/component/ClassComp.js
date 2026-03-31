import React, { Component } from "react";

class ClassComp extends Component {

    render() {
        return (
            <div>
                <h2>this is class Component</h2>

                <p>this is para in Class</p>
                <p>I'm : <strong>{this.props.myname}</strong>, hobby :  {this.props.hobby} || we need to use this.props</p>


            </div>

        )

    }

}

export default ClassComp;