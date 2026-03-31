const FuncComp = (props)=>{
    return (
                <div>
                <h1>this is function component</h1>
                <p>this is para</p>  
                <p>I'm : <em>{props.myname}</em>, hobby :  {props.hobby}</p>          
                </div>
            )
}

export default FuncComp;

