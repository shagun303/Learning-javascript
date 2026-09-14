function Person(name){
    this.name = name;
}

Person.prototype.greet = function(){
    console.log(`Hello! My name is${this.name}`)
};

let john = new Person("John");
console.log(john.greet());
//[[Prototype]]

