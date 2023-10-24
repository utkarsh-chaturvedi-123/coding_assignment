const string = "this is utkarsh chaturvedi";
let reverse = '';
let words = '';

for (let i = 0; i < string.length; i++) {
    if(string[i] !== " ")
    {
        words += string[i];
        
    }else{
        for(let j=words.length-1; j>=0; j--){
            reverse +=words[j]
        }
        reverse += " "
        words = " "
    }
        
   
}
for(let j=words.length-1; j>=0; j--){
    reverse +=words[j]
}
console.log(reverse)
 
