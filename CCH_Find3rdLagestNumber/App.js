function FindNumber(array) {
    for (let i = 0; i <array.length; i++){
        for (let j = 0; j <array.length; j++){
            if (array[j] > array[j+1]){
                let swap = array[j];
                array[j] = array[j+1];
                array[j+1] = swap;
            }
        }
    }

    console.log("The 3rd largest number is : ", array[array.length-3]);
}

module.exports = {FindNumber}