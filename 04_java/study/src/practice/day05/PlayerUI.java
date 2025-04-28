package practice.day05;

public class PlayerUI {
    public interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener;

    void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    void clickPlayButton() {
        if (clickListener == null) {
            System.out.println("❌ 리스너가 등록되지 않았습니다.");
        }
        this.clickListener.onClick();
    }
}
