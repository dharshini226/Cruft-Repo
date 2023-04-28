package com.example.demo;

 

import org.springframework.boot.CommandLineRunner;
  import org.springframework.stereotype.Component;

  @Component
  class MyCommandLineRunner implements CommandLineRunner {

      @Override
          public void run(String... args) throws Exception {
	          System.out.println("Hello, world!");
	         
	        for(int x=0;x<10;x++) {
	        	System.out.println(x);
	        }
		      }
		      }


