public class SinhVienIT extends SinhVienTechMaster{
    private double java;
    private double html;
    private double css;

    public SinhVienIT(String name, String major, double java, double html, double css) {
        super(name, major);
        this.java = java;
        this.html = html;
        this.css = css;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }

    @Override
    public double getDiem() {
        return (2 * java + html + css) / 4;
    }

    @Override
    public String getHocLuc() {
        if (getDiem() < 5) return "Yếu";
         else if (getDiem() >= 5 || getDiem() < 6.5) return "Trung bình";
         else if (getDiem() >= 6.5 || getDiem() < 7.5) return "Khá";
         else if (getDiem() >= 7.5 || getDiem() < 10) return "Giỏi";
         else return null;
    }

    @Override
    public String xuat() {
        return "Sinh viên IT {" +
                "Họ tên: " + getName() +
                ", ngành:" + getMajor() +
                ", điểm:" + getDiem() +
                ", học lực:" + getHocLuc() +
                '}';
    }
}
