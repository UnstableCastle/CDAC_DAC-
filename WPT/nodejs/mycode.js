const myName = "UnstableCastle";

const oddNumber = (num) => {
    if (num % 2 != 0) {
        return `${num} is Odd Number`;
    } else {
        return `${num} is even Number`;
    }
}

module.exports = { myName, oddNumber };