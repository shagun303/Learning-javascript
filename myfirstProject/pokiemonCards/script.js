var main = document.getElementById("main");
let s ="";
let arr = ["https://tse3.mm.bing.net/th/id/OIP.2VCmvqmiRnpXdyT6BNqKfgHaG9?pid=Api&P=0&h=180","https://tse1.mm.bing.net/th/id/OIP.XjGlIO2BCCGCcnlLLH5vnwHaHa?pid=Api&P=0&h=180","https://tse1.mm.bing.net/th/id/OIP.EgmCeGdW_SasjsL5ACO4agHaHe?pid=Api&P=0&h=180","https://tse3.mm.bing.net/th/id/OIP.Dy_jPgfeX0UfPqcKdQ6NhAHaJU?pid=Api&P=0&h=180","https://tse2.mm.bing.net/th/id/OIP.DmTrf01I5uXBEAE6HJR7lwHaFj?pid=Api&P=0&h=180"];
for(let i = 1;i <= 55;i++){
     let num = Math.floor(Math.random()*arr.length);
    s+= ` <div class="card">
    <img src =${arr[num]}>
        </div>`;
}
main.innerHTML = s;