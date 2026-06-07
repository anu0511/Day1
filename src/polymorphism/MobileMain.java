package polymorphism;

public class MobileMain {
    public static void main(String[] args) {
        Mobile mobile=new Mobile();
        mobile.ring();
        mobile=new AppleMobile();
        mobile.ring();
        mobile=new SamsungMobile();
        mobile.ring();

    }
}
