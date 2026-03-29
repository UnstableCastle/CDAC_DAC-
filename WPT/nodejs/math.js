const add = (num1,num2)=>{
    return `Add of ${num1},${num2} = ${num1+num2}`;
}
const sub = (num1,num2)=>{
    return `SUB of ${num1},${num2} = ${num1-num2}`;
}
const mult = (num1,num2)=>{
    return `MUL of ${num1},${num2} = ${num1*num2}`;
}
const div = (num1,num2)=>{
    return `DIV of ${num1},${num2} = ${num1/num2}`;
}

module.exports={add,sub,div,mult}
