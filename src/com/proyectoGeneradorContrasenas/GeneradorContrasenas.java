package src.com.proyectoGeneradorContrasenas;

import java.security.SecureRandom;

public class GeneradorContrasenas {
    /*
    Crea un generador de contraseñas que permita al usuario generar contraseñas
    seguras de diferentes longitudes y niveles de complejidad.
     */
    private static final String LETRAS_MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String LETRAS_MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMEROS = "0123456789";
    private static final String SIMBOLOS = "!@#$%^&*()_+-=[]{}|;':<>,.?/";

    private static final int FACIL = 1;
    private static final int MEDIO = 2;
    private static final int DIFICIL = 3;

    private static final SecureRandom secureRandom = new SecureRandom();

    // método generarContrasena
    private static String generarContrasena(int longitud, int complejidad) {
        StringBuilder contrasena = new StringBuilder();
        String caracteresPermitidos = "";

        switch (complejidad) {
            case FACIL:
                caracteresPermitidos = LETRAS_MINUSCULAS + LETRAS_MAYUSCULAS;
                break;
            case MEDIO:
                caracteresPermitidos = LETRAS_MINUSCULAS + LETRAS_MAYUSCULAS + NUMEROS;
                break;
            case DIFICIL:
                caracteresPermitidos = LETRAS_MINUSCULAS + LETRAS_MAYUSCULAS + NUMEROS + SIMBOLOS;
                break;
            default:
                throw new IllegalArgumentException("Nivel de complejidad invalido");
        }

        for(int i = 0; i<longitud; i++) {
            int indiceAleatorio = secureRandom.nextInt(caracteresPermitidos.length());
            char caracterAleatorio = caracteresPermitidos.charAt(indiceAleatorio);
            contrasena.append(caracterAleatorio);
        }


        return contrasena.toString();

    }

    public static void main(String[] args) {
        String contrasena = GeneradorContrasenas.generarContrasena(10, 3);
        System.out.println(contrasena);
    }

}
