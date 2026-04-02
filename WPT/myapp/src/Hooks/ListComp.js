import React, { Fragment, useState } from "react";

const ListComp = () => {
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
        
            <div style={{ maxWidth: '300px', margin: '20px auto', textAlign: 'left' }}>
                <h2>My Menu</h2>
                <hr />
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
    
    );
};

export default ListComp;