function reverseWords(sentence) {
    // Split the sentence into an array of words
    let words = sentence.split(' ');

    // Reverse each word
    let reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });

    // Join the reversed words back into a sentence
    let reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

// Example usage:
let inputSentence = "This is my girl";
let reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence); // Output: "siht si ym lrig"

