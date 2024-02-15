/* EVEN OR ODD EXERCISE */

function getUserChoise() {
    let userChoise = '';
    while (userChoise != 'even' && userChoise != 'odd') {
        userChoise = prompt("Chose even or odd by typing your choise: ");
    }
    return userChoise;
}

function getUserNumber() {
    let userNumber = 0;
    while (userNumber < 1 || userNumber > 5) {
        userNumber = prompt("Now enter a number between 1 and 5 (included): ");
    }
    return userNumber;
}

/* Extremes included */
function getRandomNumber(max, min) {
    max++; min++;
    return Math.floor(Math.random() * (max - min + 1) + min)
}

function isEven(num) {
    return num % 2 == 0;
}

let userChoise = getUserChoise();
let userNumber = getUserNumber();
let randomNumber = getRandomNumber(1, 5);

let sum = parseInt(userNumber) + parseInt(randomNumber);
console.log("");

let output = `
DATAS
user choise: ${userChoise}
user number: ${userNumber}
computer number: ${randomNumber}
sum: ${sum}
`;

if (isEven(sum) && userChoise == "even") {
    output += "The sum is even: U r the winner!";
} else if (!isEven(sum) && userChoise == "odd") {
    output += "The sum is odd: U r the winner!";
} else {
    output += "Nice try, for a loser...";
}

console.log(output);



