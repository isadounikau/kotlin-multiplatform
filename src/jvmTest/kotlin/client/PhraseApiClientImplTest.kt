package com.isadounikau.phrase.api.client

import kotlinx.coroutines.runBlocking
import kotlin.test.Test

class PhraseApiClientImplTest {

    private val client = PhraseApiClientImpl()

    @Test
    fun projects() = runBlocking {
        println(client.projects())
    }

}
