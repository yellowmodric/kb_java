package practice.day05;

public class AppMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.play("Ditto", true, new MusicPlayer.PlayResultListener() {
            @Override
            public void onSuccess(String title) {
                System.out.println("✅ 재생 성공: " + title);
            }

            @Override
            public void onError(String title, int errorCode) {
                System.out.println("❌ 재생 실패: " + title + "- 오류 코드 " + errorCode);
            }
            // TODO: 여기에서 onSuccess와 onError 메서드를 구현하세요.
            // 성공 시: "✅ 재생 성공: 제목"
            // 실패 시: "❌ 재생 실패: 제목 - 오류 코드 코드"
        });

        player.play("Attention", false, new MusicPlayer.PlayResultListener() {
            @Override
            public void onSuccess(String title) {
                System.out.println("✅ 재생 성공: " + title);
            }

            @Override
            public void onError(String title, int errorCode) {
                System.out.println("❌ 재생 실패: " + title + " - 오류 코드 " + errorCode);
            }
            // TODO: 위와 동일하게 onSuccess와 onError 메서드를 구현하세요.
        });
    }
}
