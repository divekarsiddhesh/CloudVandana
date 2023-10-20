function reverseWords(sentence) {

    let words = sentence.split(" ");

    
    let reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });

    let reversedSentence = reversedWords.join(" ");

    return reversedSentence;
}

let inputSentence = "Welcome to Cloud Vandana";
let reversedSentence = reverseWords(inputSentence);

console.log("Original Sentence: " + inputSentence);
console.log("Reversed Sentence: " + reversedSentence);


