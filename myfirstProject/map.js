let arr= [1,2,3,4];
let brr = arr.map(function square(x){
   return x*x;
    
})
console.log(brr)

function cube(ele){
    return ele**3;
}
let crr=arr.map(cube);
console.log(crr)

let drr = arr.map((ele) => ele*2);
console.log(drr);

// for(let i = 1;i<10;i++){
// setTimeout(function(){
   
//         console.log(11-i);}
    
// ,i*1000)
//  }
