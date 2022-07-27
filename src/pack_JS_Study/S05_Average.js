var arr = [1,2,3,4];
var reducer = (accumulator,curr) => accumulator + curr;
var answer = arr.reduce(reducer)/arr.length;
console.log(answer);
//물론 이문제는 for문으로 푸는게 기초인데 reducer()메소드라는게 있길래 써봤다. 사실 answer부분도 리듀서로 쓰면 전체코드가 
//한줄이 되지만 보기 힘드므로 나누어썼다.