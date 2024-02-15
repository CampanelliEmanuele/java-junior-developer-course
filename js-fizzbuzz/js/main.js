// Si scorrono i numeri da 1 a 100
for (let i = 1; i <= 100; i++) {

  if (i % 3 == 0 && i % 5 == 0) { // Se i e' divisibile sia per 3 che per 5
    console.log("FizzBuzz")
  } else if (i % 3 == 0) {   // Se i e' divisibile per 3
    console.log("Fizz")
  } else if (i % 5 == 0) {   // Se i e' divisibile per 5
    console.log("Buzz")
  } else {                  // Altrimenti si stampa semplicemente il numero
    console.log(i)
  }

}

