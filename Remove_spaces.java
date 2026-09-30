import java.util.*;

class Remove_spaces{
    public static String removeSpaces(String s){
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' ')
                continue;
            else
                ans=ans+ch;
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        System.out.println(removeSpaces(s));
    }
}