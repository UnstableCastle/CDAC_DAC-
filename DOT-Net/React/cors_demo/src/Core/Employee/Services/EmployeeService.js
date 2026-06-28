import axios from "../../../Shared/axios-instance";

async function getAllEmployee() {
    const response = await axios.get("/Employees");
    return response.data;
}

export { getAllEmployee };