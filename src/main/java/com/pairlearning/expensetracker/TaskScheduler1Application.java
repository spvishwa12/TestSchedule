package com.pairlearning.expensetracker;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskScheduler1Application {

	public static void main(String[] args) {
		SpringApplication.run(TaskScheduler1Application.class, args);
		JSONObject ob=new JSONObject();
		ob.put(1, "asas");
		System.out.println(ob);
		JSONArray a=new JSONArray();
		a.add(2);
		a.add(2);
		a.add(2);
		System.out.println(a);
	}

}
