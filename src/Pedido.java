
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Matheus Dresch
 */
public class Pedido implements Serializable {
     private static final long serialVersionUID = 1L;
    
    private List<ItemPedido> itensPedido = new ArrayList<ItemPedido>();

    public List<ItemPedido> getItens() {
        return itensPedido;
    }
    
    public void addItem(ItemPedido itemPedido) {
        itensPedido.add(itemPedido);
    }
    
    public void removeItem(int itemPedido) {
        itensPedido.remove(itemPedido);
    }
    
    public double getValorTotal() {
        return itensPedido.stream()
                .mapToDouble(ItemPedido::getValor)
                .sum();
    }

    @Override
    public String toString() {
        return "Pedido{itensPedido=" + itensPedido + "}";
    }
}
