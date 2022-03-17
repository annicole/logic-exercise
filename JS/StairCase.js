
/**
 * 
 * 
 * Staircase

Task
Create a function that output the following stair (right aligned).
The function should receive the n parameter
console.log a staircase in “#” with the sign being right aligned depending on the n size
     #
    ##
   ###
  ####
 #####
######
function staircase(n) {
}
 */


function staircase(n) {
    let hashStr = '';
    let spaces = [];
    for(let i=1; i<n; i++){
      let auxStr = hashStr.split('');
      auxStr.push('#');
      hashStr = auxStr.join('').toString();
  
      for(let j=0; j<n-i; j++){
        
        spaces.push(' ')
        //console.log('spaces' ,spaces);
      }
      console.log(spaces.join('').toString() + '' + hashStr);
      spaces = []
    }
  }
  
  staircase(10)