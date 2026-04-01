import React from 'react';
import { Link } from 'react-router-dom';
const NavComp = () => {
  return (
    <div>
      <Link to="slider" className='btn btn-primary btn-sm'>Slider</Link>{" "}
      <Link to="myimages" className='btn btn-primary btn-sm'>MyImages</Link>{" "}
      <Link to="hooks" className='btn btn-primary btn-sm'>Hooks</Link>
      

    </div>
  )
}

export default NavComp