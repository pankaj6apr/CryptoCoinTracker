package com.pankaj.cryptotracker.crypto.data.mappers

import com.pankaj.cryptotracker.crypto.data.networking.dto.CoinDto
import com.pankaj.cryptotracker.crypto.data.networking.dto.CoinPriceDto
import com.pankaj.cryptotracker.crypto.domain.Coin
import com.pankaj.cryptotracker.crypto.domain.CoinPrice
import java.time.Instant
import java.time.ZoneId

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        rank = rank,
        name = name,
        symbol = symbol,
        marketCapUsd = marketCapUsd,
        priceUsd = priceUsd,
        changePercent24Hr = changePercent24Hr
    )
}

fun CoinPriceDto.toCoinPrice(): CoinPrice {
    return CoinPrice(
        priceUsd = priceUsd,
        dateTime = Instant
            .ofEpochMilli(time)
            .atZone(ZoneId.systemDefault())
    )
}