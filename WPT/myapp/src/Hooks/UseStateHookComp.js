import React, { useState } from 'react';

const UseStateHookComp = () => {
    const [count, setCount] = useState(0);
    const [myName, setMyName] = useState("CASTLE");

    return (
        <div>
            <h2>UseStateHookComp</h2>

            <div>Count: {count}</div>

            <button type="button" onClick={() => setCount(count + 1)}>
                Increment
            </button>

            <button type="button" onClick={() => setCount(count - 1)}>
                Decrement
            </button>

            <div>
                My Name Is: <strong>{myName}</strong>
            </div>

            <h3 onMouseOver={() => setMyName("Unstable Castle")}>
                Hover on me
            </h3>
        </div>
    );
};

export default UseStateHookComp;
