package LikeLion.d2;

import java.util.Arrays;

public class Sorting {
    // 인접한 두 원소를 비교하면서
    // 더 큰 원소를 오른쪽으로 차례대로 이동시킨다.
    public static void bubbleSort(int[] array) {
        // 자주 사용하는 변수
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1; j++) {
                // j와 j+1 을 비교한다.
                if (array[j] > array[j + 1]) {
                    // 더 크면 교환
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println("round " + i + ": " + Arrays.toString(array));
        }

    }

    public static void selectionSort(int[] array) {
        int length = array.length;

        for (int j = 0; j < length - 1; j++) {
            // 현재 정렬되지 않은 제일 앞쪽 원소는 j
            // 최초로 비교할 원소는 j 부터 즉 0부터 1씩 증가하여 0 1 2 순으로
            int minIndex = j;

            // 최솟값이 어디있는지를 찾는다.
            // i = j+1 부터 비교한다. (j가 0일떄는 1부터 비교, j가 2일떄는 3부터 비교)
            for (int i = j+1; i < length; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }
            // 제일 작은 원소와 제일 앞의 원소를 교환한다.
            int temp = array[minIndex];
            array[minIndex] = array[j];
            array[j] = temp;
            System.out.println("round " + j + ": " + Arrays.toString(array));
        }

    }

    // Counting Sort
    public static void countingSort(int[] array) {
        // 원랴는 max를 찾아야 되는데
        // 이번만큼은 5임을 알고있다고 가정한다.
        int[] counts = new int[6]; // 0이 6개가 들어가있는 배열이 만들어지게 되는 것.
        // 모든 array 데이터를 순회하면서 각 counts[data]++;
        for (int data : array) {
            counts[data]++;
        }

        // counts 배열을 각 데이터가 마지막에 나오는 위치가 담기게 조정
        for (int i = 0; i < 5; i++) {
            // 다음칸에 지금칸의 데이터를 더해준다 -> 누적합
            counts[i + 1] += counts[i];
        }
        // counts 중간점검
        System.out.println(Arrays.toString(counts));

        // 결과를 담을 배열 만들기 (output)
        int[] output = new int[array.length];
        // 뒤에서부터 순회하며 output 배열 채우기.
        for (int i = array.length - 1; i >= 0; i--) {
            // 현재 원소의 마지막 위치를 조정
            counts[array[i]]--;
            // 현재 데이터의 다음 위치 정보를 회수
            int position = counts[array[i]];
            // 새로운 배열의 position에 데이터 할당하기
            output[position] = array[i];
        }

        // 원본에 새로운 데이터 적용하기
        for (int i = 0; i < array.length; i++) {
            array[i] = output[i];
        }
    }


    // 이진 탐색
    public static int binarySearch(int[] array, int target) {
        // 검색 대상 경계선을 세운다.
        // 배열의 시작과 끝의 인덱스를 저장한다.
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            // 중간지점 설정 (왼쪽부터 오른쪽 까지의 거리만큼 왼쪽에서 이동한 정도)
            int mid = (right - left) / 2 + left;

            // 3단계
            // 1. 가운데에 원하는게 있었다.
            if (array[mid] == target) { // 가운데 값이 내가 찾고있는 target 값과 같다면
                return mid;
            }
            // 2. 가운데가 원하는 것보다 작다.
            // 찾아야 하는게 지금보다 오른쪽이다.
            else if (array[mid] < target) {
                // left를 mid 보다 한칸 오른쪽으로 조정한다.
                left = mid + 1;

            }
            // 3. 가운데가 원하는 것보다 크다.
            // 찾아야 하는게 지금보다 왼쪽이다.
            else {
                // right 를 mid 보다 한칸 왼쪽으로 조정한다.
                right = mid -1;
            }
        }
        // 탐색에 실패했다면, 그걸 표시하기 위한 값을 반환
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {11, 31, 29, 16, 20, 1, 5, 8};
        // 개발자가 사용하는 입장 : Arrays.sort(array);
        System.out.println("initial: " + Arrays.toString(array));
        // bubbleSort(array);
        selectionSort(array);
        System.out.println(Arrays.toString(array));

        array = new int[]{1, 5, 8, 11, 16, 20, 29, 31};
        System.out.println(binarySearch(array, 5));

    }
}
