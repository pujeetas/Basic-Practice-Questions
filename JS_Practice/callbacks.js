function cookPizza(flavour, callback) {
    setTimeout(() => {
        callback(flavour);
    }, 3000);                                                                            
}

function callbackPizza(flavour) {
    console.log(`${flavour} pizza is ready`);
}

cookPizza("Peproni", callbackPizza);

function placeOrder(order, callback) {
    console.log(`Order Received : ${order}`);
    setTimeout(() => {
        callback(order);
    }, 2000);
}

function cookFood(order,callback){
    console.log(`Cooking ${order}...`);
    setTimeout(() => {
        callback(order);
    }, 3000);
}

function deliverFood(order){
    console.log(`Out for Delivery: Hot ${order}`);
    setTimeout(() => {
        console.log(`Hot ${order} delivered!`);
    }, 1000);
}

placeOrder("Pizza", (order) =>{
    cookFood(order, deliverFood);
});