import java.util.Scanner;
/*1.음료수 여럿 선택
* 2.잔돈 반환
* 3.클래스로 나누기
* */
public class main {
    public static void main(String[] args) {
        String yesno;
        int errsee;
        int select;
        int money;
        int cider = 1000;
        int cola = 1500;
        int macol = 1200;
        Scanner scan = new Scanner(System.in);
        //돈투입&메뉴실행
        System.out.println("자판기 프로그램입니다.");
        System.out.println("음료수는 하나만 선택하실수 있습니다. 100원 이하의 단위는 받지않습니다.");
        System.out.println("1.사이다 1000원 2.콜라 1500원 3.맥콜 1200원");
        System.out.println("음료수를 선택 하기 전 돈을 투입하여 주세요:   (원)");
        money = scan.nextInt();
        System.out.println("투입하신 금액은 "+money+"원 입니다");

        errsee=money%100;  //100원이하로 돈투입시 오류발생시키기
        if (errsee>0){
            System.out.println("오류발생 다시 시도하여 주세요");
        }

        else {
            while (money>0){
                System.out.println("음료수를 선택해 주세요:");
                select = scan.nextInt();

                switch (select) { //각 음료수별 실행구문 출력
                    case 1:
                        System.out.println("1000원짜리 사이다를 골랐습니다.");
                        money = money - cider;
                        if (money < 0) { //만약 음료수를사서 돈이 0원 아래로 떨어진다면 오류출력
                            System.out.println("잔액이 부족합니다. 다시 시도해 주세요");
                        } else {
                            System.out.println("남은 금액은" + money + "원 입니다");
                        }
                        break;

                    case 2:
                        System.out.println("1500원짜리 콜라를 골랐습니다.");
                        money = money - cola;
                        if (money < 0) {
                            System.out.println("잔액이 부족합니다. 다시 시도해 주세요");
                        } else {
                            System.out.println("남은 금액은" + money + "원 입니다");
                        }
                        break;

                    case 3:
                        System.out.println("1200원짜리 맥콜을 골랐습니다.");
                        money = money - macol;
                        if (money < 0) {
                            System.out.println("잔액이 부족합니다. 다시 시도해 주세요");
                        } else {
                            System.out.println("남은 금액은" + money + "원 입니다");
                        }
                        break;
                        }
                System.out.println(""+select+"번 음료수를 선택하였습니다.");
                System.out.println("남은 금액은" + money + "원 입니다");


            }
            System.out.println("잔돈 " + money + "원을 반환 하겠습니다.");

        }
    }
    }
