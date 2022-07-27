var num = 6;

var answer = 0;

while(num != 1 && answer !=500){
	num = (num%2==0) ? num/2 : num*3 + 1;
	answer++;
}
answer = (num==1)? answer : -1;
console.log(answer);