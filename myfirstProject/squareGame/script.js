let s1 = document.getElementById("sq1");
s1.addEventListener("mouseenter",function(){
    let r = Math.floor( Math.random()*100);
    s1.innerHTML=r;
})

s1.addEventListener("dblclick",function(){
     let b = Math.floor(Math.random()*256);
let c = Math.floor(Math.random()*256);
let a = Math.floor(Math.random()*256);
    s1.style.backgroundColor =`rgb(${a},${b},${c})`;
})
s1.addEventListener("mouseleave",function(){
    s1.innerHTML="1";
})

let s2 = document.getElementById("sq2");
  let clr ="green";
s2.addEventListener("mouseenter",function(){
  
    if(clr == "green"){
        s2.style.backgroundColor = "green";
        clr = "red";
    }
    else{
        s2.style.backgroundColor = "red";
        clr = "green";
    }
 
  
})

s2.addEventListener("mouseleave",function(){
    s2.style.backgroundColor ="grey";
})

let s3 = document.getElementById("sq3");



s3.addEventListener("mouseenter",function(){
   let b = Math.floor(Math.random()*256);
let c = Math.floor(Math.random()*256);
let a = Math.floor(Math.random()*256);
    s3.style.backgroundColor =`rgb(${a},${b},${c})`;

})

s3.addEventListener("mouseleave",function(){
    s3.style.backgroundColor ="grey";
})

let s4 = document.getElementById("sq4");
s4.addEventListener("click",function(){
    let b = Math.floor(Math.random()*256);
    s1.style.backgroundColor =`rgb(${b},255,255)`;

    let p = Math.floor(Math.random()*256);
    s2.style.backgroundColor =`rgb(255,${p},255)`;

    let y = Math.floor(Math.random()*256);
    s3.style.backgroundColor =`rgb(255,255,${y})`;
})

s4.addEventListener("mouseout",function(){
    s1.style.backgroundColor ="grey";
       s2.style.backgroundColor ="grey";
          s3.style.backgroundColor ="grey";
})

let cursor = document.getElementById("cursor");
let main = document.getElementById("main");
main.addEventListener("mousemove",function(dets){
    cursor.style.left=dets.x +"px";
    cursor.style.top=dets.y +"px";
})