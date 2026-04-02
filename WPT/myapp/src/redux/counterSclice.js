import { createSclice } from "@reduxjs/toolkit";

const counter_reducer = createSclice({
    naem: "count",
    initailState: { value: 0 },
    reducers: {
        increment: (state) => {
            state.value = state.value + 1;
        },
        decrement: (state) => {
            state.value = state.value - 1;
        },
        reset: (state) => {
            state.value = state = 0;
        },
    }
});

export const { inrecement,reset ,decrement } = counter_reducer.actions;
export default counter_reducer.reducer;
