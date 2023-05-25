package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        String[][] seat3 = new String[10][15];
        char c = 'A';

        for (int i = 0; i < seat3.length; i++) {
            for (int j = 0; j < seat3[i].length; j++) {
                seat3[i][j] = String.valueOf(c)+(j+1);
                System.out.print(seat3[i][j]+" ");
            }
            c++;
            System.out.println();
        }
    }
}
