/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Diak
 */
public class Tasks {
    private Map<String,Integer> marks=new LinkedHashMap<>();
    public void readFromFile(String filename){
        try{
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while((line=br.readLine()) != null){
            String[] s = line.split(" ");
            marks.put(s[0]+s[1], Integer.parseInt(s[2]));
        }
        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
