package com.example.lab9;

import com.example.lab9.entity.Masina;
import com.example.lab9.service.MasinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab9Application implements CommandLineRunner {

	@Autowired
	private MasinaService masinaService;

	public static void main(String[] args) {
		SpringApplication.run(Lab9Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		masinaService.adaugaMasina(new Masina("JKL123", "Audi", 2022, "Negru", 30000));
		masinaService.stergeMasina("ABC123");
		Masina masina = masinaService.cautaMasina("XYZ456");
		System.out.println(masina);

		masinaService.getToateMasinile().forEach(System.out::println);

		long count = masinaService.numarMasiniMarca("BMW");
		System.out.println("Număr mașini BMW: " + count);

		count = masinaService.numarMasiniSub100000Km();
		System.out.println("Număr mașini cu sub 100000 km: " + count);

		masinaService.masiniMaiNoiDe5Ani().forEach(System.out::println);
	}
}
