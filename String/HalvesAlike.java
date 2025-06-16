import java.util.Set;

import javax.sound.midi.Soundbank;

class HalvesAlike {
    public boolean halvesAlikeString(String s){
        int count = 0;
        Set<Character> set = Set.of('a','e','i','o','u');
        s = s.toLowerCase();
        int len = s.length();
        for(int i=0; i<len/2; i++) if(set.contains(s.charAt(i))) count += 1;
        for(int i=len/2; i<len; i++) if(set.contains(s.charAt(i))) count-=1;
        return count == 0? true : false ;
    }

}
