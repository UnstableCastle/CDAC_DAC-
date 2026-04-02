import React, { Component } from 'react'

class ConditionalRenComp extends Component {
    constructor(props) {
        super(props)

        this.state = {
            iscond: true
        }
    }

    render() {
        //  1. use of if else 
        // let msg = "";
        // if (this.state.iscond) {
        //     //    return <h2>this is Admin</h2>
        //     msg = "this is Admin";
        // } else {
        //     // return <h2>this is User</h2>
        //     msg = "this is User"
        // }
        // // 2.element as variable
        // return <h2>{msg}</h2>

        // 3. use of ternary operator
        // return (!this.state.iscond) ? <h2>this is Admin</h2> :<h2>this is User</h2>;

        // 4. short-circuit (&&)

        return this.state.iscond && <h2>this is Admin</h2>
    }
}

export default ConditionalRenComp