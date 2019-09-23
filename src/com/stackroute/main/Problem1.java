package com.stackroute.main;

public class Problem1 {
    class stringmanupulation{
        String inputstring;
        //getter and setter
        public void setString(String str){
            this.inputstring=str;
        }
        public String getString(){
            return inputstring;
        }
        public String getReverse(){
            String rev="";
            int len=inputstring.length();
            for(int i=0;i<len;i++){
                rev=inputstring.charAt(i)+rev;
            }
            return rev;
        }
        public boolean palindromeCheck(){
            int len =inputstring.length();
            for(int i=0,j=len-1;i<=j;i++,j--)
            {
                if(inputstring.charAt(i)!= inputstring.charAt(j)){
                    return false;
                }
            }
            return true;
        }
    }
    public String Result(String str){
        if(str==null || str==""){
            return null;
        }else {
            stringmanupulation targetString = new stringmanupulation();
            String  strAns;
            //Scanner input=new Scanner(System.in);
            // System.out.println("Enter String :");
            //str=input.nextLine();
            targetString.setString(str);
            strAns = "reverse input: " + targetString.getReverse();
            if (targetString.palindromeCheck()) {
                strAns = strAns + ">>It's Palindrome!";
            } else {
                strAns = strAns + ">>It's not Palindrome!";
            }
            return strAns;
        }
    }

}

