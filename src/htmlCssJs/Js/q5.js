let items = [250, 645, 300, 900, 50];

for (let i = 0; i < items.length; i++) {
    let offer = items[1] / 10;
    items[i] -= offer;

}
console.log(items[1]); 