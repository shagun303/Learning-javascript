// filter return alway in true and false form
//#..........#
// mehtod 1
let arr = [1,2,3,4,5,6,7,8,9];
console.log(arr);

function evenOdd(ele){
    if(ele%2 != 0) return false;
    else return true;
}

let brr = arr.filter(evenOdd);
console.log(brr);

//method 2

let crr = arr.filter(function(ele){
    if(ele%2 == 0) return true;
    else return false;
})
console.log(crr);

//method 3

let drr = arr.filter((ele) =>{
    if(ele >= 5) return true;
    else return false;
})
console.log(drr);