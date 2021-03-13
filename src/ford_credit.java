/*
Wilhelm Bagcal
Ford Credit Software Engineering Intern Exercise
 */

import java.util.*;

class Manhattan_Distance{
    //define the points to have an x and y component
    public static class Pair {
        int x;
        int y;

        void setx(int x)
        {
            this.x = x;
        }

        void sety(int y)
        {
            this.y = y;
        }

        void setpair()
        {
            this.x = x;
            this.y = y;
        }
    }

    // calculate the distance
    static void MaxDist(ArrayList<Pair> A, int N)
    {
        // maximum stores the distance, initialize to 0
        int maximum = 0;

        for (int i = 0; i < N; i++) {
            int sum = 0;

            for (int j = i + 1; j < N; j++) {
                // to find the distance, use:
                // |x1 - x2| + |y1 - y2|
                sum = Math.abs(A.get(i).x - A.get(j).x)  + Math.abs(A.get(i).y - A.get(j).y);
                // set the distance
                maximum = sum;
            }
        }
        System.out.println("The Manhattan distance of these two points is: " + maximum);
    }


    public static void main(String[] args)
    {
        // number of points
        int n = 2;

        ArrayList<Pair> al = new ArrayList<>();

        Scanner newNum = new Scanner(System.in);
        System.out.println("Enter a x coordinate for first point: ");
        Integer x1 = newNum.nextInt();
        System.out.println("Enter a y coordinate for first point: ");
        Integer y1 = newNum.nextInt();
        Pair p1 = new Pair();
        p1.setx(x1);
        p1.sety(y1);
        p1.setpair();
        al.add(p1);

        System.out.println("Enter a x coordinate for second point: ");
        Integer x2 = newNum.nextInt();
        System.out.println("Enter a y coordinate for second point: ");
        Integer y2 = newNum.nextInt();
        Pair p2 = new Pair();
        p2.setx(x2);
        p2.sety(y2);
        p2.setpair();
        al.add(p2);

        // Function call
        MaxDist(al, n);
    }
}