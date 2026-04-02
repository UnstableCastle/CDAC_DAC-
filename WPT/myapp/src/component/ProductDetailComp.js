import React, { useState } from 'react'
import axious from 'axios'
const ProductDetailComp = ()=> {

const [employees,setEmmployee] = useState([]);

const getData = () =>{
  const getData = ()=>{
    axious.get("http://localhost:8888/employees").then((response)=>{
      console.log(response.data);
    }).catch((error=>{}))
  }
}




}

export default ProductDetailComp
