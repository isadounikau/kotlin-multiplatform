package com.isadounikau.phrase.api.client.models

import kotlinx.datetime.Instant
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

@Serializable
data class PhraseProject(
    val id: String,
    val name: String,
    val mainFormat: String? = null,
    val sharesTranslationMemory: String? = null,
    val projectImageUrl: String? = null,
    val removeProjectImage: Boolean? = null,
    val accountId: String? = null,
    @Contextual
    val createdAt: Instant? = null,
    @Contextual
    val updatedAt: Instant? = null
)

data class CreatePhraseProject(
    val name: String,
    val mainFormat: String? = null,
    val sharesTranslationMemory: Boolean? = null,
    val removeProjectImage: Boolean? = null,
    val accountId: String? = null
)

data class UpdatePhraseProject(
    val name: String,
    val mainFormat: String? = null,
    val sharesTranslationMemory: Boolean? = null,
    val removeProjectImage: Boolean? = null,
    val accountId: String? = null
)
