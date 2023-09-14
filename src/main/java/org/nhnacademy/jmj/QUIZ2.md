1. Briefly explain what is meant by the syntax and the semantics of a programming language. Give an example to illustrate the difference between a syntax error and a semantics error.<br>
구문(syntax)은 프로그램에서 허용되는 프로그래밍 언어 규칙. 구문적으로 올바른 프로그램은 성공적으로 컴파일되거나 해석될 수 있는 프로그램이다.<br>
의미(semantics)는 해당 언어로 작성된 프로그램의 의미를 결정하는 규칙 집합으로 의미상 올바른 프로그램은 원하는 것을 수행하는 프로그램이다.<br>
2. What does the computer do when it executes a variable declaration statement. Give an example.<br>
컴퓨터가 변수 선언문을 실행할 때 변수에 대한 메모리를 따로 설정하고 변수 이름을 해당 메모리와 연결한다.<br>
3. What is a type, as this term relates to programming?<br>
특정 유형의 데이터를 나타낸다. primitive type에는 byte, short, int, long, float, double, char, boolean이 있다.<br>
4. One of the primitive types in Java is boolean. What is the boolean type? Where are boolean values used? What are its possible values?<br>
논리값 true 또는 false 중 하나를 보유한다. 조건식의 값으로 자주 사용한다.<br>
5. Give the meaning of each of the following Java operators:<br>
a)    ++
증감연산자
b)    &&
관계연산자
c)    !=
논리연산자<br>
6. Explain what is meant by an assignment statement, and give an example. What are assignment statements used for?<br>
assignment statement 형태 : 변수 = 값(Season vacation = Season.SUMMER), 변수에 값을 할당한다.<br>
7. What is meant by precedence of operators?<br>
연산자의 우선순위로 괄호를 사용하지 않을 경우 평가 순서를 결정한다.<br>
8. What is a literal?<br>
상수를 나타내기 위해 프로그램에서 입력하는 것<br>
9. In Java, classes have two fundamentally different purposes. What are they?<br>
서브루틴과 변수를 그룹핑하는 것, 타입으로써의 클래스<br>
10. What is the difference between the statement "x = TextIO.getDouble();" and the statement "x = TextIO.getlnDouble();"<br>
getlnDouble() : 개행문자나 공백과 무관하게 한 라인을 입력 받는다.<br>
getDouble() : 라인에서 한 값만을 입력 받는다.<br>
11. Explain why the value of the expression 2 + 3 + "test" is the string "5test" while the value of the expression "test" + 2 + 3 is the string "test23". What is the value of "test" + 2 * 3 ?<br>
+연산자를 사용하여 값을 string에 연결한 것 : 2+3+"test"는 2+3 연산을 먼저 하고 5+"test"는 "5test" 문자열로 연결된다.
"test"+2+3"은 문자열로 연결된 것<br>
12. Integrated Development Environments such as Eclipse often use syntax coloring, which assigns various colors to the characters in a program to reflect the syntax of the language. A student notices that Eclipse colors the word String differently from int, double, and boolean. The student asks why String should be a different color, since all these words are names of types. What's the answer to the student's question?<br>
String은 클래스고 int, double, and boolean은 type이다.<br>
13. What is the purpose of an import directive, such as import textio.TextIO or import java.util.Scanner?<br>
다른 패키지의 클래스를 가져와 쓰기 위함<br>
14. Write a complete program that asks the user to enter the number of "widgets" they want to buy and the cost per widget. The program should then output the total cost for all the widgets. Use System.out.printf to print the cost, with two digits after the decimal point. You do not need to include any comments in the program.<br>
Scanner scanner = new Scanner(System.in);
System.out.println("number of Widgets : ");
int widgets = scanner.nextInt();
double cost = 0;
for(int i=0;i<widgets;i++) cost+=scanner.nextDouble();
System.out.printf("cost : %.2f", cost);
