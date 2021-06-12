import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashTrack{
    public static void main (String[] args){
        HashMap<String,String> song = new HashMap<String, String>();
        song.put("min hamsit","min hamst hob laqetny bhib");
        song.put("hal endak shak","ayatoha al wardat w alrayhanto wa alyaqutato wa al margan");
        song.put("fadi shwaya","fadi shwaya nishrab qahwa b heta baeeda");
        song.put("ma bethon","nafs al makan wa min al sifer barjaa baaed galtit zamaaan");

        String val =song.get ("min hamsit");
        System.out.println(val);
        Set<String> keys= song.keySet();

        for (String key:keys){
            System.out.print(key +" :");
            System.out.println(song.get(key));
        }


    }

}