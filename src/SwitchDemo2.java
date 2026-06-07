public class SwitchDemo2 {
    public static void main(String[] args) {

        String role="DOCTOR";
        switch(role){
            case "ADMIN" :
                System.out.println("full Access to system");
            break;
            case "DOCTOR" :
                System.out.println("Access to patients");
                break;
            case "NURSE" :
                System.out.println("Access to patient care");
                break;
            default:
                System.out.println("Limited Access");





        }

    }
}
