'use strict';
const countingValleys = (n, steps) => {
  let valleyCount = 0,
    stepBal = 0;
  // we can use index to get char from string by string.charAt(index)
  // we can use for of loop of string
  // we can use ES6 Array destructuring by [...string]
  for (let pos = 0; pos < n; pos++) {
    if (stepBal == 0 && steps[pos] == 'D') {
      valleyCount++;
    }
    if (steps[pos] == 'U') {
      stepBal++;
    } else if (steps[pos] == 'D') {
      stepBal--;
    }
  }
  return valleyCount;
};
(async function () {
  const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout,
  });
  readline.question('', (n) => {
    readline.question('', (steps) => {
      console.log(countingValleys(n, steps));
      process.exit(0);
    });
  });
})();
