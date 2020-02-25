package telegram4s.models.messages

import io.circe.Decoder
import io.circe.generic.semiauto.deriveDecoder
import telegram4s.models.{Chat, MessageEntity, User}

final case class TextMessage(messageId: Int,
                             chat: Chat,
                             date: Int,
                             text: String,
                             entities: Option[List[MessageEntity]] = None,
                             from: Option[User] = None,
                             forwardFrom: Option[User] = None,
                             forwardFromChat: Option[Chat] = None,
                             forwardFromMessageId: Option[Int] = None,
                             forwardSignature: Option[String] = None,
                             forwardSenderName: Option[String] = None,
                             forwardDate: Option[Int] = None,
                             replyToMessage: Option[TelegramMessage] = None,
                             editDate: Option[Int] = None,
                             authorSignature: Option[String] = None)
  extends UserMessage

object TextMessage {
  implicit val decoder: Decoder[TextMessage] = deriveDecoder[TextMessage]
}
