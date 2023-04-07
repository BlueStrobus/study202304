console.log("1번 문제")


const circle = function circle(r=10){
    console.log(`반지름의 길이가 ${r}인 원의 넓이는 ${r*r*3.14}이다.`)

}
circle();


console.log("2번 문제")

function findMax(arr) {
    let max = arr[0]; // 배열의 첫 번째 요소를 초기값으로 설정
    for (let i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i]; // 현재 요소가 최대값보다 크면 최대값을 현재 요소로 변경
      }
    }
    return max; // 최대값 반환
  }
  
let arr = [3, 7, 2, 9, 1];
let max = findMax(arr);
console.log(max); // 9 출력
  


console.log("3번 문제")

// BMI 계산 함수
function calcBMI(height, weight) {
    // 키(cm)를 미터 단위로 변환
    let heightM = height / 100;
    // 체질량 지수(BMI) 계산
    let bmi = weight / (heightM * heightM);
    // 소수점 이하 둘째 자리까지 반올림
    bmi = Math.round(bmi * 100) / 100;
    return bmi;
  }
  
  // 비만도 판정 함수
function checkObesity(bmi) {
  if (bmi >= 26) {
     return "비만";
   } else if (bmi >= 24) {
     return "과체중";
   } else if (bmi >= 18.5) {
     return "정상";
   } else {
     return "저체중";
   }
}

let height = 200; // 키(cm)
let weight = 100; // 몸무게(kg)
let bmi = calcBMI(height, weight); // 체질량 지수(BMI) 계산
let obesity = checkObesity(bmi); // 비만도 판정
console.log("BMI:", bmi); // BMI: 24.22 출력
console.log("비만도:", obesity); // 비만도: 과체중 출력

  

