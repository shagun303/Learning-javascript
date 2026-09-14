//object

let username={firstname:"shagun"}

console.log(username)
console.log(typeof(username))

//another way

const names={
    "first name":"ravi",
    lastname:"kkkk"
}

names.lastname="rrr"// it changes the value not refrence (values are mutable)
console.log(names.lastname) //this prints lastname only ( it is used to print specific value from the object) 
console.log(names)
console.log(names['first name'])//accessing like this when there is space b/w variables name

let today=new Date();
//console.log(today.getDate());

//Arrays

let arr=["hello",true];
console.log(arr[0]);

let isValue=true;
console.log( isValue + 1)//2 ,becoz true consider as 1 and 0 for false
console.log(Number(isValue))//it converts into number only when it contained no.s as String
console.log(Number(null))//0
console.log(Number(undefined))//NaN(not a no.)
 
