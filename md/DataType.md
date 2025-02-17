> # 1) Wrapper Classes



## $-$ Integer
- 정수변환 (진법 변환)
    - 2수 변환 : `toBinaryString()`
- 숫자 비교 & 범위 확인
    - 정수 비교 : `compare()`, `min()`, `max()`
    - Integer 객체 비교 : `compareTo()`
- 형 변환
    - 문자열을 정수로 : `parseInt()`
    - 문자열을 Integer로 : `valueOf()`
    - 정수를 문자열로 : `toString()`

<details>
<summary>예시</summary>
<div markdown="1">

```java
/**
 * toBinaryString
 * 
 * @param i 정수
 * @return 2진수 String
 */
String toBinaryString(int i){}
// - System.out.println(Integer.toBinaryString(255)); 
// - 결과 : "11111111"

/**
 * compare
 * 
 * @param x @param y : 두 정수 x, y
 * @return x < y 이면 -1, x == y 이면 0, x > y 이면 1
 */
int compare(int x, int y){}
// - int n = Intetger.compare(1, 2);
// - 결과 : -1
```
</div>
</details>

---

## $-$ Character
- 문자 조작 (변형, 변환)
  - `toUpperCase()`, `toLowerCase()`
- 문자 검사
  - 숫자 여부 : `isDigit()`
  - 알파벳 여부 : `isLetter()`
  - 대소문자 여부 : `isUpeerCase()`, `isLowerCase()`
- 형 변환 (타입 관련)
  - 문자를 문자열로 : `toString()`

---

> # 2) Utility Classes


## $-$ String
- 문자열 조작(변형, 변환)
  - 문자열 추출 : `substring()`
  - 대소문자 변환 : `toLowerCase()`, `toUpperCase()`
  - 문자 : `replace()`
  - 문자열 치환 : `replaceAll()`
  - 문자열 앞뒤 공백 제거 : `trim()`
- 문자열 검색
  - 문자열 포함 여부 : `contains()`
  - 문자열 등장 위치 : `indexOf()`, `lasIndexOf()`
  - 문자열 시작/종료 여부 : `startsWith()`, `endsWith()`
- 문자열 분할
  - 정규표현식 : `split()`
  - 문자열 이어붙임 : `concat()`
- 형 변환
  - 문자열이 비었는지 : `isEmpty()`
  - 숫자를 문자열로 변환 : `valueOf()`
  - 문자열을 특정 횟수만큼 반복 반환 : `repeat()`

<details>
<summary>예시</summary>
<div markdown="1">

```java
/**
 * substring
 * 
 * @param beginIndex 시작 인덱스
 * @param endIndex (생략 가능) 끝 인덱스 
 * @return begin ~ end 위치의 문자열 리턴
 *         endIndex 생략 시 beginIndex 이후 위치의 문자열 리턴
 */
public String substring(int beginIndex, int endIndex);


/**
 * toLowerCase
 * 
 * @return String을 소문자 String으로 리턴
 */
public String toLowerCase() {}

/**
 * toUpperCase
 * 
 * @return String을 대문자 String으로 리턴
 */
public String toUpperCase() {}

/**
 * contains 
 * 
 * @param s 문자 시퀀스 (String, StringBuilder 등)
 * @return 주어진 문자 시퀀스가 포함되어 있으면 true, 그렇지 않으면 false
 */
public boolean contains(CharSequence s) {}

/**
 * replace
 *
 * @param oldChar 기존에 변경할 문자
 * @param newChar 새로 대체할 문자
 * @return 문자열 내에서 특정 문자(oldChar)를 새로운 문자(newChar)로 변경
 */
public String replace(char oldChar, char newChar) {}

/**
 * replaceAll
 * 
 * @param regex 변경할 패턴을 나타내는 정규 표현식
 * @param replacement 대체할 문자열
 * @return 정규 표현식(regex)에 해당하는 문자열을 새로운 문자열(replacement)로 변경
 */
public String replaceAll(String regex, String replacement) {}


/**
 * split 
 *
 * @param regex 분할 기준이 되는 정규 표현식
 * @param limit (생략 가능) 최대 분할 개수 (결과 배열의 길이가 최대 limit 개)
 * @return 정규 표현식(regex)을 기준으로 문자열을 최대 limit 개수만큼 분할 후 분할된 문자열 배열
 */
public String[] split(String regex, int limit) {}

/**
 * indexOf
 *
 * @param str 검색할 문자열
 * @param fromIndex (생략 가능) 검색을 시작할 인덱스
 * @return 문자열에서 특정 문자열(str)의 첫 등장 위치(인덱스)를 반환, 없으면 -1 
 */
public int indexOf(String str, int fromIndex) {}


/**
 * lastIndexOf
 *
 * @param str 검색할 문자열
 * @param fromIndex (생략 가능) 검색을 시작할 인덱스 (이 인덱스부터 왼쪽 방향으로 검색)
 * @return 문자열에서 특정 문자열(str)의 마지막 등장 위치(인덱스)를 반환, 없으면 -1
 */
public int lastIndexOf(String str, int fromIndex) {}

/**
 * startsWith
 *
 * @param prefix 확인할 접두사
 * @return 문자열이 지정된 접두사(prefix)로 시작하면 true, 그렇지 않으면 false
 */
public boolean startsWith(String prefix) {}

/**
 * endsWith
 *
 * @param suffix 확인할 접미사
 * @return 문자열이 지정된 접미사(suffix)로 끝나면 true, 그렇지 않으면 false
 */
public boolean endsWith(String suffix) {}

/**
 * valueOf
 *
 * @param i 변환할 정수
 * @return 주어진 정수 값을 문자열로 변환
 */
public static String valueOf(int i) {}
```
</div>
</details>


---
## $-$ Arrays

- 배열 생성 및 초기화
    - `fill()`
- 배열 복사
    - `copyOf()`, `copyOfRange()`
- 배열 정렬
    - `sort()`
- 배열 검색
    - `binarySearch()`
- 배열 비교 및 출력
    - `equals()`, `toString()`
- 배열 변환
    - `asList()`, `stream()`

<details>
<summary>예시</summary>
<div markdown="1">

```java
/**
 * 배열의 모든 요소를 특정 값으로 채웁니다.
 *
 * @param <T> 배열 요소의 타입
 * @param a 채울 배열
 * @param val 설정할 값
 */
public static <T> void fill(T[] a, T val) {}
// 예: Arrays.fill(arr, 5); → 모든 요소가 5로 채워짐

/**
 * 지정된 범위의 배열 요소를 특정 값으로 채웁니다.
 *
 * @param a 대상 배열
 * @param fromIndex 시작 인덱스 (포함)
 * @param toIndex 끝 인덱스 (제외)
 * @param val 설정할 값
 */
public static void fill(int[] a, int fromIndex, int toIndex, int val) {}
// 예: Arrays.fill(arr, 2, 5, 3); → arr[2] ~ arr[4]을 3으로 채움

/**
 * 기존 배열을 복사하여 새로운 배열을 생성합니다.
 *
 * @param original 원본 배열
 * @param newLength 새로운 배열의 길이
 * @return 복사된 배열
 */
public static int[] copyOf(int[] original, int newLength) {}
// 예: int[] copy = Arrays.copyOf(arr, 5); → 길이가 5인 배열 반환

/**
 * 배열의 특정 범위를 복사하여 새로운 배열을 생성합니다.
 *
 * @param original 원본 배열
 * @param from 시작 인덱스 (포함)
 * @param to 끝 인덱스 (제외)
 * @return 복사된 배열
 */
public static int[] copyOfRange(int[] original, int from, int to) {}
// 예: int[] subArray = Arrays.copyOfRange(arr, 2, 5); → arr[2] ~ arr[4] 복사

/**
 * 배열을 오름차순으로 정렬합니다.
 *
 * @param a 정렬할 배열
 */
public static void sort(int[] a) {}
// 예: Arrays.sort(arr); → 오름차순 정렬

/**
 * 배열의 특정 범위만 정렬합니다.
 *
 * @param a 정렬할 배열
 * @param fromIndex 시작 인덱스 (포함)
 * @param toIndex 끝 인덱스 (제외)
 */
public static void sort(int[] a, int fromIndex, int toIndex) {}
// 예: Arrays.sort(arr, 1, 5); → arr[1] ~ arr[4]만 정렬

/**
 * 사용자 지정 Comparator를 사용하여 배열을 정렬합니다.
 *
 * @param a 정렬할 배열
 * @param c Comparator 객체
 */
public static <T> void sort(T[] a, Comparator<? super T> c) {}
// 예: Arrays.sort(arr, Comparator.reverseOrder()); → 내림차순 정렬

/**
 * 배열에서 특정 값을 이진 검색(Binary Search)하여 인덱스를 반환합니다.
 * 배열이 정렬되어 있어야 합니다.
 *
 * @param a 검색할 배열 (오름차순 정렬 필수)
 * @param key 찾을 값
 * @return key의 위치 (없으면 음수)
 */
public static int binarySearch(int[] a, int key) {}
// 예: int index = Arrays.binarySearch(arr, 5); → key 값이 있는 위치 반환

/**
 * 배열에서 특정 범위 내에서 값을 검색합니다.
 *
 * @param a 검색할 배열 (오름차순 정렬 필수)
 * @param fromIndex 시작 인덱스 (포함)
 * @param toIndex 끝 인덱스 (제외)
 * @param key 찾을 값
 * @return key의 위치 (없으면 음수)
 */
public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {}

/**
 * 두 배열이 동일한지 비교합니다.
 *
 * @param a 첫 번째 배열
 * @param b 두 번째 배열
 * @return 두 배열이 같으면 true, 다르면 false
 */
public static boolean equals(int[] a, int[] b) {}
// 예: Arrays.equals(arr1, arr2); → 배열 비교 결과 반환

/**
 * 배열을 보기 좋은 문자열로 변환합니다.
 *
 * @param a 변환할 배열
 * @return 문자열 표현
 */
public static String toString(int[] a) {}
// 예: Arrays.toString(arr); → "[1, 2, 3]" 형태의 문자열 출력

/**
 * 가변인자(Varargs)를 이용하여 리스트를 배열로 변환합니다.
 *
 * @param <T> 배열 요소 타입
 * @param a 리스트 변환할 배열
 * @return 변환된 List 객체 (고정 크기)
 */
public static <T> List<T> asList(T... a) {}
// 예: List<Integer> list = Arrays.asList(1, 2, 3);
```
</div>
</details>

---

## $-$ Collections
- 정렬
  - `sort()`
  - `reverse()`
- 최대/최소 값 찾기
  - `max()`, `min()`
- 리스트 교체 및 회전
  - `replaceAll()`

<details>
<summary>예시</summary>
<div markdown="1">


```java
/**
 * 리스트를 오름차순 정렬 (Comparable<T> 기준)
 */
void sort(List<T> list) {}
// Collections.sort(list);

/**
 * 리스트를 내림차순 정렬
 */
void sort(List<T> list, Comparator<? super T> c) {}

/**
 * 리스트 요소 순서를 뒤집음
 */
void reverse(List<T> list) {}
// Collections.reverse(list);

/**
 * 컬렉션에서 최댓값 반환 (Comparable<T> 기준)
 */
T max(Collection<T> coll) {}
// System.out.println(Collections.max(list));

/**
 * 컬렉션에서 최솟값 반환
 */
T min(Collection<T> coll) {}

/**
 * 리스트 내 특정 요소를 새로운 요소로 일괄 변경
 */
boolean replaceAll(List<T> list, T oldVal, T newVal) {}
// Collections.replaceAll(list, "A", "X");
```

</div>
</details>

---


## $-$ StringBuilder & StringTokenizer

<details>
<summary>예시</summary>
<div markdown="1">

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

</div>
</details>

---


## $-$ Math 
- Math.pow(a, b)
- Math.abs(a)
- Math.min(a, b)