const fs = require('fs');

// Read file asynchronously 
fs.readFile("./writeone.txt", "utf-8", (error, data) => {
    if (error) return console.log(error);
    console.log(data);

    // Write file asynchronously
    fs.writeFile("./writethree.txt", data, (error,data) => {
        if (error) return console.log(error);

        // Append file asynchronously
        fs.appendFile("./writethree.txt", "how are you doing", (error,data) => {
            if (error) return console.log(error);
        });
    });
});