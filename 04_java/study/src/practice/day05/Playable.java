package practice.day05;

public interface Playable {
    void play(String title);

    public class LegacyPlayer {
        public void startPlay(String song) {
            System.out.println("🎵 Legacy 재생: " + song);
        }
    }

    public class ModernPlayer {
        public void begin(String musicTitle) {
            System.out.println("🎶 Modern 재생: " + musicTitle);
        }
    }
}
