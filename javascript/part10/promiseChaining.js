function fetchData(){
    return new Promise((resolve,reject) => {
        setTimeout(() => {
           let success = true;
           if(success){
            resolve("Data Fetch successfully!")
           } 
           else{
            reject("failed to fetch data X")
           }
        }, 3000);
    })
}

fetchData()
    .then((data) => console.log(data))
   .catch((error) => console.error(error));


