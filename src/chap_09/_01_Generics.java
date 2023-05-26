package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제너릭스 : 다양한 타입
//        int[] iArray = {1, 2, 3, 4, 5};
//        double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};

        Integer[] iArray = {1, 2, 3, 4, 5}; // wrapper class로 바꿔
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};  // wrapper class로 바꿔
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("-------------");

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);

    }

    // T: Type. K:Key, V :Value, E : Element
    private static<T> void printAnyArray(T[] array){
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for (Double d : dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
        for (int i : iArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
