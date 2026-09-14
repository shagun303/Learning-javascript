/* 
1.Describe an array named `teaFlavors` that containes the strings `"green tea"`.`"black tea"`,and `"oolong tea"`.
Access the first element of the array and store it in a variable named `FirstTea`*/


let teaFlavors=["green tea","black tea","oolong tea"];
// let teafl=new Array("green tea","black tea","oolong tea")

const FirstTea=teaFlavors[0];
console.log(FirstTea);

/* 
2.Declare an array named `cities` containing `"London"`,`"Paris"`,and `"New York"`.
Access the third element in the array and store it in avariable named `favouriteCity`.
*/

let cities=["London","Tokyo","Paris","New York"];
const favouriteCity=cities[2];

console.log(favouriteCity);

/*
3. You have an array names `teaType` containing `"herbal tea"`,`"white tea"`,`"masala tea"`.
Change the second element of the array to `"jasmine tea"`.
*/

let teaType=["herbal tea","white tea","masala tea"];
teaType[1]="jasmine tea";
console.log(teaType);

/*
4.Declare an array named `citiesvisited` containing `"Mumbai"` and `"Sydney"`.
Add `"Berlin"` to the array using the `push` method.
*/

let citiesvisited=["Mumbai","Sydney"];
citiesvisited.push("Berlin");
console.log(citiesvisited);

/*
5.You have an array names `teaOrders` with `"chai"`,`"iced tea"`,`"matcha"`,and `"earl grey"`.
Remove the last element of the array using 'pop' method and store it in a variable named `lastOrder`.
*/

let teaOrders=["chai","iced tea","matcha","earl grey"];
lastOrder=teaOrders.pop();
console.log(lastOrder);

/*
6.You have an array named `popularTeas` containing `"`greentea"`,`"oolong tea"`,and `"chai"`.
Create a soft copy of this array named `softCopyTeas`.
*/

let popularTeas=["green tea","oolong tea","chai"];
const softCopyTeas=popularTeas;
console.log(softCopyTeas);
console.log(popularTeas);

/*
7.You have an array:`topCities` containing `"Berlin"`,`"Singapore"`,and `"New York"`.
Create a hard copy of this aaray named `hardCopyCities`.
*/

let topCities=["Berlin","Singapore","New York"];
let hardCopyCities=[...topCities];// another way topCities.slice();
console.log(hardCopyCities);
topCities.pop();
console.log(topCities);

/*
8. You have an arrays: `europeanCities` containing `"Paris"`and `"Rome"`and `assianCities` containing `"Tokyo"` and `"Bangkok"`.
Merge these teo aarays into a new array named as `worldCities`.
*/

let europeanCities=["Paris","Rome"];
let assianCities=["Tokyo","Bangkok"];
let worldCities=europeanCities.concat(assianCities);
console.log(worldCities);

/*
9.You have an array named `teaMenu` containing `"masala tea"`,`"green tea"`,and `"earl grey"`.
find the length of the array and store it in a variable named `menuLength`.
*/

let teaMenu=["masala tea","green tea","earl grey"];
let menuLength=teaMenu.length;
console.log(menuLength);

/*
10.You have an array named `cityBucketList` containing `"Kyoto"`,`"London"`,`"Cape Town"`, and `"Vancouver"`.
Check if `LOndon` is in the array and store the result in a varible named `isLondonInList`.
*/

let cityBucketList=["Kyoto","London","Cape Town","Vancouver"];
isLondonInList=cityBucketList.includes("London");
console.log(isLondonInList)