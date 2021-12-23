## **Q1 다음 빈칸에 들어가는 메소드를 작성하시오 Object Class**
|메소드|설명|
|:---:|:---:|
||해당 객체의 복제본을 생성하여 반환함.|
||해당 객체와 전달받은 객체가 같은지 여부를 반환함.|
||해당 객체를 더는 아무도 참조하지 않아 가비지 컬렉터가 객체의 리소스를 정리하기 위해 호출함.|
|Class<T> getClass()|해당 객체의 클래스 타입을 반환함.|
|int hashCode()|해당 객체의 해시 코드값을 반환함.|
|void notify()|해당 객체의 대기(wait)하고 있는 하나의 스레드를 다시 실행할 때 호출함.|
|void notifyAll()|해당 객체의 대기(wait)하고 있는 모든 스레드를 다시 실행할 때 호출함.|
||해당 객체의 정보를 문자열로 반환함.|
|void wait()|해당 객체의 다른 스레드가 notify()나 notifyAll() 메소드를 실행할 때까지 현재 스레드를 일시적으로 대기(wait)시킬 때 호출함.|
|void wait(long timeout)|해당 객체의 다른 스레드가 notify()나 notifyAll() 메소드를 실행하거나 전달받은 시간이 지날 때까지 현재 스레드를 일시적으로 대기(wait)시킬 때 호출함.|
|void wait(long timeout, int nanos)|해당 객체의 다른 스레드가 notify()나 notifyAll() 메소드를 실행하거나 전달받은 시간이 지나거나 다른 스레드가 현재 스레드를 인터럽트(interrupt) 할 때까지 현재 스레드를 일시적으로 대기(wait)시킬 때 호출함.|

**정답:**
|메소드|설명|
|:---:|:---:|
|protected Object clone()|해당 객체의 복제본을 생성하여 반환함.|
|boolean equals(Object obj)|해당 객체와 전달받은 객체가 같은지 여부를 반환함.|
|protected void finalize()|해당 객체를 더는 아무도 참조하지 않아 가비지 컬렉터가 객체의 리소스를 정리하기 위해 호출함.|
|Class<T> getClass()|해당 객체의 클래스 타입을 반환함.|
|int hashCode()|해당 객체의 해시 코드값을 반환함.|
|void notify()|해당 객체의 대기(wait)하고 있는 하나의 스레드를 다시 실행할 때 호출함.|
|void notifyAll()|해당 객체의 대기(wait)하고 있는 모든 스레드를 다시 실행할 때 호출함.|
|String toString()|해당 객체의 정보를 문자열로 반환함.|
|void wait()|해당 객체의 다른 스레드가 notify()나 notifyAll() 메소드를 실행할 때까지 현재 스레드를 일시적으로 대기(wait)시킬 때 호출함.|
|void wait(long timeout)|해당 객체의 다른 스레드가 notify()나 notifyAll() 메소드를 실행하거나 전달받은 시간이 지날 때까지 현재 스레드를 일시적으로 대기(wait)시킬 때 호출함.|
|void wait(long timeout, int nanos)|해당 객체의 다른 스레드가 notify()나 notifyAll() 메소드를 실행하거나 전달받은 시간이 지나거나 다른 스레드가 현재 스레드를 인터럽트(interrupt) 할 때까지 현재 스레드를 일시적으로 대기(wait)시킬 때 호출함.|


<br>

## **Q2 String Class**
|메소드|설명|
|:---:|:---:|
|char charAt(int index)|해당 문자열의 특정 인덱스에 해당하는 문자를 반환함.|
|int compareTo(String str)|해당 문자열을 인수로 전달된 문자열과 사전 편찬 순으로 비교함.|
|int compareToIgnoreCase(String str)|해당 문자열을 인수로 전달된 문자열과 대소문자를 구분하지 않고 사전 편찬 순으로 비교함.|
|String concat(String str)|해당 문자열의 뒤에 인수로 전달된 문자열을 추가한 새로운 문자열을 반환함.|
||해당 문자열에서 특정 문자나 문자열이 처음으로 등장하는 위치의 인덱스를 반환함.|
||해당 문자열에서 특정 문자나 문자열이 전달된 인덱스 이후에 처음으로 등장하는 위치의 인덱스를 반환함.|
||해당 문자열에서 특정 문자가 마지막으로 등장하는 위치의 인덱스를 반환함.|
||해당 문자열에서 특정 문자가 전달된 인덱스 이후에 마지막으로 등장하는 위치의 인덱스를 반환함.|
||해당 문자열을 전달된 정규 표현식(regular expression)에 따라 나눠서 반환함.|
||해당 문자열의 전달된 인덱스부터 끝까지를 새로운 문자열로 반환함.|
||해당 문자열의 전달된 시작 인덱스부터 마지막 인덱스까지를 새로운 문자열로 반환함.|
|String toLowerCase()|해당 문자열의 모든 문자를 소문자로 변환함.|
|String toUpperCase()|해당 문자열의 모든 문자를 대문자로 변환함.|
||해당 문자열의 맨 앞과 맨 뒤에 포함된 모든 공백 문자를 제거함.|
||해당 문자열의 길이를 반환함.|
|isEmpty()|해당 문자열의 길이가 0이면 true를 반환하고, 아니면 false를 반환함.|

**정답:**
|메소드|설명|
|:---:|:---:|
|char charAt(int index)|해당 문자열의 특정 인덱스에 해당하는 문자를 반환함.|
|int compareTo(String str)|해당 문자열을 인수로 전달된 문자열과 사전 편찬 순으로 비교함.|
|int compareToIgnoreCase(String str)|해당 문자열을 인수로 전달된 문자열과 대소문자를 구분하지 않고 사전 편찬 순으로 비교함.|
|String concat(String str)|해당 문자열의 뒤에 인수로 전달된 문자열을 추가한 새로운 문자열을 반환함.|
|int indexOf(int ch)</br>int indexOf(String str)|해당 문자열에서 특정 문자나 문자열이 처음으로 등장하는 위치의 인덱스를 반환함.|
|int indexOf(int ch, int fromIndex)</br>int indexOf(String str, int fromIndex)|해당 문자열에서 특정 문자나 문자열이 전달된 인덱스 이후에 처음으로 등장하는 위치의 인덱스를 반환함.|
|int lastIndexOf(int ch)|해당 문자열에서 특정 문자가 마지막으로 등장하는 위치의 인덱스를 반환함.|
|int lastIndexOf(int ch, int fromIndex)|해당 문자열에서 특정 문자가 전달된 인덱스 이후에 마지막으로 등장하는 위치의 인덱스를 반환함.|
|String[] split(String regex)|해당 문자열을 전달된 정규 표현식(regular expression)에 따라 나눠서 반환함.|
|String substring(int beginIndex)|해당 문자열의 전달된 인덱스부터 끝까지를 새로운 문자열로 반환함.|
|String substring(int begin, int end)|해당 문자열의 전달된 시작 인덱스부터 마지막 인덱스까지를 새로운 문자열로 반환함.|
|String toLowerCase()|해당 문자열의 모든 문자를 소문자로 변환함.|
|String toUpperCase()|해당 문자열의 모든 문자를 대문자로 변환함.|
|String trim()|해당 문자열의 맨 앞과 맨 뒤에 포함된 모든 공백 문자를 제거함.|
|length()|해당 문자열의 길이를 반환함.|
|isEmpty()|해당 문자열의 길이가 0이면 true를 반환하고, 아니면 false를 반환함.|

<br>

## **Q3. Wrapper Class**
|기본타입|래퍼클래스|
|:---:|:---:|
|byte|Byte|
|short|Short|
|int||
|long|Long|
|float|Flost|
|double||
|char|Character|
|boolean||

**정답:**
|기본타입|래퍼클래스|
|:---:|:---:|
|byte|Byte|
|short|Short|
|int|Integer|
|long|Long|
|float|Flost|
|double|Double|
|char|Character|
|boolean|Boolean|

<br>

## **Q4 Wrapper Class**
|기본 타입|
|:---:|
|byte|
|short|
|int|
|long|
|float|
|double|
|char|
|boolean|

``` 1 ``` :point_down: :point_up: ``` 2 ```


|래퍼 클래스|
|:---:|
|Byte|
|Short|
|Integer|
|Long|
|Float|
|Double|
|Character|
|Boolean|
**정답:**  
```
1. 박싱
2. 언박싱
```

<br>

## **Q5 Math Class**
|기본타입|래퍼클래스|
|:---:|:---:|
||0.0 이상 1.0 미만의 범위에서 임의의 double형 값을 하나 생성하여 반환함.|
|static double abs(double a)</br>static double abs(float a)</br>static double abs(int a)</br>static double abs(long a)|전달된 값이 음수이면 그 값의 절댓값을 반환하며, 전달된 값이 양수이면 인수를 그대로 반환함.|
||전달된 double형 값의 소수 부분이 존재하면 소수 부분을 무조건 올리고 반환함.|
|static double floor(double a)|전달된 double형 값의 소수 부분이 존재하면 소수 부분을 무조건 버리고 반환함.|
|</br>static int round(float a)|전달된 값을 소수점 첫째 자리에서 반올림한 정수를 반환함.|
|static double rint(double a)|전달된 double형 값과 가장 가까운 정수값을 double형으로 반환함.|
|static double max(double a, double b)</br>static float max(float a, float b)</br>static long max(long a, long b) </br> static int max(int a, int b)|전달된 두 값을 비교하여 큰 값을 반환함.|
|static double min(double a, double b)</br>static float min(float a, float b)</br>static long min(long a, long b)</br>static int min(int a, int b)|전달된 두 값을 비교하여 작은 값을 반환함.|

**정답:**  
|기본타입|래퍼클래스|
|:---:|:---:|
|static double random()|0.0 이상 1.0 미만의 범위에서 임의의 double형 값을 하나 생성하여 반환함.|
|static double abs(double a)</br>static double abs(float a)</br>static double abs(int a)</br>static double abs(long a)|전달된 값이 음수이면 그 값의 절댓값을 반환하며, 전달된 값이 양수이면 인수를 그대로 반환함.|
|static double ceil(double a)|전달된 double형 값의 소수 부분이 존재하면 소수 부분을 무조건 올리고 반환함.|
|static double floor(double a)|전달된 double형 값의 소수 부분이 존재하면 소수 부분을 무조건 버리고 반환함.|
|static long round(double a)</br>static int round(float a)|전달된 값을 소수점 첫째 자리에서 반올림한 정수를 반환함.|
|static double rint(double a)|전달된 double형 값과 가장 가까운 정수값을 double형으로 반환함.|
|static double max(double a, double b)</br>static float max(float a, float b)</br>static long max(long a, long b) </br> static int max(int a, int b)|전달된 두 값을 비교하여 큰 값을 반환함.|
|static double min(double a, double b)</br>static float min(float a, float b)</br>static long min(long a, long b)</br>static int min(int a, int b)|전달된 두 값을 비교하여 작은 값을 반환함.|



<br>

## **Q6 StringBugger Class**
|기본타입|래퍼클래스|
|:---:|:---:|
||인수로 전달된 값을 문자열로 변환한 후, 해당 문자열의 마지막에 추가함.|
|int capacity()|현재 버퍼 크기를 반환함.|
|StringBuffer delete(int start, int end)|전달된 인덱스에 해당하는 부분 문자열을 해당 문자열에서 제거함.|
|StringBuffer deleteCharAt(int index)|전달된 인덱스에 해당하는 문자를 해당 문자열에서 제거함.|
|StringBuffer insert(int offset, boolean b)</br>StringBuffer insert(int offset, char c)</br>StringBuffer insert(int offset, char[] str)</br>StringBuffer insert(int offset, CharSequence s)</br>StringBuffer insert(int offset, double d)</br>StringBuffer insert(int offset, float f)</br>StringBuffer insert(int offset, int i)</br>StringBuffer insert(int offset, long lng)</br>StringBuffer insert(int offset, Object obj)</br>StringBuffer insert(int offset, String str)|인수로 전달된 값을 문자열로 변환한 후, 해당 문자열의 지정된 인덱스 위치에 추가함.|
|StringBuffer reverse()|해당 문자열의 인덱스를 역순으로 재배열함.|

**정답:**
|기본타입|래퍼클래스|
|:---:|:---:|
|StringBuffer append(boolean b)</br>StringBuffer append(char c)</br>StringBuffer append(char[] str)</br>StringBuffer append(CharSequence s)</br>StringBuffer append(double d)</br>StringBuffer append(float f)</br>StringBuffer append(int i)</br>StringBuffer append(long lng)</br>StringBuffer append(Object obj)</br>StringBuffer append(String str)</br>StringBuffer append(StringBuffer sb)|인수로 전달된 값을 문자열로 변환한 후, 해당 문자열의 마지막에 추가함.|
|int capacity()|현재 버퍼 크기를 반환함.|
|StringBuffer delete(int start, int end)|전달된 인덱스에 해당하는 부분 문자열을 해당 문자열에서 제거함.|
|StringBuffer deleteCharAt(int index)|전달된 인덱스에 해당하는 문자를 해당 문자열에서 제거함.|
|StringBuffer insert(int offset, boolean b)</br>StringBuffer insert(int offset, char c)</br>StringBuffer insert(int offset, char[] str)</br>StringBuffer insert(int offset, CharSequence s)</br>StringBuffer insert(int offset, double d)</br>StringBuffer insert(int offset, float f)</br>StringBuffer insert(int offset, int i)</br>StringBuffer insert(int offset, long lng)</br>StringBuffer insert(int offset, Object obj)</br>StringBuffer insert(int offset, String str)|인수로 전달된 값을 문자열로 변환한 후, 해당 문자열의 지정된 인덱스 위치에 추가함.|
|StringBuffer reverse()|해당 문자열의 인덱스를 역순으로 재배열함.|

<br>

## **Q7 StringTokenizer**
|생성자|설명|
|:---:|:---:|
|StringTokenizer(String str)|지정된 스트링으로 초기화된 스트링 토크나이저 생성
|StringTokenizer(String str, String delim)|지정된 스트링과 구분 문자로 초기화된 스트링 토크나이저 생성|
|StringTokenizer(String str, String delim, boolean returnDelims)|지정된 스트링과 구분 문자로 초기화된 스트링 토크나이저 생성. returnDelims가 true이면 구분 문자로 지정된 문자도 분리된 토큰에 포함된다|

|메소드|설명|
|:---:|:---:|
||스트링에남아 토큰 수 반환|
||스트링에 토근이 남아 있으면 true 반환|
||다음 토큰 반환|
|String nextToken(String delim)|지정된 분리자에 대한 다음 토큰 반환|

**정답:**
|메소드|설명|
|:---:|:---:|
|int countTokens()|스트링에남아 토큰 수 반환|
|boolean hasMoreToekns()|스트링에 토근이 남아 있으면 true 반환|
|String nextToken()|다음 토큰 반환|
|String nextToken(String delim)|지정된 분리자에 대한 다음 토큰 반환|