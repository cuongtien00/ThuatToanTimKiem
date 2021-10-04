package DoPhucTapCuaThuatToan;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap chuoi");

        String inputString = scanner.nextLine();

        int[] frequentChar = new int[255];               //{1}

        for (int i = 0; i < inputString.length(); i++) { //{2}

            int ascii = (int)inputString.charAt(i);      //{3}

            frequentChar[ascii] += 1;                    //{4}
        }
        int max = 0;                                      //{5}
        char character = (char) 255;                      //{6}
        for (int i = 0; i < 255; i++) {                   //{7}
            if(frequentChar[i]>max){                      //{8}
                max = frequentChar[i];                    //{9}
                character = (char) i;                     //{10}
            }
        }
        System.out.println("Ky tu " + character + " xuat hien nhieu nhat voi so lan " + max);
    }

}
//tinh do phuc tap
//cac cau lenh voi thoi gian thuc hien O(1) la: {1}{3}{4}{5}{6}{8}{9}{10};
//cau lenh {2} ton thoi gian O(n);
//cau lenh {7} ton O(255);