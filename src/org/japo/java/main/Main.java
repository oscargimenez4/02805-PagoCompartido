/* 
 * Copyright 2019 Oscar G.4 - oscargimenez4@gmail.com.
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
import java.util.Scanner;

/**
 *
 * @author Oscar G.4 - oscargimenez4@gmail.com
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        double importe;
        int comensales;
        try {
            System.out.print("Introduzca el importe de la cena...... : ");
             importe = SCN.nextDouble();
            System.out.print("Introduzca el numero de comensales ... : ");
             comensales = SCN.nextInt();
             double pagoindv = importe / comensales ;
             System.out.println("\n=======\n");
             System.out.printf("Importe cena (€) ....: %.2f%n", importe);
             System.out.printf("Numero comensales ...: %d%n", comensales);
             System.out.printf("Pago por comensal ...: %.2f%n", pagoindv);
        } catch (Exception e) {
            System.out.print("Error: Dato Incorrecto");
        } finally {
            SCN.nextLine();
        }
    }
}
