/**
 * Generics podem ser aplicados em uma classe ou interface.
 * <T> representa o tipo do retorno que será armazenado, assim a classe se torna bem geral e pode ser utilizada com várias coleções.
 * Vantagens: 
 *  Reutilização de código
 *  Segurança de tipo de dados.
 * 
 * T pode ser utilizado ao longo de toda classe
 */
public class Generics<T> {
    private T t;
    
    public void set(T t) { this.t = t; }
    public T get() { return t; }
}
