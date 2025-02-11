let marks = [97,64,54,45,98,96];

let toppers = marks.filter((val) =>{
    return val>90;
 });

 console.log(toppers);



let n= prompt("enter a number:");
let arr=[];
for(let i=1; i<=n; i++){
    arr[i-1]=i;
}
console.log(arr);


//reduce method

let sum = arr.reduce((res, curr)=>{
return res+curr;}

);
 console.log("sum = " + sum);

 //product of all number like factorial 

 let factorial = arr.reduce((res, curr)=>{
    return res*curr;}
    
    );
     console.log("factorial = "+ factorial);
