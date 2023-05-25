package chap_04;

public class _05_For {
    public static void main(String[] args) {
        int sum = 0;

        // 1+2+3+....+10  = ?
        for(int i=1; i<11; i++ ){
            sum += i;
        }

        System.out.println(sum);


        // fori : 단축키
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if( j >= 4-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
