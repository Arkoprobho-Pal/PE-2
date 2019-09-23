package com.stackroute.main;

public class MemberVariable {

        public String MemberData(String name, Integer age, Double salary)
        {
            //- null case
            for (int i = 0; i < name.length(); i++){
                Character c=name.charAt(i);
                if (Character.isDigit(c))
                {
                    return null;
                }
            }

            if(age==0||salary==null|| name.equals("")){
                return null;
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
            instance.setName(name);
            instance.setAge(age);
            instance.setSalary(salary);

            String strAns="Members Name: "+instance.getName()+" Members Age: "+instance.getAge()+" Members Salary: "+instance.getSalary();
            return strAns;

        }


}
