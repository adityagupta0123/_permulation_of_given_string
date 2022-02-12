class Solution {
    public String find_permutation(String S) {
        return perm(S,0, S.length()-1);
    }
    private String perm(String s, int l, int r){
        if(l == r)
        return s;
        else{
            for(int i=0; i<s.length()-1; i++){
                s = swap(s,l,r);
                perm(s, l+1, r);
                s = swap(s,l,r);
            }
        }
    }
    private String swap(String s, int i, int j){
        char temp;
        char [] arr = s.toCharArray();
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
        return String.valueOf(arr);
    }
}
