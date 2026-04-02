import React from 'react';
import './App.css';
import ListComp from './Hooks/ListComp'; 

function App() {
  return (
    <div className="App">
      {/* If this text shows up but the list doesn't, the issue is in ListComp.js */}
      <h1 style={{color: 'blue'}}>React App is Running</h1>
      <ListComp />
    </div>
  );
}

export default App;