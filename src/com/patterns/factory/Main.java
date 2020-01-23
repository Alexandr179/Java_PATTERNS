package com.patterns;

//import com.patterns.factory.Developer;
//import com.patterns.factory.DeveloperFactory;
//import com.patterns.factory.JavaDevFactory;
//import com.patterns.factory.PhpDevFactory;

import com.patterns.factory.Developer;
import com.patterns.factory.DeveloperFactory;
import com.patterns.factory.JavaDevFactory;
import com.patterns.factory.PhpDevFactory;

public class Main {

    public static void main(String[] args) {//------------------------- Factory --------------------------------------
        DeveloperFactory developerFactory = createDeveloperBySpeciality("php");
        Developer developer = developerFactory.createDeveloper();
        developer.createCode();
    }


    static DeveloperFactory createDeveloperBySpeciality (String speciality){
        if(speciality.equalsIgnoreCase("java")){
            return new JavaDevFactory();
        } else if (speciality.equalsIgnoreCase("php")){
            return new PhpDevFactory();
        } else {
            throw new  RuntimeException(speciality + " is not exist");
        }
    }
}
