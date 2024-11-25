
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mathe
 */
public class TelaTotem extends javax.swing.JFrame {

    List<ItemCardapio> alimentos;
    Pedido pedido = new Pedido();
    
    int itemPedidoSelecionado;
    boolean modoEdicao = false;
    int indiceEdicao;
    
    File listaPedidosArquivo = new File("Pedidos.bin");
    
    /**
     * Creates new form TelaInicial
     */
    public TelaTotem() {
        initComponents();
        
        alimentos = new ArrayList<>();
        alimentos.add(new ItemCardapio("Baguete", 11.00f, List.of("Frango", "Salame")));
        alimentos.add(new ItemCardapio("Pastel", 5.50f, List.of("Frango", "Calabresa", "Frango c/ Catupiry")));
        alimentos.add(new ItemCardapio("Pizza", 22.00f, List.of("Quatro Queijos", "Frango c/ Catupiry", "Calabresa"))); 
        alimentos.add(new ItemCardapio("Enroladinho", 2.00f, List.of())); 
        alimentos.add(new ItemCardapio("Pão de Queijo", 1.50f, List.of())); 
        alimentos.add(new ItemCardapio("Wrap", 7.00f, List.of("Frango", "Rucula", "Salame")));
        alimentos.add(new ItemCardapio("Sanduíche", 4.00f, List.of())); 
        alimentos.add(new ItemCardapio("Bauru", 6.00f, List.of())); 
        alimentos.add(new ItemCardapio("Croissant", 3.00f, List.of()));
        
        for (ItemCardapio alimento: alimentos) {
            jAlimentoSelect.addItem(alimento.toString());
        }
        
        for (Pedido p : getPedidosSalvos()) {
            System.out.println(p.getValorTotal());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jDialog1 = new javax.swing.JDialog();
        jTela = new javax.swing.JTabbedPane();
        jTelaInicial = new javax.swing.JPanel();
        jTituloInicio = new javax.swing.JLabel();
        jSubtituloInicio = new javax.swing.JLabel();
        jNovoPedidoButton = new javax.swing.JButton();
        verPedidosButton = new javax.swing.JButton();
        jNovoPedido = new javax.swing.JPanel();
        jTitulo = new javax.swing.JLabel();
        jSubtitulo = new javax.swing.JLabel();
        jAlimentoLabel = new javax.swing.JLabel();
        jAlimentoSelect = new javax.swing.JComboBox<>();
        jSaborLabel = new javax.swing.JLabel();
        jSaborSelect = new javax.swing.JComboBox<>();
        jAddButton = new javax.swing.JButton();
        jListaPedidoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListaPedido = new javax.swing.JList<>();
        jExcluirItemButton = new javax.swing.JButton();
        jTotalPedidoLabel = new javax.swing.JLabel();
        jTotalPedido = new javax.swing.JFormattedTextField();
        jSalvarButton = new javax.swing.JButton();
        jVoltarButton = new javax.swing.JButton();
        jCancelarButton = new javax.swing.JButton();
        jVerPedidos = new javax.swing.JPanel();
        jTituloInicio1 = new javax.swing.JLabel();
        jSubtituloInicio1 = new javax.swing.JLabel();
        jVoltarButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPedidosList = new javax.swing.JList<>();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bar do Tiri");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(360, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTelaInicial.setName("Início"); // NOI18N

        jTituloInicio.setBackground(new java.awt.Color(255, 255, 255));
        jTituloInicio.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jTituloInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTituloInicio.setText("BAR DO TIRI");

        jSubtituloInicio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jSubtituloInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSubtituloInicio.setText("Bem-vindo(a)!");

        jNovoPedidoButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jNovoPedidoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/plus-custom.png"))); // NOI18N
        jNovoPedidoButton.setText("Novo Pedido");
        jNovoPedidoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                novoPedido(evt);
            }
        });

        verPedidosButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        verPedidosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/format-list-bulleted-custom.png"))); // NOI18N
        verPedidosButton.setText("Ver Pedidos");
        verPedidosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPedidos(evt);
            }
        });

        javax.swing.GroupLayout jTelaInicialLayout = new javax.swing.GroupLayout(jTelaInicial);
        jTelaInicial.setLayout(jTelaInicialLayout);
        jTelaInicialLayout.setHorizontalGroup(
            jTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTelaInicialLayout.createSequentialGroup()
                .addGroup(jTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTelaInicialLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTituloInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSubtituloInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jTelaInicialLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(verPedidosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNovoPedidoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 66, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jTelaInicialLayout.setVerticalGroup(
            jTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTelaInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTituloInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSubtituloInicio)
                .addGap(218, 218, 218)
                .addComponent(jNovoPedidoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verPedidosButton)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        jTela.addTab("Início", new javax.swing.ImageIcon(getClass().getResource("/Icons/home-custom.png")), jTelaInicial); // NOI18N

        jNovoPedido.setName("Início"); // NOI18N

        jTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jTitulo.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTitulo.setText("BAR DO TIRI");

        jSubtitulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSubtitulo.setText("Edi");

        jAlimentoLabel.setLabelFor(jAlimentoSelect);
        jAlimentoLabel.setText("Alimento:");

        jAlimentoSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizaSabores(evt);
            }
        });

        jSaborLabel.setLabelFor(jSaborSelect);
        jSaborLabel.setText("Sabor:");

        jAddButton.setText("Adicionar ao pedido");
        jAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionaItemPedido(evt);
            }
        });

        jListaPedidoLabel.setLabelFor(jScrollPane1);
        jListaPedidoLabel.setText("Itens do pedido:");

        jListaPedido.setModel(new DefaultListModel());
        jListaPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                itemPedidoSelecionado(evt);
            }
        });
        jScrollPane1.setViewportView(jListaPedido);

        jExcluirItemButton.setText("Excluir Item");
        jExcluirItemButton.setEnabled(false);
        jExcluirItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirItemPedido(evt);
            }
        });

        jTotalPedidoLabel.setLabelFor(jTotalPedido);
        jTotalPedidoLabel.setText("Total do pedido:");

        jTotalPedido.setEditable(false);
        jTotalPedido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        jSalvarButton.setText("Salvar");
        jSalvarButton.setEnabled(false);
        jSalvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarPedido(evt);
            }
        });

        jVoltarButton.setText("Voltar");
        jVoltarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaInicial(evt);
            }
        });

        jCancelarButton.setText("Cancelar pedido");
        jCancelarButton.setToolTipText("");
        jCancelarButton.setEnabled(false);
        jCancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarPedido(evt);
            }
        });

        javax.swing.GroupLayout jNovoPedidoLayout = new javax.swing.GroupLayout(jNovoPedido);
        jNovoPedido.setLayout(jNovoPedidoLayout);
        jNovoPedidoLayout.setHorizontalGroup(
            jNovoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jNovoPedidoLayout.createSequentialGroup()
                .addGroup(jNovoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jNovoPedidoLayout.createSequentialGroup()
                        .addGroup(jNovoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jNovoPedidoLayout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jTotalPedidoLabel))
                            .addGroup(jNovoPedidoLayout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 87, Short.MAX_VALUE))
                    .addGroup(jNovoPedidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jNovoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCancelarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSalvarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jVoltarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jAddButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSubtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jNovoPedidoLayout.createSequentialGroup()
                                .addGroup(jNovoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jAlimentoSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jAlimentoLabel))
                                .addGap(8, 8, 8)
                                .addGroup(jNovoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jNovoPedidoLayout.createSequentialGroup()
                                        .addComponent(jSaborLabel)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jSaborSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jNovoPedidoLayout.createSequentialGroup()
                                .addComponent(jListaPedidoLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jExcluirItemButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jNovoPedidoLayout.setVerticalGroup(
            jNovoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jNovoPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSubtitulo)
                .addGap(18, 18, 18)
                .addGroup(jNovoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSaborLabel)
                    .addComponent(jAlimentoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jNovoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAlimentoSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSaborSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAddButton)
                .addGap(18, 18, 18)
                .addComponent(jListaPedidoLabel)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jExcluirItemButton)
                .addGap(18, 18, 18)
                .addComponent(jTotalPedidoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(jCancelarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSalvarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jVoltarButton)
                .addGap(15, 15, 15))
        );

        jTitulo.getAccessibleContext().setAccessibleDescription("");

        jTela.addTab("Pedido", new javax.swing.ImageIcon(getClass().getResource("/Icons/plus-custom.png")), jNovoPedido); // NOI18N

        jVerPedidos.setName("Início"); // NOI18N

        jTituloInicio1.setBackground(new java.awt.Color(255, 255, 255));
        jTituloInicio1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jTituloInicio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTituloInicio1.setText("BAR DO TIRI");

        jSubtituloInicio1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jSubtituloInicio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSubtituloInicio1.setText("Pedidos");

        jVoltarButton1.setText("Voltar");
        jVoltarButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaInicialPedidos(evt);
            }
        });

        jPedidosList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPedidosList.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPedidosList.setModel(new DefaultListModel<String>()
        );
        jPedidosList.setAutoscrolls(false);
        jPedidosList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPedidosList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pedidoSelecionado(evt);
            }
        });
        jScrollPane3.setViewportView(jPedidosList);

        javax.swing.GroupLayout jVerPedidosLayout = new javax.swing.GroupLayout(jVerPedidos);
        jVerPedidos.setLayout(jVerPedidosLayout);
        jVerPedidosLayout.setHorizontalGroup(
            jVerPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jVerPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jVerPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTituloInicio1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(jSubtituloInicio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jVoltarButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jVerPedidosLayout.setVerticalGroup(
            jVerPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jVerPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTituloInicio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSubtituloInicio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jVoltarButton1)
                .addContainerGap())
        );

        jTela.addTab("Pedidos", new javax.swing.ImageIcon(getClass().getResource("/Icons/format-list-bulleted-custom.png")), jVerPedidos); // NOI18N

        getContentPane().add(jTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void telaInicial(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telaInicial
        pedido = new Pedido();
        
        atualizaListaPedido();
        
        this.jTela.setSelectedIndex(0);
    }//GEN-LAST:event_telaInicial

    private void novoPedido(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novoPedido
        jSubtitulo.setText("Novo pedido");
        
        this.jTela.setSelectedIndex(1);
    }//GEN-LAST:event_novoPedido

    private void atualizaSabores(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizaSabores
        ItemCardapio alimentoSelecionado = getItemCardapioSelecionado();
        
        jSaborSelect.removeAllItems();
        
        if (alimentoSelecionado.getSabores().isEmpty()) {
            jSaborSelect.setEnabled(false);
            return;
        }
        
        jSaborSelect.setEnabled(true);
        
        for (String sabor: alimentoSelecionado.getSabores()) {
            jSaborSelect.addItem(sabor);
        }
    }//GEN-LAST:event_atualizaSabores

    private void adicionaItemPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionaItemPedido
        ItemCardapio itemSelecionado = getItemCardapioSelecionado();
    
        ItemPedido itemPedido = new ItemPedido(itemSelecionado.getNome(), itemSelecionado.getValor());
        
        if (jSaborSelect.getSelectedIndex() >= 0) {
            String saborSelecionado = itemSelecionado.getSabores().get(jSaborSelect.getSelectedIndex());
            
            itemPedido.setSabor(saborSelecionado);
        }
        
        pedido.addItem(itemPedido);
        
        atualizaListaPedido();
    }//GEN-LAST:event_adicionaItemPedido

    private void itemPedidoSelecionado(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemPedidoSelecionado
        if (jListaPedido.getSelectedIndex() < 0) {
            jExcluirItemButton.setEnabled(false);
            return;
        }
        
        itemPedidoSelecionado = jListaPedido.getSelectedIndex();
        jExcluirItemButton.setEnabled(true);
    }//GEN-LAST:event_itemPedidoSelecionado

    private void excluirItemPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirItemPedido
        pedido.removeItem(itemPedidoSelecionado);
        
        jExcluirItemButton.setEnabled(false);
        
        atualizaListaPedido();
    }//GEN-LAST:event_excluirItemPedido

    private void salvarPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarPedido
        ArrayList<Pedido> pedidosSalvos = getPedidosSalvos();
      
        if (modoEdicao) {
            pedidosSalvos.set(indiceEdicao, pedido);
        } else {
            pedidosSalvos.add(pedido);
        }
        
        setPedidosSalvos(pedidosSalvos);

        alternaModoEdicao(false);
        
        pedido = new Pedido();
        atualizaListaPedido();
        jExcluirItemButton.setEnabled(false);
        
        emitePopupAviso("Pedido salvo com sucesso!" );
    }//GEN-LAST:event_salvarPedido

    private void verPedidos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPedidos
        this.jTela.setSelectedIndex(2);
        
        DefaultListModel<String> lista = (DefaultListModel<String>) jPedidosList.getModel();
        
        lista.removeAllElements();
        
        for (int i = 0; i < getPedidosSalvos().size(); i++) {
            lista.addElement(String.format("Pedido #%03d", i));
        }
    }//GEN-LAST:event_verPedidos

    private void telaInicialPedidos(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telaInicialPedidos
        telaInicial(evt);
    }//GEN-LAST:event_telaInicialPedidos

    private void pedidoSelecionado(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedidoSelecionado
        int indicePedido = jPedidosList.getSelectedIndex();
        
        alternaModoEdicao(indicePedido);
        pedido = getPedidosSalvos().get(indicePedido);
        atualizaListaPedido();
        
        jTela.setSelectedIndex(1);
    }//GEN-LAST:event_pedidoSelecionado

    private void cancelarPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarPedido
        pedido = new Pedido();
        
        if (modoEdicao) {
            alternaModoEdicao(false);
            
            ArrayList<Pedido> pedidos = getPedidosSalvos();
            
            pedidos.remove(indiceEdicao);
            
            setPedidosSalvos(pedidos);
        }
        
        atualizaListaPedido();
        
        emitePopupAviso("Pedido cancelado com sucesso!" );
    }//GEN-LAST:event_cancelarPedido
    
    private ArrayList<Pedido> getPedidosSalvos() {
        FileInputStream fis;
        ArrayList<Pedido> listaPedidos = new ArrayList<>();
        
        try {
            fis = new FileInputStream(listaPedidosArquivo);
            
            ObjectInputStream ois = new ObjectInputStream(fis);
            listaPedidos = (ArrayList<Pedido>) ois.readObject();
            
            ois.close();
            fis.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaTotem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(TelaTotem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listaPedidos;
    }
    
    private void setPedidosSalvos(ArrayList<Pedido> pedidos) {
        FileOutputStream fos;

        try {
            fos = new FileOutputStream(listaPedidosArquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(pedidos);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaTotem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaTotem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void atualizaListaPedido() {
        DefaultListModel<String> lista = (DefaultListModel<String>) jListaPedido.getModel();
        
        lista.removeAllElements();
        
        for (ItemPedido itemPedido : pedido.getItens()) {
            lista.addElement(itemPedido.toString(true));
        }
        
        jTotalPedido.setText(String.format("R$ %.2f", pedido.getValorTotal()));
        
        if (pedido.getItens().isEmpty()) {
            jSalvarButton.setEnabled(false);
            jCancelarButton.setEnabled(false);
            return;
        }
        
        jCancelarButton.setEnabled(true);
        jSalvarButton.setEnabled(true);
    }
    
    private ItemCardapio getItemCardapioSelecionado() {
        return alimentos.get(jAlimentoSelect.getSelectedIndex());
    }
    
    private void alternaModoEdicao(int indice) {
        indiceEdicao = indice;
        
        alternaModoEdicao(true);
    }
    
    private void alternaModoEdicao(boolean estado) {
        if (estado) {
            modoEdicao = true;
            jSubtitulo.setText(String.format("Editando pedido #%03d", indiceEdicao));
            return;
        }
        
        modoEdicao = false;
        jSubtitulo.setText("Novo pedido");
    }
    
    private void emitePopupAviso(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaTotem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTotem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTotem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTotem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTotem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddButton;
    private javax.swing.JLabel jAlimentoLabel;
    private javax.swing.JComboBox<String> jAlimentoSelect;
    private javax.swing.JButton jCancelarButton;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JButton jExcluirItemButton;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jListaPedido;
    private javax.swing.JLabel jListaPedidoLabel;
    private javax.swing.JPanel jNovoPedido;
    private javax.swing.JButton jNovoPedidoButton;
    private javax.swing.JList<String> jPedidosList;
    private javax.swing.JLabel jSaborLabel;
    private javax.swing.JComboBox<String> jSaborSelect;
    private javax.swing.JButton jSalvarButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jSubtitulo;
    private javax.swing.JLabel jSubtituloInicio;
    private javax.swing.JLabel jSubtituloInicio1;
    private javax.swing.JTabbedPane jTela;
    private javax.swing.JPanel jTelaInicial;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JLabel jTituloInicio;
    private javax.swing.JLabel jTituloInicio1;
    private javax.swing.JFormattedTextField jTotalPedido;
    private javax.swing.JLabel jTotalPedidoLabel;
    private javax.swing.JPanel jVerPedidos;
    private javax.swing.JButton jVoltarButton;
    private javax.swing.JButton jVoltarButton1;
    private javax.swing.JButton verPedidosButton;
    // End of variables declaration//GEN-END:variables
}