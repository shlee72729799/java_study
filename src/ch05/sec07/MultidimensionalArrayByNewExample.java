package ch05.sec07;

public class MultidimensionalArrayByNewExample {


    public static void main(String[] args) {
        // -----------------------------
        // 수학 점수 배열 생성 및 출력
        // -----------------------------
        int[][] mathScores = new int[2][3]; // 2반, 각 반에 3명

        for (int i = 0; i < mathScores.length; i++) { // 반 반복
            for (int k = 0; k < mathScores[i].length; k++) { // 학생 반복
                System.out.println("mathScores[" + i + "][" + k + "]: " + mathScores[i][k]);
            }
        }

        System.out.println();

        // 수학 점수 값 저장
        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;

        // 수학 평균 점수 구하기
        int totalStudent = 0;
        int totalMathSum = 0;

        for (int i = 0; i < mathScores.length; i++) {      // 반 반복
            totalStudent += mathScores[i].length;          // 학생 수 누적
            for (int k = 0; k < mathScores[i].length; k++) { // 학생 반복
                totalMathSum += mathScores[i][k];          // 점수 누적
            }
        }

        double totalMathAvg = (double) totalMathSum / totalStudent;
        System.out.println("전체 수학 평균 점수: " + totalMathAvg);
        System.out.println();


        // -----------------------------
        // 영어 점수 배열 생성 및 출력
        // -----------------------------
        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2]; // 1반 학생 2명
        englishScores[1] = new int[3]; // 2반 학생 3명

        for (int i = 0; i < englishScores.length; i++) { // 반 반복
            for (int k = 0; k < englishScores[i].length; k++) { // 학생 반복
                System.out.println("englishScores[" + i + "][" + k + "]: " + englishScores[i][k]);
            }
        }

        System.out.println();

        // 영어 점수 값 저장
        englishScores[0][0] = 90;
        englishScores[0][1] = 91;
        englishScores[1][0] = 92;
        englishScores[1][1] = 93;
        englishScores[1][2] = 94;

        // 영어 평균 점수 구하기
        totalStudent = 0;
        int totalEnglishSum = 0;

        for (int i = 0; i < englishScores.length; i++) {
            totalStudent += englishScores[i].length;
            for (int k = 0; k < englishScores[i].length; k++) {
                totalEnglishSum += englishScores[i][k];
            }
        }

        double totalEnglishAvg = (double) totalEnglishSum / totalStudent;
        System.out.println("전체 영어 평균 점수: " + totalEnglishAvg);
    }
}
