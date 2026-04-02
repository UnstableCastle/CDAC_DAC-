import React from 'react'
import { Outlet } from 'react-router-dom';
import NavComp from '../layout/NavComp';
import FooterComp from '../layout/FooterComp';

const DashboardCom = () => {
  return (
    <div className='container mt-2'>
      {/* <h2>DashboardCom</h2> */}
      <div className='card border-primary'>
         <div className='card-header border-primary'>
            <NavComp/>
         </div>
         <div className='card-body border-primary'>
             <Outlet/>
         </div>
         <div className='card-footer border-primary'>
          <FooterComp/>
         </div>
      </div>
     
    </div>
  )
}

export default DashboardCom