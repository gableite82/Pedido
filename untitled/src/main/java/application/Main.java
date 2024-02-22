package application;


import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entitiesEnum.OrderStatus;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("insira os dados do cliente");
        System.out.print("NOME: ");
        String name = sc.nextLine();
        System.out.print("EMAIL: ");
        String email = sc.next();
        System.out.print("DATA DE NASCIMENTO: ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println();
        System.out.println("insira os dados do pedido");
        System.out.print("STATUS: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.println();

        System.out.print("Quantos itens para este pedido? : ");
        int n =sc.nextInt();
        for (int i = 0; i < n; i ++) {
            System.out.println("insira os dados do item #" + 1 + i + " : ");
            sc.nextLine();
            System.out.print("PRODUTO: ");
            String nameProduct = sc.nextLine();
            System.out.print("VALOR PRODUTO: ");
            double productPrice = sc.nextDouble();
            System.out.print("QUANTIDADE: ");
            int quantity = sc.nextInt();
            System.out.println();

            Product product = new Product(nameProduct, productPrice);

            OrderItem it = new OrderItem(quantity, productPrice, product);
            order.addItem(it);
        }

        System.out.println("RESUMO DO PEDIDO");
        System.out.println(order);

        sc.close();
    }
}