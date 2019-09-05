package com.xsis.day07;

public class EmployeeDemoLagi {
    public static void main(String[] args) {
     EmployeeLagi e1 = new EmployeeLagi("Law","1234","law@hp.com",1994, 400.00);
        //System.out.println(e1.toString());
     Manager m1 = new Manager("Luffy","1235","luffy@shp.com",1996, 500.00, 0.5);
       //System.out.println(m1.toString());

      EmployeeInterface emi = new Manager("Kidd", "1236","kidd@kp.com",1995,450.00, 0.0);
        //emi.potongGaji(100);
        //emi.getInfoEmployee();

      Programmer p1 = new Programmer("Sanji", "1221", "sanji@shp.com", 1996, 300.00, 9);
      Programmer p2 = new Programmer("Zoro", "1222","zoro@shp.com", 1994, 400, 15);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println();

      EmployeeInterface ip1 = new Programmer("Sanji", "1221", "sanji@shp.com", 1996, 300.00, 9);
      EmployeeInterface ip2 = new Programmer("Zoro", "1222","zoro@shp.com", 1994, 400, 15);
        ip1.potongGaji(100);
        ip1.getInfoEmployee();
       /* ip2.potongGaji(50);
        ip2.getInfoEmployee();*/

    }
}
