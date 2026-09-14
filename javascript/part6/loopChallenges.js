// 1................................................
let teas = ["green tea","black tea","chai","oolong tea"];
let selectedTeas = [];

for(let i = 0; i < teas.length; i++){
    if(teas[i] === "chai"){
         break;
    }
   selectedTeas.push(teas[i]);
}
console.log(selectedTeas);

//2.............................................
let cities = ["London","New York","Paris","Berlin"];
let visitedCities = [];
for(let j = 0;j<cities.length; j++){
    if(cities[j] === "Paris" || cities[j] === "paris"){
        continue;
    }
    visitedCities.push(cities[j]);
}
console.log(visitedCities);

//3...............................................
let numbers = [1,2,3,4,5];
let smallNumbers = [];

for (const num of numbers) {
    if(num === 4){
        break;
    }
    smallNumbers.push(num);
    }
   console.log(smallNumbers); 

//4..............................................
let indianTea = ["chai","green tea","herbal tea","black tea"];
let preferredTeas = [];

for (const teas of indianTea) {
    if(teas === "herbal tea"){
        continue;
    }
    preferredTeas.push(teas);
 }
 console.log(preferredTeas);

//5............................................
let citiesPopulation = {
    "London":8900000,
    "New York":8400000,
     "Berlin":3500000,
    "Paris":2200000
   
}

let cityNewPopulations = {}
//console.log(Object.keys(citiesPopulation));

for (const city in citiesPopulation) {
    if(city === "Berlin"){
        break;

    }
    //console.log(citiesPopulation[city]);
    cityNewPopulations[city] = citiesPopulation[city];
    }
    console.log(cityNewPopulations);

 //6................................................
 let worldCities = {
    "Sydney":5000000,
    "Tokyo":9000000,
      "Paris":2200000,
    "Berlin":3500000
  
 }   
  
 let largeCities = {};
 for(const city in worldCities){
    if(worldCities[city] < 3000000 ){
        continue;
    }
    largeCities[city] = worldCities[city];
 }
 console.log(largeCities);

 //7.................................................

 let teaCollection = ["earl grey","green tea","chai","oolong tea"];
 let availableTeas = [];

 teaCollection.forEach(function(tea) {
    if(tea === "chai"){
       return;
    }
    availableTeas.push(tea);
    
 });
 console.log(availableTeas);

 //8..................................................
 
 let citiesNew = ["Berlin","Tokyo","Sydney","Paris"];
 let traveledCities = [];

citiesNew.forEach(function(city) {
    if(city === "Sydney"){
        return;
    }
     traveledCities.push(city);
    
 });
 console.log(traveledCities);

 //9.................................................
 let num = [2,5,7,9];
 let doubledNumbers = [];

 for(let i = 0; i < num.length; i++){
    if(num[i] === 7){
        continue;
    }
    num[i] *= 2;
    doubledNumbers.push(num[i]);
 }
 console.log(doubledNumbers);

 //10..................................................

 let anotherTea = ["chai","green tea","black tea","jasmine tea","herbal tea"];
 let shortTeas = [];
  
 for (const tea of anotherTea) {
    if(tea.length > 10){
        break;
    }
    shortTeas.push(tea);
    
 }
 console.log(shortTeas);




