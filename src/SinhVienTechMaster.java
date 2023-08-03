public abstract class SinhVienTechMaster {
    protected String name;
    protected String major;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getMajor() {
//        return major;
//    }
//
//    public void setMajor(String major) {
//        this.major = major;
//    }

    public SinhVienTechMaster(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public abstract float getDiem();
    public abstract String getHocLuc();
    public abstract String xuat();

}
