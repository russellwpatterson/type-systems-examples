// We can explicitly change the type of a variable.
let changeTypes = "some string";
console.log(changeTypes);

changeTypes = 23;
console.log(changeTypes);

// We can change the structure of an object with new fields.
let someObj = {
    field1: 45,
    field2: "some string"
};
console.log(JSON.stringify(someObj));

someObj.field3 = 23.6;
console.log(JSON.stringify(someObj));