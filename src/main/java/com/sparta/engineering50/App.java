package com.sparta.engineering50;

public class App {
    public static void main(String[] args) {
        String sql = "INSERT INTO rabbit (Age, Gender, Available, Pregnant, Dead) VALUES (0, /" + "male" + "/, 'no', 'no', 'no')";
        sql = sql.replace("/", "'");
        System.out.println(sql);

//        Output.returnDeathCounter();
//        Output.returnRabbitCounter();
    }
}
