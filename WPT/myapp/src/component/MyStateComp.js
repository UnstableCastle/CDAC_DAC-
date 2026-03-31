import React, { Component } from "react";

class MyStateComp extends Component {

    constructor() {
        super();
        this.state = {
            name: "abc",
            sal: 123
        }
    }

    changeState() {
        this.setState({ name: "UnstableCastle", sal: this.state.sal + 1 })
    }

    changeState1() {
        this.setState((prevState) => ({ name: "__Castle__", sal: prevState.sal + 5000 }));
    }





    greeting() {
        window.alert("meow meow meow")
    }
    render() {

        return (
            <div>
                <h2>this is class MyStateComp Component</h2>
                <p>my name : {this.state.name} and sal : {this.state.sal}</p>
                <button type='button' onClick={() => this.greeting()}>Greet</button>

                <button type='button' onClick={() => this.changeState()}>changeState</button>
                <button type='button' onClick={() => this.changeState1()}>changeState - arrow</button>


                <button type='button' onClick={() => this.setState((prevState) => ({ name: "__Castle__", sal: prevState.sal + 1 }))}>changeState - within button</button>


            </div>



        )

    }

}

export default MyStateComp;