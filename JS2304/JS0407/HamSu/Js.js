





// 람다식 함수선언 => 한번 선언 후 나중에 않쓸 거
// const gugudan = () => {
//     for(let i=1; i <=9; i++){
//         console.log(`3 - ${i} = ${3}-i `);
//      }
//  }
// const varr = (dan=1,x,y){
// }
const gugudon = function gugudon(dan=5,x,y){
    for(let i=1; i <=9; i++){
       console.log(`${dan} - ${i} = ${dan*i} `);
    }
}
gugudon();

let a = gugudon;
a(8,5,2);




const sum = (num1=10, num2) => {
    let sum = num1+num2;
    return sum;  // 함수 외부로 데이터 반환, return 만나면 함수는 끝이 남 
}

// 위랑 동일한 결과
// const sum = (num1=10, num2) => num1+num2;


let sum1 = sum(3,5) +50  // 전역 변수
console.log(sum1);



// if(true){
//     console.log("if", sum1);
// }





//var로 선언한 변수, 함수는 선언문 자체를 맨 위로 올려줌



// crossOriginIsolated. 
//     (function init (){
//         console.log("initialized");
// }

// const init = function(){
//     console.log("initialized");
// }

// init();

//즉시 실행 함수 : 소괄호() 열고 적기
(function init(){
    console.log("initialized!");
})();



const init =100;
console.log(init)


