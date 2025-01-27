// Kotlin 테스트 
// 1. 사칙연산 계산기 클래스
// 두 개의 값을 받아 사칙연산 하는 코드 
// 결과 : "답은 00 입니다." 출력 혹은 return
// 0 나눗셈 시, "계산할 수 없습니다." return

class Calculating constructor(first_num:Int, cal_sym:String, sec_num:Int){
    if(cal_sym = "+"){
        print(first_num + sec_num)
    }
    else if(cal_sym="-"){
        print(first_num - sec_num)
    }
    else if(cal_sym="*"){
        print(first_num * sec_num)
    }
    else if(cal_sym="/"){
        if(first_num=0){
            print("계산할 수 없습니다.")
        }
        print(first_num/sec_num)
    }
}


// 2. 자동차 클래스
// 연비 계산 결과 제공
// 연료 00L 넣으면 몇 km 가는지
// 다른 자동차를 input으로 제공하면 비교 해주는 함수 구성
// 해당 클래스 안에 5종류 이상의 자동차 구성
// list 같은 배열에 추가
// 소지금 입력 시, 살 수 있는 자동차 개수 및 종류 출력

