package radu.kotlin.spring.bankexampledemo.service

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import radu.kotlin.spring.bankexampledemo.datasource.BankDataSource

internal class BankServiceTest {

    private val dataSource: BankDataSource = mockk(relaxed = true) //will return empty list for collection
    private val bankService = BankService(dataSource)

    @Test
    fun `should call its data source to retrieve banks`() {
        // Given
//        every { dataSource.retrieveBanks() } returns emptyList()

        // When
        bankService.getBanks()

        // Then
        verify(exactly = 1) { dataSource.retrieveBanks() }
    }
}