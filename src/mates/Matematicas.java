/**
 * Copyright [2022] [Juan Cordero]
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */

package mates;

/**
 * Clase con varias implementaciones de algoritmos matemáticos
 *
 * @author Juan Cordero
 * @version 1.0
 */
public class Matematicas {

    /**
     * Método generar una aproximación al número Pi mediante Montecarlo
     *
     * @param pasos El número de pasos a repetir el método de Montecarlo
     * @return Un número double que se aproxima a Pi
     */
    public static double generarNumeroPi(long pasos) {
        long aciertos = 0;
        double areaCuadrado = 4.;

        for (long i = 1; i <= pasos; i++) {
            double x = Math.random();
            double y = Math.random();

            double distancia = Math.sqrt(x * x + y * y);
            if (distancia <= 1.) {
                aciertos += 1;
            }

        }

        double radio = 1.;
        double areaCirculo = areaCuadrado * (aciertos * 1. / pasos);
        return areaCirculo / (radio * radio);
    }
}
