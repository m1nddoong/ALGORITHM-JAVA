# 문법 정리

> 수열은 점화식

## Integer
```java
// 정수를 2진수 변환
// String binaryString = Integer.toBinaryString(int i);
System.out.println(Integer.toBinaryString(255)); // "11111111"

// 두 정수 a 와 b를 비교
// 대소관계를 나타내는 값 반환
// a < b 이면 -1, a == b 이면 0, a > b 이면 1
int n = Intetger.compare(a, b);
```

## String
```java
// < String 클래스 >

// index 이후 위치의 문자열 리턴
String substring(int index);
// begin ~ end 위치의 문자열 리턴
String substring(int beginIndex, int endIndex);

// 소문자로 리턴
String str1 = myString.toLowerCase();
// 대문자로 리턴
String str2 = myString. toUpperCase();

// 문자열 포함
public boolean contains(CharSequence s) {}

// 문자열 내 뮨자 교환
public String replace(char oldChar, char newChar) {}

// 문자열 내 문자 전체 교환
public String replaceAll(String regex, String replacement) {}

// 문자열 자르기 (정규표현식 regex 입력)
public String[] split(String regex) {}

// 문자열 자르기, x를 기준으로 최대 limit 번 분할 (결과 배열의 길이가 최대 10이 되도록 한다)
public String[] split(String regex, int limit) {}


// 문자열에서 특정 문자열 또는 문자가 등장하는 위치(인덱스) 반환 : lastIndexOf, IndexOf

/**
 * 문자열 str 이 처음으로 등장하는 위치를 반환
 */
public int indexOf(String str) {}

/**
 * fromIndex 위치부터 검색을 시작하여 str 이 처음 등장하는 위치를 반환
 */
public int indexOf(String str, int fromIndex) {}


/**
 * str 이 원본 문자열에서 마지막으로 등장하는 위치(인덱스) 반환, 없으면 -1
 */
public int lastIndexOf(String str) {}

// ex)
String text = "hello world, hello java";
int index = text.lastIndexOf("hello");
System.out.println(index); // 13


/**
 * fromIndex 를 기준으로 왼쪽(역방향)으로 검색하여 str 이 마지막으로 등장하는 위치 반환
 */
public int lastIndexOf(String str, int fromIndex) {}

// ex)
String text = "hello world, hello java";
int index = text.lastIndexOf("hello", 10);
System.out.println(index); // 0

// 특정 문자로 문자열이 시작하는지
public boolean startsWith(String prefix) {}

// 특정 문자로 문자열이 종료되는지
public boolean endsWith(String suffix) {}


// 문자열을 IntStream 형태의 문자 스트림으로 반환 
public IntStream chars() {}

String str = "Hello";
IntStream intStream = str.chars().map(c -> c - 48).sum();
```

## Arrays 

```java
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


// arr 를 length 크기로 복사하여, 원래 배열보다 크다면 나머지 부분을 0으로 채워넣는다.
Arrays.copyOf(arr, length);

public static int[] copyOf(int[] original, int newLength) {
  int[] copy = new int[newLength];
  System.arraycopy(original, 0, copy, 0,
          Math.min(original.length, newLength));
  return copy;
}
```

## List 인터페이스

```java
// 
<T> T[] toArray(T[] a);

// 컬렉션의 요소를 배열로 변환 (전달한 배열 타입(T[])을 유지한 채 변환)
// List<E> → E[]
// Set<E> → E[]
list.toArray(new String[0]);

```

## StringBuilder & StringTokenizer

```java
StringBuilder sb = new StringBuilder();
// String 넣어서 초기화 가능
StringBuilder t = new StringBuilder(s.substring(l, r + 1));

public StringBuilder delete(int start, int end); // start ~ end 까지 삭제
public StringBuilder insert(int offset, String str); // offset 위치에 str 에 전달된 문자열 추가
public StringBuilder replcae(int start, int end, String str); // start ~ end 내용을 str 로 대체
public StringBuilder reverse(); // 문자열 뒤집기


// 디폴트로 delim 에 " \t\n\r\f" 가 들어가있음 
// StringTokenizer 는 빈 문자열 ("") 무시
StringTokenizer st = new StringTokenzier(String str, String delim);
while(st.hasMoreTokens()) {}
st.nextToken();
    
```


## Map
- HashMap ` Map<Integer, Integer> student = new HashMap<>();`
  - 해시 테이블(Hash Table) 기반으로 동작 
  - 데이터 순서를 보장하지 않음 (키-값 쌍이 무작위로 저장)
  - Null 키 허용 
- TreeMap `Map<Integer, Integer> student = new TreeMap<>();`
  - Red-Black Tree(이진 검색 트리) 기반 동작
  - 키 값 기준으로 자동 정렬됨 (기본적으로 오름차순)
  - Null 키를 허용하지 않음

  
## Stack
> Stack 은 Vector 상속하고 있어서 문제가 있기때문에 자바 doc 찾아보면 Deque인터페이스의 ArrayDeque 구현체를 스택과 큐로 사용하는 것을 권장
```java
Deque<E> stack = new ArrayDeque<>();

void push(E e);
E pop();
E peek();
boolean isEmpty();
```



## Queue 
- Queue<E>
  - FIFO 구조를 가진 인터페이스
- Deque<E>
  - 양쪽에서 삽입, 삭제가 가능한 인터페이스
- PriorityQueue<E>
  - 우선순위 기반 정렬이 적용된 힙(Heap) 기반 큐
  - 요소를 정렬된 순서대로 저장하는 것이 아니라, 꺼낼 때 우선순위가 가장 높은 요소가 먼저 반환됨
  - 기본적으로 `Comparable` 인터페이스를 구현한 객체의 `compareTo` 기준으로 정렬
    - 숫자라면 오름차순(작은 값 우선), String 이면 알파벳 순 정렬
  - 우선순위 기준을 변경하려면 `Comparator` 를 사용해야함
```java
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 기본적으로 최소 힙 (오름차순)
        
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(1);

        System.out.println("우선순위 큐에서 꺼낸 값 순서:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // 1 → 5 → 10 → 20 (오름차순)
        }
    }
}
/*
우선순위 큐에서 꺼낸 값 순서:
1
5
10
20
*/

public class MaxHeapExample {
  public static void main(String[] args) {
    // 내림차순 정렬 (최대 힙)
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    maxHeap.add(10);
    maxHeap.add(5);
    maxHeap.add(20);
    maxHeap.add(1);

    System.out.println("최대 힙에서 꺼낸 값 순서:");
    while (!maxHeap.isEmpty()) {
      System.out.println(maxHeap.poll()); // 20 → 10 → 5 → 1 (내림차순)
    }
  }
}
/*
최대 힙에서 꺼낸 값 순서:
20
10
5
1
*/
```
 
- LinkedList<E>
  - 연결 리스트 기반의 큐 (Deque 기능 포함)
- ArrayDeque<E>
  - 배열 기반의 큐 (성능이 우수)



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

- IntStream.of(arr) : 정수배열 (int[]) 을 스트림(IntStream) 으로 변환


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

answer = Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
// min, max, average


```