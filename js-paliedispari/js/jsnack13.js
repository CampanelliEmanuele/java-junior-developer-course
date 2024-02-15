/**
 * Crea una funzione chiamata mediaAritmetica che prende in input un array di 10 
 * numeri e restituisca la media aritmetica dei numeri contenuti nell'array.
 * Utilizzare la funzione sommaNumeri precedentemente creata per calcolare la media 
 * dei 10 numeri che vanno chiesti all'utente attraverso dei prompt.
*/

/* Return a random number between two elements. */
function getRandomNumber(max, min) {
    max++; min++;
    return Math.floor(Math.random() * (max - min + 1) + min)
}

/* Return an array of integer with length size. */
function getArrFromUser(length) {
    let arr = [];
    for (let i = 0; i < length; i++) {
        let userNumber = parseInt(prompt("Enter the " + i + "-th element: "));
        arr.push(userNumber)
    }
    return arr;
}

function numberSum(arr) {
    let sum = 0;
    console.log("Array content: ")
    for (let i = 0; i < arr.length; i++) {
        console.log("arr[" + i + "] = " + arr[i])
        sum += arr[i];
    }
    return sum;
}

function arithmeticAverage(arr) {
    return numberSum(arr) / arr.length;
}

let arr = getArrFromUser(10);

console.log("The average of the array is: " + arithmeticAverage(arr));

