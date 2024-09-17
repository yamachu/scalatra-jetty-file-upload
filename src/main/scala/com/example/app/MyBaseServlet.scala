package com.example.app

import org.scalatra.servlet.FileUploadSupport
import org.scalatra.servlet.MultipartConfig
import org.scalatra.servlet.SizeConstraintExceededException
import org.scalatra.RequestEntityTooLarge

trait MyBaseServlet extends FileUploadSupport {
  configureMultipartHandling(MultipartConfig(maxFileSize = Some(1 * 1024)))

  error { case e: SizeConstraintExceededException =>
    RequestEntityTooLarge()
  }
  
}
