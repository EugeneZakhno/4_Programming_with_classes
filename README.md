# Programming with classes

Описание файлов:

 - Practice (tasks).pdf - файл содержит список задач, которые нужно решить для завершения этапа.
 - Questions.pdf - файл содержит вопросы, на которые нужно уметь отвечать по завершению этапа.
 - Recommendations.pdf - файл содержит рекомендуемые материалы (видео и книги), к которым следует обратиться при возникновении трудностей при решении задач или ответах на вопросы.


``java
/*  Eng:
    01. Create the class Test1 with two variables. Add a display method and methods for changing these
    variables. Add a method that finds the sum of the values of these variables and a method that finds
    the largest value of these two variables.
    Rus:
    01. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
    переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
    наибольшее значение из этих двух переменных.
 */

public class Test1 {

    private static int a = 1;
    private static int b = 2;

    public static void main(String[] args) {
        show(a, b);
        System.out.print("Change numbers: ");
                changeNumber(a, b);

        System.out.println("sum of numbers " + sumNumber(a,b));
        System.out.println("bigest number " + whatIsMore(a,b));
    }

    private static void show(int a, int b) {
        System.out.println(a +" "+ b);
    }

    private static void changeNumber(int a, int b) {
        a = 5;
        b = 7;
        System.out.println(a + " " + b);
    }

    private static int sumNumber(int a, int b) {
        return a+b;
    }

    private static int whatIsMore(int a, int b) {
        return Math.max(a, b);
    }
}
```
______________________________________________________________________________________________________________________________
