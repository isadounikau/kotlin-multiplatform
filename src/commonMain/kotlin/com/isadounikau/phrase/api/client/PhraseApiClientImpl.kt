package com.isadounikau.phrase.api.client

import com.isadounikau.phrase.api.client.models.CreateKey
import com.isadounikau.phrase.api.client.models.CreatePhraseLocale
import com.isadounikau.phrase.api.client.models.CreatePhraseProject
import com.isadounikau.phrase.api.client.models.CreateTranslation
import com.isadounikau.phrase.api.client.models.DownloadPhraseLocaleProperties
import com.isadounikau.phrase.api.client.models.Key
import com.isadounikau.phrase.api.client.models.PhraseLocale
import com.isadounikau.phrase.api.client.models.PhraseProject
import com.isadounikau.phrase.api.client.models.Translation
import com.isadounikau.phrase.api.client.models.UpdatePhraseProject
import com.isadounikau.phrase.api.client.models.downloads.DownloadResponse
import com.isadounikau.phrase.api.client.models.downloads.FileFormat
import com.isadounikau.phrase.api.client.utils.Constants.PHRASE_API_HOST
import io.ktor.client.HttpClient
import io.ktor.client.features.defaultRequest
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.request.get
import io.ktor.client.request.header
import io.ktor.client.request.host
import kotlinx.serialization.json.Json

class PhraseApiClientImpl(
    private val authToken: String
) : PhraseApiClient {
    private val client: HttpClient = HttpClient {
        defaultRequest { // this: HttpRequestBuilder ->
            host = PHRASE_API_HOST
            header("Authorization", "token $authToken")
        }
        install(JsonFeature) {
            serializer = KotlinxSerializer(
                json = Json {
                    ignoreUnknownKeys = true
                }
            )
        }
    }

    override suspend fun projects(): List<PhraseProject> {
        return client.get("/api/v2/projects")
    }

    override fun project(projectId: String): PhraseProject {
        TODO("Not yet implemented")
    }

    override fun deleteProject(projectId: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun createProject(phraseProject: CreatePhraseProject): PhraseProject {
        TODO("Not yet implemented")
    }

    override fun updateProject(projectId: String, phraseProject: UpdatePhraseProject): PhraseProject {
        TODO("Not yet implemented")
    }

    override fun locale(projectId: String, localeId: String, branch: String?): PhraseLocale {
        TODO("Not yet implemented")
    }

    override fun locales(projectId: String, branch: String?): List<PhraseLocale> {
        TODO("Not yet implemented")
    }

    override fun createLocale(projectId: String, locale: CreatePhraseLocale): PhraseLocale? {
        TODO("Not yet implemented")
    }

    override fun downloadLocale(projectId: String, localeId: String, fileFormat: FileFormat, properties: DownloadPhraseLocaleProperties?): DownloadResponse {
        TODO("Not yet implemented")
    }

    override fun deleteLocale(projectId: String, localeId: String, branch: String?): Boolean {
        TODO("Not yet implemented")
    }

    override fun translations(project: PhraseProject, locale: PhraseLocale, branch: String?): List<Translation> {
        TODO("Not yet implemented")
    }

    override fun createTranslation(projectId: String, createTranslation: CreateTranslation): Translation {
        TODO("Not yet implemented")
    }

    override fun createKey(projectId: String, createKey: CreateKey): Key {
        TODO("Not yet implemented")
    }

    override fun deleteKey(projectId: String, keyId: String, branch: String?): Boolean {
        TODO("Not yet implemented")
    }
}
