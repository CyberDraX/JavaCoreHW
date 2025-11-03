package JavaCoreHM2;

public class Counter {

    public long current(long number){
        return number;
    }

    public long next(long number){
        number++;
        return number;
    }

    public long prev(long number){
        number--;
        return number;
    }

    static void main(String[] args) {
        Counter counter = new Counter();

        // Should be 5
        System.out.println("counter.current(5) = " + counter.current(5));

        // Should be 6
        System.out.println("counter.next(5) = " + counter.next(5));

        // Should be 4
        System.out.println("counter.prev(5) = " + counter.prev(5));
    }
}
