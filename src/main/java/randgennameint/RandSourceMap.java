package randgennameint;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandSourceMap {
    int n;
    Map<String,Integer> map= new HashMap<>();
   public RandSourceMap(int n){
        this.n = n;
    }

   public Map<String,Integer> keyValPair(){
        for(int i=0;i<n;i++){
            map.put(generateName(),generateInt());
        }
        return map;
    }

    private Integer generateInt() {
        return new Random().nextInt();
    }

    private String generateName() {
        String s="";
        return s+((char) (65+new Random().nextInt(25)))+((char) (65+new Random().nextInt(25)))+((char) (65+new Random().nextInt(25)))+((char) (65+new Random().nextInt(25)));
    };

}
