package com.niyaj.cryptocurrencyapp.presentation.coin_detail

import com.niyaj.cryptocurrencyapp.domain.model.Coin
import com.niyaj.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
