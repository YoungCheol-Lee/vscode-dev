// Kotlin 테스트 

// 0. class란?
// 클래스, 객체, 생성자(속성=property=constructor로 만든 변수들)

// 1. 사칙연산 계산기 클래스
// 두 개의 값을 받아 사칙연산 하는 코드 
// 결과 : "답은 00 입니다." 출력 혹은 return
// 0 나눗셈 시, "계산할 수 없습니다." return

class Calculater {
    var first_num:Int
    var cal_sym:String
    var sec_num:Int
    // function으로 Calculating.cal_sym = "+" 일때,
    // ${Calculating.first_num + Calculating.sec_num}
    // class로 객체 생성 : val cal1 = Calculating(3, "+", 1)
    // 함수명(cal1) : class에 있는 함수명으로 해당 객체(cal1)에 할당된 값으로 함수 실행
    fun Calculating(){
        if(Calculater.cal_sym="+"){
            println("답은 ${Calculater.first_num + Calculater.sec_num}")
        }
        else if(Calculater.cal_sym="-"){
            println("답은 ${Calculater.first_num + Calculater.sec_num}")
        }
        else if(Calculater.cal_sym="*"){
           println("답은 ${Calculater.first_num * Calculater.sec_num}")
        }
        else if(Calculater.cal_sym="%"){
            if(Calculater.first_num = 0){
                println("계산할 수 없습니다.")
            }
            else(){
                println("답은 ${Calculater.first_num % Calculater.sec_num}")
            }
        }
    }


// 2. 자동차 클래스
// 연비 계산 결과 제공
// 연료 00L 넣으면 몇 km 가는지
// 다른 자동차를 input으로 제공하면 비교 해주는 함수 구성
// 해당 클래스 안에 5종류 이상의 자동차 구성
// list 같은 배열에 추가
// 소지금 입력 시, 살 수 있는 자동차 개수 및 종류 출력

class CarClass{
    class km_per_liter(_car_name:String){
        car_name = _car_name
    }
}
// class에서 constructor의 역할과 필요성 
// -> 특히 constructor 없이 아래 변수 구성 시, class로 입력되는 변수 개수 설정은?
// ex) CarClass(소나타)와 CarClass(소나타, 1000)으로 했을 때, 소지금에 따른 return을 받을 수 있나?