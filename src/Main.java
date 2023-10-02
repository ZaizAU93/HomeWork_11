public class Main {
    public static void main(String[] args) throws MyExeption {
        String[] animals = {"Кот", "Собака", "Лошадь"};

        try {
            for (int i = 0; i <= animals.length; i++) {
                System.out.println(animals[i]);
            }
            int b = 0;
            int a = 0;
            int c = b / a;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Произошло исключение");
        } catch (ArithmeticException e) {
            System.out.println("Произошло исключение №2");
        }

        try {
            int b = 10;
            int a = 0;
            int c = b / a;
        } catch (ArithmeticException e) {
            System.out.println("Произошло исключение №2");
        }

        try {
            for (int i = 0; i <= animals.length; i++) {
                System.out.println(animals[i]);
            }
            int b = 0;
            int a = 0;
            int c = b / a;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Произошло исключение 3");
          //  System.out.println(e.getMessage());
        }


        Person per = new Person("Boris");
        per.setAge(17);

        try {
            System.out.print(per.getAge());
        }catch (MyExeption e) {
            System.out.println("Нужен подходящий возраст");
        }


        //Задача 3:
        //Создать класс с как минимум 4 разными методами, в каждом методе добавить проверку
        //на исключительные ситуации, используя:
        //1. try- catch
        //2. try-catch, где catch будет несколько
        //3. try -catch, с использованием multi-catch
        //4. try-catch-finally
        //Продемонстрировать обработку исключительных ситуаций на примерах

        System.out.println("3-е практическое задание");
        ClassExeption classExeption = new ClassExeption(0);
        classExeption.MyExeptionMetod_1();
       try {
           classExeption.MyClassExeption_2();
       }catch (ArrayIndexOutOfBoundsException e){
           e.printStackTrace();
           System.err.println("Ошибка с использованием несуществующего индекса массива");
       }

        try {
            Login.loginToAccount("Loginname", "12345", "1245");
        } catch (WrongLoginException e) {
            System.out.println("Ошибка в логине: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка в пароле: " + e.getMessage());
        }

        //Написать try/catch/finally, в котором finally вызван не будет
        System.out.println("Задание со *");
        Finally_Exit finally_exit = new Finally_Exit();
        finally_exit.classExeption();

    }
}