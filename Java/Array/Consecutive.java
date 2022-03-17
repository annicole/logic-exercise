
/**


Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an non-negative integer size. Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly by 1. He may need some additional statues to be able to accomplish that. Help him figure out the minimum number of additional statues needed.

Example

For statues = [6, 2, 3, 8], the output should be
solution(statues) = 3.

Ratiorg needs statues of sizes 4, 5 and 7.

 */

public class Consecutive{
    int solution(int[] statues) {
    int min = statues[0];
    int max = statues[0];
    for (int i=1; i<statues.length; ++i) {
        min = Math.min(min, statues[i]);
        max = Math.max(max, statues[i]);
    }
    return (max-min+1) - statues.length;
}


int solution(int[] a) {
    Arrays.sort(a);
    int n = a[a.length-1] - a[0];
    return n - a.length + 1;
}

int solution(int[] statues) {
    int solution=0,aux=0;
    int[] arraySorted = statues; 
     Arrays.sort(arraySorted);
     
     for(int i=0;i<arraySorted.length-1;i++){
         aux= (arraySorted[i+1] - arraySorted[i])-1;
         if(aux !=0){
             solution = solution+ aux;
         }
     }
     
     return solution;
}

}