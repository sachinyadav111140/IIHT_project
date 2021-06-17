package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.SectorEntity;
import com.example.demo.repo.SectorRepo;


@SpringBootApplication
public class IihtApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(IihtApplication.class, args);
	}
	@Autowired
     SectorRepo sectorRepo;
	@Override
	public void run(String... args) throws Exception 
	{
	 Optional<SectorEntity> sectorEntity=  sectorRepo.findById((long) 11);
	 System.out.println(sectorEntity.get());
	}
}
