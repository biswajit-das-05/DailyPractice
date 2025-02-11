// let h2 = document.querySelector("h2");
// console.dir(h2.innerText);

// h2.innerText = h2.innerText  +"from apna college !";

let divs = document.querySelectorAll(".box");

let idx = 1;
for (div of divs){
    div.innerText = `new unique thing ${idx}`;
    idx++;
}