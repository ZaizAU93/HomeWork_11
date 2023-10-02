public class Main {
    public static void main(String[] args) throws MyExeption {
        String[] animals = {"���", "������", "������"};

        try {
            for (int i = 0; i <= animals.length; i++) {
                System.out.println(animals[i]);
            }
            int b = 0;
            int a = 0;
            int c = b / a;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("��������� ����������");
        } catch (ArithmeticException e) {
            System.out.println("��������� ���������� �2");
        }

        try {
            int b = 10;
            int a = 0;
            int c = b / a;
        } catch (ArithmeticException e) {
            System.out.println("��������� ���������� �2");
        }

        try {
            for (int i = 0; i <= animals.length; i++) {
                System.out.println(animals[i]);
            }
            int b = 0;
            int a = 0;
            int c = b / a;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("��������� ���������� 3");
          //  System.out.println(e.getMessage());
        }


        Person per = new Person("Boris");
        per.setAge(17);

        try {
            System.out.print(per.getAge());
        }catch (MyExeption e) {
            System.out.println("����� ���������� �������");
        }


        //������ 3:
        //������� ����� � ��� ������� 4 ������� ��������, � ������ ������ �������� ��������
        //�� �������������� ��������, ���������:
        //1. try- catch
        //2. try-catch, ��� catch ����� ���������
        //3. try -catch, � �������������� multi-catch
        //4. try-catch-finally
        //������������������ ��������� �������������� �������� �� ��������

        System.out.println("3-� ������������ �������");
        ClassExeption classExeption = new ClassExeption(0);
        classExeption.MyExeptionMetod_1();
       try {
           classExeption.MyClassExeption_2();
       }catch (ArrayIndexOutOfBoundsException e){
           e.printStackTrace();
           System.err.println("������ � �������������� ��������������� ������� �������");
       }

        try {
            Login.loginToAccount("Loginname", "12345", "1245");
        } catch (WrongLoginException e) {
            System.out.println("������ � ������: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("������ � ������: " + e.getMessage());
        }

        //�������� try/catch/finally, � ������� finally ������ �� �����
        System.out.println("������� �� *");
        Finally_Exit finally_exit = new Finally_Exit();
        finally_exit.classExeption();

    }
}