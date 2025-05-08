package practice.day11.parents_gift_suggester.step2;

import practice.day11.parents_gift_suggester.data.GiftRepository;
import practice.day11.parents_gift_suggester.model.GiftItem;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CategoryCountReport {
    public static void run() {
        System.out.println("\uD83D\uDCE6 카테고리별 선물 개수 요약");

        Map<String, List<GiftItem>> map = GiftRepository.getGifts().stream()
                .collect(
                        Collectors.groupingBy(GiftItem::getCategory)
                );
        map.entrySet().stream()
                .forEach(e -> {
                    String category = e.getKey();
                    int count = e.getValue().size();
                    System.out.println(category + ": " + count + "개");
                });

    }
}
