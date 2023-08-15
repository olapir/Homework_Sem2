public class Task2 {
/*
Если необходимо, исправьте данный код (задание 2
 */
    public static void main(String[] args) {
        int[] intArray = null;
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.err.println("Catching exception: " + e);
        } catch (NullPointerException e){
            System.err.println("NullPointerException" + e);
        } catch (IndexOutOfBoundsException e){
            System.err.println("IndexOfBoundException" + e);
        }

    }
}