var n = 3;
var m = 12;
var answer = [];

var min = (n < m) ? n : m;
var gcd = 0;
for (var i = 1; i <= min; i++) {
	if(n % i == 0 && m % i == 0) gcd = i;
}
answer[0] = gcd;
answer[1] = n*m/gcd;
console.log(answer);
/*

function gcdlcm(a, b) {
    var r;
    for(var ab= a*b; r = a % b; a = b, b = r){}
    return [b, ab/b];
}
와;;;; 이생각 어떻게한거지 대체
*/