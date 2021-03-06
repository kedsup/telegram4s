package telegram4s.models

import io.circe.Encoder
import io.circe.generic.semiauto.deriveEncoder

/**
 * Button of the reply keyboard.
 * For simple text buttons String can be used instead of this object to specify text of the button.
 * Optional fields are mutually exclusive.
 *
 * @param text            Text of the button. If none of the optional fields are used, it will be sent to the
 *                        bot as a message when the button is pressed
 * @param requestContact  If True, the user's phone number will be sent as a contact when the button
 *                        is pressed. Available in private chats only
 * @param requestLocation If True, the user's current location will be sent when the button is pressed.
 *                        Available in private chats only
 */
final class KeyboardButton private(val text: String,
                                   val requestContact: Option[Boolean] = None,
                                   val requestLocation: Option[Boolean] = None)

object KeyboardButton {

  /**
   * `text` will be sent to the bot as a message when the button is pressed.
   *
   * @param text Text of the button
   */
  def text(text: String): KeyboardButton = new KeyboardButton(text)

  /**
   * The user's phone number will be sent as a contact when the button is pressed.
   * Available in private chats only.
   *
   * @param text Text of the button
   */
  def requestLocation(text: String): KeyboardButton =
    new KeyboardButton(text, requestLocation = Some(true))

  /**
   * The user's current location will be sent when the button is pressed.
   * Available in private chats only.
   *
   * @param text Text of the button.
   */
  def requestContact(text: String): KeyboardButton =
    new KeyboardButton(text, requestContact = Some(true))

  implicit val encoderInstance: Encoder[KeyboardButton] = deriveEncoder[KeyboardButton]
}
