package com.ivoronline.springboot_commandlinerunner.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class MyRunner1 implements CommandLineRunner {

  @Override
  public void run(String... args) throws Exception {
    System.out.println("Hello from MyRunner1");
  }

}
