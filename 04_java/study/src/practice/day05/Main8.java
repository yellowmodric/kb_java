package practice.day05;

public class Main8 {
    public static void main(String[] args) {
        Playable legacy = new LegacyPlayerAdapter(new Playable.LegacyPlayer());
        Playable modern = new ModernPlayerAdapter(new Playable.ModernPlayer());

        legacy.play("Ditto");
        modern.play("bad song");
        legacy.play("사건의 지평선");
        modern.play("Attention");
    }
}
