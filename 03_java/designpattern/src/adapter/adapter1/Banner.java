package adapter.adapter1;

public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParent() {
        System.out.println("(" + string + ")");
    }

    public void showWithAter() {
        System.out.println("*" + string + "*");
    }
}
