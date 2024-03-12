import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ya_Al30_DivB_Ch01_task19 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("main/input.txt"));
        int count = Integer.parseInt(bufferedReader.readLine());

        Number head;



        for (int i = 0; i < count; i++) {
            if (i == 0) {
                if (bufferedReader.read() == 0) {
                    head = new Number(bufferedReader.read());
                }
            } else if (bufferedReader.read() == 0) {
                Number number = new Number(bufferedReader.read());
//                if (number.number > head.number) {
//
//                }

            } else {

            }
        }


    }
    static class Number {
        Number left;
        Number right;
        int number;

        public Number(int number) {
            this.number = number;
        }
    }
}
