package by.itland.itjava.materials.lesson04;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import static org.junit.Assert.*;

@SuppressWarnings("all")

//поставьте курсор на следующую строку и нажмите Ctrl+Shift+F10
public class TestItJava04 {

    @Test
    public void testDay() throws Exception {
        System.out.println("\n\nПроверка Day");
        checkMethod("Day", "static printDay", int.class);
        checkMethod("Day", "static getNameDay", int.class);
        run("1").include("понедельник");
        run("2").include("вторник");
        run("3").include("среда");
    }

    @Test
    public void testFindMinMaxValue() throws Exception {
        System.out.println("\n\nПоиск min max");
        checkMethod("FindMinMaxValue", "static findMin", int.class, int.class);
        checkMethod("FindMinMaxValue", "static findMax", int.class, int.class);
        run("1\n2\n3\n4").include("min: 1\nmax: 4");
        run("-1\n-2\n-3\n-4").include("min: -4\nmax: -1");
        run("7\n7\n7\n7").include("min: 7\nmax: 7");
        run("75\n57\n57\n75").include("min: 57\nmax: 75");
    }

    @Test
    public void testNumberDayLeapYear() throws Exception {
        System.out.println("\n\nNumberDayLeapYear");
        checkMethod("NumberDayLeapYear", "static getNUmberDay", int.class, String.class);
        run("март\n24").include("84");
        run("ДеКаБрЬ\n31").include("366");
        run("Сентябрь\n12").include("256");
        run("ФевраЛЬ\n29").include("60");
    }

    @Test
    public void testNumberDayNoLeapYear() throws Exception {
        System.out.println("\n\nNumberDayLeapYear");
        checkMethod("NumberDayLeapYear", "static getNUmberDay", int.class, String.class);
        run("март\n24").include("83");
        run("ДеКаБрЬ\n31").include("365");
        run("Сентябрь\n12").include("255");
        run("ФевраЛЬ\n28").include("59");
    }

    @Test
    public void testLeapYearWithMethod() throws Exception {
        System.out.println("\n\nОпределение года");
        checkMethod("LeapYearWithMethod", "static leapYear", int.class);
        run("2000").include("Високосный");
        run("1100").include("Невисокосный");
        run("1600").include("Високосный");
        run("2020").include("Високосный");
        run("2100").include("Невисокосный");
        run("-2015").include("Год не может быть отрицательным");
    }


    @Test
    public void testNumberDayYear() throws Exception {
        System.out.println("\n\nОпределение дня года");
        checkMethod("NumberDayYear", "static checkMonth", String.class);
        run("3\nМарт\n2000").include("63");
        run("3\nМаРт\n1999").include("62");
        run("3\nмарт\n-1999").include("62");
        run("-3\nМАРТ\n-1999").include("62");
        run("3\nмартик\n1500").include("Ошибка");
    }

    @Test
    public void testMultiplicationNumbers() throws Exception {
        System.out.println("\n\nпроверка умножения");
        checkMethod("MultiplicationNumbers", "static convertNumberToString", int.class);
        run("4\n3").include("четыре умножить на три равно двенадцать");
        run("7\n3").include("семь умножить на три равно двадцать один");
        run("15\n3").include("пятнадцать умножить на два равно тридцать");
        run("15\n3").include("минус пятнадцать умножить на два равно минус тридцать");
        run("2\n2").include("два умножить на два равно четыре");
        run("-2\n2").include("минус два умножить на два равно минус четыре");
        run("-2\n-2").include("минус два умножить на минус два равно четыре");
        run("9\n9").include("девять умножить на девять равно восемьдесят один");
    }

    /*
===========================================================================================================
НИЖЕ ВСПОМОГАТЕЛЬНЫЙ КОД ТЕСТОВ. НЕ МЕНЯЙТЕ В ЭТОМ ФАЙЛЕ НИЧЕГО.
Но изучить как он работает - можно, это всегда будет полезно.
===========================================================================================================
 */
    //-------------------------------  методы ----------------------------------------------------------
    private Class findClass(String SimpleName) {
        String full = this.getClass().getName();
        String dogPath = full.replace(this.getClass().getSimpleName(), SimpleName);
        try {
            return Class.forName(dogPath);
        } catch (ClassNotFoundException e) {
            fail("\nERROR:Тест не пройден. Класс " + SimpleName + " не найден.");
        }
        return null;
    }

    private Method checkMethod(String className, String methodName, Class<?>... parameters) throws Exception {
        Class aClass = this.findClass(className);
        try {
            methodName = methodName.trim();
            Method m;
            if (methodName.startsWith("static")) {
                methodName = methodName.replace("static", "").trim();
                m = aClass.getDeclaredMethod(methodName, parameters);
                if ((m.getModifiers() & Modifier.STATIC) != Modifier.STATIC) {
                    fail("\nERROR:Метод " + m.getName() + " должен быть статическим");
                }
            } else
                m = aClass.getDeclaredMethod(methodName, parameters);
            m.setAccessible(true);
            return m;

        } catch (NoSuchMethodException e) {
            System.err.println("\nERROR:Не найден метод " + methodName + " либо у него неверная сигнатура");
            System.err.println("ERROR:Ожидаемый класс: " + className);
            System.err.println("ERROR:Ожидаемый метод: " + methodName);
            return null;
        }
    }

    private Method findMethod(Class<?> cl, String name, Class... param) {
        try {
            return cl.getDeclaredMethod(name, param);
        } catch (NoSuchMethodException e) {
            fail("\nERROR:Тест не пройден. Метод " + cl.getName() + "." + name + " не найден\n");
        }
        return null;
    }

    private Object invoke(Method method, Object o, Object... value) {
        try {
            method.setAccessible(true);
            return method.invoke(o, value);
        } catch (Exception e) {
            System.out.println(e.toString());
            fail("\nERROR:Не удалось вызвать метод " + method.getName() + "\n");
        }
        return null;
    }


    //метод находит и создает класс для тестирования
    //по имени вызывающего его метода, testTaskA1 будет работать с TaskA1
    private static TestItJava04 run(String in) {
        return run(in, true);
    }

    private static TestItJava04 run(String in, boolean runMain) {
        Throwable t = new Throwable();
        StackTraceElement trace[] = t.getStackTrace();
        StackTraceElement element;
        int i = 0;
        do {
            element = trace[i++];
        }
        while (!element.getMethodName().contains("test"));

        String[] path = element.getClassName().split("\\.");
        String nameTestMethod = element.getMethodName();
        String clName = nameTestMethod.replace("test", "");
        clName = clName.replaceFirst(".+__", "");
        clName = element.getClassName().replace(path[path.length - 1], clName);
        System.out.println("\n---------------------------------------------");
        System.out.println("Старт теста для " + clName);
        if (!in.isEmpty()) System.out.println("input:" + in);
        System.out.println("---------------------------------------------");
        return new TestItJava04(clName, in, runMain);
    }

    //-------------------------------  тест ----------------------------------------------------------
    public TestItJava04() {
        //Конструктор тестов
    }

    //переменные теста
    private String className;
    private Class<?> aClass;
    private PrintStream oldOut = System.out; //исходный поток вывода
    private PrintStream newOut; //поле для перехвата потока вывода
    private StringWriter strOut = new StringWriter(); //накопитель строки вывода

    //Основной конструктор тестов
    private TestItJava04(String className, String in, boolean runMain) {
        //this.className = className;
        aClass = null;
        try {
            aClass = Class.forName(className);
            this.className = className;

        } catch (ClassNotFoundException e) {
            fail("ERROR:Не найден класс " + className + "\n");
        }
        InputStream reader = new ByteArrayInputStream(in.getBytes());
        System.setIn(reader);   //перехват стандартного ввода
        System.setOut(newOut);  //перехват стандартного вывода

        if (runMain) //если нужно запускать, то запустим, иначе оставим только вывод
            try {
                Class[] argTypes = new Class[]{String[].class};
                Method main = aClass.getDeclaredMethod("main", argTypes);
                main.invoke(null, (Object) new String[]{});
                System.setOut(oldOut); //возврат вывода, нужен, только если был запуск
            } catch (Exception x) {
                x.printStackTrace();
            }
    }

    //проверка вывода
    private TestItJava04 is(String str) {
        assertTrue("ERROR:Ожидается такой вывод:\n<---начало---->\n" + str + "<---конец--->",
                strOut.toString().equals(str));
        return this;
    }

    private TestItJava04 include(String str) {
        assertTrue("ERROR:Строка не найдена: " + str + "\n", strOut.toString().contains(str));
        return this;
    }

    private TestItJava04 exclude(String str) {
        assertTrue("ERROR:Лишние данные в выводе: " + str + "\n", !strOut.toString().contains(str));
        return this;
    }


    //логический блок перехвата вывода
    {
        newOut = new PrintStream(new OutputStream() {
            private byte bytes[] = new byte[1];
            private int pos = 0;

            @Override
            public void write(int b) throws IOException {
                if (pos == 0 && b == '\r') //пропуск \r (чтобы win mac и linux одинаково работали
                    return;
                if (pos == 0) { //определим кодировку https://ru.wikipedia.org/wiki/UTF-8
                    if ((b & 0b11110000) == 0b11110000) bytes = new byte[4];
                    else if ((b & 0b11100000) == 0b11100000) bytes = new byte[3];
                    else if ((b & 0b11000000) == 0b11000000) bytes = new byte[2];
                    else bytes = new byte[1];
                }
                bytes[pos++] = (byte) b;
                if (pos == bytes.length) { //символ готов
                    String s = new String(bytes); //соберем весь символ
                    strOut.append(s); //запомним вывод для теста
                    oldOut.append(s); //копию в обычный вывод
                    pos = 0; //готовим новый символ
                }

            }
        });
    }
}
