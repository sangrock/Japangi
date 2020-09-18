import java.util.Scanner;

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
        System.out.println("100원 이하의 단위는 받지않습니다.");
        System.out.println("음료수를 선택 하기 전 돈을 투입하여 주세요:   (원)");
        money = scan.nextInt();
        System.out.println("투입하신 금액은 "+money+"원 입니다");

        errsee=money%100;  //100원이하로 돈투입시 오류발생시키기
        if (errsee>0){
            System.out.println("오류발생 다시 시도하여 주세요");
        }

        else {
            while (money>0){
                System.out.println("1.사이다 1000원 2.콜라 1500원 3.맥콜 1200원");
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


                    if (money>100){
                        System.out.println("음료수를 더 선택하시겠습니까? 예는 1번 아니오는 2번을 눌러주세요");
                        select = scan.nextInt();
                        if (select==1){
                            continue;
                        }
                        else if (select==2){
                            break;
                        }
                    }
                    else{
                        System.out.println("100원 이하의 잔액이 남았기 때문에 환불 과정으로 넘어가겠습니다.");
                        break;
                    }
            }
            System.out.println("환불을 시작하겠습니다");
            int m1000=money/1000;
            money=money-(m1000*1000);
            int m500=money/500;
            money=money-(m500*500);
            int m100=money/100;
            money=money-(m100*100);
            if (m1000>0){
                System.out.println("1000원 지폐는 "+m1000+"장 환불되었습니다");
            }
            else{
            }
            if (m500>0){
                System.out.println("500원 동전은 "+m500+"개 환불되었습니다");
            }
            else{
            }
            if (m100>0){
                System.out.println("100원 동전은 "+m100+"개 환불되었습니다");
            }
            else{
            }
        }
    }
    }
