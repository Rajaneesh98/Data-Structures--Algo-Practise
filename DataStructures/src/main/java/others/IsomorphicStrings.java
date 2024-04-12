package others;

import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings {

    public boolean isIsomorphicAnotherApproach(String s, String t){
        HashMap<Character,Character> hashMapS = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            Character current = s.charAt(i);
            Character currentIso = t.charAt(i);
            if(hashMapS.containsKey(current)){
                if(hashMapS.get(current)!= currentIso){
                    return false;
                }
            } else if (hashMapS.containsValue(currentIso)) {
                return false;
            }else{
                hashMapS.put(current,currentIso);
            }
        }
        return true;
    }

    public boolean isIsomorphicBetter(String s, String t){
        HashMap<Character,Character> hashMapS = new HashMap<>();
        HashMap<Character,Character> hashMapT = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }

        for(int i=0 ; i<s.length(); i++){
            Character currentChar = s.charAt(i);
            Character currentIso = t.charAt(i);
            if(hashMapS.containsKey(currentChar)){
                if(hashMapS.get(currentChar)!=currentIso){
                    return false;
                }
            }else{
                if(hashMapT.containsKey(currentIso)){
                    return false;
                }
                hashMapS.put(currentChar,currentIso);
                hashMapT.put(currentIso,currentChar);
            }
        }
        return true;
    }

    public boolean isIsomorphicBest(String s, String t) {
        HashMap<Character,Character> hashMap = new HashMap<>();
        HashSet<Character> strSet = new HashSet<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0 ; i<s.length(); i++){
            Character currentChar = s.charAt(i);
            Character currentIso = t.charAt(i);
            if(hashMap.containsKey(currentChar)){
                if(hashMap.get(currentChar)!=currentIso){
                    return false;
                }
            } else if (strSet.contains(currentIso)) {
                return false;
            }else{
                hashMap.put(currentChar,currentIso);
                strSet.add(currentIso);
            }
            hashMap.put(currentChar,currentIso);
        }
        return true;
    }

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hashMap = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }

        for(int i=0 ; i<s.length(); i++){
            Character currentChar = s.charAt(i);
            Character currentIso = t.charAt(i);
            if(hashMap.containsKey(currentChar)){
                if(hashMap.get(currentChar)!=currentIso){
                    return false;
                }
            }else{
                for( Character c : hashMap.keySet()){
                    if(hashMap.get(c)==currentIso){
                        return false;
                    }
                }
                hashMap.put(currentChar,currentIso);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings isomorphicStrings =new IsomorphicStrings();
        System.out.println(isomorphicStrings.isIsomorphicBest("abcbc","sdfdf") );
    }
}
