
let x = document.querySelector("h1"); // it selects only first one of same tag  
// console.log(x);

let y = document.querySelectorAll("h1");
// console.log(y);

//class selector

let clas = document.querySelectorAll(".one");
// console.log(clas);

//change color through js
let col = document.querySelector("h2");
col.style.color = "blue";

//change text
let txt = document.querySelector("h3");
txt.innerHTML = "H3changed";

//change text after 2 second
let changeTxt = document.querySelector(".two");
setTimeout(function(){
    changeTxt.innerHTML ="Text changed after two second ";
},2000);

// change style by eventlistner
let clic = document.getElementById("ele");
clic.addEventListener("click",function(){
    clic.style.color ="orange";
    clic.style.backgroundColor = "green";
})



// eventlistner mousemove
let z = document.getElementById("ele2");
z.addEventListener("mousemove",function(){
    z.style.color ="yellow";
    z.style.backgroundColor ="grey";
})

// mouse leave eventlistner

z.addEventListener("mouseleave",function(){
    z.style.color = "black";
    z.style.backgroundColor ="#a1a1a1";
})

//click on ele2 and change occur in ele3

let ele = document.getElementById("ele3");
z.addEventListener("click",function(){
   ele.style.color ="white";
   ele.style.backgroundColor ="purple";
})


