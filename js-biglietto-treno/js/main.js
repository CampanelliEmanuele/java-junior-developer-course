let km = parseInt(prompt("Enter distance (in km): "));
let age = parseInt(prompt("Enter your age: "));

if (km > 0 && age > 0 && age <= 100) {
    let output = `
Entered informations:
    ${km}km
    ${age} years

The price for you is equal to: `;

    let basePrice = 0.21 * km;
    let onePercent = basePrice / 100;
    let finalPrice = basePrice;

    if (age >= 65) {
        finalPrice = basePrice - 40 * onePercent;
    }
    else if (age >= 18) {
        finalPrice = basePrice - 20 * onePercent;
    }

    output += finalPrice.toFixed(2);
    output += '$';
    console.log(output);
} else if (km == 0 || age == 0) {
    console.log("ERROR: input cannot be equal to 0.");
} else {
    console.log("ERROR: invalid inputs.")
}
