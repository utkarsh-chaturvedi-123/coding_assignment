function descendingOrderArray(array) {
  for (let i = 0; i < array.length; i++) {
    for (let j = i+1; j < array.length; j++) {
      if(array[i] < array[j]){
        let temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
  }
  return array;
}

const array = [5,4,7,8,9,2,88];

console.log(descendingOrderArray(array))
