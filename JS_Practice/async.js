
// function boilWater() {
//     return new Promise((resolve) => {
//         setTimeout(() => {
//             resolve("Water boiled");
//         }, 1000);
//     });
// }

// function addTeaLeaves() {
//     return new Promise((resolve, reject) => {

//         if (Math.random() > 0.5) {
//             setTimeout(() => {
//                 resolve("Tea Leaves Added");
//             }, 1000);
//         }
//         else{ reject("Out of tea leaves");}
//     })
// }

// function pourTea() {
//     return new Promise((resolve) => {
//         setTimeout(() => {
//             resolve("Tea is served");
//         }, 1000);
//     })
// }

// async function makeTea() {
//     try {
//         const val = await boilWater();
//         console.log(val);

//         const val2 = await addTeaLeaves();
//         console.log(val2);

//         const val3 = await pourTea();
//         console.log(val3);
//     }
//     catch(error){
//         console.log(error);
//     }

// }
// makeTea();

function boilWater() {
    return new Promise(resolve => {
        setTimeout(() => {
            resolve("Water boiled");
        }, 1000);
    });
}

function toastBread() {
    return new Promise((resolve, reject) => {
        if (Math.random() > 0.5) {
            setTimeout(() => {
                resolve("Bread toasted");
            }, 1000);
        }
            else {
            reject("Toaster not working");
        }
    });
}

async function ready() {
    try {
        const val = await Promise.race([boilWater(), toastBread()]);
        console.log("Breakfast prep started!");

        console.log(val);
        console.log("Breakfast is ready!");
    }
    catch (error) {
        console.log(error);
    }
}
ready();
