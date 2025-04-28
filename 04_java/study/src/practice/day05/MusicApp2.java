package practice.day05;

public class MusicApp2 {
    private static String user = "yura";

    public static class PlayerUI {
        public void show() {
            System.out.println("🎧 현재 사용자: " + user); // ❌ 컴파일 에러 발생
        }
    }

    public static void main(String[] args) {
        MusicApp2.PlayerUI ui = new MusicApp2.PlayerUI();
        ui.show();
    }
}
