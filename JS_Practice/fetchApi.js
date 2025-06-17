async function userData() {
    try{
    const val = await fetch("https://api.example.com/users");

        if(!val.ok){
            throw new Error("Something went wrong");
        }
        console.log(response);
    }
    catch(error){
        console.log(error);
    }
}