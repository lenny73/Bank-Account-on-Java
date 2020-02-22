package com.Leonid;

class Person {
    private String name;
    private int age;
    private boolean student;
    private double loan;

    Person(String name, int age, boolean student, double loan) {
        this.name = name;
        this.age = age;
        this.student = student;
        this.loan = loan;

    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getStudent() {
        return student;
    }

    public double getLoan() {
        return loan;
    }

    public void setName() {
        this.name = name;
    }

    public void setLoan(double amt) {
        if (amt <= 1000)
            System.out.println("Finacial aid");
        else {
            System.out.println("Loan");
        }
    }

    public void setAge(int a) {
        if (a >= 0 && a <= 18) {
            System.out.println("School");
        } else System.out.println("College");}

        public String toString () {
            return "name" +name+"age"+age+"status"+getStudent()+"cost"+getLoan();
        }


    }


    class College extends Person {
        double income;


        College(String name, int age, boolean student, double loan, double income) {
            super(name, age, student, loan);
            initial();

        }

        private void initial() {
            String race = "white";
            int age = 16;
        }


        @Override
        public java.lang.String toString() {
            return super.toString()+income+"j";
        }

        public static void main(String[] args) {
        Person korn= new Person("na",7,true,10000);

                korn.setAge(6);
                System.out.println(korn);
                Person kom=new College("m",20,true,22222,35555);
                kom.setAge(66);
                kom.getName();
                System.out.println(kom);
                ((College) kom).initial();

                Person[] Num=new Person[2];
                Num[0]=new Person("n",12,true,8000);
                Num[1]=korn;
                Num[2]=kom;
                int count=0;
                for(int i=0;i<Num.length;i++);
                if(Num[0] instanceof College);{
                   count++;

                }
                if(kom.equals(korn))
                    System.out.println("Objects' contents are equivalent!");
                else
                    System.out.println("Objects' contents are NOT equivalent!");



            }}




