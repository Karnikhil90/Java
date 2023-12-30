package OOPs.Basic;

/**
 * Box
 */
public class Box {

    int l, b, h;

    Box() { // Non Parameter
        l = 12;
        b = 5;
        h = 8;
    }

    Box(int l, int h) { // Dual Parameter
        this.l = l;
        this.b = h;
        this.h = h;
    }

    Box(int l, int b, int h) { // Triple Parameter
        this.l = l;
        this.b = b;
        this.h = h;
    }

    // Volume
    public int volume() {
        return l * b * h;
    }

    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(5, 7);
        Box box3 = new Box(8, 6, 8);
        // Output
        System.out.println("First Box Volume :" + box1.volume());
        System.out.println("Second Box Volume :" + box2.volume());
        System.out.println("Third Box Volume :" + box3.volume());

    }
}