import { useState } from 'react';

export default function App() {
  const name = "Castle";
  const [count, setCount] = useState(0);
  const [text, setText] = useState("");

  function handleIncrement() {
    setCount(count + 1);
  }

  function handleDecrement() {
    setCount(count - 1);
  }

  function handleReset() {
    setCount(0);
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
        justifyContent: "center",
      }}
    >
      <h1>{name}</h1>
      <hr style={{ width: "200px", borderColor: "#334155" }} />

      {/* Count Display */}
      <div style={{ fontSize: "2.5rem", fontWeight: "bold", margin: "20px 0" }}>
        Count : {count}
      </div>

      {/* Button Row */}
      <div style={{ display: "flex", gap: "10px" }}>
        <button
          onClick={handleIncrement}
          style={{ padding: "8px 16px", cursor: "pointer", borderRadius: "4px" }}
        >
          Increase
        </button>

        <button
          onClick={handleDecrement}
          style={{ padding: "8px 16px", cursor: "pointer", borderRadius: "4px" }}
        >
          Decrease
        </button>

        <button
          onClick={handleReset}
          style={{ padding: "8px 16px", cursor: "pointer", borderRadius: "4px" }}
        >
          Reset
        </button>
      </div>


      <div>
<br/>
      <label style={{display:"block",marginBottom:"8px"}}>Type Something....</label>
      
      <input type='text' value={text} onChange={(e)=>setText(e.target.value)}placeholder='Enter text....'style={{padding:"8px 16px",}}></input>

      </div>
<div>

Text Preview : {text? text:"(start typing above)"}
<hr/>

</div>

    </div>
  );
}