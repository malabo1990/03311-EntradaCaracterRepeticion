/* 
 * Copyright 2019 User.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Casimiro Ondo Obiang
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        //Variables
        boolean P15AR = false;
        boolean OK = false;
        int n = 0;
        do {
            do {
                try {
                    System.out.print("Introduzca un numero par...: ");
                    n = SCN.nextInt();
                    OK = true;
                } catch (Exception e) {
                    System.out.println("ERROR: Dato incorrecto");
                } finally {
                    SCN.nextLine();
                }
            } while (!OK);
            PAR = n % 2 == 0;
        } while (!PAR);
        System.out.printf("Su numero par es...: %d%n", n);
    }
}