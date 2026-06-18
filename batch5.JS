function exmple?(){
    console.log("B")
}
const example=()=>
console.log("A")
setTimeout(() => {
    console.log("B")
}, 2000)
console.log("C")