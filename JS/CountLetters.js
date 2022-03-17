

/**
 * 
 * @param word 
 * # Encode String



## Task



#### Given a string, encode it in such a way that the repeated consecutive characters are represented by the number of times they have been repeated so far and followed by the character



### Constrains

- You always will receive characters from A - Z

- No extra validations needed



### Input

`AAAYYCCDDDOO`



### Output 

`3A2Y2C3D2O`
 * @returns 
 */

function countLetters(word){
    let result="";
    let counter = 1;
    for(let i=0; i<word.length;i++){
      let currentLetter = word[i];
      let nextLetter = word [i+1];
      if(currentLetter === nextLetter){
        counter ++;
      }else{
        result = result + counter + word[i];
        counter = 1;
    }
     console.log(result);
    }
    return result;
    }
    
    countLetters("AAAUAAONMNMAA");