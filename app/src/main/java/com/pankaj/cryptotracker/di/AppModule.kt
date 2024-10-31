package com.pankaj.cryptotracker.di

import com.pankaj.cryptotracker.core.data.networking.HttpClientFactory
import io.ktor.client.engine.cio.CIO
import org.koin.dsl.module

val appModule = module {
    single { HttpClientFactory.create(CIO.create()) }
  //  singleOf(::RemoteCoinDataSource).bind<CoinDataSource>()

    //viewModelOf(::CoinListViewModel)
}