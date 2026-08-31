class Solution {
    public boolean isAnagram(String s, String t) {
        // HashMap<Character,Integer> h1 = new HashMap<>();
        // HashMap<Character,Integer> h2 = new HashMap<>();

        // for(char x:s.toCharArray()){
        //     if(h1.containsKey(x)){
        //         int count=h1.get(x);
        //         h1.put(x,count+1);
        //     }
        //     else{
        //         h1.put(x,1);
        //     }
        // }

        // for(char x:t.toCharArray()){
        //     if(h2.containsKey(x)){
        //         int count=h2.get(x);
        //         count++;
        //         h2.put(x,count);
        //     }
        //     else{
        //         h2.put(x,1);
        //     }
        // }

        // if(h1.size()!=h2.size()){
        //     return false;
        // }
        // return h1.equals(h2);

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(a.length!=b.length){
            return false;
        }

        for(int i=0; i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}
