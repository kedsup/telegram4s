package telegram4s.methods.stickers

import io.circe._
import io.circe.generic.semiauto._
import telegram4s.methods.TelegramMethod
import telegram4s.models.{InputFile, MaskPosition}

/**
 * Use this method to create new sticker set owned by a user.
 * The bot will be able to edit the created sticker set.
 *
 * Returns True on success.
 *
 * @param userId        User identifier of created sticker set owner
 * @param name          Short name of sticker set, to be used in t.me/addstickers/ URLs (e.g., animals).
 *                      Can contain only english letters, digits and underscores.
 *                      Must begin with a letter.
 *                      Can't contain consecutive underscores and
 *                      must end in “_by_<bot username>”. <bot_username> is case insensitive.
 *                      1-64 characters.
 * @param title         Sticker set title, 1-64 characters
 * @param pngSticker    Sticker file (can be existing Telegram file or new one in .png format)
 * @param emojis        One or more emoji corresponding to the sticker
 * @param containsMasks Pass True, if a set of mask stickers should be created
 * @param maskPosition  Position where the mask should be placed on faces
 */
final case class CreateNewStickerSet(userId: Int,
                                     name: String,
                                     title: String,
                                     pngSticker: InputFile,
                                     emojis: String,
                                     containsMasks: Option[Boolean] = None,
                                     maskPosition: Option[MaskPosition] = None)

object CreateNewStickerSet {
  implicit val encoder: Encoder[CreateNewStickerSet] = deriveEncoder[CreateNewStickerSet]
  implicit val method: TelegramMethod[CreateNewStickerSet, Boolean] =
    TelegramMethod[CreateNewStickerSet, Boolean](
      name = "CreateNewStickerSet",
      attachments = r => List("png_sticker" -> r.pngSticker)
    )
}
