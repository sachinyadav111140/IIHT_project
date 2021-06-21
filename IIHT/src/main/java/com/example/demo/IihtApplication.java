package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import com.example.demo.entity.SectorEntity;
import com.example.demo.repo.SectorRepo;

@Configuration
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@EnableScheduling
@Component
public class IihtApplication implements CommandLineRunner 
{
	
	public static void main(String[] args) 
	{
		SpringApplication.run(IihtApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception 
	{
     System.out.println("you are in main file");
	}
}
