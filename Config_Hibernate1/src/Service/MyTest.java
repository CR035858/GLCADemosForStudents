package Service;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Connecting to the database");
		SessionFactory factory = new Configuration()
				.configure("hibernate1.cfg.xml")
				.buildSessionFactory();
		System.out.println("Created");

	}

}
