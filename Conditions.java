import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter operation (1:+ 2:- 3:* 4:/ 5:%): ");
        int operation = sc.nextInt();

        if (operation == 1) {
            System.out.println(a + b);
        } else if (operation == 2) {
            System.out.println(a - b);
        } else if (operation == 3) {
            System.out.println(a * b);
        } else if (operation == 4) {
            System.out.println(a / b);
        } else if (operation == 5) {
            System.out.println(a % b);
        } else {
            System.out.println("Invalid");
        }
    }
}

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Enter operation (1:+ 2:- 3:* 4:/ 5:%):");
        int operation = sc.nextInt();

        switch(operation) {
            case 1: System.out.println(a + b); break;
            case 2: System.out.println(a - b); break;
            case 3: System.out.println(a * b); break;
            case 4: System.out.println(a / b); break;
            case 5: System.out.println(a % b); break;
        }
    }
}



/Library/Java/JavaVirtualMachines/jdk-24.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=60556 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/purushothamrj/Desktop/devcode/java-2026/java-fundamentals/out/production/java-fundamentals Conditions
Enter first number: 
5
Enter second number: 
5
Enter operation (1:+ 2:- 3:* 4:/ 5:%):
4
1

Process finished with exit code 0
