function checkWords(a,b) {

    let wordOne = a.split("");
    let wordTwo = b.split("");

    wordOne.sort();
    wordTwo.sort();

    if (wordOne.length != wordTwo.length){
        console.log("Length is not same");
    }else{
        for (let i = 0; i<wordOne.length;i++){
            if (wordOne[i] != wordTwo[i]){
                console.log("This words are not anagram words");
                return false;
            }
        }
        console.log("the " + a +" word and " + b +" words are anagram" );
    }



}
module.exports = {checkWords}