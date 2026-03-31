import staticData from "../shared/constant/constantData";
import React, { useState } from "react";

const ToggleImg = () => {
    const [img, setImg] = useState(staticData.lambo);

    const changeImg = () => {
        if (img === staticData.lambo) {
            setImg(staticData.hura);
        } else {
            setImg(staticData.lambo);
        }
    };

    return (
        <div>
            <h3>Images</h3>

            <img
                src={img}
                alt="car"
                width="500px"
                height="500px"
            />

            <br /><br />

            <button type="button" onClick={changeImg}>
                Change Image
            </button>
            <hr/>
        </div>
    );
};

export default ToggleImg;
