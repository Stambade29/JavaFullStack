
public class USERTRAIL {
    private int val1;
    private int val2;

    public USERTRAIL(int val1, int val2) throws Exception {
        if (val1 < 0 || val2 < 0) {
            throw new Exception("Value cannot be negative.");
        }
        this.val1 = val1;
        this.val2 = val2;
    }

    public boolean show() {
        return (val1 > 0 && val2 > 0);
    }
}