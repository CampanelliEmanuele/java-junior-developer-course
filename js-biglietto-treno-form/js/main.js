

const submitBtn = document.getElementById("submitBtn");

submitBtn.addEventListener("click", function(event) {
    event.preventDefault();

    let name = document.getElementById("inputName").value;
    let surname = document.getElementById("inputSurname").value;
    let km = document.getElementById("inputKm").value;
    let ageCase = document.getElementById("inputAge").value;

    document.getElementById("ticket").classList.remove("d-none");

    let ticketCode = Math.floor(Math.random() * 10001);
    let basePrice = 0.21 * km;
    let finalPrice = basePrice;

    switch (ageCase) {
        case "middleAge":
            finalPrice = basePrice * 0.8;
            break;
        case "overAge":
            finalPrice = basePrice * 0.6;
            break;
    }
    let ticketPrice = finalPrice.toFixed(2);

    document.getElementById("ticketCompleteName").innerHTML = name + ' ' + surname
    document.getElementById("ticketDistance").innerHTML = km + ' km'
    document.getElementById("ticketCode").innerHTML = ticketCode
    document.getElementById("ticketPrice").innerHTML = ticketPrice + '$'

});


