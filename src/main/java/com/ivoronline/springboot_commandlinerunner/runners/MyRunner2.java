package com.ivoronline.springboot_commandlinerunner.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class MyRunner2 implements CommandLineRunner {

  @Override
  public void run(String... args) throws Exception {
    System.out.println("Hello from MyRunner2");
  }

}
