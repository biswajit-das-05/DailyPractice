let userScore = 0;
let compScore = 0;

const choices = document.querySelectorAll(".choice");


const GenCompChoice = () => {
    const options = ["rock" , "paper" , "scissor"];
    Math.random()
}

const playGame = (userChoice) => {
    console.log("user choice = " , userChoice);
//generate comp choice
}

choices.forEach((choice) => {
    choice.addEventListener("click", () => {
        const userChoice = choice.querySelector("img").id;
        console.log("choice was clicked", userChoice);
    });
});