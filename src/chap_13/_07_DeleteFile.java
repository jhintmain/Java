package chap_13;

import java.io.File;

public class _07_DeleteFile {
    public static void main(String[] args) {
        File file = new File("test.txt");

        // 파일 삭제
        if(file.exists()){
            if(file.delete()){
                System.out.println("파일삭제 성공: "+file.getName());
            }else{
                System.out.println("파일삭제 실패: "+file.getName());
            }
        }

        // 폴더삭제
        File folder = new File("A/B/C");

        if(folder.exists()){
            // 하위폴더 없을때만 가능
            if(folder.delete()){
                System.out.println("폴더삭제 성공: "+folder.getAbsolutePath());
            }else{
                System.out.println("폴더삭제 실패: "+folder.getAbsolutePath());
            }
        }

        // 하위 폴더 삭제
        folder = new File("A");
        if(deleteFolder(folder)){
            System.out.println("하위 폴더삭제 성공: "+folder.getAbsolutePath());
        }else{
            System.out.println("하위 폴더삭제 실패: "+folder.getAbsolutePath());
        }
    }

    // 하위폴더 재귀 삭제 메소드
    public static boolean deleteFolder(File folder){
        if(folder.exists()){
            for(File file : folder.listFiles()){
                if(file.isDirectory()){
                    deleteFolder(file);
                }
            }
        }
        System.out.println("삭제대상 : "+folder.getAbsolutePath());
        return folder.delete();
    }
}
