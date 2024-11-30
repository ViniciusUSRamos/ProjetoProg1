/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Matheus Dresch
 */
public class ItemPedido extends Item{
     private static final long serialVersionUID = 1L;
    
    private String sabor;

    public ItemPedido(String nome, double valor) {
        super(nome, valor);
    }
    
    public ItemPedido(String nome, double valor, String sabor) {
        super(nome, valor);
        this.sabor = sabor;
    }
    
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
    public String getSabor() {
        return sabor;
    }

    @Override
    public String toString() {
        return "ItemPedido={nome=" + nome + ",valor=" + valor + ",sabor=" + sabor + "}";
    }
    
    public String toString(boolean formatado) {
        if (! formatado) return toString();
        
        if (sabor == null) return super.toString();
        
        return String.format("%s de %s", nome, sabor);
    }
}
