package practice.day10;

import practice.day10.framework.Ticket;
import practice.day10.framework.TicketFactory;
import practice.day10.metamong.MetaMonTicketFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    private static List<Goods> list = new ArrayList<>();
    public static void main(String[] args) {
        list.add(new Goods("메타몽 쿠션", "분홍", false));
        list.add(new Goods("메타몽 노트북 파우치", "보라", true));
        list.add(new Goods("메타몽 인형", "분홍", false));
        list.add(new Goods("메타몽 가방", "회색", true));
        list.add(new Goods("메타몽 키링", "파랑", false));

        Main main = new Main();

        main.printSelectedGoods("이슬이", g -> g.getColor() == "분홍");
        main.printSelectedGoods("지우", Goods::isUseful);
    }

    public void printSelectedGoods(String user, Predicate<Goods> filter) {
        System.out.println("[" + user + "의 선택]");
        for (Goods g : list) {
            if (filter.test(g)) {
                System.out.println("- " + g.getName());
            }
        }
    }
}
