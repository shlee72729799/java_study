package ch06;

import java.util.Scanner;

public class BankApplication {

    private static Account[] accountArray = new Account[100]; // 계좌 배열
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean run = true;

        while (run) {
            System.out.println("--------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("--------------------------------------------");
            System.out.print("선택> ");

            String selectNo = scanner.nextLine();   // 반드시 nextLine 사용

            switch (selectNo) {
                case "1":
                    createAccount();
                    break;
                case "2":
                    accountList();
                    break;
                case "3":
                    deposit();
                    break;
                case "4":
                    withdraw();
                    break;
                case "5":
                    System.out.println("프로그램 종료");
                    run = false;
                    break;
                default:
                    System.out.println("잘못 입력했습니다.");
            }
        }
    }

    // 1. 계좌 생성
    private static void createAccount() {
        System.out.println("[계좌생성]");
        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();

        System.out.print("계좌주: ");
        String owner = scanner.nextLine();

        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(scanner.nextLine());

        // 배열에서 빈 자리 찾기
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = new Account(ano, owner, balance);
                System.out.println("결과: 계좌가 생성되었습니다.");
                return;
            }
        }
        System.out.println("더 이상 계좌를 생성할 수 없습니다.");
    }

    // 2. 계좌 목록
    private static void accountList() {
        System.out.println("[계좌목록]");

        for (int i = 0; i < accountArray.length; i++) {
            Account account = accountArray[i];
            if (account != null) {
                System.out.println(
                        account.getAno() + "\t" +
                                account.getOwner() + "\t" +
                                account.getBalance()
                );
            }
        }
    }

    // 3. 예금
    private static void deposit() {
        System.out.println("[예금]");
        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();

        System.out.print("예금액: ");
        int money = Integer.parseInt(scanner.nextLine());

        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }

        account.setBalance(account.getBalance() + money);
        System.out.println("결과: 예금이 성공되었습니다.");
    }

    // 4. 출금
    private static void withdraw() {
        System.out.println("[출금]");
        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();

        System.out.print("출금액: ");
        int money = Integer.parseInt(scanner.nextLine());

        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }

        if (account.getBalance() < money) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        account.setBalance(account.getBalance() - money);
        System.out.println("결과: 출금이 성공되었습니다.");
    }

    // 계좌 검색 (계좌번호로 찾기)
    private static Account findAccount(String ano) {
        for (int i = 0; i < accountArray.length; i++) {
            Account account = accountArray[i];
            if (account != null && account.getAno().equals(ano)) {
                return account;
            }
        }
        return null;
    }
}
