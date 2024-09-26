import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        // 차량별로 주차 요금을 저장할 Map (차량 번호 -> 요금)
        Map<String, Integer> feeMap = new HashMap<>();
        // 입차 시간을 기록할 Map (차량 번호 -> 입차 시간)
        Map<String, String> parkingArea = new HashMap<>();
        // 총 주차 시간을 기록할 Map (차량 번호 -> 누적 시간)
        Map<String, Integer> totalTimeMap = new HashMap<>();

        // 기록을 하나씩 처리
        for (String record : records) {
            String[] arr = record.split(" ");
            String time = arr[0];
            String carNumber = arr[1];
            String action = arr[2];

            if (action.equals("IN")) {
                parkingArea.put(carNumber, time);
            } else { // OUT
                String inTime = parkingArea.get(carNumber);
                String outTime = time;
                int totalMin = calTime(inTime, outTime);
                parkingArea.remove(carNumber);

                // 누적 시간을 업데이트
                totalTimeMap.put(carNumber, totalTimeMap.getOrDefault(carNumber, 0) + totalMin);
            }
        }

        // 남아있는 차들에 대해 23:59에 출차 처리
        for (String carNumber : parkingArea.keySet()) {
            String inTime = parkingArea.get(carNumber);
            String outTime = "23:59";
            int totalMin = calTime(inTime, outTime);
            totalTimeMap.put(carNumber, totalTimeMap.getOrDefault(carNumber, 0) + totalMin);
        }

        // 요금 계산
        for (String carNumber : totalTimeMap.keySet()) {
            int totalMin = totalTimeMap.get(carNumber);
            int fee = feesCal(fees, totalMin);
            feeMap.put(carNumber, fee);
        }

        // 차량 번호 순으로 정렬하고 결과 반환
        List<String> sortedCarNumbers = new ArrayList<>(feeMap.keySet());
        Collections.sort(sortedCarNumbers);

        int[] answer = new int[sortedCarNumbers.size()];
        for (int i = 0; i < sortedCarNumbers.size(); i++) {
            answer[i] = feeMap.get(sortedCarNumbers.get(i));
        }

        return answer;
    }

    // 시간 차이를 분으로 계산하는 메서드
    public static int calTime(String inTime, String outTime) {
        return timeToMin(outTime) - timeToMin(inTime);
    }

    // "HH:MM" 형식의 시간을 분 단위로 변환하는 메서드
    public static int timeToMin(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }

    // 요금을 계산하는 메서드
    public static int feesCal(int[] fees, int totalMin) {
        int basicTime = fees[0];  // 기본 시간
        int basicFee = fees[1];   // 기본 요금
        int unitTime = fees[2];   // 단위 시간
        int unitFee = fees[3];    // 단위 요금

        if (totalMin <= basicTime) {
            return basicFee;
        } else {
            return basicFee + (int) Math.ceil((double) (totalMin - basicTime) / unitTime) * unitFee;
        }
    }
}
