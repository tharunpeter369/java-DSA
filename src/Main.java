import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//        Scanner input  = new Scanner(System.in);
//        System.out.println("Please enter some input:");
//        System.out.println(input.nextInt());
//
//        Scanner name = new Scanner(System.in);
//        System.out.println("Enter the name");
//        String name = input.next();
//        System.out.println("the nam is" + name );
//        System.out.println("enter the marks");
//        float marks = input.nextFloat();
//        System.out.println("the mark is "+ marks);

        Scanner input = new Scanner(System.in);
        //sum of two number
        System.out.println("Enter the number1");
        int num1 = input.nextInt();
        System.out.println("Enter the number2");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("the sum is :"+sum);



//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
    }
}