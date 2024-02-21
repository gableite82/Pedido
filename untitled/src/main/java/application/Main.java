package application;


import entities.Client;
import entitiesEnum.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception{

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("insira os dados do cliente");
        System.out.print("NOME: ");
        String name = sc.nextLine();
        System.out.print("EMAIL: ");
        String email = sc.nextLine();
        System.out.print("DATA DE NASCIMENTO: ");
        Date birthDate = sdf.parse(sc.next());
        Client client = new Client(name, email,birthDate);

        System.out.println();
        System.out.println("insira os dados do pedido");
        System.out.println("STATUS: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());
        OrderStatus order = new OrderStatus(new Date(), status, client);



        sc.close();
    }
}