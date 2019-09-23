package com.stackroute.main;

public class Problem2 {
    class powernumber{
        int checknumber;
        int powerof;
        // getter and setter
        public void setCheck(int num){
            this.checknumber=num;
        }
        public void setPower(int n){
            this.powerof=n;
        }
        private boolean divCheck(int num){
            if(num%powerof==0){
                return true;
            }
            else{
                return false;
            }
        }
        public boolean powerCheck(){
            int num=checknumber;
            while(divCheck(num)){
                num=num/powerof;
                if(num==powerof){
                    return true;
                }

            }
            return false;
        }
    }

        public  String Result(Integer checknum,Integer powernum) {
            //null condition
            if(checknum==null||powernum==null || powernum==0||checknum==0)
            {
                return null;
            }
        //---------
            powernumber instance=new powernumber();

            String strAns;
            //Scanner input= new Scanner(System.in);
            //System.out.println("type the Check number:");
            //int checknum,powernum;
            //checknum=input.nextInt();
            //System.out.println("Type the Power value: ");
            //powernum=input.nextInt();
            instance.setCheck(checknum);
            instance.setPower(powernum);
            if(instance.powerCheck()){
                strAns=("the number "+checknum+" is a power of "+powernum);
            }else{
                strAns=("the number "+checknum+" is NOT a power of "+powernum);

            }
            return strAns;
        }


}
