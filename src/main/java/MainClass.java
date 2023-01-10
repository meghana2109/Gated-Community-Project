import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        Admin a = new Admin(01,"Admin","Admin123");
        Owner o1 = new Owner(1,"John","Doe","771188665","johnDoe@gmail.com", new String[]{"201A", "202B"});

        Resident r1 = new Resident(1,"Meghana","M","202B","990088776","meghamanjunath@gmail.com");
        Date d1 = new Date(2023,01,31);
        ElectricityBill e1 = new ElectricityBill("E0012",1245.80,d1,"not paid");
        MaintenanceBill m1 = new MaintenanceBill("b003","201A",3000.00,d1,"not paid");

        System.out.println("Owner Details : "+o1.firstName+" "+o1.lastName+" "+o1.contactNumber);

        System.out.println("Resident Details for "+r1.houseNumber+" is : "+r1.firstName+ " "+r1.lastName+ " "+r1.contactNumber);

        System.out.println("Electricity Bill Details : "+e1.billID+ " Amount Pending : "+e1.billAmount+" Due date : "+e1.dueDate);
        System.out.println("Maintenance Bill Details : "+m1.billID+ " Amount Pending : "+m1.amount+" Due date : "+m1.dueDate);
    }
}
