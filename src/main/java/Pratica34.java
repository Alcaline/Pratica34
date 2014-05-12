/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Exercício prático 4.
 * @author Guilherme Jacichen<gui_jaci@yahoo.com.br>
 */
public class Pratica34 {
    public static void main(String[] args) {
        long i = 0L;
        while(fatorial(i)>=0){
            System.out.println("Indice: "+i+"\nFatorial: "+fatorial(i));
            i++;
        }
        System.out.println(mdc(12L,24L)+"\n"+mdc(7L,5L));
    }

    public static long fatorial(long fArgs){
        if (fArgs == 1 || fArgs == 0)
            return 1L;
        else
            return fatorial(fArgs-1)*fArgs;
    }
    
    public static long mdc(long m, long n){
        if(n>m)
            return mdc(n,m);
        else if(n == 0)
            return m;
        else 
            return mdc(n, m%n);
    }
}
