package adapter.adapter1;

public class PrintBanner extends Banner implements Print{
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeek() {
        showWithParent();
    }

    @Override
    public void printStrong() {
        showWithAter();
    }
}
