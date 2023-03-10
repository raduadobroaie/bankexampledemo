package radu.kotlin.spring.bankexampledemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BankExampleDemoApplication

fun main(args: Array<String>) {
	runApplication<BankExampleDemoApplication>(*args)
}
