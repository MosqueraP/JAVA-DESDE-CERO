public class Usuario {
    int edad = 18;
    String nombreDeUsuario = "howard123";
    int seguidores = 300;

    // metodo principal de mi clase
    public static void main(String[] args) {
        // creacion de objeto
        Usuario usuarioDeReferencia = new Usuario();
        System.out.println(usuarioDeReferencia.nombreDeUsuario);
        System.out.println(usuarioDeReferencia);
    }

}
