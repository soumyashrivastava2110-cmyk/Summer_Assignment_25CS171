 class Functionmax 
 {
    static int maximum(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String args[]) {
        int max = maximum(25, 40);
        System.out.println("Maximum = " + max);
    }
}
