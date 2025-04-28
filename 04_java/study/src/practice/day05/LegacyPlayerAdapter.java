package practice.day05;

public class LegacyPlayerAdapter implements Playable{
    private LegacyPlayer legacyPlayer;

    public LegacyPlayerAdapter(LegacyPlayer legacyPlayer) {
        this.legacyPlayer = legacyPlayer;
    }

    @Override
    public void play(String title) {
        if (title.toLowerCase().contains("bad")) {
            System.out.println("\uD83D\uDEAB 금지어가 포함된 곡은 재생할 수 없습니다: " + title);
            return;
        } else {
            legacyPlayer.startPlay(title);
        }
    }
}
