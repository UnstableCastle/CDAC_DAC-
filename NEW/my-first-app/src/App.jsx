import { useState } from 'react';

export default function App() {
  // State 1: Current text typed in the box
  const [inputText, setInputText] = useState("");

  // State 2: List of saved items (starts as an empty array)
  const [items, setItems] = useState([
    "Initial deposit: $500",
    "Server hosting fee: -$20"
  ]);

  // Function to add the typed item to the array
  function handleAddItem(e) {
    e.preventDefault(); // Prevents the browser from reloading the page

    // Don't add if the input is empty or just spaces
    if (inputText.trim() === "") return;

    // Create a new array with all existing items + the new text
    setItems([...items, inputText]);

    // Clear the input field for the next entry
    setInputText("");
  }

  // Function to delete a single item by its index
  function handleDeleteItem(indexToDelete) {
    // filter returns a brand-new array excluding the item at that index
    const updatedItems = items.filter((_, index) => index !== indexToDelete);
    setItems(updatedItems);
  }

  return (
    <div
      style={{
        minHeight: "100vh",
        backgroundColor: "#121824",
        color: "white",
        fontFamily: "monospace",
        display: "flex",
        flexDirection: "column",
        alignItems: "center",
        paddingTop: "50px",
      }}
    >
      <h2>Transaction Log</h2>

      {/* Form with input and add button */}
      <form onSubmit={handleAddItem} style={{ display: "flex", gap: "8px", marginBottom: "24px" }}>
        <input
          type="text"
          value={inputText}
          onChange={(e) => setInputText(e.target.value)}
          placeholder="e.g. Salary credited: $1200"
          style={{
            padding: "8px 12px",
            fontSize: "14px",
            borderRadius: "4px",
            border: "1px solid #475569",
            outline: "none",
            width: "260px",
          }}
        />
        <button
          type="submit"
          style={{
            padding: "8px 16px",
            backgroundColor: "#2563eb",
            color: "white",
            border: "none",
            borderRadius: "4px",
            cursor: "pointer",
            fontWeight: "bold",
          }}
        >
          Add
        </button>
      </form>

      {/* Rendered List Section */}
      <div style={{ width: "340px" }}>
        {items.length === 0 ? (
          <p style={{ color: "#64748b", textAlign: "center" }}>No records found.</p>
        ) : (
          <ul style={{ listStyle: "none", padding: 0, margin: 0 }}>
            {items.map((item, index) => (
              <li
                key={index}
                style={{
                  backgroundColor: "#1e293b",
                  border: "1px solid #334155",
                  borderRadius: "6px",
                  padding: "10px 14px",
                  marginBottom: "8px",
                  display: "flex",
                  justifyContent: "space-between",
                  alignItems: "center",
                }}
              >
                <span>{item}</span>
                <button
                  onClick={() => handleDeleteItem(index)}
                  style={{
                    backgroundColor: "transparent",
                    border: "none",
                    color: "#ef4444",
                    cursor: "pointer",
                    fontWeight: "bold",
                  }}
                >
                  ✕
                </button>
              </li>
            ))}
          </ul>
        )}
      </div>
    </div>
  );
}