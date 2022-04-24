import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// public class Test {
//     /*------------------- Method Overloading------------------ */
//     // public static int sum(int a,int b){
//     //     return a + b; 
//     //  }

//     // public static double sum(Double a, Double b){
//     //     return a + b;
//     // }
    
//         /*------------------- Recursion------------------ */
//     // public static int sum(int num){
//     //     if(num > 0){
//     //         return num + sum(num-1);
//     //     } else {
//     //         return 0;
//     //     }
        
//     // }

//     //         /*------------------- Recursion------------------ */
//     // public static int sum(int start, int end){
//     //     if(end > start){
//     //         return end + sum(start, end-1);
//     //     } else {
//     //         return end;
//     //     }
//     // }

//     interface Animal{
//         public void animalSound();
//         public void sleep();
//     }

//     class Pig implements Animal{
//         public void animalSound(){
//             System.out.println("Gorr Gorr");
//         }
//         public void sleep(){
//             System.out.println("zzzzzz");
//         }
//     }
//     public static void main(String[] args) {
    
//         Test T1 = new Test();
//      /*------------------- Method Overloading------------------ */
//         // System.out.println(T1.sum(1, 2));
//         // System.out.print(T1.sum(1.1, 2.2));

//     /*------------------- Recursion------------------ */
//         // int sum = sum(10,20);
//         // System.out.println(sum);

//         Test.Pig p =T1.new Pig(); 
//         p.animalSound();
//         p.sleep();
        
//     }
// }


/*--------------------------Enum----------------------------- */
// enum Level{
//     LOW,
//     MEDIUM ,
//     HIGH 
// }

// class Test{
//     public static void main(String[] args) {
//         Level var = Level.HIGH;
//         System.out.print(var);
//         switch (var) {
//             case LOW:
//                 System.out.println(var);
//                 break;
//             case HIGH:
//                 System.out.println(var);
//                 break;
//             case MEDIUM:
//                 System.out.println(var);
//                 break;
        
//             default:
//                 break;
//         }

//         for(Level myvar : Level.values()){
//             System.out.println(myvar);
//         }
//     }
// }

// class Test{


//     public static void main(String[] args) {
//         Scanner ip = new Scanner(System.in);

//         System.out.println("Integer");
//         int num = ip.nextInt();
//         System.out.println(num);

//         System.out.println("Float");
//         float num2 = ip.nextFloat();
//         System.out.println(num2);

//         System.out.println("Double");
//         double num3 = ip.nextDouble();
//         System.out.println(num3);

//         System.out.println("Byte");
//         byte num4 = ip.nextByte();
//         System.out.println(num4);

//         System.out.println("Short");
//         short num5 = ip.nextShort();
//         System.out.println(num5);

//         System.out.println("Boolean");
//         boolean b = ip.nextBoolean();
//         System.out.println(b);

//         System.out.println("String");
//         String s = ip.nextLine();
//         System.out.println(s);

//         System.out.println("Long");
//         long l = ip.nextLong();
//         System.out.println(l);

//         System.out.println("Char");
//         char c = ip.next().charAt(0);
//         System.out.println(c);

//     }
// }

// class Test{
//     public static void main(String[] args) {
//         LocalDate date = LocalDate.now();
//         System.out.println(date);
//         LocalTime time = LocalTime.now();
//         System.out.println(time);
//         LocalDateTime dt = LocalDateTime.now();
//         System.out.println(dt);

//         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
//         System.out.println(dtf);



//     }
// }

// class Test{

//     ArrayList<Integer> arr = new ArrayList<>();
//     public void arrayCreate(){
//         arr.add(110);
//         arr.add(20);
//         arr.add(30);
//         arr.add(50);
//         Collections.sort(arr);
//     }

//     public void print(ArrayList<Integer> arr){
//         for (int i = 0; i < arr.size(); i++) {
//             System.out.println(arr.get(i));
//         }
//         System.out.println("Size of the array is " + arr.size());
//     }

//     public static void main(String[] args) {
//         Test al = new Test();
//         al.arrayCreate();
//         al.print(al.arr);
//     }

// }

class Test{
    LinkedList<Integer> ll = new LinkedList<Integer>();

    public void create(){
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);

    }
}