package practice.day11.parents_gift_suggester.step1;

import practice.day11.parents_gift_suggester.data.GiftRepository;
import practice.day11.parents_gift_suggester.model.GiftItem;

import java.util.stream.Stream;

public class HighPreferenceFilter {
    public static void run() {
        System.out.println("\uD83C\uDF81 부모님이 진짜 좋아하시는 선물 리스트");
        GiftRepository.getGifts().stream()
                .filter(n -> n.getPreferenceScore() >= 70)
                .forEach(n -> System.out.println(n.getName()));


    }
}
