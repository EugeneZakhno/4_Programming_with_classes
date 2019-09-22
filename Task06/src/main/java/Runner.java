import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*      Eng:
        6. Write a class description to represent time. Provide options for setting the time and
        changing its individual fields (hour, minute, second) with checking the validity of the entered values. When
        invalid field values the field is set to 0. Create methods to change the time to
        set number of hours, minutes and seconds.

        Rus:
        6. Составьте  описание  класса  для  представления  времени.  Предусмотрте  возможности установки  времени  и
        изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
        недопустимых  значений полей  поле  устанавливается  в  значение  0.  Создать  методы  изменения  времени на
        заданное количество часов, минут и секунд.
 */

public class Runner {
    private static TimeDescription timeDescriptionZero = new TimeDescription(10, 72, 5);

    public static void main(String[] args) {

        System.out.println(timeDescriptionZero.getHours() + ":" + timeDescriptionZero.getMinutes() + ":" + timeDescriptionZero.getSeconds());

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter incrementing \"+\" or decrementing\"-\" for hours ");
            String operatorHour = reader.readLine();
            System.out.println("Enter deference for hours ");
            int hours = Integer.parseInt(reader.readLine());

            System.out.println("Enter incrementing \"+\" or decrementing\"-\" for minutes ");
            String operatorMinute = reader.readLine();
            System.out.println("Enter deference for minutes ");
            int minutes = Integer.parseInt(reader.readLine());

            System.out.println("Enter incrementing \"+\" or decrementing\"-\" for seconds ");
            String operatorSecond = reader.readLine();
            System.out.println("Enter deference for seconds ");
            int seconds = Integer.parseInt(reader.readLine());

            System.out.println(changeHour(timeDescriptionZero.getHours(), operatorHour, hours) + ":" +
                    changeMinute(timeDescriptionZero.getMinutes(), operatorMinute, minutes) + ":" +
                    changeSecond(timeDescriptionZero.getSeconds(), operatorSecond, seconds)
            );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int changeHour(int hour, String operator, int hours) {
        int change = 0;
        if (operator.equals("+"))
            change = hour + hours;
        else if (operator.equals("-"))
            change = hour - hours;
        return change;
    }

    private static int changeMinute(int minute, String operator, int minutes) {
        int change = 0;
        if (operator.equals("+"))
            change = minute + minutes;
        else if (operator.equals("-"))
            change = minute - minutes;
        return change;
    }

    private static int changeSecond(int second, String operator, int seconds) {
        int change = 0;
        if (operator.equals("+"))
            change = second + seconds;
        else if (operator.equals("-"))
            change = second - seconds;
        return change;
    }
}
