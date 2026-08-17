package com.devtalles.exception.customized.checked;

public class AgeValidator {

    public static void main(String[] args) {
        Person person = null;
        try {
          person = Person.createPerson(14, "Carl");
        } catch (AgeValidationException e) {
            System.out.println(e.getMessage());
        }
        //System.out.println(person.toString());
    }

}
