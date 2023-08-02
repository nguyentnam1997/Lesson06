import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //BÀI TẬP 1
        do {
            System.out.println("Mời nhập quãng đường: ");
            int distance = Integer.parseInt(scanner.nextLine());
            if (distance <= 0) {
                System.out.println("Giá trị không hợp lệ, mời nhập lại!");
                continue;
            }
            Bus bus = new Bus(distance);
            bus.print();
            Train train = new Train(distance);
            train.print();
            Airplane airplane = new Airplane(distance);
            airplane.print();
            break;
        }
        while (true);

        //BÀI TẬP 2
//        do {
//            ""
//            switch ()
//            case
//        }
//        while (true);

    }
}