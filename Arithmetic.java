public class Arithmetic {

    public static void main(String args[]){
        try{
            int a = 65 / 0;
            System.out.println(a);
        }
        catch (ArithmeticException x){
            System.out.println("Number cant be divided by zero");
        }
        finally {
            System.out.println("Thank you");
        }
    }
}
