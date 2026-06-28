import axios from "axios";

const axiosInstance = axios.create(

    {
        baseURL:'https://localhost:7133/api'
    }
);
// axiosInstance.interceptors.request.use(request=>{

//     request.headers.set("Authorization",`Bearer ${'token'} `)

// });
export default axiosInstance;