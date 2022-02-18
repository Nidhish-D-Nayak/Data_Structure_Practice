//#1 BASIC ARRAYS - Static Arrays
console.log("Hello world");
class MyArray {
    constructor() {
        this.length = 0;
        this.data = {};
    }
    get(index) {
        return this.data[index];
    }
    push(item) {
        this.data[this.length] = item;
        this.length++;
        return this.legth;
    }
}
const newArray = new MyArray();
newArray.push("Hi");
console.log(newArray);

// #HashMaps Example
let hashMapMain = new Map();
hashMapMain.set("main", "project");
hashMapMain.set("flag", "projec2");
console.log(hashMapMain);

// #JS Objects

let objectOne = { "firstName": "John", lastName: "Doe", mage: 20, age: 50, eyeColor: "blue" };
console.log(objectOne);
let push = (name, value) => {
    objectOne[name] = value;
}
push('Nidhish', 23);
console.log(objectOne);

// #More Extras

