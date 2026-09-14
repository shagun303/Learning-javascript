function fetchUserData(){

    return new Promise((resolve,reject) => {

        setTimeout(() => {
          resolve({name:"chaicode",
                Url:"https/chaivode.com"
            })
        }, 3000);
    })
}

async function getUserData(){

    try{
        console.log("Fetching user data....")
      const userData =  await fetchUserData(); //await always use with async
      console.log("User Data :",userData); 
    }

    catch(error){
        console.log("Error fetching Data");
    }
}

getUserData();