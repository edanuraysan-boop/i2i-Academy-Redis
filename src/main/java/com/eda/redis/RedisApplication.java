package com.eda.redis;

import com.google.gson.Gson;
import redis.clients.jedis.Jedis;

public class RedisApplication {

    public static void main(String[] args) {

        Gson gson = new Gson();

        try (Jedis jedis = new Jedis("localhost", 6379)) {

            System.out.println("Redis connection successful!");

            for (int i = 1; i <= 10000; i++) {
                Person person = new Person(i, "Person " + i, 18 + (i % 50));
                String json = gson.toJson(person);
                jedis.set("person:" + i, json);
            }

            System.out.println("10000 Person objects inserted into Redis.");

            for (int i = 1; i <= 5; i++) {
                String json = jedis.get("person:" + i);
                Person person = gson.fromJson(json, Person.class);

                System.out.println("ID: " + person.getId()
                        + ", Name: " + person.getName()
                        + ", Age: " + person.getAge());
            }
        }
    }
}