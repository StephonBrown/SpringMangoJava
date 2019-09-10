package com.stephb.JavaMongo;

import com.stephb.JavaMongo.dao.BikeRepository;
import com.stephb.JavaMongo.dao.CustomerRepository;
import com.stephb.JavaMongo.dto.Bike;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JavaMongoApplication implements CommandLineRunner {
        @Autowired
        private BikeRepository bikeRepo;
        private CustomerRepository custRepo;
        
	public static void main(String[] args) {
            SpringApplication.run(JavaMongoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String response = "";
        boolean running = true;
        while(running){
            System.out.println("What would you like to create? \n C: The Customer \n B: Bike? \n X:Close");
            response = scan.nextLine();
            if ("B".equals(response.toUpperCase())) {
                String[] bikeInformation = new String[3];
                System.out.println("Enter the information for the Bike");
                System.out.println("Model Number");
                bikeInformation[0] = scan.nextLine();
                System.out.println("Color");
                bikeInformation[1] = scan.nextLine();
                System.out.println("Description");
                bikeInformation[2] = scan.nextLine();

                Bike bike = new Bike();
                bike.setModelNumber(bikeInformation[0]);
                bike.setColor(bikeInformation[1]);
                bike.setDescription(bikeInformation[2]);

                bike = bikeRepo.save(bike);
                System.out.println(bike.toString());


            } else if ("X".equals(response.toUpperCase())) {
                System.out.println("Bye");
                running = false;
            } else {
                System.out.println("Sorry nothing else works right now!");
            }
        }

        
    }

}
