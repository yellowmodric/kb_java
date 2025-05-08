package practice.day11.parents_gift_suggester.step3;

import practice.day11.parents_gift_suggester.data.GiftRepository;
import practice.day11.parents_gift_suggester.model.GiftItem;

public class MostValuableGift {
    public static void run() {
        GiftRepository.getGifts().stream()
                .filter(GiftItem::isForMom)

    }
}
