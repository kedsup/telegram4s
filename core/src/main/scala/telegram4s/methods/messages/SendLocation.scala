package telegram4s.methods.messages

import io.circe._
import io.circe.generic.semiauto._
import telegram4s.methods.TelegramMethod
import telegram4s.models.messages.LocationMessage
import telegram4s.models.{ChatId, ReplyMarkup}

/**
 * Use this method to send point on the map.
 * On success, the sent Message is returned.
 *
 * @param chatId              Unique identifier for the target chat or username of the target channel
 *                            (in the format @channelusername)
 * @param latitude            Latitude of location
 * @param longitude           Longitude of location
 * @param livePeriod          Period in seconds for which the location will be updated (see Live Locations).
 *                            Should be between 60 and 86400.
 * @param disableNotification Sends the message silently.
 *                            iOS users will not receive a notification,
 *                            Android users will receive a notification with no sound.
 * @param replyToMessageId    If the message is a reply, ID of the original message
 * @param replyMarkup         Additional interface options.
 *                            A JSON-serialized object for an inline keyboard, custom reply keyboard,
 *                            instructions to hide reply keyboard or to force a reply from the user.
 */
final case class SendLocation(chatId: ChatId,
                              latitude: Double,
                              longitude: Double,
                              livePeriod: Option[Int] = None,
                              disableNotification: Option[Boolean] = None,
                              replyToMessageId: Option[Int] = None,
                              replyMarkup: Option[ReplyMarkup] = None)

object SendLocation {
  implicit val encoder: Encoder[SendLocation] = deriveEncoder[SendLocation]
  implicit val method: TelegramMethod[SendLocation, LocationMessage] =
    TelegramMethod[SendLocation, LocationMessage]("SendLocation")
}
