/* PALINDROME EXERCISE */

function isPalindrome(word) {
    for (let i = 0; i < word.length; i++) {
        let reverseIndex = word.length - i - 1;
        if (word[i] != word[reverseIndex]) {
            return false;
        }
    }
    return true;
}

function removeWhiteSpaces(word) {
    return word.replace(/\s+/g, '');
}

let word = prompt("Enter a word: ");

word = removeWhiteSpaces(word)

if (isPalindrome(word)) {
    console.log("The word " + word + " IS palindrome.")
} else {
    console.log("The word " + word + " IS NOT palindrome.")
}