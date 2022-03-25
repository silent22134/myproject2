package com.wei.ticket;

import java.util.Scanner;

public class TicketSale {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(Ticket.TAIPEI_STATION,Ticket.KAOHSIUNG_STATION,);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your start station");
        int startStation = Integer.parseInt(scanner.next());
    }
}
