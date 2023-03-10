package radu.kotlin.spring.bankexampledemo.datasource.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {

    private val mockBankDataSource = MockBankDataSource()

    @Test
    fun `should return a collection of banks`() {
        // When
        val banks = mockBankDataSource.retrieveBanks()

        // Then
        assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }

    @Test
    fun `should provide some mock data`() {
        // When
        val banks = mockBankDataSource.retrieveBanks()

        // Then
//        assertThat(banks).satisfies(Consumer { bankMutableCollection ->
//            assertThat(bankMutableCollection.forEach { it.accountNumber.isNotBlank() }) // ... any detail assert statement
//        })
        assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
        assertThat(banks).anyMatch { it.trust != 0.0 }
        assertThat(banks).anyMatch { it.transactionFee != 0 }
    }
}