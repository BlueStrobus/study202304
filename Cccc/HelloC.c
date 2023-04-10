#include <stdio.h>
int main (void){

    //6. scanf
    //키보드 입력을 받아 저장
    int input;
    printf("값을 입력하세요 : ");
    scanf_s("%d", &input);
    printf("입력값 : %d\n", input);

    return 0;
    







/*


    //5. printf
    // int add = 3 + 7 ; //10
    // printf("3 + 7 = %d\n", add);
    // printf("%d + %d = %d\n", 3, 7, add);

    // printf("%d X %d = %d\n", 30, 79, 30*79);
    // return 0;


    //4.상수형 변수
    // const int YEAR = 2000; //상수 : 변경하지 않는 변수; 변수명 대문자로만 적기
    // printf("태어난 년도 : %d\n", YEAR);
    // //YEAR = 2001;
    // return 0;


    //3. 실수형 변순
    // float y = 46.5f; //float로 선언한 변수의 값에는 f가 붙어야 함
    // printf("%.2f\n",y); // %.2f : 소숫점 뒷자리 2번째 자리까지 표시
    // double d = 4.428;
    // printf("%.2lf",d);  //double 출력시 %lf(엘 에프)
    // return 0;


    //2. 개인정보 입력
    // int age = 12;
    // printf("%d \n", age);
    // age = 13; // 선언한 변수의 내용물 바꿀 때 int 같은거 쓰면 충돌 생김. 선언한거 다시 선언하지만
    // printf("%d \n", age);
    // return 0;



    //1. 안녕출력
    // printf("Hello world\n");
    // return 0;


    */
}