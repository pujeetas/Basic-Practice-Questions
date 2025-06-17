// promises
// const myPromise = new Promise((resolve, reject) => {

// })

// function cookPizza(flavour) {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             resolve(`${flavour}`);
//         }, 3000);
//     });
// }

// cookPizza("Pepperoni")
//     .then(readyPizza => {
//         console.log(`${readyPizza} pizza is ready`);
//     });

// function getUser(id, callback) {
//   setTimeout(() => callback({ id, name: "Alice" }), 1000);
// }

// getUser(1, (user) => console.log(user));

// function getUser(id) {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             resolve(`${id}, name: "Alice"`);
//         }, 1000);
//     })
// }
// getUser(1)
//     .then(userDetail => {
//         console.log(userDetail);
//     })

// function makeTea(type) {
//     return new Promise((resolve) => {
//         setTimeout(() =>{
//             resolve(`${type} is ready`);
//         },2000);
//     })
// }
// makeTea("Green Tea")
//     .then(detail => {
//         console.log(detail)
//     })

// function bakeCake(flavour) {
//     return new Promise((resolve) => {
//         setTimeout(() =>{
//             resolve(`${flavour}`);
//         }, 3000)
//     })
// }
// bakeCake("Chocolate")
//     .then(cake => {
//         console.log(`${cake} cake is baked`);
//         return;
//     })
//     .then(after => {
//         console.log("Serving the cake...");
//     })

// function boilWater() {
//     return new Promise((resolve) => {
//         setTimeout(() => {
//             resolve("Water Boiled!");
//         }, 2000);
//     })
// }
// boilWater()
//     .then(meassage => {
//         console.log(meassage);
//         return;
//     })
//     .then(after => {
//         console.log("Making tea with the boiled water...")
//     })

// function orderCoffee(type) {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             if(type === "Espresso" || type === "Latte"){
//                 resolve(`Your ${type} coffee is ready`);
//             }
//             else reject(`Sorry we don't serve ${type} coffee`);
//         }, 2000);
//     })
// }
// orderCoffee("Espresso")
//     .then(res => {
//         console.log(res);
//     })
//     .catch(rej =>{
//         console.log(rej);
//     })

// function fetchIngredients() {
//     return new Promise((resolve) => {
//         setTimeout(() => {
//             resolve("Ingredients ready");
//         },1000);
//     })
// }
// function cookMeal(ingredients) {
//     return new Promise(resolve =>{
//         setTimeout(() =>{
//             resolve(`Meal cooked with ${ingredients}`);
//         }, 1000);
//     })
// }

// function serveMeal(meal) {
//     return new Promise((resolve) =>{
//         setTimeout(() =>{
//             resolve(`Served: ${meal}`);
//         },1000);
//     })
// }

// fetchIngredients()
//     .then(ingre =>{
//         return cookMeal(ingre);
//     })
//     .then(meal =>{
//         return serveMeal(meal);
//     })
//     .then(serve =>{
//         console.log(serve);
//     })
//     .catch(err =>{
//         console.log("Something went wrong");
//     })

// function checkInventory(product) {
//     return new Promise((resolve, reject) =>{
//         console.log("Checking inventory for Laptop...");
//         setTimeout(() =>{
//             if(product === "Laptop"){
//                 console.log("Laptop is in stock");
//                 resolve("Laptop");
//             }
//             else reject("Out of Stock");
//         }, 1500);
//     })
// }

// function processPayment(item) {
//     console.log(`Initiating Payemnt ${item}`);
//     return new Promise((resolve) =>{
//         setTimeout(() =>{
//             resolve(`Payment successful for ${item}` );
//         },2000)
//     })
// }

// checkInventory("Laptop")
//     .then(check =>{
//         return processPayment(check);
//     })
//     .then(message =>{
//         console.log(message);
//     })
//     .catch(err =>{
//         console.log(err);
//     })

function placeOrder(order) {
    return new Promise((resolve, reject) => {
        setTimeout(()=> {
            if(order === ""){
                reject("No Item Provided");
            }
            else resolve(`Order placed: ${order}`);
        },1000);
    })
}

function packOrder(orderDetails) {
    return new Promise((resolve) => {
        setTimeout(() => {
            console.log(`Order packed: ${orderDetails}`);
            resolve(`Order packed: ${orderDetails}`);
        }, 1000);
    })
}
function dispatchOrder(packedDetails) {
    return new Promise((resolve) =>{
        setTimeout(() => {
            console.log(`Order shipped: ${packedDetails}`);
            resolve(`Order shipped: ${packedDetails}`);
        }, 1500);
    })
}

placeOrder("")
    .then((packDetail) => {
        return packOrder(packDetail);
    })
    .then((shipDetail) =>{
        return dispatchOrder(shipDetail);
    })