import {createBrowserRouter} from 'react-router-dom';
import MyImagesComp from '../component/MyImagesComp';
import SliderImages from '../task/ImageSlider';
import PageNotFount from '../Layout/PageNotFount';
import ParentComp from '../component/ParentComp';
import Dashboard from '../Layout/Dashboard';
import UseStateHookComp from '../Hooks/UseStateHookComp';
import LoginComp from '../Layout/LoginComp';
import UseEffectHookComp from '../Hooks/UseEffectHookComp';
import ReactHookComp from '../Hooks/ReactHookComp';
import NavComp from '../Layout/NavComp';

const router = createBrowserRouter([
    {path: "", element: <LoginComp/>},
    {path: "login", element: <LoginComp/>},
    {path: "dashboard", element: <Dashboard/>, children: [
        // 2. default routing 
        {path: "", element: <SliderImages/>},
        // 1. naming routing 
        {path: "myimages", element: <MyImagesComp/>},
        {path: "slider", element: <SliderImages/>},
        // 3.parameterize routing 
        {path: "parent/:id", element: <ParentComp/>},
        // 4.child routing
        {path: "hooks", element: <ReactHookComp/>, children: [
            {path: "", element: <UseStateHookComp/>},
            {path: "usestate", element: <UseStateHookComp/>},
            {path: "useeffect", element: <UseEffectHookComp/>},
        ]}, 
    ]},
    
    //5. wild card routing 
    {path: "*", element: <PageNotFount/>}
]);

export default router;