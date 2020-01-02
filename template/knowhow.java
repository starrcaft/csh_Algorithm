public class knowhow {
}

/*
1. 입력
1) 여러 줄
 2588의 경우는 int 2줄을 입력받는다. 이런 경우는 int 변수 2개를 선언한 후 template의 nextInt를 2번 해주면 된다.

2) string to char
 2588의 경우는 문자열에서 각 부분이 필요한 경우가 많다. 이럴 경우 문자열을 char배열로 받는것이 편하다.
 string.toCharArray()함수를 이용해 해당 string을 char로 바꾸는 함수를 char 배열에 넣는다.

3) char * int
 2588의 경우 char * int를 통해 각 자리의 값을 곱하는 연산이 필요하다. 뭔 이유인지는 모르겠지만 바로 곱셈을 하면 값이 다르게 나온다.
 아마 char의 ascii값인듯 하다. https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html 해당 내용은 여깄다.
 이를 방지하기 위해 Character.getNumericValue()라는 함수를 이용해 해당 char값을 int로 바꿔주는 연산이 필요하다.
 */