package adapter.adapter2;

import adapter.adapter1.Banner;

public class PrintBanner extends Print{
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeek() {
        banner.showWithParent();
    }

    @Override
    public void printStrong() {
        banner.showWithAter();
    }
}
