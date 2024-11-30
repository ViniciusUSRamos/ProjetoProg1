
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Matheus Dresch
 */
public class ItemCardapio extends Item {
    private final List<String> sabores;

    public ItemCardapio(String nome, double valor, List<String> sabores) {
        super(nome, valor);
        this.sabores = sabores;
    }

    public List<String> getSabores() {
        return sabores;
    }
}
