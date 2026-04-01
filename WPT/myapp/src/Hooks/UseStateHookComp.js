import React, { useState } from 'react';

const UseStateHookComp = () => {
    const [count, setCount] = useState(0);
    const [myName, setMyName] = useState("CASTLE");
    const [items, setItems] = useState([
        { id: 1, name: "Samosa" },
        { id: 2, name: "Dosa" },
        { id: 3, name: "Vadapav" },
        { id: 4, name: "Idali" }
    ]);

    const removeItem = (idToRemove) => {
        setItems((prevItems) =>
            prevItems.filter((item) => item.id !== idToRemove)
        );
    };

    return (
        <div style={{ padding: '20px', fontFamily: 'sans-serif' }}>
            <h2>UseStateHookComp</h2>

            <div>
                <div>Count: {count}</div>
                <button type='button' onClick={() => setCount(count + 1)}>count++</button>
                <button type='button' onClick={() => setCount(count - 1)}>count--</button>
            </div>

            <hr style={{ margin: '20px 0' }} />

            <div>
                <div>My Name Is: <strong>{myName}</strong></div>
                <h3 onMouseOver={() => setMyName("UnstableCastle")} onMouseOut={() => setMyName("CASTLE")} style={{ cursor: 'pointer', color: 'blue' }}
                > Hover on me to update name  </h3>
            </div>

            <hr style={{ margin: '20px 0' }} />
            <div id="div1" style={{ maxWidth: '300px' }}>
                <h2>My Menu</h2>
                {items.length === 0 && <p>No items left!</p>}
                <ul style={{ listStyleType: 'none', padding: 0 }}>
                    {items.map((item) => (
                        <li
                            key={item.id}
                            style={{
                                display: 'flex',
                                justifyContent: 'space-between',
                                marginBottom: '10px',
                                padding: '8px',
                                border: '1px solid #ccc',
                                borderRadius: '4px'
                            }}
                        >
                            <span>{item.name}</span>
                            <button onClick={() => removeItem(item.id)}>
                                Remove
                            </button>
                        </li>
                    ))}
                </ul>
            </div>
        </div>
    );
};

export default UseStateHookComp;