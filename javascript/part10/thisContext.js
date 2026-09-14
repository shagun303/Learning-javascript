const person = {
    name:"Shagun",
    greet(){
        console.log (`Hii ! I am ${this.name} `);
    },
};

person.greet();

const greetFunction = person.greet;
greetFunction();//undefined

const boundGreet = person.greet.bind({name:"John"});// for printing name we have to bind it .
boundGreet();