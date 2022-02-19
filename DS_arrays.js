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

//More Extras
//String Question ? => Turn it into array => make operations => return as string

//Reverse a string
function reverse(str) {
    let hash = []
    for (let i = 0; i < str.length; i++) {
        hash[str.length - i] = str[i];
    }
    let main = hash.join('');
    return main;
}
//ES6 with methods
const reverse2 = str => str.split('').reverse().join('');
const str1 = "Nidhish";
console.log(reverse2(str1));

// MERGE Sorted ARRAYS
const mergeSortedArrays = (array1, array2) => {
    let array3 = [];
    for (let i = 0; i < array1.length + array2.length; i++) {
        if (i < array1.length) {
            array3[i] = array1[i];
        } else {
            array3[i] = array2[i - array1.length];
        }
    }
    arr = array3.sort(function (a, b) {
        return (a - b)
    });
    return arr;
}
console.log(mergeSortedArrays([0, 22, 43, 52], [3, 4, 6, 12, 32, 65]))
