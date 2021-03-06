package telegram4s.models

import io.circe.Decoder
import io.circe.generic.semiauto.deriveDecoder

/**
 * @param fileId       Unique identifier for this file
 * @param width        Sticker width
 * @param height       Sticker height
 * @param thumb        Sticker thumbnail in .webp or .jpg format
 * @param emoji        Emoji associated with the sticker
 * @param setName      Name of the sticker set to which the sticker belongs
 * @param maskPosition For mask stickers, the position where the mask should be placed
 * @param fileSize     File size
 */
final case class Sticker(fileId: String,
                         width: Int,
                         height: Int,
                         isAnimated: Boolean,
                         thumb: Option[PhotoSize],
                         emoji: Option[String],
                         setName: Option[String],
                         maskPosition: Option[MaskPosition],
                         fileSize: Option[Int])

object Sticker {
  implicit val decoder: Decoder[Sticker] = deriveDecoder[Sticker]
}
