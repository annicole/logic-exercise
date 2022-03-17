/*

You have two integer arrays, a and b, and an integer target value v. Determine whether there is a pair of numbers, where one number is taken from a and the other from b, that can be added together to get a sum of v. Return true if such a pair exists, otherwise return false.

Example

For a = [1, 2, 3], b = [10, 20, 30, 40], and v = 42, the output should be
solution(a, b, v) = true.

*/


class SumofTwo {


boolean solution(int[] a, int[] b, int v) {
    HashMap<Integer, Boolean> hash = new HashMap<>();
    for (int e : a) hash.put(v - e, true);
    for (int e : b) if (hash.containsKey(e)) return true;
    return false;
}


}