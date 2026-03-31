import React, { Component } from "react";

class TimeComp extends Component {

    constructor() {
        super();
        this.state = {
            hour: 0,
            min: 0,
            sec: 0
        };
    }

    i_h() {
        this.setState(prev => ({ hour: prev.hour + 1 }), this.time_man);
    }

    i_m() {
        this.setState(prev => ({ min: prev.min + 1 }), this.time_man);
    }

    i_s() {
        this.setState(prev => ({ sec: prev.sec + 1 }), this.time_man);
    }

    reset() {
        this.setState({ hour: 0, min: 0, sec: 0 });
    }

    time_man() {
        let { hour, min, sec } = this.state;

        if (sec >= 60) {
            sec = 0;
            min += 1;
        }

        if (min >= 60) {
            min = 0;
            hour += 1;
        }

        if (hour >= 24) {
            hour = 0;
            alert("Time out of bound");
        }

        this.setState({ hour, min, sec });
    }

    render() {
        return (
            <div>
                <p>
                    Hour : {this.state.hour} | Min : {this.state.min} | Sec : {this.state.sec}
                </p>

                <button type="button" onClick={() => this.i_h()}>Hour</button>
                <button type="button" onClick={() => this.i_m()}>Min</button>
                <button type="button" onClick={() => this.i_s()}>Sec</button>

                <br /><br />

                <button type="button" onClick={() => this.reset()}>RESET</button>

                <hr />
            </div>
        );
    }
}

export default TimeComp;
