public class ClassExeption {
    int number;
    

    public ClassExeption(int number) {
        this.number = number;
        try {
            int i = 10/number;
        }catch (ArithmeticException e){
            System.out.println("����� ������������ � �������������� �������, ������� �� ����");
            System.err.println("������� �� ����");
        }finally {
           int i = 10;
           System.out.println("�������� ��������� i  ��������� = " + i);
        }
    }

    public void MyExeptionMetod_1(){
        ClassExeption classExeption = null;
        try {
            classExeption.MyExeptionMetod_1();
        }catch (NullPointerException e){
            System.err.println("���������� ������ �� ������ ������");
        }

    }

     public void MyClassExeption_2(){
        int[] array = new int[4];
        array[8] = 9;
    }

}
