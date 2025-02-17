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
- PriorityQueue(우선순위 기반 정렬이 적용된 Heap 기반 큐)
  - 내부적으로 힙을 사용하여 우선순위가 높은 요소를 먼저 처리 
  - 구현체 : PriorityQueue
  - 메서드 : `offer()`, `poll()`, `peek()` 
  - 기본적으로 최소힙 (최솟값 우선)으로 동작하며, `Collection.reverseOrder()` 등을 통해 최대 힙으로 설정 가능
  - 기본적으로 `Comparable` 인터페이스를 구현한 객체의 `compareTo` 기준으로 정렬
    - 숫자라면 오름차순(작은 값 우선), String 이면 알파벳 순 정렬
  - 우선순위 기준을 변경하려면 `Comparator` 를 사용해야함


<details>
<summary>예시</summary>
<div markdown="1">

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
