package assigment.question09;

public class Program {
    public static void main(String[] args) {
        try {
            HinhTron hinhTron = new HinhTron(34);
            HinhTron hinhTron1 = new HinhTron(34);
            HinhTron hinhTron2 = new HinhTron(34);
            HinhTron hinhTron3 = new HinhTron(34);
            HinhTron hinhTron4 = new HinhTron(34);
            HinhTron hinhTron5 = new HinhTron(34);

            System.out.println("hinhTron.chuVi() = " + hinhTron.chuVi());
            System.out.println("hinhTron.chuVi()1 = " + hinhTron1.chuVi());
            System.out.println("hinhTron.chuVi()2 = " + hinhTron2.chuVi());
            System.out.println("hinhTron.chuVi()3 = " + hinhTron3.chuVi());
            System.out.println("hinhTron.chuVi()4 = " + hinhTron4.chuVi());
            System.out.println("hinhTron.chuVi()5 = " + hinhTron5.chuVi());
        } catch (HinhHocException e) {
            System.out.println("error Messgae = " + e.getMessage());
        }
    }
}
