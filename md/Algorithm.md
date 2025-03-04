> # 1) Sort

> 정렬 동작 원리
> - 양수 : 첫 번째 요소가 두 번쨰 요소보다 클 경우 두 요소의 순서를 바꾸는 원리
> - 음수 : 첫 번째 요소가 두 번쨰 요소보다 작은 경우 순서를 유지하는 원리
> - 0 : 두 요소가 같을 경우 순서를 변경하지 않는 원리

## 배열 정렬: Arrays.sort() 
- 기본형 배열 정렬 
  - 내림차순: `Arrays.sort(arr);`
  - 오름 차순  `Arrays.sort(arr, reverseOrder())`
  - 람다식 변환 : `Arrays.sort(nums, (a, b) -> a - b))`
- 객체 배열 정렬 
  - Comparable 구현 
    - 클래스가 자신을 다른 객체와 비교할 수 있도록 하는 인터페이스
    - 객체 스스로 정렬 기준으로 정의, `int compareTo(Object o)` 메서드 오버라이딩
  - Comparator 구현
    - 두 객체를 비교하기 위해 별도의 클래스를 만들 수 있도록 하는 인터페이스
    - 두 객체를 비교할 외부 정렬 기준 정의, `int compare(Object o1, Object o2)` 메서드 오버라이딩
    - 양수면 a 가 앞으로 음수면 
  - 익명 클래스를 사용하여 Comparator 구현
    - 람다식 변환 : `Arrays.sort(people, (p1, p2) -> p1.name.compareTo(p2.name));`
 

```java
/**
 * 기본형 배열 정렬
 */
int[] arr = {5, 2, 3, 1, 4};
Arrays.sort(arr); // 오름차순: [1, 2, 3, 4, 5]
Arrays.sort(arr, reverseOrder()); // 내림차순: [5, 4, 3, 2, 1]

/**
 * 객체 배열 정렬 - Comparable
 */
class Person implements Comparable<Person> {
    String name;
    int age;
    
    public Person(String name, int age) {...};
    
    @Override
    public int compareTo(Person other) {
        return this.age - other.age; // 나이 기준 오름차순
    }
}

Person[] people = {new Person("Alex", 25), new Person("Brad", 22)};
Arrays.sort(people); // 나이 기준 정렬

/**
 * 객체 배열 정렬 - Comparator
 */
class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);
    }
}

/**
 * 익명 클래스
 * 1. Comparator<Person> 을 구현한 익명 클래스르 사용하여 compare 메서드를 오버리이딩
 * 2. 두 Person 객체의 name 을 비교하는데, String 클래스의 compareTo 를 사용하여 두 문자열 비교
 * 3. 두 문자열이 같으면 0, 첫 번째 문자열 더 크면 양수, 두 번쨰 문자열이 더 크면 음수 반환
 * 4. 양수면 p1 이 뒤로, 음수면 p1 이 앞으로, 0이면 그대로 
 */
Arrays.sort(people, new Comparator<Person>() {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);
    }
});

/**
 * 람다식 변환
 * - p1, p2 는 Person 객체 
 * - -> 뒤의 표현식이 comparator 의 compare 메서드를 구현한 부분
 */
Arrays.sort(people, (p1, p2) -> p1.name.compareTo(p2.name)); // 이름 기준 오름차순
```

---
## 리스트 정렬: Collections.sort()
- `Collections.sort()` 는 `List` 를 정렬하는 데 사용된다.
- 기본 리스트 정렬
  - 오름 차순 : `Collections.sort(list);`
  - 내읾 차순 : `Collections.sort(list, reverseOrder())`
- 객체 리스트 정렬
  - Comparable
  - Comparator

```java
/**
 * 기본 리스트 정렬
 */
List<Integer> nums = new ArrayList<>();
nums.add(5);
nums.add(2);
nums.add(3);
nums.add(1);
nums.add(4);
Collections.sort(nums); // 오름차순 : [1, 2, 3, 4, 5]

/**
 * 객체 리스트 정렬 - Comparable
 */
class Person implements Comparable<Person> {
    String name;
    int age;
    
    public Perseon(String name, int age) {...}
    
    @Override
    public int compareTo(Person other) {
        return this.age - other.age;
    }
}
List<Person> peopleList = new ArrayList<>();
peopleList.add(new Person("Alex", 25));
peolpleList.add(new Person("Brad", 22));
Collections.sort(peopleList); // 나이 기준 정렬


/**
 * 객체 리스트 정렬 - Comparator
 */
class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);
    }
}

/**
 * 익명 클래스 - Comparator
 */
Collections.sort(peopleList, new Comparator<Person>() {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);
    }
})

/**
 * 람다식 변환
 */
Collections.sort(peopleList, (p1, p2) -> p1.name.compareTo(p2.name)); // 이름 기준 오름차순
```
---

## Set 정렬 
```java
// 익명 클래스 
import java.util.TreeSet;
import java.util.Comparator;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        // 익명 클래스 사용
        TreeSet<Person> treeSet = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.age, p2.age); // 나이 기준 오름차순
            }
        });

        treeSet.add(new Person("Alice", 30));
        treeSet.add(new Person("Bob", 25));
        treeSet.add(new Person("Charlie", 35));

        System.out.println(treeSet);
    }
}

// 람다식 변환
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // 람다식 사용
        TreeSet<Person> treeSet = new TreeSet<>((p1, p2) -> Integer.compare(p1.age, p2.age)); // 나이 기준 오름차순

        treeSet.add(new Person("Alice", 30));
        treeSet.add(new Person("Bob", 25));
        treeSet.add(new Person("Charlie", 35));

        System.out.println(treeSet);
    }
}
```

## Map 정렬

```java
// 익명 클래스
import java.util.TreeMap;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // 익명 클래스 사용
        TreeMap<String, Integer> treeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String key1, String key2) {
                return key1.compareTo(key2); // 이름 기준 오름차순
            }
        });

        treeMap.put("Alice", 30);
        treeMap.put("Bob", 25);
        treeMap.put("Charlie", 35);

        System.out.println(treeMap);
    }
}

// 람다식 
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // 람다식 사용
        TreeMap<String, Integer> treeMap = new TreeMap<>((key1, key2) -> key1.compareTo(key2)); // 이름 기준 오름차순

        treeMap.put("Alice", 30);
        treeMap.put("Bob", 25);
        treeMap.put("Charlie", 35);

        System.out.println(treeMap);
    }
}
```

> # 2) Greedy


> # 3) Dynamic Programming


> # 4) DFS/BFS


> # 5) 이분 탐색



> # 6) 그래프