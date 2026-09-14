//1.
function makeTea( typeOfTea){
    return `Making ${typeOfTea}`;
}
let teaOrder = makeTea("green tea");
console.log(teaOrder);

//2.
function orderTea(teaType){
    function confirmOrder(){
        return `Order confirmed for ${teaType}`;
    }
   return confirmOrder();

}
console.log(orderTea("chai"));

//3.
const calculateTotal = (price,quantity) => price * quantity;// return 

let totalCost = calculateTotal(200,4);
console.log(totalCost);

//4.
function makeTea(typeOfTea){
    return `maketea: ${typeOfTea}`;
}

function processTeaOrder(teaFunction){
   return teaFunction('earl grey');
}

let order = processTeaOrder(makeTea);
console.log(order);

//5.
function createTeaMaker(){
    return function(teaType){
        return `Making ${teaType}`;
    };
}
let teaMaker = createTeaMaker();
console.log(teaMaker("green tea"));