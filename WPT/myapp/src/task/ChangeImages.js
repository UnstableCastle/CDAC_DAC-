import staticData from "../shared/constant/constantData";
import React, { useState } from "react";

const ChangeImages = () => {
    const [img, setImg] = useState(staticData.lambo);

    const changeToHura = () => {
        setImg(staticData.hura);
    };

    const changeToC63 = () => {
        setImg(staticData.c63);
    };

    const changeToLambo = () => {
        setImg(staticData.lambo);
    };

    return (
        <div>
            <h3>Images</h3>

            <img
                src={img}
                alt="car"
                width="400px"
                height="500px"
            />

            <br /><br />

            <button type="button" onClick={changeToHura}>
                Huracan
            </button>

            <button type="button" onClick={changeToC63}>
                C63
            </button>

            <button type="button" onClick={changeToLambo}>
                Lambo
            </button>
        </div>
    );
};

export default ChangeImages;
