package practice.day07;

public class Fan implements Runnable {

    private String name;
    private boolean isVip;
    private EntryManager entryManager;

    public Fan(String name, boolean isVip, EntryManager entryManager) {
        this.name = name;
        this.isVip = isVip;
        this.entryManager = entryManager;
    }

    @Override
    public void run() {
        entryManager.registerFan(this);
        while (!entryManager.processEntry(this)) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}
        }

    }

    public String getName() {
        return name;
    }

    public boolean isVip() {
        return isVip;
    }
}
