public class Finally_Exit {
    public void classExeption() {
        try {
           System.out.println("���������� ���������� ��������� ��� ��������� � ���� finally");
           System.exit(0);

        }catch (ArithmeticException e){
             System.err.println("������� �� ����");
        }finally {
            int i = 10;
            System.out.println("�������� ��������� i  ��������� = " + i);
        }
    }
}
