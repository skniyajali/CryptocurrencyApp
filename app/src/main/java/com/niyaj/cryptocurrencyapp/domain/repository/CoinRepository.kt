package com.niyaj.cryptocurrencyapp.domain.repository

import com.niyaj.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.niyaj.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}