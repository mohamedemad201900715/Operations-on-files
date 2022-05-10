/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AiProject;

import java.io.File;
import java.util.HashMap;
import java.util.Map;


    public class descoverfile implements Runnable {
    public static Map<Integer,String>mat=new HashMap<Integer,String>();
    public static Map<Integer,String>map=new HashMap<Integer,String>();
    String path;
    public descoverfile(String m){
        this.path=m;
    }
    @Override
    public void run() {
        try {
            File file = new File(path);
            String s = "";
            String str = "";
            File[] files = file.listFiles();
            Integer i=0;
            for (File sourceFile : files) {
                String fileN = sourceFile.getName();
                s = fileN.substring(fileN.lastIndexOf(".") + 1);
                if (s.equalsIgnoreCase("txt")) {
                    map.put(i, fileN); 
                    i++;
                    mat.put(i, path);
                } 
                fileN = "";
                str = "";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

