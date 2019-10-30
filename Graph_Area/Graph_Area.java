import java.util.Scanner;


abstract class Graph{
    abstract double getA();
}

class Triangle extends Graph{
    private double x,y,z;

    public Triangle(int l1,int l2,int l3){
        this.x = (double)l1;
        this.y = (double)l2;
        this.z = (double)l3;
    }

    public double getA(){
        double p = (x+y+z)/2;
        return Math.sqrt(p*(p-x)*(p-y)*(p-z));
    }

}

class Rectangle extends Graph{
    private double x,y;

    public Rectangle(int l1,int l2){
        this.x = (double)l1;
        this.y = (double)l2;
    }

    public double getA(){
        return x*y;
    }
}

public class Graph_Area{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        console.nextLine();
        String[][] input = new String[n][];
        double[] output = new double[n];

        for (int i =0; i<n; i++) {
            String temp = console.nextLine();
            input[i] =temp.split(" ");
        }
        console.close();

        for (int i =0; i<n; i++) {
            int len = input[i].length;
            int[] intArr = new int[len];
            for(int j = 0; j <len; j++) {
                intArr[j] = Integer.parseInt( input[i][j]);
            }
            //System.out.println(Arrays.toString(intArr));
            if (len == 2) {
                Rectangle r = new Rectangle(intArr[0], intArr[1]);
                output[i]= r.getA();
            }
            if (len == 3) {
                Triangle t = new Triangle(intArr[0], intArr[1], intArr[2]);
                output[i]= t.getA();
            }
        }
        for (double i : output) {
            System.out.println(i);
        }
    }
}