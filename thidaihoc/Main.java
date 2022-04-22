package thidaihoc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TuyenSinh tuyenSinh = new TuyenSinh();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=====Menu=====");
            System.out.println("1. Them thi sinh");
            System.out.println("2. Hien thong tin thi sinh");
            System.out.println("3. Tim kiem theo so bao danh");
            System.out.println("4. Thoat");

            int choice = -1;
            while (choice == -1) {
                try {
                    choice = scanner.nextInt();
                } catch (Exception e) {
                    System.err.println("Nhap vao so!");
                } finally {
                    scanner.nextLine();
                }
            }
            switch (choice) {
                case 1:
                    System.out.println("a. Nhap thi sinh khoi A");
                    System.out.println("b. Nhap thi sinh khoi B");
                    System.out.println("c. Nhap thi sinh khoi C");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a":
                            tuyenSinh.them(taoThiSinh(scanner, "a"));
                            break;
                        case "b":
                            tuyenSinh.them(taoThiSinh(scanner, "b"));
                            break;
                        case "c":
                            tuyenSinh.them(taoThiSinh(scanner, "c"));
                            break;
                        default:
                            System.err.println("Nhap khoi khong hop le.");
                            break;
                    }
                case 2:
                    tuyenSinh.hienThongTin();
                    break;
                case 3: {
                    System.out.println("Nhap so bao danh: ");
                    String id = scanner.nextLine();
                    String thiSinh = String.valueOf(tuyenSinh.timKiemTheoID(id));
                    if (thiSinh == null) {
                        System.err.println("Khong thay");
                    } else {
                        System.out.println(thiSinh);
                    }
                    break;
                }
                case 4:
                    System.exit(0);
                default:
                    System.err.println("Khong hop le");
                    continue;
            }
        }
    }

    public static ThiSinh taoThiSinh(Scanner scanner, String khoi) {
        System.out.println("Nhap so bao danh: ");
        String soBaoDanh = scanner.nextLine();
        System.out.print("Nhap ten: ");
        String ten = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        String diaChi = scanner.nextLine();
        System.out.print("Nhap muc do uu tien: ");
        int mucUuTien = scanner.nextInt();
        scanner.nextLine();
        if (khoi.equals("a")) {
            return new ThiSinhA(soBaoDanh, ten,diaChi,mucUuTien);
        } else if (khoi.equals("b")) {
            return new ThiSinhB(soBaoDanh, ten,diaChi,mucUuTien);
        } else {
            return new ThiSinhC(soBaoDanh, ten,diaChi,mucUuTien);
        }
    }
}
