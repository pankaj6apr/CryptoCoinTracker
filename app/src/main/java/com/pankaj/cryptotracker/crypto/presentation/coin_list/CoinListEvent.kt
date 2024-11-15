package com.pankaj.cryptotracker.crypto.presentation.coin_list

import com.pankaj.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError) : CoinListEvent
}