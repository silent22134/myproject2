package com.wei.ticket;

import java.util.Scanner;

public class TicketSale {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(Station.TAIPEI_STATION,Station.KAOHSIUNG_STATION);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your start station :(1.Taipei 2.Taichung 3.Kaohsiung)");
        int choice = Integer.parseInt(scanner.next());
       Station start = null;
       switch (choice){
           case 1:
           start = Station.TAIPEI_STATION;
           break;
           case 2:
           start = Station.TAICHUNG_STATION;
           break;
           case 3:
           start = Station.KAOHSIUNG_STATION;
           break;
       }
        System.out.println("Please enter your destination station :(1.Taipei 2.Taichung 3.Kaohsiung)");
        choice = Integer.parseInt(scanner.next());
        Station destination = null;
        switch (choice){
            case 1:
                destination = Station.TAIPEI_STATION;
                break;
            case 2:
                destination = Station.TAICHUNG_STATION;
                break;
            case 3:
                destination = Station.KAOHSIUNG_STATION;
                break;
        }
        //
        System.out.println("Which kind of ticket?(1.Normal 2.Student 3.Priority)");
        choice = Integer.parseInt(scanner.next());
        Ticket ticket1 = null;
        switch (choice){
            case 1:
                ticket = new Ticket(start,destination);
                break;
            case 2:
                ticket = new Student(start,destination);
                break;
        }
        ticket.print();
    }
}
