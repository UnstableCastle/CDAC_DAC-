import React from 'react'
import {useSelector,useDispatch} from 'react-redux';
import { inrecement } from '../redux/counterSclice';
import { decrement } from '../redux/counterSclice';
import { reset } from '../redux/counterSclice';
const CounterComp = () => {
  
  const data = useSelector((state)=>state.count.value);
  
    return (
    <div>
      
<h2>Counter</h2>
<div> Counter :{data}</div>
<button className='btn btn-primary' onClick={()=>{dispatch(inrecement)}}>increment</button>
<button className='btn btn-primary' onClick={()=>{dispatch(decrement)}}>decrement</button>
<button className='btn btn-primary' onClick={()=>{dispatch(reset)}}>reset</button>

    </div>
  )
}

export default CounterComp
