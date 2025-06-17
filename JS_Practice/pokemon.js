async function pokeAPI() {
    API_URL = "https://pokeapi.co/api/v2/pokemon/ditto";

    try{
        const response = await fetch(API_URL);

        if(!response.ok){
            throw new Error("Cannot get response");
        }
        const data = await response.json();

        return data;
    }
    catch(error){
        console.log(error);
    }
}

pokeAPI().then(res =>{
    console.log(res);
});

