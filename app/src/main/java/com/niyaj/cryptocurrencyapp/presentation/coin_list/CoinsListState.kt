package com.niyaj.cryptocurrencyapp.presentation.coin_list

import com.niyaj.cryptocurrencyapp.domain.model.Coin

data class CoinsListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
