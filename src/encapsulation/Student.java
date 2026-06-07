package encapsulation;

public class Student {
    private String semail;
    private int sage;
    private String spassword;

    public String getSemail() {
        return semail;
    }

    public void setSemail(String semail) {
        this.semail = semail;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        if(sage>0 && sage<50 ){
            this.sage=sage;
        }
        this.sage = sage;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }
}
