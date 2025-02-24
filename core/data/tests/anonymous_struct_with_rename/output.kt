/**
 * Generated by typeshare 1.0.0
 */

@file:NoLiveLiterals

package com.agilebits.onepassword

import androidx.compose.runtime.NoLiveLiterals
import kotlinx.serialization.*

/// Generated type representing the anonymous struct variant `List` of the `AnonymousStructWithRename` Rust enum
@Serializable
data class AnonymousStructWithRenameListInner (
	var list: List<String>
)

/// Generated type representing the anonymous struct variant `LongFieldNames` of the `AnonymousStructWithRename` Rust enum
@Serializable
data class AnonymousStructWithRenameLongFieldNamesInner (
	var some_long_field_name: String,
	var and: Boolean,
	var but_one_more: List<String>
)

/// Generated type representing the anonymous struct variant `KebabCase` of the `AnonymousStructWithRename` Rust enum
@Serializable
data class AnonymousStructWithRenameKebabCaseInner (
	@SerialName("another-list")
	var another_list: List<String>,
	@SerialName("camelCaseStringField")
	var camelCaseStringField: String,
	@SerialName("something-else")
	var something_else: Boolean
)

@Serializable
sealed class AnonymousStructWithRename {
	@Serializable
	@SerialName("list")
	data class List(val content: AnonymousStructWithRenameListInner): AnonymousStructWithRename()
	@Serializable
	@SerialName("longFieldNames")
	data class LongFieldNames(val content: AnonymousStructWithRenameLongFieldNamesInner): AnonymousStructWithRename()
	@Serializable
	@SerialName("kebabCase")
	data class KebabCase(val content: AnonymousStructWithRenameKebabCaseInner): AnonymousStructWithRename()
}

