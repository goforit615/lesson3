package operator;

public class OperationEx1 {
    public static void main(String[] args) {
        int mathScore = 90;
        int engScore = 70;

        int totalScore = mathScore + engScore;  // 총점 구하기
        System.out.println("Total score: " + totalScore);

        double avgScore = totalScore / 2.0; // 평균 구하기
        System.out.println("Average score: " + avgScore);
    }
}
