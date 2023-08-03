import Entities.SinhVienBiz;
import Entities.SinhVienIT;
import Entities.SinhVienTechMaster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //BÀI TẬP 1
//        do {
//            System.out.println("Mời nhập quãng đường: ");
//            int distance = Integer.parseInt(scanner.nextLine());
//            if (distance <= 0) {
//                System.out.println("Giá trị không hợp lệ, mời nhập lại!");
//                continue;
//            }
//            Entities.Bus bus = new Entities.Bus();
//            bus.print();
//            Entities.Train train = new Entities.Train();
//            train.print();
//            Entities.Airplane airplane = new Entities.Airplane();
//            airplane.print();
//            break;
//        }
//        while (true);

        ////BÀI TẬP 2
        //Tạo mảng để chứa thông tin sinh viên
        SinhVienTechMaster[] arrSinhVien = new SinhVienTechMaster[10];
        int index = 1;  //tạo bộ đếm để truy xuất thứ tự phần tử trong mảng
        do {
            System.out.println("Mời chọn sinh viên:");
            System.out.println("1. Sinh viên IT");
            System.out.println("2. Sinh viên Biz");
            int input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1 -> {
                    System.out.println("-----------Sinh viên IT------------");
                    System.out.print("Mời nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("\n");
                    System.out.print("Mời nhập ngành: ");
                    String major = scanner.nextLine();
                    System.out.print("\n");
                    System.out.println("Mời nhập điểm: ");
                    do {
                        System.out.print("Điểm Java: ");
                        float java = Float.parseFloat(scanner.nextLine() + "\n");
                        if (java < 0 || java > 10) {
                            System.out.println("Giá trị không hợp lệ, mời nhập lại!");
                            continue;
                        }
                        do {
                            System.out.print("Điểm HTML: ");
                            float html = Float.parseFloat(scanner.nextLine() + "\n");
                            if (html < 0 || html > 10) {
                                System.out.println("Giá trị không hợp lệ, mời nhập lại!");
                                continue;
                            }
                            do {
                                System.out.print("Điểm CSS: ");
                                float css = Float.parseFloat(scanner.nextLine() + "\n");
                                if (css < 0 || css > 10) {
                                    System.out.println("Giá trị không hợp lệ, mời nhập lại!");
                                    continue;
                                }
                                SinhVienIT sinhVienIT = new SinhVienIT(name, major, java, html, css);
                                //System.out.println(sinhVienIT.xuat());
                                arrSinhVien[index - 1] = sinhVienIT;
                                index++;
                                break;
                            }
                            while (true);
                            break;
                        }
                        while (true);
                        break;
                    }
                    while (true);
                }
                case 2 -> {
                    System.out.println("-----------Sinh viên Biz------------");
                    System.out.print("Mời nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("\n");
                    System.out.print("Mời nhập ngành: ");
                    String major = scanner.nextLine();
                    System.out.print("\n");
                    System.out.println("Mời nhập điểm: ");
                    do {
                        System.out.print("Điểm Marketing: ");
                        float marketing = Float.parseFloat(scanner.nextLine() + "\n");
                        if (marketing < 0 || marketing > 10) {
                            System.out.println("Giá trị không hợp lệ, mời nhập lại!");
                            continue;
                        }
                        do {
                            System.out.print("Điểm Sales: ");
                            float sales = Float.parseFloat(scanner.nextLine() + "\n");
                            if (sales < 0 || sales > 10) {
                                System.out.println("Giá trị không hợp lệ, mời nhập lại!");
                                continue;
                            }
                            SinhVienBiz sinhVienBiz = new SinhVienBiz(name, major, marketing, sales);
                            //System.out.println(sinhVienBiz.xuat());
                            arrSinhVien[index - 1] = sinhVienBiz;
                            index++;
                            break;
                        }
                        while (true);
                        break;
                    }
                    while (true);
                }
            }
            System.out.println("Bạn có muốn tiếp tục? (Y/N)");
            String n = scanner.nextLine();
            if (n.equalsIgnoreCase("y")) {continue;}

            //In ra màn hình các phần tử của mảng
            System.out.println("-------Thông tin Sinh viên --------");
            for (int i = 0; i < index - 1; i++) {
                System.out.println(arrSinhVien[i].xuat());
            }
            break;
        } while (true);
    }
}