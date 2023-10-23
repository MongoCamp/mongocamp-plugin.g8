package dev.mongocamp.server.plugins.monitoring.routes

import com.typesafe.scalalogging.LazyLogging
import dev.mongocamp.server.exception.ErrorDescription
import dev.mongocamp.server.plugin.{RoutesPlugin, ServerPlugin}
import dev.mongocamp.server.route.BaseRoute
import io.circe.generic.auto._
import sttp.capabilities.WebSockets
import sttp.capabilities.akka.AkkaStreams
import sttp.model.{Method, StatusCode}
import sttp.tapir._
import sttp.tapir.json.circe.jsonBody
import sttp.tapir.server.ServerEndpoint

import scala.concurrent.Future
import scala.jdk.CollectionConverters._

object $name;format="Camel"$Routes extends ServerPlugin with LazyLogging {

  override def activate(): Unit = {
    //todo: do some crazy stuff here
  }


}
