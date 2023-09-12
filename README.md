# Chapter1
## 1. 컴퓨터의 구성 요소 중 하나는 CPU입니다. CPU란 무엇이며 컴퓨터에서 어떤 역할을 합니까?
cpu는 **중앙처리장치**</br>
**주 기능**
1. **ALU(산술)**
2. **프로그램 카운터(다음 명령어 메모리 주소 저장)**
3. **명령어 실행**

## 2. "비동기 이벤트"가 무엇을 의미하는지 설명하세요. 몇 가지 예를 들어보세요.

* **폴링이란**?
</br>cpu가 들어오는 데이터를 계속 확인하여 데이터를 터리하는 방법.
</br>cpu가 입력을 기다리는것으로 엄청난 시간 낭비이다.
* **인터럽트란**?
</br> 이러한 비효율을 피하기위해 인터럽트를 사용하고 인터럽트는 다른 장치가 cpu에 신호를 주는것
* **비동기 이벤트란?**</br>
인터럽트가 일어나면 하던일을 잠시 멈추고 비동기 이벤트가 일어난 사건을 해결한 뒤 원래 하던일로 돌아간다 이것을 비동기 이벤트라고 한다.

## 3. 컴파일러와 인터프리터의 차이점
* **컴파일러란**?
</br>고급수준의 언어를 한번에 번역하여 기계어로 만들어 실행하는것
* **인터프리터란**?
</br>고급수준의 언어를 한줄씩 번역하여 기계어로 만들어 실행하는것

## 4. 고급언어 와 기계어 의 차이점을 설명해보세요 .
* **고급언어란**?
* </br>사람이 보기 좋은 언어로 되있는 언어
* **기계어란**?
* </br>사람은 보기 힘들지만 기계가 보기 좋은 언어.

## 5. Java 프로그램의 소스 코드가 있고 해당 프로그램을 실행하려면 컴파일러 와 인터프리터 가 모두 필요합니다 . Java 컴파일러는 무엇을 하고, Java 인터프리터는 무엇을 합니까?
자바의 컴파일러는 기계어를 만들어 내는 것이 아니라 각 cpu아키텍처에 맞는 바이트코드를 컴파일한다.
</br> 위에서 만들어진 자바 바이트코드를 실행시킬때 JVM은 인터프리터방식으로 실행한다.

## 6. 서브루틴 이란 무엇입니까 ?
* **서브루틴이란?**
클래스, 메소드등 내부에서 실행되는 것들.

## 7. Java는 객체 지향 프로그래밍 언어입니다. 객체란 무엇입니까 ?
* **객체란?**
데이터와 서브루틴을 포함하는 일종의 모듈

## 8. 변수란 무엇입니까 ? (Java에는 변수와 관련된 네 가지 아이디어가 있습니다. 답변에 네 가지 측면을 모두 언급해 보십시오. 힌트: 측면 중 하나는 변수의 이름입니다.)
이름이 지정된 메모리 위치이다.

## 9. Java는 "플랫폼 독립적인 언어"입니다. 이것은 무엇을 의미 하는가?
자바는 JVM만 있다면 어디서든 실행 할 수 있다.

## 10. "인터넷"이란 무엇입니까? 어떻게 사용되는지 몇 가지 예를 들어보세요. (어떤 서비스를 제공하나요?)
인터넷은 다름사람과 통신을 할수있는 거대한 네트워크.
다른 누군가에게 메일을 보낼때 사용된다/

# Chapter2
## 1. 프로그래밍 언어의 syntax and the semantics 가 무엇을 의미하는지 간략하게 설명하세요 . 구문 오류와 의미 오류의 차이점을 설명하는 예를 들어보세요.
* Syntax?  언어의 기본 어휘와 루프, 분기 및 서브루틴과 같은 항목을 사용하여 프로그램을 구성할 수 있는 방법
* semantics? 프로그래밍 언어의 의미는 해당 언어로 작성된 프로그램의 의미를 결정하는 규칙 집합

## 2. 변수 선언문을 실행할 때 컴퓨터는 무엇을 합니까? 예를 들어보세요.
빈공간을 준비한다.

## 3. 프로그래밍과 관련된 용어인 타입 이란 무엇입니까 ?
* 타입이란? 당 데이터가 메모리에 어떻게 저장되고, 프로그램에서 어떻게 처리되어야 하는지를 명시적으로 알려주는 역할을 한다.

## 4. Java의 기본 유형 중 하나는 boolean입니다. boolean타입은 무엇입니까 ? boolean값은 어디에 사용됩니까? 가능한 값은 무엇입니까?
</br>해당 조건이 거짓인지 진실인지를 나타내는 타입.
</br>조건문에 사용된다.
</br>가능한 값은 true false;

## 5. 다음 각 Java 연산자의 의미를 설명하십시오.
* a) ++ : 더하라
* b) && : And
* c) != : Not

## 6. 할당문의 의미를 설명 하고 예를 들어보세요. 할당문은 무엇을 위해 사용되나요?(assignment statement)
할당문이란? 오른쪽의 결과를 왼쪽에 변수로 대입하는 문
ex) a=13

## 7. 연산자 우선순위란 무엇을 의미하나요 ?
수학의 * / 가 우선순위가 있는거처럼 프로그래밍언어에서도 우선순위가 존재한다.

## 8. 리터럴이란?
상수 = 변하지않는수

## 9. Java에서 클래스는 근본적으로 다른 두 가지 목적을 가지고 있습니다. 그들은 무엇인가?
첫번째 namespace
 두번째 객체

## 10. " x = TextIO.getDouble(); " 문과 " x = TextIO.getlnDouble(); " 문 사이의 차이점은 무엇입니까?
getDouble은 스페이스를 기준으로 한개만 가져오는거 getIlnDouble은 라인을 전체 가져오고 나머지는 버림.

## 11. 2 + 3 + "test" 표현식의 값이 문자열 "5test" 인 반면 "test" + 2 + 3 표현식의 값은 "test23" 문자열인 이유를 설명하세요 . "test" + 2 * 3 의 값은 무엇입니까  ?
test+2+3은 처음에 test가 string이기때문에 뒤에 숫자도 String으로 인식하였다.
test2test2test2

## 12. Eclipse와 같은 통합 개발 환경에서는 언어 구문을 반영하기 위해 프로그램의 문자에 다양한 색상을 지정하는 구문 색상 지정을 사용하는 경우가 많습니다. 학생은 Eclipse에서 String 이라는 단어의 색상이 int , double 및 boolean 과 다르게 표시되는 것을 발견했습니다 . 학생은 이 모든 단어가 유형의 이름이기 때문에 문자열이 왜 다른 색상이어야 하는지 묻습니다. 학생의 질문에 대한 답은 무엇입니까?
String은 클래스이기 때문이다.

## 13. import textio.TextIO 또는 import java.util.Scanner 와 같은 가져오기 지시문의 목적은 무엇입니까 ?
콘솔에 입력한 값을 가져오기 위한 목적

## 14. 사용자에게 구매하려는 "위젯" 수와 위젯당 비용을 입력하도록 요청하는 완전한 프로그램을 작성하세요. 그러면 프로그램은 모든 위젯의 총 비용을 출력해야 합니다. System.out.printf를 사용하여 소수점 이하 두 자리로 비용을 인쇄합니다. 프로그램에 설명을 포함할 필요는 없습니다.
public class Main{
    public class void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numberOfWidgets = scanner.nextInt();
        int sum = 0;        
        for(int i=0; i<numberOfWidgets;i++ )
        {
            int widgetCost = scanner.nextInt();
            sum +=widgets;
        }
        System.out.printf("%.3f", sum);
    }
}