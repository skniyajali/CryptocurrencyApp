package com.niyaj.cryptocurrencyapp.domain.repository

import com.niyaj.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.niyaj.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.niyaj.cryptocurrencyapp.data.remote.dto.CoinDto
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }
    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}