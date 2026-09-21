import React from 'react'

export default function App() {
const name = "Castle";
const year = 2026;
const isActive = true; 


  return (
    <div style={{padding:"40",fontFamily:"monospace"}}>

      <h1>Hello !</h1>
      <p>hello this is paragraph</p>
<hr/>
<p>Name : <strong>{name}</strong></p>
<p>Year : <strong>{year}</strong></p>
<p>Status  : <strong>{isActive ? "Active" : "InActive"}</strong></p>
<hr/>



    </div>
  )
}
