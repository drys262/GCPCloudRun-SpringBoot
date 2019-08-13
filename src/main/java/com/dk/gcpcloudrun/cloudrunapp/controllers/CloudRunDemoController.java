package com.dk.gcpcloudrun.cloudrunapp.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudRunDemoController {

  @GetMapping
  public String helloWorld() {
    return "Hello Cloud Run";
  }

}
