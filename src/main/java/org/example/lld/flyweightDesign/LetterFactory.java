package org.example.lld.flyweightDesign;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    private static Map<Character,ILetter> characterCache=new HashMap<>();
    public static ILetter createLetter(char characterVal){
        if(characterCache.containsKey(characterVal)){
            return characterCache.get(characterVal);
        }else{
            ILetter characterObj=new DocumentCharacter(characterVal,"Arial", 10);
            characterCache.put(characterVal,characterObj);
            return characterObj;
        }
    }
}
