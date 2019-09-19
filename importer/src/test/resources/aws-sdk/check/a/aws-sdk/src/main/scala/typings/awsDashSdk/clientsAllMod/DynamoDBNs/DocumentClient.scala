package typings.awsDashSdk.clientsAllMod.DynamoDBNs

import typings.awsDashSdk.clientsDynamodbMod.ClientConfiguration
import typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.DocumentClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/all", "DynamoDB.DocumentClient")
@js.native
/**
  * Creates a DynamoDB document client with a set of configuration options.
  */
class DocumentClient ()
  extends typings.awsDashSdk.clientsDynamodbMod.DocumentClient {
  def this(options: DocumentClientOptions with ClientConfiguration) = this()
}

