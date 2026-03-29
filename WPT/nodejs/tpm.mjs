import validator from 'validator';

import chalk from 'chalk';

let myname = "";
console.log(validator.isEmpty(myname));
let friend = "CASTLE";
console.log(validator.isEmpty(friend));
let email = "castle@abc.com";

console.log(chalk.blue.bold.bgCyan('UnstableCastle'));
console.log(chalk.blue.bold.bgMagenta('UnstableCastle'));

let danger = chalk.bgRed.white.italic;
let success = chalk.bgGreen.white.bold;

console.log(danger("went wrong"));
console.log(success("went good"));

// C:\D DRIVE\DAC\CDAC_DAC-\WPT\nodejs>node tpm.mjs
// true
// false
// UnstableCastle
// UnstableCastle
// went wrong
// went good
