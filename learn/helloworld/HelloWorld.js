const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout,
});

readline.question('Enter your name :', (name) => {
  console.log('hello world by ' + name);
  readline.close();
});
