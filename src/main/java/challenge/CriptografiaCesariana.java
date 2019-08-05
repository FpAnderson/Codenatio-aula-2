package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {

        if(texto.isEmpty()){
            throw new IllegalArgumentException();
        }

        if(texto.equals(null)){
            throw new NullPointerException();
        }

        texto = texto.toLowerCase();
        String criptografia = "";

        criptografia = texto.chars().map(c -> c + 3).toString();

        return criptografia;
    }

    @Override
    public String descriptografar(String texto) {

        if(texto.isEmpty()){
            throw new IllegalArgumentException();
        }

        if(texto.equals(null)){
            throw new NullPointerException();
        }

        texto = texto.toLowerCase();
        String descriptografia = "";
        for(int i = 0; i < texto.length(); i++){
            if(((int) texto.charAt(i)) >= 97 && ((int) texto.charAt(i)) <= 122){
                    descriptografia += (char) (texto.charAt(i) - 3);
            }else{
                descriptografia += texto.charAt(i);
            }
        }
        return descriptografia;
    }
}
