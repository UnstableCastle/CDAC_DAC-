import { useEffect, useState } from "react";
import { getAllEmployee } from "../Services/EmployeeService";

export const EmployeeList = () => {

    const [employee, setEmployee] = useState([]);

    useEffect(() => {
        (async () => {
            const data = await getAllEmployee();
            console.log(data);   // Check API response
            setEmployee(data);
        })();
    }, []);

    return (
        <div className="container mt-3">
            <h2>Employee List</h2>

            <table className="table table-hover table-striped">
                <thead>
                    <tr>
                        <th>Emp ID</th>
                        <th>Name</th>
                    </tr>
                </thead>

                <tbody>
                    {employee.map(emp => (
                        <tr key={emp.id}>
                            <td>{emp.id}</td>
                            <td>{emp.name}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
};