package com.example.app

import org.scalatra._

class MyScalatraServlet extends ScalatraServlet with MyBaseServlet {

  get("/") {
    views.html.hello()
  }

}
