import React, { Component } from 'react'

class ComponentLifeCycleComp extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         color:"red"
      }
    }
    // static getDerivedStateFromProps(props){
    //     return{
    //         color:props.mycolor
    //     }
    // }
    // componentDidMount(){
    //     setTimeout(()=>{
    //         this.setState({color:"Green"});
    //     },2000);
    // }
    shouldComponentUpdate(){
        return true;
    }
    getSnapshotBeforeUpdate(prevProps,prevState){
     document.getElementById("beforeUpdate").innerHTML=`before Update my Favourite Color was:${prevState.color}`;
    }
   changeColor (){
    this.setState({color:"Blue"});
   }
   componentDidUpdate(){
    document.getElementById("afterUpdate").innerHTML=`After Update my Favourite Color is:${this.state.color}`;
   }
  render() {
    return (
      <div>
        <div>ComponentLifeCycleComp</div>
        <p>Color is :{this.state.color}</p>
        <div id='beforeUpdate'></div>
        <div id='afterUpdate'></div>
        <button type='button' className='btn btn-outline-primary' onClick={()=>this.changeColor()}>Change Color</button>
      </div>
    )
  }
}

export default ComponentLifeCycleComp