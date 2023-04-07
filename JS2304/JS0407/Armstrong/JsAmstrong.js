for (let i = 100; i <= 1000; i++) {
    let sum = 0;
    let digits = i.toString().split("");
    let numDigits = digits.length;
    for (let j = 0; j < numDigits; j++) {
      sum += Math.pow(parseInt(digits[j]), numDigits);
    }
    if (sum == i) {
      console.log(i + " is an Amstrong number.");
    }
  }
  