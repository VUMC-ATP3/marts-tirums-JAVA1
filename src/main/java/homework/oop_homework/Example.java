package homework.oop_homework;

import java.util.Date;

public class Example {
    public static void main(String[] args) {
        Customer customer = new Customer("Kate");
        customer.setMember(false);
        customer.setMemberType("Not a Member example");
        System.out.println(customer.toString());

        Visit visit = new Visit(customer, new Date());
        visit.setServiceExpense(100);
        visit.setProductExpense(20);
        System.out.println(visit.toString());

        Customer customerP = new Customer("Pēteris");
        customerP.setMember(true);
        customerP.setMemberType("Silver");
        System.out.println("Silver example " + customerP.toString());

        Visit visitP = new Visit(customerP, new Date());
        visitP.setServiceExpense(100);
        visitP.setProductExpense(20);
        System.out.println(visitP.toString());

        Customer customerL = new Customer("Laima");
        customerL.setMember(true);
        customerL.setMemberType("Gold");
        System.out.println("Gold example " + customerL.toString());

        Visit visitL = new Visit(customerL, new Date());
        visitL.setServiceExpense(100);
        visitL.setProductExpense(20);
        System.out.println(visitL.toString());

        Customer customerR = new Customer("Roberts");
        customerR.setMember(true);
        customerR.setMemberType("Premium");
        System.out.println("Premiumm example " + customerR.toString());

        Visit visitR = new Visit(customerR, new Date());
        visitR.setServiceExpense(100);
        visitR.setProductExpense(20);
        System.out.println(visitR.toString());







    }
}
