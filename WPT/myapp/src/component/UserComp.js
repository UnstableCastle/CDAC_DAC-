import React from "react";

const UserComp = (props)=>{
    if(props.name==="Ganesh"){
        throw new Error("Not a user");
    }
    return <h2>User is:{props.name}</h2>
}

export default UserComp;