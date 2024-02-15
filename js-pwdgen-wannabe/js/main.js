
let name = prompt("Enter your name");
let surname = prompt("Enter your surname");
let color = prompt("Enter a color");

let password = name + ' ' + surname + ' ' + color + ' ';

let output = password + '21';
console.log(output);
document.getElementById("baseExercise").innerHTML = output;

let firstNumber = parseInt(prompt("Enter a number"));
let secondNumber = parseInt(prompt("Enter a second number"));
output = password + (firstNumber / secondNumber);
console.log(output);
document.getElementById("bonus1").innerHTML = output;

/* Generate a random integer between 1 and 1000 */
let casualNumber = Math.floor(Math.random() * 1001);

output = password + casualNumber;
console.log(output);
document.getElementById("bonus4").innerHTML = output;