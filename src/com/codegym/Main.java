package com.codegym;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int choice = -1;
        CandidatureManagement candidatureManagement = new CandidatureManagement();
        do {
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            if (choice > 3) {
                System.out.println("chọn lại Menu!!!!");
            }
            switch (choice) {
                case 1: {
                    candidatureManagement.displayCandidatureBlockA();
                    candidatureManagement.displayCandidatureBlockB();
                    candidatureManagement.displayCandidatureBlockC();
                    break;
                }

                case 2: {
                    System.out.println("----Nhập thông tin thí sinh mới----");
                    System.out.println("1. Thí sinh khối A.");
                    System.out.println("2. Thí sinh Khối B.");
                    System.out.println("3. Thí sinh khối C.");
                    System.out.println("Bạn hãy lụa chọn: ");
                    int choice1 = scanner.nextInt();
                    switch (choice1) {
                        case 1: {
                            System.out.println("---Thêm thí sinh khối A---");
                            BlockA newCandidature = inputNewCandidatureBlockA();
                            candidatureManagement.addNewCandidature(0,newCandidature);
                            break;
                        }
                        case 2: {
                            System.out.println("---Thêm thí sinh khối B---");
                            BlockB newCandidature = inputNewCandidatureBlockB();
                            candidatureManagement.addNewCandidature(0,newCandidature);
                            break;
                        }
                        default: {
                            System.out.println("---Thêm thí sinh khối C---");
                            BlockC newCandidature = inputNewCandidatureBlockC();
                            candidatureManagement.addNewCandidature(0,newCandidature);
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    Scanner inputName = new Scanner(System.in);
                    System.out.println("----Tìm thí sinh theo Số báo danh----");
                    System.out.println("Nhập SDB thí sinh cần tim: ");
                    int examID = scanner.nextInt();
                    candidatureManagement.findCandidature(examID);
                    break;
                }
            }
        } while (choice != 4);
    }

    public static void menu() {
        System.out.println("----MENU QUẢN LÝ THÍ SINH----");
        System.out.println("1. Hiển thị tất cả thí sinh");
        System.out.println("2. Nhập thông tin  thí sinh mới");
        System.out.println("3. Tìm kiếm thí sinh theo họ tên");
        System.out.println("4. Thoát");
    }

    public static BlockA inputNewCandidatureBlockA() {
        System.out.println("Nhập số báo danh: ");
        int examID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Họ và tên: ");
        String name = scanner.nextLine();
        System.out.println("Địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Nhập khu vực ưu tiên: ");
        String priorityArea = scanner.nextLine();
        String examObject = "Toán, Lý, Hóa";
         return  new BlockA(examID, name, address, priorityArea, examObject);

    }

    public static BlockB inputNewCandidatureBlockB() {
        System.out.println("Nhập số báo danh: ");
        int examID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Họ và tên: ");
        String name = scanner.nextLine();
        System.out.println("Địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Nhập khu vực ưu tiên: ");
        String priorityArea = scanner.nextLine();
        String examObject = "Toán, Hóa, Sinh";
        return new BlockB(examID,name,address,priorityArea,examObject);
    }

    public static BlockC inputNewCandidatureBlockC() {
        System.out.println("Nhập số báo danh: ");
        int examID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Họ và tên: ");
        String name = scanner.nextLine();
        System.out.println("Địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Nhập khu vực ưu tiên: ");
        String priorityArea = scanner.nextLine();
        String examObject = "Văn, Sử, Địa";
        return new BlockC(examID,name,address,priorityArea,examObject);
    }

}
