/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AiProject;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author medo
 */
    public class discoversubdirs implements Runnable {
    public static Map<String,String>mapS=new HashMap<String,String>();

    String path;
    public discoversubdirs(String m){
        this.path=m;
    }
    @Override
    public void run() {
        try {
            File file = new File(path);
            File[] files = file.listFiles();
            for (File sourceFile : files) {
                String fileN = sourceFile.getName();
                    if(sourceFile.isDirectory()){
                    String k  = path + fileN;
                    mapS.put("3",k);
                    }
            fileN = "";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

