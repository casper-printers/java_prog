/**
 * Created by Uzed on 11.05.2017.
 */
public class App1105 {
    public static void main(String[] args){

      int a = 0;

      Test myObject; // бъявление переменной (тип + название)
        /*
        System.out.print(myObject);// ошибка - переменная не инициализирована
        */

        myObject = null;        //нулевая ссылка
        //myObject.toString();    // при обращении к её полям - ошибка NullPointerException

        myObject = new Test();  // создание объекта в куче
                                // и возвращается ссылка на него в myObject
        System.out.println(myObject);
        Test2 object2 = new Test2(); // создание объекта типа Test2
        System.out.println(object2.x); //вывод переменной х объекта object2
        object2.x = 42; // запись значения в переменную
        System.out.println(object2.x);//вывод нового значения переменной х объекта object2
        object2.objectTest = new Test(); // запись нового объекта типа Test в поле objectTest объекта object2

        object2.setX(-10); // вызов метода setX класса object2
        System.out.println(object2.x);
        int dx = object2.getDoubledX(); // вызов метода и получение его результата
        System.out.println(dx);

        Test2 obj3 = new Test2();   // создание объекта при помощи конструктора без параметров
        //obj3.setX(10);

        Test2 obj4 = new Test2(20); // создание объекта при помощи конструктора с параметром
        System.out.println(obj4.x);




    }
}

class Test{

}

class Test2{
    int x;
    Test objectTest;   // Поле типа Test

    Test2(){          // Конструктор без параметров
        //x = 10;
        this(10);   // вызов другого конструктора ( всегда должен быть первым )
    }

    Test2(int x){       // Конструктор с параметрами
        this.x = x;
    }

    void setX(int newX){   // метод, принимающий параметры
        this.x = newX;
    }

    int getDoubledX(){     // метод, возвращающий значение
        return this.x * 2 ;
    }

}