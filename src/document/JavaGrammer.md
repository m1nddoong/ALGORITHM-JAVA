## 문법 정리

### String
```java
// index 이후 위치의 문자열 리턴
String substring(int index);
// begin ~ end 위치의 문자열 리턴
String substring(int beginIndex, int endIndex);

```
### Math 함수 정리
- Math.pow(a, b)
- Math.abs(a)



---
### Java Stream
- 스트림은 데이터소스(배열, 컬렉션 등)에사 데이터를 읽어 작업을 수행한다.
- 원본 데이터를 변경하지 않고 새로운 결과를 반환한다.
- 스트림은 한 번 사용하면 소모됩니다.
- 중간 연산
  - 스트림을 변환하거나 필터링하며, 또 다른 스트림을 반환한다.
  - `map` : 스트림의 각 요소를 특정 함수에 적용하여 새로운 요소로 변환
  - `filter` : 스트림의 각 요소에 대해 조건을 검사하여 조건을 만족하는 요소만 포함하는 새로운 스트림을 생성
  - `sorted` 
- 최종 연산
  - 스트림을 소비하여 결과를 생성한다. 
  - `forEach` : : 스트림의 각 요소를 하나씩 소비하여 작업을 수행합니다. 주로 요소를 출력하거나 특정 작업을 실행할 때 사용
  - `toArray`
  - `collect` 
  


