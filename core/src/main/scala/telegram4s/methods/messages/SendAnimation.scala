package telegram4s.methods.messages

import io.circe._
import io.circe.generic.semiauto._
import telegram4s.methods.TelegramMethod
import telegram4s.models.ParseMode.ParseMode
import telegram4s.models.messages.AnimationMessage
import telegram4s.models.{ChatId, InputFile, ReplyMarkup}

/**
 * Use this method to send animation files (GIF or H.264/MPEG-4 AVC video without sound).
 *
 * On success, the sent Message is returned.
 * Bots can currently send animation files of up to 50 MB in size, this limit may be changed in the future.
 *
 * @param chatId              Unique identifier for the target chat or username of the target channel
 *                            (in the format @channelusername)
 * @param animation           Animation to send
 * @param duration            Duration of sent animation in seconds
 * @param width               Animation width
 * @param height              Animation height
 * @param thumb               Thumbnail of the file sent
 * @param caption             Video caption (may also be used when resending videos by file_id), 0-200 characters
 * @param parseMode           Parse mode of captured text (Markdown or HTML)
 * @param disableNotification Sends the message silently.
 *                            iOS users will not receive a notification,
 *                            Android users will receive a notification with no sound
 * @param replyToMessageId    If the message is a reply, ID of the original message
 * @param replyMarkup         Additional interface options.
 *                            A JSON-serialized object for an inline keyboard, custom reply keyboard,
 *                            instructions to hide reply keyboard or to force a reply from the user.
 */
final case class SendAnimation(chatId: ChatId,
                               animation: InputFile,
                               duration: Option[Int] = None,
                               width: Option[Int] = None,
                               height: Option[Int] = None,
                               thumb: Option[InputFile] = None,
                               caption: Option[String] = None,
                               parseMode: Option[ParseMode] = None,
                               disableNotification: Option[Boolean] = None,
                               replyToMessageId: Option[Int] = None,
                               replyMarkup: Option[ReplyMarkup] = None)

object SendAnimation {
  implicit val encoder: Encoder[SendAnimation] = deriveEncoder[SendAnimation]
  implicit val method: TelegramMethod[SendAnimation, AnimationMessage] =
    TelegramMethod[SendAnimation, AnimationMessage](
      name = "SendAnimation",
      attachments = r => r.thumb.map("thumb" -> _).toList :+ ("animation" -> r.animation)
    )
}
