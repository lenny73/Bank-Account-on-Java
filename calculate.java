package com.Leonid;

    interface Calculatable {

        double calculate(int i);

    }


    class Square implements Calculatable{


        public double calculate(int i)

        {

            return i*i;

        }

    }

    class Cube implements Calculatable{


        public double calculate(int i)

        {

            return i*i*i;

        }
}
 class Main {


    public static double sumCalculate(Calculatable [] array, int x)

    {

        double sum = 0;


        for(int i=0; i<array.length; i++)

        {

            sum += array[i].calculate(x);

        }

        return sum;

    }

    public static void main(String[] args) {

        Calculatable c1 = new Square();

        System.out.println("Square  " + c1.calculate(4));

        Calculatable c2 = new Cube();

        System.out.println("Cube " + c2.calculate(2));

        Calculatable [] calcOb = new Calculatable[3];

        calcOb[0] = new Square();

        calcOb[1] = new Cube();

        calcOb[2] = new Cube();
        System.out.println("sumCalculate : " + sumCalculate(calcOb,1));

    }

}
