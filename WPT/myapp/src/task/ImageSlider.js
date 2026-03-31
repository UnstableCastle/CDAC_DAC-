import staticData from "../shared/constant/constantData";
import React, { useState } from "react";

const SliderImages = () => {
    const images = [
        staticData.lambo,
        staticData.hura,
        staticData.c63
    ];

    const [index, setIndex] = useState(0);

    const nextImg = () => {
        setIndex((prev) => (prev + 1) % images.length);
    };

    const prevImg = () => {
        setIndex((prev) => (prev - 1 + images.length) % images.length);
    };

    return (
        <div>
            <h3>Images</h3>

            <img
                src={images[index]}
                alt="car"
                width="400px"
                height="500px"
            />

            <br /><br />

            <button type="button" onClick={prevImg}>
                ⬅️ Prev
            </button>

            <button type="button" onClick={nextImg}>
                Next ➡️
            </button>
        </div>
    );
};

export default SliderImages;
