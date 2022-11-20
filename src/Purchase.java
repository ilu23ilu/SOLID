public class Purchase {

    protected final String title;
    protected int count;

    public Purchase (String title, int count) {
        this.title = title;
        this.count = count;
    }
    public String getTitle() {
        return title;
    }
}
