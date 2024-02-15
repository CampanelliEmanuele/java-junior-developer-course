/**
 * Crea una funzione chiamata sommaNumeri che dato un array di 10
 * numeri definito da voi nel codice, ne calcoli la loro somma e la restituisca come risultato.
 * Utilizzare la funzione sommaNumeri per stampare il risultato ottenuto.
*/

/* Return a random number between two elements. */
function getRandomNumber(max, min) {
    max++; min++;
    return Math.floor(Math.random() * (max - min + 1) + min)
}

/* Return an array of integer with length size. */
function getArr(length) {
    let arr = [];
    for (let i = 0; i < length; i++) {
        arr.push(getRandomNumber(0, 9))
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

let arr = getArr(10);

console.log("The sum of array's elements is: " + numberSum(arr));
