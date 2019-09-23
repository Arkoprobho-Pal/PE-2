package com.stackroute.main;

public class Problem7 {
    public boolean ValidAge(int age){
        if(age>=18 && age<=60)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args)
    {
        Problem7 problem7=new Problem7();

        String firstname;
        String lastname;
        int age;
        Double salary;
        firstname="Aryan";
        lastname="Chakraborty";
        age=32;
        salary=32344.23;
        //- null case
        for (int i = 0; i < firstname.length(); i++){
            Character c=firstname.charAt(i);
            if (Character.isDigit(c))
            {
               // return null;

                System.out.println("invalid input");
                System.exit(0);
            }
        }
        for (int i = 0; i < lastname.length(); i++){
            Character c=lastname.charAt(i);
            if (Character.isDigit(c))
            {
             //   return null;

                System.out.println("invalid input");
                System.exit(0);
            }
        }
        //------------------
        if(age<0 || age>100){
           // return null;
            System.out.println("invalid input");
            System.exit(0);
        }
        if(!problem7.ValidAge(age)){
            //return null;

            System.out.println("invalid input");
            System.exit(0);
        }

        if(salary==null|| firstname.equals("")){
            //return null;

            System.out.println("invalid input");
            System.exit(0);
        }


        //    Scanner input=new Scanner(System.in);
        //  String name;
        // int age;
        // double salary;
        // System.out.println("put the Member name: ");
        //name=input.nextLine();

        //System.out.println("put the Member Age: ");
        //age=input.nextInt();

        //System.out.println("put the Member Salary: ");
        //   salary=input.nextDouble();

        Member instance=new Member();
        instance.setFirstName(firstname);
        instance.setLastName(lastname);
        instance.setAge(age);
        instance.setSalary(salary);

        String strAns="Members Name: "+instance.getFullName()+" Members Age: "+instance.getAge()+" Members Salary: "+instance.getSalary();
        //return strAns;

        System.out.println(strAns);

    }

}
