# 문법 정리

## String
```java
// index 이후 위치의 문자열 리턴
String substring(int index);
// begin ~ end 위치의 문자열 리턴
String substring(int beginIndex, int endIndex);

```
## Math 함수 정리
- Math.pow(a, b)
- Math.abs(a)



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

// min, max, average
```