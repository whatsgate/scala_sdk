/**
 * API whatsgate.ru
 * Интерфейс для взаимодействия с клиентом Whatsapp
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.model


/**
 * @param whatsappID Идентификатор Whatsapp ID
 * @param recipient 
 */
case class SeenBody (
  whatsappID: Option[String] = None,
  recipient: Option[AnyOfseenBodyRecipient] = None
)

