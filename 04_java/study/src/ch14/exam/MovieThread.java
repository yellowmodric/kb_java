package ch14.exam;

import java.awt.*;

public class MovieThread {
        Thread movieThread = new Thread() {
            public void run() {
                for (int i=0; i<3; i++) {
                    System.out.println("동영상을 재생합니다.");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {}
                }
            }
        };

        public void start() {
            movieThread.start();
        }
    }

