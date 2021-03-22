import java.util.Objects;

public class Fraction {
    private int integer1;
    private int integer2;

    public Fraction() {
        integer1 = 0;
        integer2 = 0;
    }

    public Fraction(int integer1, int integer2) {
        this.integer1 = integer1;
        this.integer2 = integer2;
    }

    public void setInteger1(int integer1) {
        this.integer1 = integer1;
    }

    public void setInteger2(int integer2) {
        this.integer2 = integer2;
    }

    public int getInteger1() {
        return integer1;
    }

    public int getInteger2() {
        return integer2;
    }

    public void Ratio() {
        int num3 = 1;
        for (int i = 2; i <= integer1 && i <= integer2; i++) {
            if (integer1 % i == 0 && integer2 % i == 0) {
                num3 = i;
            }

        }
        System.out.println("The ratio of " + integer1 + " and " + integer2 + " is " + integer1 / num3 + ":" + integer2 / num3);

    }

    private int[] doubleRatio(int[] a) {
        int num3 = 1;
        int[] r = new int[4];
        for (int i = 1; i < 4; i += 2) {
            num3 = 1;
            for (int j = 2; j <= a[i - 1] && j <= a[i]; j++) {
                if (a[i - 1] % j == 0 &&  a[i] % j == 0) {
                    num3 = j;
                }
                r[i - 1] = a[i - 1] / num3;
                r[i] = a[i] / num3;

            }
        }
        return r;
    }
    public boolean equals(Fraction o) {
        int[] x = doubleRatio(new int[]{this.integer1,this.integer2,o.integer1,o.integer2});
        if(x[0]==x[2] && x[1]==x[3]){
            return true;
        }
        else {
            return false;
        }




    }


}



