/*

Given a string s consisting of small English letters, find and return the first instance of a non-repeating character in it.
 If there is no such character, return '_'.
Example
For s = "abacabad", the output should be
solution(s) = 'c'.
There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the string first.

*/
package interview.Array;

/**
 *
 * @author ANA.ROSAS
 */

public class FirstNotRepeating {
char solution(String s) {
    char res='-';
    char[] arrayChar = s.toCharArray();
    HashMap<Character,Integer> listChar = new HashMap<>();
 for(int i=0; i<arrayChar.length;i++){
     if(!listChar.containsKey(arrayChar[i])){
         listChar.put(arrayChar[i], 1);
     }else {
         listChar.put(arrayChar[i], listChar.get(arrayChar[i])+1);
     }
 }
 for(Character c : arrayChar){
     if(listChar.get(c) == 1){
          return c;
     }
 }
 return  '_';
}

char solution(String s) {
    char[] c=s.toCharArray();
for(int i=0;i<s.length();i++){
    if(s.indexOf(c[i])==s.lastIndexOf(c[i]))
        return c[i];
}
    return '_';
}

}