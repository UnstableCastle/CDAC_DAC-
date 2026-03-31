import logo from './logo.svg';
import './App.css';

import FuncComp from './component/FuncComp';
import ClassComp from './component/ClassComp';
import MyStateComp from './component/MyStateComp';
import CounterClass from './task/CounterClass';
import MyDetails from './task/MyDetailComp';
import MyFriendComp from './task/MyFriendComp';
import TimeComp from './task/TimeComp';
import ParentComp from './component/ParentComp';
import MyImagesComp from './component/MyImagesComp';
import ChildComp from './component/ChildComp';
import UseStateHookComp from './Hooks/UseStateHookComp';
import ToggleImg from './task/ToggleImg';
import ChangeImages from './task/ChangeImages';
import SliderImages from './task/ImageSlider';

function App() {
  return (
    <div className="App">

      <h1>🚀 All React Components Demo</h1>

      {/* Basic Components */}
      <FuncComp myname="Castle" hobby="Reading" />
      <ClassComp myname="Castle" hobby="Reading" />
      <MyStateComp />

      <hr />

      {/* Task Components */}
      <CounterClass />
      <MyDetails 
        myname="Amaan" 
        lname="Sayyed" 
        city="Pune" 
        quli="Computer Applications" 
        g="Male" 
        c="India"
      />
      <MyFriendComp />
      <TimeComp />

      <hr />

      {/* Parent-Child */}
      <ParentComp />
      <ChildComp item="Pizza" price="299" />

      <hr />

      {/* Images */}
      <MyImagesComp />
      <ToggleImg />
      <ChangeImages />
      <SliderImages />

      <hr />

      {/* Hooks */}
      <UseStateHookComp />

    </div>
  );
}

export default App;
