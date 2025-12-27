import java.util.Scanner;

class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        float a , b;
        System.out.println("введите числа:");
        a= sc.nextFloat();
        b=sc.nextFloat();
        System.out.println("выберите действие: \n1-сложение \n 2-вычитание \n 3-умножение \n 4-деление");
      String choice = sc.next();
      if(choice.equals("1")) {
          System.out.println("Ответ:"+ (a + b));
      }
      else if(choice.equals("2")) {
          System.out.println("Oтвет:" + (a - b));
      }
      else if(choice.equals("3")) {
          System.out.println("Ответ:" + (a * b));
      }
      else if(choice.equals("4")) {
          System.out.println("Ответ:" + (a/b));
      }

	}
}