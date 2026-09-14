//1.
let car = {
    make:"Toyota",
    model:"Camry",
    year:2020,

    start:function(){
        return `${this.make} car got started in ${this.year} `;
    },
};
console.log(car.start());

//2.
function Person(name, age){
    this.name = name;
    this.age = age;
}

let john = new Person("john", 20);
console.log(john.name);

//prototypl change

function Animal(type){
    this.type = type;
    
}

Animal.prototype.speak = function(){
    return `${this.type} makes a sound`;
}

Array.prototype.hitesh = function (){
    return `Custom method ${this}`;
}

let myArray = [1,2,3];
console.log(myArray.hitesh());

let myAnimal =new Animal("dog");
console.log(myAnimal.speak());

//class and inheritence in javascript
class vehicle{
    constructor(make,model){
        this.make = make;
        this.model = model;
    }

    start(){
        return `${this.model} is a car from ${this.make}`;
    }
}

class Car extends vehicle {
    drive(){
        return `${this.make} : This is an inheritence example;`
    }
}

let myCar = new Car("Toyota","Corolla");
console.log(myCar.start());
console.log(myCar.drive());

let vehOne = new vehicle("Toyota","corolla");
console.log(vehOne.make);

//Encapsulation
class BankAccount {
    #balance = 0;

    deposit(amount){
        this.#balance += amount;
        return this.#balance;
    }

    getBalance(){
        return `$${this.#balance}`;
    }
}

let account = new BankAccount();
console.log(account.deposit(100000));
console.log(account.getBalance());

//Abstraction
class coffeeMachine {
     start() {
        return `starting the machine....`;
     }

     brewCoffee() {
        return `Brewing coffee!!`;
     }

     pressStartButton(){
       let msgOne = this.start();
       let msgTwo =  this.brewCoffee();
       return `${msgOne}\n${msgTwo}`;
  
     }
}
let myCoffee = new coffeeMachine();
console.log(myCoffee.pressStartButton());

//Poluymorphism
class Bird{

    fly(){
        return `I am flying....`;
    }
}

class Penguin extends Bird{

    fly(){
        return `Penguins are flying.....`;
    }
}

let myBird = new Bird();
let penguin = new Penguin();
console.log(myBird.fly());
console.log(penguin.fly());

//Static Method
class Calculator{
 static add(a,b){
        return a+b;
    }
}

console.log(Calculator.add(2,3))

//Getter and Setter
class Employee{
    #salary;
    constructor(name,salary){
        if(salary < 0){
            throw new error("Salary cannot be in negative");
        }
        this.name = name;
        this.#salary = salary;

    }
      get salary(){
        return `You are not allowed to see salary`;
      }

      set salary(value){
        if(value < 0){
            console.log("Invalid Salary");
        }
        else {
            this._salary = value;
        }
     }

}
let emp = new Employee("Alice",-20000);
console.log(emp.salary);
emp.salary = 60000;



