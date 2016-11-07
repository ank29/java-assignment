    static boolean isAnagram(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
       int stringA = a.length(); 
       int stringB = b.length(); 
       if ( stringA != stringB ) 
        {return false;}
        else {
        char[] s1array=a.toCharArray();
        char[] s2array=b.toCharArray();
         Arrays.sort(s1array);
         Arrays.sort(s2array);
         if (Arrays.equals(s1array,s2array))
         {return false;}
        else return true;}
    
}