/*
A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

Write a function:

function solution(N);

that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

Write an efficient algorithm for the following assu


*/



function solution(N) {
    // write your code in JavaScript (Node.js 8.9.4)
    let binaryNum = Number(N).toString(2);
    let array = binaryNum.split('')
    const allOne = array.every(num => num === '1');
    let max = 0;
    if (!allOne) {
        let counter = 0;
        array.forEach(num => {
            if (num === '0') {
                counter++;
            } else if (num === '1' && counter > 0) {
                max = Math.max(max, counter);
                counter = 0;
            }
        });
    }
    return max;
}

var binaryGap = function(n) {
    var str = (n >>> 0).toString(2), start = 0, end = 0, diff = 0;
    for(var i=0;i<str.length;i++) {
    	if(str[i] === '1') {
      	end = i;
        diff = Math.max(diff, end - start);
        start = i;
      } 
    }
    return diff;
};