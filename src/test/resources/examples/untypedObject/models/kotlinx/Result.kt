package examples.untypedObject.models

import kotlin.String
import kotlin.collections.Map
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonObject

@Serializable
public data class Result(
  /**
   * Any data. Object has no schema.
   */
  @SerialName("data")
  public val `data`: Map<String, JsonObject?>? = null,
)
