import java.util.Scanner;


/**
 * Created by Uzed on 11.05.2017.
 */
public class App2_1105 {
    public static void main(String[] args){

        String source;  // исходная строка

        Scanner scanner = new Scanner(System.in); // сканер для чтения

        source = scanner.nextLine(); // читаем строку

        Stack charStack = new Stack(source.length());

        for (int i = 0; i < source.length(); i++){

            char c = source.charAt(i);

            switch (c){
                case '(':
                case '{':
                case '[':
                    charStack.push(c);
                    break;
                case ']':
                    if (charStack.size() == 0){
                        System.err.println("Скобки не сбалансированы");
                        return;
                    } else {
                        char s = charStack.pop();
                        if (s != '[') {
                            System.err.println("кобки не сбалансирован");
                            return;
                        }

                    }
                    break;
                case '}':
                    if (charStack.size() == 0){
                        System.err.println("Скобки не сбалансированы");
                        return;
                    } else {
                        char s = charStack.pop();
                        if (s != '{') {
                            System.err.println("кобки не сбалансирован");
                            return;
                        }

                    }
                    break;
                case ')':
                    if (charStack.size() == 0){
                        System.err.println("Скобки не сбалансированы");
                        return;
                    } else {
                        char s = charStack.pop();
                        if (s != '(') {
                            System.err.println("Скобки не сбалансированы");
                            return;
                        }

                    }
                    break;
                default:
                    return;
            }
        }

        if (charStack.size() !=0) {
            System.err.println("Скобки не сбалансированы");
        } else {
            System.err.println("Выражение правельно");
        }

    }
}

/*
    Класс представляющий собой стек символов
    (последним вошёл - первым вышел)
 */

class Stack{

    char[] symbols; // массив ячеек - символов
    int pointer; // указатель на свободную ячейку

    public Stack(int size) {
        symbols = new char[size];
        pointer = 0;
    }

    public void push(char c) {
        if (pointer == symbols.length) {   // если свободных ячеек не осталось
            System.err.println("Стек переполнен");
        }else {
            symbols[pointer] = c; // вставка в свободную ячейку
            pointer++; // сдвиг указателя на следующею свабодную ячейку
        }
    }

    public char pop() {
        if (pointer == 0) {  // если свободная ячейка самая первая
            System.err.println("Стек пуст");
            return 0;
        }else{
            pointer--; // сдвигаем казатель
            char c = symbols[pointer]; // возвращаем символ лежащий на вершине стека
            symbols[pointer] = 0;
            return c;
        }
    }

    public int size(){   // кол-во символов в стеке
        return pointer;
    }


}