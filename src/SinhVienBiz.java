public class SinhVienBiz extends SinhVienTechMaster{
    private float marketing;
    private float sales;

    public SinhVienBiz(String name, String major, float marketing, float sales) {
        super(name, major);
        this.marketing = marketing;
        this.sales = sales;
    }

    @Override
    public float getDiem() {
        return (2 * marketing + sales) / 3;
    }

    @Override
    public String getHocLuc() {
        if (getDiem() < 5) return "Yếu";
        else if (getDiem() >= 5 && getDiem() < 6.5) return "Trung bình";
        else if (getDiem() >= 6.5 && getDiem() < 7.5) return "Khá";
        else if (getDiem() >= 7.5 && getDiem() < 10) return "Giỏi";
        else return null;
    }

    @Override
    public String xuat() {
        return "Sinh viên Biz { " +
                "Họ tên: " + name +
                ", ngành: " + major +
                ", điểm: " + getDiem() +
                ", học lực: " + getHocLuc() +
                " }";
    }
}
