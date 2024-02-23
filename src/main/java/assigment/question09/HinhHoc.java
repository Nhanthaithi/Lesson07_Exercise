package assigment.question09;

abstract class HinhHoc {
    private static int countHinh = 0;

    public HinhHoc() throws HinhHocException {
        countHinh++;

        if (countHinh > Congifgs.SO_LUONG_HINH_TOI_DA) {
            throw new HinhHocException("Số lượng hình tối đa là: " +
                    Congifgs.SO_LUONG_HINH_TOI_DA);
        }

    }

    abstract double chuVi();

    abstract double dienTich();

    public static void increaseCountHinh() {
        countHinh++;
    }

    public static int getCountHinh() {
        return countHinh;
    }
}
