public class Finally_Exit {
    public void classExeption() {
        try {
           System.out.println("Нормальное завершение программы без вхождения в блок finally");
           System.exit(0);

        }catch (ArithmeticException e){
             System.err.println("Деление на ноль");
        }finally {
            int i = 10;
            System.out.println("Значение аргумента i  назначено = " + i);
        }
    }
}
