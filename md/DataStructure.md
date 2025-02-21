# 자료구조 정리

---



## 5) List vs Set vs Map
- List (순서가 있는 컬렉션)
  - 구현체 : `ArrayList`, `LinkedList`
  - 메서드 : `get()`, `add()`, `remove()`, `indeOf()`, `size()`
- Set (중복 없는 컬렉션, 순서 보장 X)
  - 구현체 : `HashSet`, `TreeSet`, `LinkedHashSet`
  - 메서드 : `add()`, `remove()`, `contains()`, `size()`
- Map (key-value 쌍으로 저장, 순서 보장 X)
  - 구현체 
    - `HashMap` : 해시 테이블 기반 동작, 순서 보장 X, Null 키 허용 O
    - `TreeMap` : 이진 검색 트리 기반 동작, Key 값 기준 오름차순 정렬, Null 키 허용 X 
    - `LinkedHashMap` 
  - 메서드 : `put()`, `get()`, `remove()`, `containsKey()`, `keySet()`, `values()`, `size()`

<details>
<summary>예시</summary>
<div markdown="1">

```java
/**
 * 요소를 순서대로 저장하며 중복 허용
 * 구현체: ArrayList, LinkedList
 */
interface List<E> extends Collection<E> {}

E get(int index); // 특정 위치 요소 조회
void add(E e); // 요소 추가
void add(int index, E element); // 특정 위치에 요소 추가
E remove(int index); // 특정 위치 요소 제거
int indexOf(Object o); // 특정 요소의 인덱스 반환
int size(); // 리스트 크기 반환

// 에시
List<String> list = new ArrayList<>();
list.add("A");
list.add("B");
System.out.println(list.get(0)); // "A"

/**
 * 중복을 허용하지 않는 컬렉션 (순서 보장 X)
 * 구현체: HashSet, TreeSet, LinkedHashSet
 */
interface Set<E> extends Collection<E> {}

boolean add(E e); // 요소 추가 (이미 존재하면 false 반환)
boolean remove(Object o); // 요소 제거
boolean contains(Object o); // 특정 요소 포함 여부 확인
int size(); // 집합 크기 반환

Set<Integer> set = new HashSet<>();
set.add(1);
set.add(2);
set.add(2); // 중복이므로 추가 안됨
System.out.println(set.size()); // 2

/**
 * 키-값(key-value) 구조의 컬렉션 (키는 중복 불가)
 * 구현체: HashMap, TreeMap, LinkedHashMap
 */
interface Map<K, V> {}

V put(K key, V value); // 키-값 추가 (기존 키면 값 덮어쓰기)
V get(Object key); // 특정 키에 해당하는 값 조회
V remove(Object key); // 특정 키 제거
boolean containsKey(Object key); // 특정 키 존재 여부 확인
Set<K> keySet(); // 모든 키 반환
Collection<V> values(); // 모든 값 반환
int size(); // 맵 크기 반환

Map<String, Integer> map = new HashMap<>();
map.put("A", 10);
map.put("B", 20);
System.out.println(map.get("A")); // 10
```

</div>
</details>

---

## 6) Stack, Queue
- Stack (LIFO) 
  - 구현체 : ArrayDeque
  - 메서드 : `push()`, `pop()`, `peek()`
- Queue (FIFO)
  - 구현체 : ArrayDeque
  - 메서드 : `offer()`, `poll()`, `peek()`
- Deque (양방향 큐) 
  - 구현체 : ArrayDeque
  - 메서드 : `addFirst()`, `addLast()`, `removeFirst()`, `removeLast()`

- PriorityQueue
  - 기본 동작 
    - 기본 정렬 방식 : 요소들은 Comparable 인터페이스의 compareTo 메서드에 따라 자연 순서로 정렬된다.
      - 숫자 : 오름차순으로 정렬되어 작은 값이 우선된다.
      - 문자열 : 알파벳 순서로 정렬된다. 
    - 내부 구현 : PriorityQueue는 완전 이진 트리 형태의 힙을 기반으로 하며, 요소의 추가 및 제거 시 시간 복잡도가 O(log n)을 가진다.
    - 메서드
      - `offer(E e)` : 큐의 끝에 요소를 추가한다.
      - `poll()` : 큐의 머리(head)에 있는 요소를 제거하고 반환한다.
      - `peek()` : 큐의 머리(head)에 있는 요소를 제거하지 않고 반환한다.
  - 최대 힙과 최소 힙으로서의 PriorityQueue
    - 설명 : PriorityQueue는 기본적으로 최소 힙으로 동작하지만, Comparator를 사용하여 최대 힙으로 동작하도록 설정할 수 있다.
    - (1) 최소 힙 (Min-Heap)
      - 기본 동작 : 별도의 설정 없이 PriorityQueue 를 생성하면 최소 힙으로 동작한다.
    - (2) 최대 힙 (Max-Heap)
      - `Comparator` 사용 : `Collections.reverseOrder()` 를 이용하여 역순 정렬로 최대 힙을 구현할 수 있다.  
  
> 자바의 PriorityQueue 에서는 힙 삽입/삭제 시 자동으로 heapify가 실행됨

  



<details>
<summary>예시</summary>
<div markdown="1">

### 기본 PriorityQueue 사용법
```java
// 이 예제에서 PriorityQueue는 
// 기본적으로 최소 힙으로 동작하여 작은 값부터 출력된다.
import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.offer(10);
    pq.offer(5);
    pq.offer(20);

    while (!pq.isEmpty()) {
      System.out.println(pq.poll());
    }
  }
}
// 결과
// 5
// 10
// 20
```

### (1) 최소 힙 
```java
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
minHeap.offer(15);
minHeap.offer(10);
minHeap.offer(30);

while(!minHeap.isEmpty()) {
    System.out.println(minHeap.poll());   
}
// 결과
// 10
// 15
// 30
```

### (3) 최대 힙 (Max-Heap)
```java
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.offer(15);
        maxHeap.offer(10);
        maxHeap.offer(30);

        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
    }
}
// 결과
// 30
// 15
// 10

// 람다식을 사용해서 Comparator 를 직접 정의할 수도 있다.
PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

```



```java
Stack<Integer> stack = new Stack<>();
stack.push(1);
stack.push(2);
System.out.println(stack.pop()); // 2
System.out.println(stack.peek()); // 1


Deque<E> stack = new ArrayDeque<>();
void push(E e);
E pop();
E peek();
boolean isEmpty();



Queue<Integer> queue = new LinkedList<>();
queue.offer(1);
queue.offer(2);
System.out.println(queue.poll()); // 1
System.out.println(queue.peek()); // 2
```

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

</div>
</details>


> Stack 은 Vector 상속하고 있어서 문제가 있기때문에 자바 doc 찾아보면 Deque인터페이스의 ArrayDeque 구현체를 스택과 큐로 사용하는 것을 권장
  








---
