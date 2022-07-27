var arr1 = [[1,2],[2,3]];
var arr2 = [[3,4],[5,6]];
var answer = [[]];
    /*for(var i =0; i < arr1.length; i++){
        answer[i] = new Array(arr1[i].length);
    }*/
    for(var i = 0; i < arr1.length; i++){
        answer[i]=[];
        for(var j = 0; j < arr1[i].length;j++){
            answer[i].push(arr1[i][j] + arr2[i][j]);
        }
    }
console.log(answer);