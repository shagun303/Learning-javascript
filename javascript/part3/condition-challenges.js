// checking if a number greater than another number

let num1=8
let num2=10

console.log("upper")

if(num1<num2){
    console.log("num is greater")
}
else{
    console.log("num is lesser")
}

console.log("bottom")

//checking if a strings equal or not

let username="hello"
let anotherUsername="hello"
if(username==anotherUsername){
    console.log("pick another username")
}

//checking if a variable is number or not
let num=22
if(typeof num==='number'){
    console.log("yes,it is a number")
}else{
    console.log('no,it is not a number')
}

//checking if a boolean is true or false

let isActive=false
if(isActive){
    console.log("ACTIVE")
}else{
    console.log("NOT ACTIVE")
}

//checking if an array is empty or not

let arr=[]
console.log(arr.length)
if(arr.length===0){
    console.log("array is empty")
}else{
    console.log("array is not empty")
}