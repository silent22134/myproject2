package com.wei.ticket;

import java.util.Scanner;

public class TicketSale {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(Station.TAIPEI_STATION,Station.KAOHSIUNG_STATION);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your start station :(1.Taipei 2.Taichung 3.Kaohsiung)");
        int startStation = Integer.parseInt(scanner.next());
    }
}
