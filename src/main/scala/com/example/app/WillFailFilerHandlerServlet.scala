package com.example.app

import org.scalatra._
import org.scalatra.servlet.FileUploadSupport
import org.scalatra.servlet.MultipartConfig
import org.scalatra.servlet.SizeConstraintExceededException

class WillFailFilerHandlerServlet extends ScalatraServlet with MyBaseServlet {
  post("/") {
    for {
      _ <- fileParams.get("data")
    } yield ()
    201
  }

}
