package pdi.jwt.akka

import akka.http.scaladsl.model.headers.RawHeader
import akka.http.scaladsl.server.Directive0
import akka.http.scaladsl.server.Directives._


trait TokenDirectives {
  def createHeaderWithValue(name: String, value: String) =
    RawHeader(name, value)

  def setToken(manager: TokenManager): Directive0 = {
    respondWithHeader(createHeaderWithValue(manager.HTTP_HEADER, ???))
  }
}

object TokenDirectives extends TokenDirectives
