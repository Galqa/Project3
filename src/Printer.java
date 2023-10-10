/** Cтворіть проект. Потрібно:
 Створити клас Printer. У тілі класу створіть метод void print(String value), який виводить на екран значення аргументу.
 Реалізуйте можливість того, щоб у разі успадкування від даного класу інших класів,
 та виклику відповідного методу їх екземпляра, рядки, передані як аргументи методів, виводилися різними кольорами.
 Обязательно используйте приведення типів.
*/

public class Printer {
      public void print(String value) {
          System.out.println(value);
      }
}
 class RedPrinter extends Printer {
     @Override
     public void print(String value) {
         super.print(value);
         System.out.println((char)27 + "[31m" + value + (char)27 + "[0m");
     }
 }
 class GreenPrinter extends Printer {
    @Override
    public void print(String value) {
        System.out.println((char) 27 + "[32m" + value + (char) 27 + "[0m");
    }
}

class NewPrinter {
      public static void main(String[] args) {
          Printer printer = new Printer();
          printer.print("Sun");

          printer = new RedPrinter();
          printer.print("Sun");

          printer = new GreenPrinter();
          printer.print("Sun");
      }
 }
