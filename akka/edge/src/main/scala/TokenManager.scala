package pdi.jwt.akka

import com.typesafe.config.Config

/**
  * Created by nico on 04/07/2016.
  */
class TokenManager(val config: Config) {
  lazy val HTTP_HEADER = config.getString("jwt.http.header").orElse("Authorization")
}
