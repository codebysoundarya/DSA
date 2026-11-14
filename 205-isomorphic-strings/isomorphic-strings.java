class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length())
        {
            return false;
        }

        HashMap<Character, Character> mpp = new HashMap<>();

        for( int i=0 ; i<s.length() ; i++)
        {
            char original = s.charAt(i);
            char replace = t.charAt(i);
        
       
       if(!mpp.containsKey(original))
       {
          if(!mpp.containsValue(replace))
          {
            mpp.put(original,replace);
          }
          else
          {
            return false;
          }
       }
       else
       {
          char store = mpp.get(original);
          if(store != replace)
          {
            return false;
          }
       }

        }
        
      return true;


        
    }
}