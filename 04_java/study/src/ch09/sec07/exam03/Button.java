package ch09.sec07.exam03;

public class Button {
    public static interface ClickListener {
        void onClick();
    }

    private Button.ClickListener clickListener;

    public void setClickListener(Button.ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }
}
