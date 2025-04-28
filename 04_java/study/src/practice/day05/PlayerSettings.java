package practice.day05;

public class PlayerSettings {
    static class Mode {
        static boolean shuffle = false;
        static boolean repeat = true;
        static int volumeLevel = 5;

        public static void printSettings() {
            System.out.println("\uD83C\uDF9B 현재 재생 설정 상태");
            System.out.print("\t - Shuffle: ");
            System.out.println(shuffle ? "ON" : "OFF");
            System.out.print("\t - Repeat: ");
            System.out.println(repeat ? "ON" : "OFF");
            System.out.print("\t - Volume: ");
            System.out.println(volumeLevel);
        }

        public static void setShuffle(boolean value) {
            shuffle = value;
            if (shuffle) {
                System.out.println("Shuffle 모드가 ON으로 설정되었습니다.");
            } else {
                System.out.println("Shuffle 모드가 OFF로 설정되었습니다.");
            }
        }

        public static void setRepeat(boolean value) {
            repeat = value;
            if (repeat) {
                System.out.println("Repeat 모드가 ON으로 설정되었습니다.");
            } else {
                System.out.println("Repeat 모드가 OFF로 설정되었습니다.");
            }
        }

        public static void setVolumeLevel(int level) {
            if (level < 0 || level > 10) {
                System.out.println("볼륨은 0~10 사이로 설정해야 합니다,.");
                return;
            } else {
                volumeLevel = level;
                System.out.println("볼륨이 " + volumeLevel + "로 설정되었습니다.");
            }
        }
    }
}
