//1.
function person(name,age){
    this.name = name;
    this.age = age;
}

//2.
function car(make,model){
    this.make = make;
    this.model = model;
}

let myCar = new car("Toyota","Camry");
console.log(myCar);

//3.
function Tea(type){
    this.type = type;
    this.describe = function(){
        return `this is a cup of ${this.type}`;
    }
}
let lemonTea =  new Tea("lemonTea");
console.log(lemonTea.describe());

//4.
function animal(species){
    this.species = species;
}

animal.prototype.sound = function(){
    return `${this.species} makes a sound`;
}

let dog = new animal("Dog");
console.log(dog.sound());

//5.

function Drink(name){
    if(!new.target){
        throw new Error("Drink must be called with new keyword");
    }
    this.name = name;

}
let tea = new Drink("tea");
console.log("tea");
let coffee = Drink("coffee");