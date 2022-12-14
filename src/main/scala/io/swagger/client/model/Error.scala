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
 * @param name Наименование ошибки
 * @param message Текст ошибки
 * @param code 
 * @param status 
 */
case class Error (
  name: Option[String] = None,
  message: Option[String] = None,
  code: Option[Integer] = None,
  status: Option[Integer] = None
)

