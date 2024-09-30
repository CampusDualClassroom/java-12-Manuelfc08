package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", "Gasoline");

        // 1. tacómetro en cero
        System.out.println("¿Tacómetro en cero?: " + myCar.isTachometerEqualToZero());

        // 2. Encender el coche (el tacómetro cambiaría)
        myCar.start();

        // 3. Encender el coche cuando ya está encendido
        myCar.start();

        // 4. Apagar el coche (tacómetro vuelve a cero)
        myCar.stop();

        // 5. Intentar apagar el coche mientras está en movimiento
        myCar.start(); // Volver a encender el coche
        myCar.accelerate(); // Acelerar para poner el coche en movimiento
        myCar.stop(); // Intentar apagar mientras está en movimiento

        // 6. Acelerar el coche
        myCar.accelerate();
        System.out.println("Velocidad actual: " + myCar.speedometer + " km/h");

        // 7. Acelerar hasta intentar superar la velocidad máxima
        for (int i = 0; i < 30; i++) { // Acelerar varias veces para intentar superar la velocidad máxima
            myCar.accelerate();
        }
        System.out.println("Velocidad después de intentar superar el máximo: " + myCar.speedometer + " km/h");

        // 8. Frenar el coche
        myCar.brake();
        System.out.println("Velocidad después de frenar: " + myCar.speedometer + " km/h");

        // 9. Frenar hasta intentar un valor negativo
        for (int i = 0; i < 10; i++) { // Frenar varias veces
            myCar.brake();
        }
        System.out.println("Velocidad después de intentar frenar a un valor negativo: " + myCar.speedometer + " km/h");

        // 10. Girar el volante 20 grados
        myCar.turnAngleOfWheels(20);
        System.out.println("Ángulo del volante: " + myCar.wheelsAngle + " grados");

        // 11. Girar el volante más de 45 grados o menos de -45 grados
        myCar.turnAngleOfWheels(50); // Más de 45 grados
        System.out.println("Ángulo del volante después de intentar girar más de 45 grados: " + myCar.wheelsAngle + " grados");
        myCar.turnAngleOfWheels(-50); // Menos de -45 grados
        System.out.println("Ángulo del volante después de intentar girar menos de -45 grados: " + myCar.wheelsAngle + " grados");

        // 12. Detener el coche y poner marcha atrás
        myCar.brake(); // Asegurarse de que el coche esté detenido
        myCar.setReverse(true);
        System.out.println("Marcha actual: " + myCar.gear);

        // 13. Intentar poner marcha atrás mientras el coche está en movimiento hacia adelante
        myCar.setReverse(false); // Quitar la marcha atrás
        myCar.accelerate(); // Acelerar hacia adelante
        myCar.setReverse(true); // Intentar poner marcha atrás
        System.out.println("Marcha actual después de intentar cambiar a reversa en movimiento: " + myCar.gear);
    }

}