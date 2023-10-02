public class ClassExeption {
    int number;
    

    public ClassExeption(int number) {
        this.number = number;
        try {
            int i = 10/number;
        }catch (ArithmeticException e){
            System.out.println("Вызов конструктора с арифметической ошибкой, деление на ноль");
            System.err.println("Деление на ноль");
        }finally {
           int i = 10;
           System.out.println("Значение аргумента i  назначено = " + i);
        }
    }

    public void MyExeptionMetod_1(){
        ClassExeption classExeption = null;
        try {
            classExeption.MyExeptionMetod_1();
        }catch (NullPointerException e){
            System.err.println("Исключение ссылка на пустой объект");
        }

    }

     public void MyClassExeption_2(){
        int[] array = new int[4];
        array[8] = 9;
    }

}
