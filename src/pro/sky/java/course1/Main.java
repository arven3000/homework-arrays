package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
        /*Task 1*/
        int[] arrInt = new int[3];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;

        double[] arrDouble = {1.57, 7.654, 9.986};

        String[] arrString = new String[]{"A", "B", "C"};

        /*Task 2*/
        for (int j : arrInt) {
            System.out.print(j);
            if (j != arrInt[arrInt.length - 1]) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (double j : arrDouble) {
            System.out.print(j);
            if (j != arrDouble[arrDouble.length - 1]) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (String j : arrString) {
            System.out.print(j);
            if (!j.equals(arrString[arrString.length - 1])) {
                System.out.print(", ");
            }
        }
        System.out.println();

        /*Task 3*/
        for (int i = arrInt.length - 1; i >= 0 ; --i) {
            System.out.print(arrInt[i]);
            if(arrInt[i] != arrInt[0]){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arrDouble.length - 1; i >= 0 ; --i) {
            System.out.print(arrDouble[i]);
            if(arrDouble[i] != arrDouble[0]){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arrString.length - 1; i >= 0 ; --i) {
            System.out.print(arrString[i]);
            if(!arrString[i].equals(arrString[0])){
                System.out.print(", ");
            }
        }
        System.out.println();

        /*Task 4*/
        for (int i = 0; i < arrInt.length; ++i) {
           if(arrInt[i] % 2 != 0){
               arrInt[i]++;
           }
            System.out.print(arrInt[i]);
           if(arrInt[i] != arrInt[arrInt.length - 1]){
               System.out.print(", ");
           }
        }
    }
}
