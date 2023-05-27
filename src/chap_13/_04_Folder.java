package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir();
        if(folder.exists()){
            System.out.println("폴더가 존재합니다 : "+folder.getAbsolutePath());
        }

        folderName = "A/B/C";
        folder = new File(folderName);
//        folder.mkdir(); // 상위폴더가 존재해야 가능함 mkdir()
        folder.mkdirs(); // 상위폴더가 존재하지 않아도 가능함 mkdirs()
        if(folder.exists()){
            System.out.println("폴더가 존재합니다 : "+folder.getAbsolutePath());
        }else{
            System.out.println("폴더 생성 실패");
        }

    }
}
