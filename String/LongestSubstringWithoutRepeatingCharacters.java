/* ~~~~~~~~~~~~~~~~
Write a java program to find longest substring length , which doesn't contain repeating character in given string 

Input : abbac
Output: bac --> length is 3

Input: abcabcbb
Output: abc --> length is 3

Input: java
Output: jav --> length is 3

~~~~~~~~~~ */

import java.util.*;
class LongestSubstringWithoutRepeatingCharacters 
{
    public static void main(String[] args) 
    {
        lengthOfLongestSubString("abbac");
        lengthOfLongestSubString("abcabcbb");
        lengthOfLongestSubString("java");
    }
    
    public static void lengthOfLongestSubString(String s)
    {
        String longestSubString = null;
        int longestSubStringLength = 0;
        
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        
        char[] arr = s.toCharArray();
        
        for(int i = 0; i < arr.length; i++)
        {
            char ch = arr[i];
            
            if(!map.containsKey(ch))
            {
                map.put(ch, i); 
            }
            else
            {
                i = map.get(ch);
                map.clear();
            }
            
            if(map.size() > longestSubStringLength)
            {
                longestSubStringLength = map.size();
                longestSubString = map.keySet().toString();
            }
        }
        
        System.out.println("The longest substring : " + longestSubString);
        System.out.println("The longest substring length : " + longestSubStringLength);
    }
}
