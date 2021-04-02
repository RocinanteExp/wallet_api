package com.lab01.wallet

import com.lab01.wallet.domain.Customer
import com.lab01.wallet.domain.Wallet
import com.lab01.wallet.repositories.CustomerRepository
import com.lab01.wallet.repositories.WalletRepository
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean

@SpringBootApplication
class WalletApplication {
	// @Bean
	// fun run_test_db(custRepo: CustomerRepository, walletRepo: WalletRepository): CommandLineRunner {
	// 	return CommandLineRunner {
	// 		println("Hi, I am run_test_db")
	// 		val cust1 = Customer(1, "foo")
	// 		val cust2 = Customer(2, "bar")
	// 		val wallet = Wallet(null, 100, Customer(1, "bar"))
	// 		custRepo.save(cust1)
	// 		custRepo.save(cust2)
	// 		custRepo.findAll().forEach(::println)
	// 		walletRepo.save(wallet)
	// 		walletRepo.findAll().forEach(::println)
	// 	}
	// }
}

fun main(args: Array<String>) {
	runApplication<WalletApplication>(*args)
}