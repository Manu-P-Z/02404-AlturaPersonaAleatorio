/* 
 * Copyright 2019 Manu Portolés Zagalá.
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

/**
 *
 * @author Manu Portolés Zagalá
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static final Random RND = new Random();

    public static void main(String[] args) {
        final double ALTURA_MIN = 0.50;
        final double ALTURA_MAX = 0.20;
        double altura;
        
        altura = RND.nextDouble() * (ALTURA_MAX - ALTURA_MIN) + ALTURA_MIN;
        System.out.printf(Locale.ENGLISH,"%s %.2f%s", "Altura aleatoria ..........:", altura, "metros");

    }

}
