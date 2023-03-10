package radu.kotlin.spring.bankexampledemo.datasource

import radu.kotlin.spring.bankexampledemo.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
}