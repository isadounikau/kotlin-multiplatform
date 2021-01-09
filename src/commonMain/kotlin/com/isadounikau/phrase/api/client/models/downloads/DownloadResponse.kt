package com.isadounikau.phrase.api.client.models.downloads

sealed class DownloadResponse(
    open val response: Any
)

data class MessagesResponse(
    override val response: Messages
) : DownloadResponse(response)

data class ByteArrayResponse(
    override val response: ByteArray
) : DownloadResponse(response)

typealias Messages = Map<String, Message>

data class Message(
    val message: String?,
    val description: String? = null
)
