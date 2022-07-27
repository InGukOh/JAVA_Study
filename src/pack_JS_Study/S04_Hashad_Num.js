var x = 11;
var anaswer = true;

var to_S = String(x).split('');
var sum = 0;
for(var i = 0; i<to_S.length; i++){
	sum+=parseInt(to_S[i]);
}
if(x%sum != 0){
	answer = false;
}

console.log(to_S);
console.log(sum);
console.log(answer);