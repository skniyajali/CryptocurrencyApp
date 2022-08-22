package com.niyaj.cryptocurrencyapp.domain.use_case.get_coins

import com.niyaj.cryptocurrencyapp.common.Resource
import com.niyaj.cryptocurrencyapp.data.remote.dto.toCoin
import com.niyaj.cryptocurrencyapp.domain.model.Coin
import com.niyaj.cryptocurrencyapp.domain.model.CoinDetail
import com.niyaj.cryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke() : Flow<Resource<List<Coin>>> = flow{
        try{
            emit(Resource.Loading<List<Coin>>())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success<List<Coin>>(coins))
        }catch(e: HttpException){
            emit(Resource.Error<List<Coin>>(e.localizedMessage ?: "An unexpected error occurred."))
        }catch(e: IOException){
            emit(Resource.Error<List<Coin>>(e.message ?: "Couldn't reach server."))
        }
    }
}