public class Practice1 {
  final static int START_COUNTER;
  static {
    START_COUNTER = Integer.parseInt("Y-"); // ошибка, программа упадет здесь
  }
  public static void main(String[] args) {
    System.out.println("Hello"); // этот код не выполнится
  }
}
/* 
Программа упадет при попытке преобразовать "Y-" в число
Метод main не выполнится вообще
Выведется ошибка NumberFormatException*/