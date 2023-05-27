package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {

        try{
//            System.out.println(3/0);

//            int[] arr = new int[3];
//            arr[5] = 100;

            Object obj = "test";
            System.out.println((int)obj);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 정상종료");
    }
}
