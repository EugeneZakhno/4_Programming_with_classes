/*
    02. Create a class Test2 with two variables. Add a constructor with input parameters. Add
         constructor initializing the members of the class by default. Add set- and get- methods for instance fields
         class.
    02. Создйте  класс  Test2 c  двумя  переменными.  Добавьте  конструктор  с  входными  параметрами.  Добавьте
        конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
        класса.
 */
public class Test2 {

    private int able;
    private int enable;

    public Test2(int able, int enable) {
        this.able = able;
        this.enable = enable;
    }

    public Test2() {
    }

    public int getAble() {
        return  able;
    }

    public void setAble(int able) {
        this.able = able;
    }

    public int getEnable() {
        return enable;
    }

    public void setEnable(int enable) {
        this.enable = enable;
    }
}