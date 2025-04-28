package practice.day05;

public class PlaybackLogger {
    void log(String title, String artist) {
        class RecentLog {
            String title;
            String artist;

            public RecentLog(String title, String artist) {
                this.title = title;
                this.artist = artist;
            }

            void printLog() {
                if (title.length() >= 10 || artist.length() >= 10) {
                    System.out.println("\uD83C\uDFBC 최근 재생: " + title + " - " + artist + " (인기곡)");
                } else {
                    System.out.println("\uD83C\uDFBC 최근 재생: " + title + " - " + artist);
                }
            }
        }
        RecentLog r = new RecentLog(title, artist);
        r.printLog();
    }
}
