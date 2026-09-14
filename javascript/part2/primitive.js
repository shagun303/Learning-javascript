//number

let bal=120;
let bal2=new Number(120)

console.log(typeof(bal))
console.log(typeof(bal2))

//boolean

let isactive=true;
let isreallyactive = new Boolean(true)

console.log(typeof(isactive))
console.log(typeof(isreallyactive))

//null and undefined

let firstname=null
let lastname

console.log(firstname)
console.log(lastname)

//string
let name="rhea"
let myString='hiii'
let oldGreet=`hmm`

let geetMassage= name + "byyy"
console.log(geetMassage)

let message=`hello ${name} `
let demo=`Total money ${100 * 5}`

console.log(message)
console.log(demo)

//symbol
let sm1=Symbol()
let sm2=Symbol()
console.log(sm1==sm2)