public class Usuario {
    int edad = 18;
    String nombreDeUsuario = "howard123";
    int seguidores = 300;

    // método principal de mi clase
    public static void main(String[] args) {

        // creación de objeto
        Usuario usuarioDeReferencia = new Usuario();

        // llamar el objeto
        System.out.println(usuarioDeReferencia.nombreDeUsuario);
        System.out.println(usuarioDeReferencia);
    }

}
