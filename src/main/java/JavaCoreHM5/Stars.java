public class Stars {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        StringBuilder textNumber = new StringBuilder();
        int i = count;
        while (i > 0) {
            if (i >= 1000) {
                i -= 1000;
                textNumber.append("X");
            } else if (i >= 100) {
                i -= 100;
                textNumber.append("Y");
            } else if (i >= 10) {
                i -= 10;
                textNumber.append("Z");
            } else {
                i -= 1;
                textNumber.append("*");
            }
        }
        return textNumber.toString();
    }

    static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars);
        System.out.println(stars.getCount());
    }
}
