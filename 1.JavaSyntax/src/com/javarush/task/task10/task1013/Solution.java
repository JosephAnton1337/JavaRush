package com.javarush.task.task10.task1013;

/*
 В классе Human должно быть 10 конструкторов.


Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static class Human {
        private String Name;
        private int age;
        private String rasa;
        private boolean sex;
        private int telephoneNumber;
        private boolean isGay;


        public  Human (String Name , int age ){
            this.Name= Name;
            this.age = age;
        }
public  Human (int Age){
            age =Age;
}
public Human(String Rasa,boolean isGay){
            rasa = Rasa;
            this.isGay = isGay;
}
public Human (int Phone, int age){
            telephoneNumber=Phone;
            this.age = age;

}
public Human (String Name , int age , String rasa , boolean sex , int telephoneNumber,boolean isGay){

            this.Name =Name;

            this.age = age;

            this.telephoneNumber=telephoneNumber;

            this.rasa=rasa;
            this.sex = sex;
            this.isGay = isGay;
}
        public Human (String Name , int age , String rasa , boolean sex , int telephoneNumber){
            this.Name =Name;

            this.age = age;

            this.telephoneNumber=telephoneNumber;

            this.rasa=rasa;
            this.sex = sex;
        }
        public Human (String Name , int age , String rasa ,  int telephoneNumber){
            this.Name =Name;

            this.age = age;

            this.telephoneNumber=telephoneNumber;

            this.rasa=rasa;
            //this.sex = sex;

        }
        public Human(String Name  ){

            this.Name =Name;

         
        }
        public Human(String Name , int age ,boolean sex, String rasa ){
            this.Name =Name;
            this.sex = sex;
            this.age = age;
            this.rasa=rasa;

        // Напишите тут ваши переменные и конструкторы
    }
        public Human(String Name , int age , String rasa,boolean sex ){
            this.Name =Name;
            this.sex =sex;
            this.age = age;
            this.rasa=rasa;
}}}
