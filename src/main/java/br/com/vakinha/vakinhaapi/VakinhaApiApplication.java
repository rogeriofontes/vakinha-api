package br.com.vakinha.vakinhaapi;

import br.com.vakinha.vakinhaapi.models.Product;
import br.com.vakinha.vakinhaapi.models.User;
import br.com.vakinha.vakinhaapi.repositories.ProductRepository;
import br.com.vakinha.vakinhaapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class VakinhaApiApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(VakinhaApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product product1 = Product.builder()
				.id(1l)
				.name("Catador João")
				.description("Catador João")
				.image("img1.png")
				.price(BigDecimal.ONE)
				.build();

		productRepository.save(product1);

		Product product2 = Product.builder()
				.id(2l)
				.name("Catador Antonio")
				.description("Catador Antonio")
				.image("img1.png")
				.price(BigDecimal.TEN)
				.build();

		productRepository.save(product2);

		Product product3 = Product.builder()
				.id(3l)
				.name("Catador Maria")
				.description("Catador Maria")
				.image("img1.png")
				.price(BigDecimal.ONE)
				.build();

		productRepository.save(product3);

		Product product4 = Product.builder()
				.id(4l)
				.name("Catador Antonia")
				.description("Catador Antonia")
				.image("img1.png")
				.price(BigDecimal.TEN)
				.build();

		productRepository.save(product4);

		User rogerioFontes = User.builder()
				.id(1l)
				.name("Rogerio Fontes")
				.email("fontestz@gmail.com")
				.password("12345678")
				.build();

		userRepository.save(rogerioFontes);
	}
}
