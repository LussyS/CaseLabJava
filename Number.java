// Задача 2
public class Number {
    public static int a = 5;
    public static int b = 10;
    
    public static void main(String[] args){

        System.out.print ("Старое значение a: ");
        System.out.println(a);
        System.out.print ("Старое значение b: ");
        System.out.println(b);

        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.print ("Новое значение a: ");
        System.out.println(a);
        System.out.print ("Новое значение b: ");
        System.out.println(b);

    }
    
}
