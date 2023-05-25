package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] sizes = new int[10];
        int default_size = 250;

        for (int i = 0; i < sizes.length; i++) {
            sizes[i] = default_size + (i * 5);
        }

        for (int size : sizes
        ) {
            System.out.println("사이즈 " + size + " (재고있음)");

        }
    }
}
