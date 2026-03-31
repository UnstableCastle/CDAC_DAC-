import React, { Component } from "react";

class CounterClass extends Component {

    constructor() {
        super();
        this.state = {
            count: 0
        }
    }

    counter_i() {
        this.setState({ count: this.state.count + 1 })
    }

    counter_d() {
        this.setState({ count: this.state.count - 1 })
    }
    
    counter_r() {
        this.setState({ count: this.state.count = 0 })
    }

    render() {

        return (
            <div>
                <p>Counter : {this.state.count}</p>
                <button type='button' onClick={() => this.counter_i()}>increase count</button>
                <button type='button' onClick={() => this.counter_d()}>decrease count</button>
                <button type='button' onClick={() => this.counter_r()}>reset count</button>
            </div>



        )

    }

}

export default CounterClass;