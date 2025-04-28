package practice.day05;

public class MusicApp {
    String title;
    String artist;
    String genre;

    public MusicApp(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    class MusicPlayer {
        String getEffect(String genre) {
            if (genre.equals("HIPHOP")) {
                return "💥";
            } else if (genre.equals("BALLAD")) {
                return "🎵";
            } else {
                return "🎧";
            }
        }

        void play() {
            System.out.println(getEffect(genre) + " " + title + " - " + artist + " 을(를) 재생합니다. " + getEffect(genre));
        }
    }
}
