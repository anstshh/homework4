 public class Main {
     public static void main(String[] args) {
         // Задание 1
         int i = 1;
         while (i <= 10) {
             System.out.print(i++);
         }
         {
             System.out.println();
         }
         int a = 10;
         for (a = 10; a >= 1; a--) {
             System.out.print(a);
         }

         // Задание 2

         {
             System.out.println();
         }

         int dateFriday = 5;
         for (dateFriday = 5; dateFriday <= 31; dateFriday += 7) {
             System.out.println("Сегодня " + dateFriday + " -е число месяца. Необходимо подготовить отчет");

         }

         // Задание 3

         {
             System.out.println();
         }

         int yearGap = 79;
         int startDate = 1822;
         int finalDate = 2122;

         for (startDate = 1822; startDate <= 2122; startDate++) {
             if (startDate % 79 == 0) {
                 System.out.println(startDate);
             }

         }
     }
 }