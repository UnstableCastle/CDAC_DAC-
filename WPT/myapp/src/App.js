import React from 'react';
import './App.css';
import ListComp from './Hooks/ListComp'; 
import MyDetails from './task/MyDetailComp';
function App() {
  return (
    <div className="App">
      <h1 style={{color: 'blue'}}>React App is Running</h1>
      {/* <ListComp /> */}
<MyDetailComp myname="ABC" lname="DEF" city="GHI" country="jkl" gender="mno"/>
    </div>
  );
}

export default App;