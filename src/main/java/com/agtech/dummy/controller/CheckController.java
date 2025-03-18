package com.agtech.dummy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

  @GetMapping("/check")
  public String check() {
    return "Dummy Service Check com.agtech.dummy.controller is working fine";
  }
}
