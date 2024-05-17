package algorithm.d4;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

    // 자바의 기본 Queue는 Queue 인터페이스가 아닌 컬렉션의 LinkedList 클래스를 활용한다.
        // Queue<Integer> queue = new Queue<Integer>()
        Queue<Integer> queue = new LinkedList<>();

    // 1. enQueue 용 메서드 2가지 - add, offer
        // 둘다 넣는다는 것은 동일 하지만 오류 상황에서의 대처가 다르다.
        // add : 넣기를 시도하고 실패할 경우 예외를 발생시킨다.
        queue.add(10);
        queue.add(20);
        queue.add(30);
        // offer : 넣기를 시도하고, 실패할 경우 false 를 반환한다.
        queue.offer(15);
        queue.offer(25);
        queue.offer(35);

    // 2. deQueue 메서드 2거지 - remove, poll
        // remove : 뺴기를 시도하고, 실패할 경우 예외를 발생시킨다.
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        // poll : 뺴기를 시도하고, 실패할 경우 null 을 반환한다.
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        // 예외가 발생하지 않고 null 을 출력
        System.out.println(queue.poll());
        // 예외가 발생, 프로그램 종료
        // System.out.println(queue.remove());

    // 3. 다음에 등장할 아이템을 확인하는 메서드 - element, peek
        // element : 비어있을 경우 예외 발생
        // System.out.println(queue.element());
        // peek : 비어있을 걍우 null 반환
        System.out.println(queue.peek());

    // 4. 비어있는지 확인
        System.out.println(queue.isEmpty());

    // 5. 몇개 있는지 확인
        System.out.println(queue.size());




    }
}
