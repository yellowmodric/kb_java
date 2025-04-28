package ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        MovieThread movieThread = new MovieThread();
        MusicRunnable musicRunnable = new MusicRunnable();

        movieThread.start();
        musicRunnable.start();


    }
}
