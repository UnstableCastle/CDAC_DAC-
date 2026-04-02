import { configureStore } from "@reduxjs/toolkit";
import counter_reducer from "./counterSclice";
const store = configureStore({

reducer:{
    count : counter_reducer
}  




});

export default store;
