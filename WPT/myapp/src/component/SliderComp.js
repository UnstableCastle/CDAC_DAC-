import React from 'react'
import Carousel from 'react-bootstrap/Carousel';
import staticData from '../shared/constant/constantData';

const SliderComp = () => {
    return (<div>
        <h2>Slider component</h2>
        <Carousel>
            <Carousel.Item>
                {/* <ExampleCarouselImage text="First slide" /> */}
                <img src={staticData.dosa} alt='dosa' style={{width:"100%",height:"400px"}} />
                <Carousel.Caption>
                    <h3>First slide label</h3>
                    <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
                </Carousel.Caption>
            </Carousel.Item>
            <Carousel.Item>
                {/* <ExampleCarouselImage text="Second slide" /> */}
               <img src={staticData.samoa} alt='samosa' style={{width:"100%",height:"400px"}}/>
                <Carousel.Caption>
                    <h3>Second slide label</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                </Carousel.Caption>
            </Carousel.Item>
            <Carousel.Item>
                {/* <ExampleCarouselImage text="Third slide" /> */}
                <img src={staticData.vadapav} alt='vadapav' style={{width:"100%",height:"400px"}} />
                <Carousel.Caption>
                    <h3>Third slide label</h3>
                    <p>
                        Praesent commodo cursus magna, vel scelerisque nisl consectetur.
                    </p>
                </Carousel.Caption>
            </Carousel.Item>
        </Carousel>
    </div>

    )
}

export default SliderComp
