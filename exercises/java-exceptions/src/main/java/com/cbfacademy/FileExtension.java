package com.cbfacademy;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class FileExtension {
    public boolean check(String filename) throws FilenameException{
        if (filename==null||filename.isEmpty()) {
            throw new FilenameException("Don't leave this empty!");
        } else if (filename.endsWith(".java")) {
            return true;
        } else {
            return false;
        }
        //endswith



    }

    public Map<String, Integer> map(List<String> filenames) {
        Map<String, Integer> result = new HashMap<>();
        for (String filename: filenames){
            try {
                result.put(filename, check(filename) ? 1 : 0);
            } catch(FilenameException e) {
                result.put(filename,-1);
            }
        }
        return result;
        //check each provided file's extension and map the returned value as 1 if true or 0 if false
        //map -1 when an exception occurs
    }
}
