package com.whitelabel.core.domain.model

/**
 * A group of items with a display name (e.g., grouped by country, artist, era).
 */
data class ItemGroup(
    val key: String,
    val displayName: String,
    val items: List<DisplayableItem>
)

/**
 * Metadata for a group key (e.g., country info with localized names).
 */
interface GroupMetadata {
    val key: String
    val name: String
    val localizedFields: LocalizedFieldSet

    fun getLocalizedName(languageCode: String): String =
        localizedFields.getName(languageCode) ?: name
}
