package app.tabser.model;

public class Beat {
    public static final Beat INHERIT = new Beat(-1, -1);
    public static final Beat FOUR_FOURTH = new Beat(4, 4);
    public static final Beat THREE_FOURTH = new Beat(3, 4);
    private  int bar;
    private  int count;

    public Beat() {
    }

    public Beat(int bar, int count) {
        this.bar = bar;
        this.count = count;
    }

    public int getBar() {
        return bar;
    }

    public void setBar(int bar) {
        this.bar = bar;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
