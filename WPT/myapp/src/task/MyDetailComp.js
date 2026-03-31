const MyDetails = (props) => {
    return (
        <div>
            <p>Name: <strong>{props.myname} {props.lname}</strong> City: <em>{props.city}</em> Qualification <ins>{props.quli}</ins> Gender:{props.g} Country:{props.c}</p>
            <br></br>
            <p>...from MyDetailComp </p>
            <hr></hr>
        </div>
    )


}

export default MyDetails;