package Entities;

public class SinhVienIT extends SinhVienTechMaster{
    private float java;
    private float html;
    private float css;

    public SinhVienIT(String name, String major, float java, float html, float css) {
        super(name, major);
        this.java = java;
        this.html = html;
        this.css = css;
    }

    public float getJava() {
        return java;
    }

    public void setJava(float java) {
        this.java = java;
    }

    public float getHtml() {
        return html;
    }

    public void setHtml(float html) {
        this.html = html;
    }

    public float getCss() {
        return css;
    }

    public void setCss(float css) {
        this.css = css;
    }

    @Override
    public float getDiem() {
        return (2 * java + html + css) / 4;
    }

    @Override
    public String getHocLuc() {
        if (getDiem() < 5) return "Yếu";
         else if (getDiem() >= 5 && getDiem() < 6.5) return "Trung bình";
         else if (getDiem() >= 6.5 && getDiem() < 7.5) return "Khá";
         else if (getDiem() >= 7.5 && getDiem() < 10) return "Giỏi";
         else return "Không xác định";
    }

    @Override
    public String xuat() {
        return "Sinh viên IT {" +
                "Họ tên: " + name +
                ", ngành: " + major +
                ", điểm: " + getDiem() +
                ", học lực: " + getHocLuc() +
                "}";
    }
}
