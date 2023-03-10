package radu.kotlin.spring.bankexampledemo.service

import org.springframework.stereotype.Service
import radu.kotlin.spring.bankexampledemo.datasource.BankDataSource
import radu.kotlin.spring.bankexampledemo.model.Bank

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()


}