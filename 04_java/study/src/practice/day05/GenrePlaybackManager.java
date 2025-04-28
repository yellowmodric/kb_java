package practice.day05;

public class GenrePlaybackManager {
    public interface GenrePlayer {
        public void play(String title, String artist);
    }

    private static GenrePlayer genrePlayer;

    public void setPlayer(GenrePlayer player) {
        this.genrePlayer = player;
    }
    public void play(String title, String artist) {
        this.genrePlayer.play(title, artist);
    }
}
