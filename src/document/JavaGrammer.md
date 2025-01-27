# 문법 정리

> 수열은 점화식

## Integer
```java
// 정수를 2진수 변환
// String binaryString = Integer.toBinaryString(int i);
System.out.println(Integer.toBinaryString(255)); // "11111111"
```

## String
```java
// index 이후 위치의 문자열 리턴
String substring(int index);
// begin ~ end 위치의 문자열 리턴
String substring(int beginIndex, int endIndex);

// 정수배열 -> String
Arrays.toString(int[] a);

/**
 * 배열 초기화
 * Arrays.fill(arr, fromIdx, toIdx, value);
 * - arr 데이터형 (int, long, double, char, boolean, byte, Object)
 */
Arrays.fill(arr, -1);

Arrays.sort();

/**
 * 배열 특정 구간 복사 
 * Arrays.copyOfRange(int[] original, int from, int to)
 * - original : 원본 배열
 * - from ~ to : 시작 ~ 끝 인덱스
 */
int[] original = {10, 20, 30, 40, 50};
int[] copy = Arrays.copyOfRange(original, 1, 4); // [20, 30, 40]
```
```java
StringBuilder sb = new StringBuilder();
// String 넣어서 초기화 가능
StringBuilder t = new StringBuilder(s.substring(l, r + 1));

public StringBuilder delete(int start, int end); // start ~ end 까지 삭제
public StringBuilder insert(int offset, String str); // offset 위치에 str 에 전달된 문자열 추가
public StringBuilder replcae(int start, int end, String str); // start ~ end 내용을 str 로 대체
public StringBuilder reverse(); // 문자열 뒤집기
```

## Stack
> Stack 은 Vector 상속하고 있어서 문제가 있기때문에 자바 doc 찾아보면 Deque인터페이스의 ArrayDeque 구현체를 스택과 큐로 사용하는 것을 권장
```java
Deque<E> stack = new ArrayDeque<>();

void push(E e);
E pop();
E peek();
boolean isEmpty();
```




## Math 함수 정리
- Math.pow(a, b)
- Math.abs(a)
- Math.min(a, b)



---
## Lambda
- 인터페이스 구현 : 구현 클래스, 익명 내부 클래스, 람다 표현식
- 람다식 조건 : interface의 추상 메서드가 하나뿐일때
- 추상 메서드의 형태(파라미터, 리턴값)
- 람다식을 위한 Functional Interface  
  - Consumer(리턴값X)
  - Supplier(매개변수X)
  - Function(타입변환용)
  - Operator(연산구현)
  - Predicate(리턴형 boolean)
- 메서드 참조
  - 정적 메서드(클래스명::메서드명)
  - 일반 메서드(객체명::메서드명)
  - 일반 메서드 : 객체 자체가 람다의 매개변수로 들어온 경우 (클래스명::메서드명)
- 생성자 참조
  - 디폴트 생성자, 매개변수 있는 생성자 (클래스명::new)

## Stream 
### 1. 스트림 생성
- Arrays.stream(arr) : 배열의 타입에 따라서 반환 스트림이 달라짐
```java
// 컬렉션 배열의 경우 : Arrays.stream(arr)
String[] arr = {"A", "B", "C", "D"};
Stream<String> arrStream = Arrays.stream(arr);

// 원시타입 배열(정수)의 경우
int[] nums = {1, 2, 3, 4, 5};
IntStream intStream = Arrays.stream(nums);
// 문자열의 경우
// 따로 charStream은 존재하지 않는다.
Instream charStream = "abcdefg@gmail.com".chars();
```
#### IntStream 의 range() 메소드
- 지정된 범위의 정수를 생성하는 메서드
```java
public int solution(int a, int d, boolean[] included) {
  int answer = 0;
  return IntStream.range(0, included.length)
          .map(i -> included[i] ? a + d * i : 0)
          .sum();
}

IntStream.range(1, 5).forEach(System.out::println); // 마지막 5는 포함 X
IntStream.rangeClosed(1, 5).forEach(System.out::println); // 마지막 5도 포함 O
```

### 2. 중간 연산
`filter`, `map`, `sort`

```java
// 1. filter
// boolean 을 리턴하는 람다식을 작성하여 true 인 결과로 stream 재구성 
Stream<T> filter(Predicate<? super T> predicate);

// forEach
// 매개변수를 주고 그냥 소비 (출력문에 사용)
void forEach(Consumer<? super T> action);


// map
// 스트림의 각 요소를 변환 
// R: 변환된 요소의 타입, T: 원래 요소 타입, mapper: 각 원소를 변환하는 함수
<R> Stream<R> map(Function<? super T, ? extends R> mapper);

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<String> strings = numbers.stream()
        .map(num -> String.valueOf(num))
        .toList();

// mapToInt
// 타입변환용(book 객체를 intStream 으로) 
IntStream mapToInt(ToIntFunction<? super T> mapper);


// mapToObject
// IntStream 을 문자열로 변환
int[] numList = {1, 2, 3, 4, 5};

List<String> stringList = Arrays.stream(numList)
        .mapToObj(Integer::toString)  // int를 String으로 변환
        .collect(Collectors.toList());

// IntStream 을 문자로 변환
int[] numList = {65, 66, 67, 68};  // ASCII 코드 (A, B, C, D)

List<Character> charList = Arrays.stream(numList)
        .mapToObj(i -> (char) i)  // int를 char로 변환
        .collect(Collectors.toList());




// sort
// Comparable 을 구현해야하는데, 일시적인 적용을 원한다면 Comparator 사용 가능
List<String> nameList = Arrays.asList("Ched", "Alex", "Brad");

List<String> sortedNameList = nameList.stream()
        //.sorted(); // 오름차순 (.sorted((o1, o2) -> o1.compareTo(o2)))
        //.sorted(Comparator.reverseOrder());
        .sorted((o1, o2) -> o1.length() - o2.length()); // 길이를 비교해 긴게 더 앞으로 간다.

// distinct
// hashCode(), eqauls() 메서드에 의존 (오버라이딩 필요)
class Book {
    private String title;
    private int price;

    @Override
    public int hashCode() {
        //return super.hashCode();
        return Objects.hash();
    }

    @Override
    public boolean equals(Object obj) {
        // return super.equals(obj);
        if (!(obj instanceof Book)) return false;
        Book book = (Book) obj;
        return Objects.eqauls(title, book.title)
                && price == book.price;
    }
    
    // ...
}

class Test {
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();

    // hashCode: 71350647
    books.add(new Book("Java", 3000);
    // hashCode: 70060826
    books.add(new Book("Xml", 2500);
    // hashCode: 71350647				
    books.add(new Book("Java", 3000);

    books.stream()
            .distinct()
            .forEach(book -> System.out.println(book));
  }
}



// collect

<R, A> R collect(Collector<? super T,A,R> collector);

static <T, K> Collector<...> groupingBy(Function<T, K> classifier);

default void forEach(BiConsumer<K, V> action);

class Test {
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();

    books.add(new Book("Java", "태양"));
    books.add(new Book("Html", "달빛"));
    books.add(new Book("DB", "태양"));

    Map<String, List<Book>> result =
            books.stream()
                    .collect(
                            //Collectors.groupingBy(book -> 
                            //		book.getPublisher())
                            Collectors.groupingBy(Book::getPublisher)
                    );
    result.forEach((publisher, listByPublisher) -> {
      System.out.println(publisher);
      listByPublisher.forEach(System.out::println);
    });

    Map<String, Long> result =
            books.stream()
                    .collect(
                            Collectors.groupingBy(
                                    Book::getPublisher,
                                    Collectors.counting()
                            )
                    );
						);
    result.forEach((publisher, count) -> {
      System.out.println(publisher + ":" + count);
    })
  }

}


```



### 3. 종료 연산

`forEach`, `count`, `toList`, `allMatch`, `anyMath`, `noneMatch`, `sum`, `min`, `max`, `average`

```java
// forEach

// count

// toList

// allMatch, anyMatch, noneMatch

// sum

/**
 * int reduce(int identity, IntBinaryOperator op) 
 * - 설명 : 배열의 모든 요소를 순차적으로 처리하여 결과를 누적하는 방식의 메서드
 * - identity : 초기값
 * - op : 각 요소를 처리하는 람다식
 *   - left : 누적된 값
 *   - right : 현재 요소
 */
int product = Arrays.stream(arr)
        .reduce(1, (a, b) -> a * b);

int max = Arrays.stream(new int[]{1, 5, 3, 7, 2})
        .reduce(Integer.MIN_VALUE, (a, b) -> Math.max(a, b));

// min, max, average


```