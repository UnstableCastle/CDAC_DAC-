import React from 'react'
import './externalstyle.css';
import mycss from './mycss.module.css';
import staticData from '../shared/constant/constantData';

const CssComp = () => {
    let boxObj = {
        border:"2px solid",
        height:"100px",
        width:"100px",
        backgroundColor:"dodgerblue",
        margin:"auto"
    }
  return (
    <div> 
        {/* use of internal css  */}
        <h1 style={{color:"blue",backgroundColor:"aqua"}}>Css component</h1>
        <div style={boxObj}>hello</div>
        {/* use of external css  */}
        <div className='txtdanger'>Panchashil Wankhede</div>
        <div className='txtsuccess'>Hematite Infotech Pvt Ltd</div>
        {/* use of module css  */}
        <img className={mycss.circle} src={staticData.happy} alt='happy'/>
    </div>
  )
}

export default CssComp