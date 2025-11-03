package JavaCoreHW3;

public class CaptainDisputeAgain {

    public int findMin(int[] triple) {
        return Math.min(Math.min(triple[0], triple[1]),triple[2]);
    }

    static void main(String[] args) {
        CaptainDisputeAgain cap = new CaptainDisputeAgain();

        //Return 1
        System.out.println(cap.findMin(new int[]{1, 10, 3}));

        //Return 4
        System.out.println(cap.findMin(new int[]{50, 4, 100}));
    }
}
