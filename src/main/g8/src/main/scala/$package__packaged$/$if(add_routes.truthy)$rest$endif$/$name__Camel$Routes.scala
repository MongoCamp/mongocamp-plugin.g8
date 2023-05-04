package dev.mongocamp.server.plugins.monitoring.routes

import dev.mongocamp.server.exception.ErrorDescription
import dev.mongocamp.server.plugin.RoutesPlugin
import dev.mongocamp.server.route.BaseRoutes
import io.circe.generic.auto._
import sttp.capabilities.WebSockets
import sttp.capabilities.akka.AkkaStreams
import sttp.model.{Method, StatusCode}
import sttp.tapir._
import sttp.tapir.json.circe.jsonBody
import sttp.tapir.server.ServerEndpoint

import scala.concurrent.Future
import scala.jdk.CollectionConverters._

object $name;format="Camel"$Routes extends BaseRoute with RoutesPlugin {

  override def endpoints = {
    var endpoints: List[ServerEndpoint[AkkaStreams with WebSockets, Future]] = List()
    endpoints
  }

}
