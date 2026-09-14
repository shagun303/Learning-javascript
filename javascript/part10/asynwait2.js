function fetchPostData(){

    return new Promise((resolve) => {
   setTimeout(() => {
        resolve("Post Data fetched");
   },2000);

    })
}

function fetchCommentedData(){

      return new Promise((resolve) => {
   setTimeout(() => {
        resolve("Comment Data fetched");
   },3000);

    })

}

async function getBlogData(){
    try{
        console.log("Fetching blog data");
        // const blogData = await fetchPostData();
        // const blogComment = await fetchCommentedData();
        
      const [postData,postComment] =  await Promise.all([fetchPostData(),fetchCommentedData()]);

        // console.log(blogData);
        // console.log(blogComment);

        console.log(postData);
        console.log(postComment);
        console.log("fetch completed");
      
    }
    catch(error){
        console.log("Error fetchin blog data",error);

    }
}

getBlogData();