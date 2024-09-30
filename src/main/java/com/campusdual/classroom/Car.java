package com.campusdual.classroom;

public class Car {
    public static final int MAX_SPEED = 120; // Velocidad máxima permitida
    public int speedometer = 0; // Velocidad actual
    public int tachometer = 0; // Tacómetro (rpm)
    public String gear = "N"; // Marcha actual ("N" para neutro, "R" para reversa)
    private boolean isRunning = false; // Estado del motor (encendido/apagado)
    public int wheelsAngle = 0; // Ángulo de las ruedas (de -45º a 45º)
    private boolean reverse = false; // Estado de la marcha atrás


    // Constructor vacío
    public Car() {
    }

    public Car(String toyota, String corolla, String gasoline) {
    }

    // Verifica si el tacómetro es mayor que cero (el coche está encendido)
    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }

    // Verifica si el tacómetro es igual a cero (el coche está apagado)
    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }

    // Encender el coche
    public void start() {
        if (!isRunning) {
            this.tachometer = 1000; // Establece el tacómetro a 1000 rpm al encender
            isRunning = true; // Cambia el estado a encendido
            System.out.println("Vehículo encendido");
        } else {
            System.out.println("El vehículo ya está encendido");
        }
    }

    // Apagar el coche
    public void stop() {
        if (this.speedometer == 0 && isRunning) {
            this.tachometer = 0; // Resetea el tacómetro al apagar
            isRunning = false; // Cambia el estado a apagado
            System.out.println("Vehículo apagado");
        } else if (this.speedometer > 0) {
            System.out.println("No se puede apagar el vehículo, primero tiene que estar detenido");
        } else {
            System.out.println("El vehículo ya está apagado");
        }
    }

    // Acelerar el coche
    public void accelerate() {
        if (isRunning) {
            if (this.speedometer + 5 <= MAX_SPEED) {
                this.speedometer += 5; // Aumenta la velocidad en 5 km/h
                this.tachometer += 500; // Aumenta el tacómetro en 500 rpm
                System.out.println("El vehículo acelera a " + this.speedometer + " km/h.");
            } else {
                this.speedometer = MAX_SPEED; // No puede exceder la velocidad máxima
                System.out.println("No se puede superar la velocidad máxima de " + MAX_SPEED + " km/h.");
            }
        } else {
            System.out.println("El vehículo debe estar encendido para acelerar.");
        }
    }

    // Frenar el coche
    public void brake() {
        if (this.speedometer - 5 >= 0) {
            this.speedometer -= 5; // Disminuye la velocidad en 5 km/h
            this.tachometer -= 500; // Disminuye el tacómetro en 500 rpm
            System.out.println("El vehículo frena a " + this.speedometer + " km/h.");
        } else {
            this.speedometer = 0; // No puede bajar de 0 km/h
            this.tachometer = 1000; // Mínimo del tacómetro cuando está encendido
            System.out.println("El vehículo está detenido.");
        }
    }

    // Girar el volante (ángulo de las ruedas)
    public void turnAngleOfWheels(int angle) {
        if (angle >= -45 && angle <= 45) {
            this.wheelsAngle = angle;
            System.out.println("El volante se gira a " + this.wheelsAngle + " grados.");
        } else if (angle > 45) {
            this.wheelsAngle = 45; // Máximo 45º
            System.out.println("El volante se gira al máximo permitido: 45 grados.");
        } else {
            this.wheelsAngle = -45; // Mínimo -45º
            System.out.println("El volante se gira al mínimo permitido: -45 grados.");
        }
    }

    // Establecer la marcha atrás
    public void setReverse(boolean reverse) {
        if (this.speedometer == 0) { // Sólo puede poner marcha atrás si está detenido
            this.reverse = reverse;
            if (reverse) {
                this.gear = "R"; // Cambia a reversa
                System.out.println("El coche está en marcha atrás.");
            } else {
                this.gear = "N"; // Vuelve a neutral
            }
        } else {
            System.out.println("No se puede poner marcha atrás mientras el coche está en movimiento.");
        }
    }
}
