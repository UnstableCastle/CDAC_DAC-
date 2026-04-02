import React, { Component } from "react";

class ErrorBoundaryComp extends Component{
 
    constructor(){
        super();
        this.state={
            hasValue:false
        }
    }
    static getDerivedStateFromError(){
        return{
            hasValue:true
        }
    }
    componentDidCatch(error){
        console.log(error);
    }
    render(){
        if(this.state.hasValue){
           return <h2>Not A User</h2>
        }
        return this.props.children;
    }

}

export default ErrorBoundaryComp;

