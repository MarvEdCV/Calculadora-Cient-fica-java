
package proyecto1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class Principal {
    public static JPanel panelPrincipal, panelEcuacionCuadratica,panelCalculadora,panelBinomioCuadrado,panelDiferenciaDeCuadrados,
            panelSumaYDiferenciaDeCubos,panelSeno,panelCoseno,panelTangente,panelLongitudDeArco,panelSumaDeRiemann,panelFavoritos,panelCasosDeDerivacion,
            panelprueba,panelprueba1,panelCasosDeIntegracion,panelHistorial;
    public static Ventana ventanaPrincipal;
    public static JTextArea favs;
    public static Ventana ventanaEcuacionCuadratica,ventanaLongitudDeArco,ventanaFavoritos,ventanaCasosDeIntegracion,ventanaHistorial;
    public static Ventana ventanaCalculadora,ventanaSumaYDiferenciaDeCubos,ventanaCasosDeDerivacion;
    public static Ventana ventanaBinomioCuadrado,ventanaDiferenciaDeCuadrados,ventanaSeno,ventanaCoseno,ventanaTangente,ventanaSumaDeRiemann;
    public static JTextField variableAlCuadrado,variableLineal,x1,x2,resultadoCalculadora,constante;
    public static JTextField sumaYDiferenciaDeCubos, A2,AB,B2,signo,A,B,RESULTADO;
    public static JTextField A2DC,B2DC,ADC,BDC,AXDC,BXDC;
    public static JTextField A3,B3,ASDC,signoSDCX,BSDC,A2SDC,ABSDC,B2SDC;
    public static JTextField sen,cos,tan,rsen,rcos,rtan;
    public static JTextField angulo,radio,resultadoLongitudDeArco;
    public static JTextField limiteInferior,limiteSuperior,diferencial,resultadoSR;
    public static JComboBox funcion;
    public static JComboBox usen,ucos,utan,uLongitudDeArco,casosDeDerivacion,casosDeIntegracion,resultadoh;
    public static JButton guardarResultadoSeno,guardarResultadoCoseno,guardarResultadoTangente,calcularSeno,calcularCoseno,calcularTangente,guardarResultadoSR;
    public static JButton calcularLongitudDeArco,guardarResultadoLongitudDeArco,calcularEC,calcularSR,ordenar,ver,ver1;
    public static JComboBox signoSDC,resultado;
    public static JButton n1,n2,n3,n4,n5,n6,n7,n8,n9,n0,suma,resta,multiplicacion,division,factorial,raiz,potencia,calcular,limpiar,
            parentesis,raizn,partidox,guardarResultadoEC,guardarResultadoBC,guardarResultadoC;
    public static JButton calcularBC,guardarResultadoSDC,calcularSDC;
    public static JButton guardarResultadoDC,calcularDC,ordenarh;
    public static JTextArea def1,def2;
    //Atributos para calculos 
    public static double primerNumero,segundoNumero,tercerNumero;
    public static String operador;
    public static double senoa =0,cosenoa=0,tangentea,n=100;
    public static String res;
    public static String op;
    
    public static void main(String[] args) {
        crearVentanaPrincipal();
    }
    
    //Creo la ventana principal donde se veran todas las funciones
    static void crearVentanaPrincipal(){
        //Creando Ventana Principal
        ventanaPrincipal = new Ventana();
        ventanaPrincipal.setSize(1200,600);
        ventanaPrincipal.setTitle("Funciones Matematicas");
        ventanaPrincipal.setLocationRelativeTo(null);  
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventanaPrincipal.setVisible(true);
      
        iniciarComponentesVP();
        
        
    }
    
    //Metodo para iniciar todos los componentes del panel sobre la ventana principal
    static void iniciarComponentesVP(){
        colocarPanel();
        colocarEtiquetasVP();
        colocarBotonesVP();
    }
    
    //Crear un panel para colocar encima de la Ventana principal
    static void colocarPanel(){
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);//Desactivando el diseño por defecto para poder colocar componentes a mi gusto
        panelPrincipal.setBackground(Color.darkGray);
        ventanaPrincipal.getContentPane().add(panelPrincipal);//Agregando a la ventana principal el panel    
    }
    
    //Colocar Etiquetas
    static void colocarEtiquetasVP(){
        
        //Creando etiquetas de la fila 1 de la ventana Principal 
        JLabel calculadoraCientifica = new JLabel("CALCULADORA CIENTIFICA",SwingConstants.CENTER);
        calculadoraCientifica.setBounds(500,20,200,30);
        calculadoraCientifica.setFont(new Font("Agency FB",1,20));
        calculadoraCientifica.setForeground(Color.white);
        panelPrincipal.add(calculadoraCientifica);
        
        JLabel aritmetica = new JLabel("Aritmética",SwingConstants.CENTER);//Nombro la etiqueta y alineo el texto en el centro de la misma
        aritmetica.setBounds(10,50,70,30);
        aritmetica.setFont(new Font("Agency FB",1,18));
        aritmetica.setForeground(Color.white);
        panelPrincipal.add(aritmetica);
        
        JLabel algebra = new JLabel("Algebra",SwingConstants.CENTER);//Nombro la etiqueta y alineo el texto en el centro de la misma
        algebra.setBounds(230,50,70,30);
        algebra.setFont(new Font("Agency FB",1,18));
        algebra.setForeground(Color.white);
        panelPrincipal.add(algebra);
        
        JLabel trigonometria = new JLabel("Trigonometría",SwingConstants.CENTER);//Nombro la etiqueta y alineo el texto en el centro de la misma
        trigonometria.setBounds(450,50,90,30);
        trigonometria.setFont(new Font("Agency FB",1,18));
        trigonometria.setForeground(Color.white);
        panelPrincipal.add(trigonometria);
        
        JLabel calculo = new JLabel("Cálculo",SwingConstants.CENTER);//Nombro la etiqueta y alineo el texto en el centro de la misma
        calculo.setBounds(670,50,70,30);
        calculo.setFont(new Font("Agency FB",1,18));
        calculo.setForeground(Color.white);
        panelPrincipal.add(calculo);
        
        JLabel algebraLineal = new JLabel("Algebra lineal",SwingConstants.CENTER);//Nombro la etiqueta y alineo el texto en el centro de la misma
        algebraLineal.setBounds(900,50,90,30);
        algebraLineal.setFont(new Font("Agency FB",1,18));
        algebraLineal.setForeground(Color.white);
        panelPrincipal.add(algebraLineal);
        
        //Creando etiqutas de la fila 2 de la ventana Principal
        JLabel ecuaciones = new JLabel("Ecuaciones",SwingConstants.CENTER);//Nombro la etiqueta y alineo el texto en el centro de la misma
        ecuaciones.setBounds(255,75,70,30);
        ecuaciones.setFont(new Font("Agency FB",1,18));
        ecuaciones.setForeground(Color.white);
        panelPrincipal.add(ecuaciones);
        
        JLabel funcionesTrigonometricas = new JLabel("Funciones trigonométricas",SwingConstants.CENTER);//Nombro la etiqueta y alineo el texto en el centro de la misma
        funcionesTrigonometricas.setBounds(475,75,155,30);
        funcionesTrigonometricas.setFont(new Font("Agency FB",1,18));
        funcionesTrigonometricas.setForeground(Color.white);
        panelPrincipal.add(funcionesTrigonometricas);
        
        JLabel calculoDiferencial = new JLabel("Cálculo diferencial",SwingConstants.CENTER);//Nombro la etiqueta y alineo el texto en el centro de la misma
        calculoDiferencial.setBounds(695,75,110,30);
        calculoDiferencial.setFont(new Font("Agency FB",1,18));
        calculoDiferencial.setForeground(Color.white);
        panelPrincipal.add(calculoDiferencial);
        
        JLabel operacionesConMatrices = new JLabel("Operaciones con matrices",SwingConstants.CENTER);//Nombro la etiqueta y alineo el texto en el centro de la misma
        operacionesConMatrices.setBounds(925,75,165,30);
        operacionesConMatrices.setFont(new Font("Agency FB",1,18));
        operacionesConMatrices.setForeground(Color.white);
        panelPrincipal.add(operacionesConMatrices);
        
        //Creando etiquetas de la fila 4 de la ventana principal 
        JLabel calculoIntegral = new JLabel("Cálculo integral",SwingConstants.CENTER);//Nombro la etiqueta y alineo el texto en el centro de la misma
        calculoIntegral.setBounds(695,175,110,30);
        calculoIntegral.setFont(new Font("Agency FB",1,18));
        calculoIntegral.setForeground(Color.white);
        panelPrincipal.add(calculoIntegral);
        
        //Creando etiquetas de la fila 5 de la ventana principal 
        JLabel factorizacion = new JLabel("Factorización",SwingConstants.CENTER);//Nombro la etiqueta y alineo el texto en el centro de la misma
        factorizacion.setBounds(255,245,90,30);
        factorizacion.setFont(new Font("Agency FB",1,18));
        factorizacion.setForeground(Color.white);
        panelPrincipal.add(factorizacion);
        
        //Creando etiquetas de la fila 6 de la ventana principal
        JLabel angulos = new JLabel("Ángulos",SwingConstants.CENTER);//Nombro la etiqueta y alineo el texto en el centro de la misma
        angulos.setBounds(475,305,75,30);
        angulos.setFont(new Font("Agency FB",1,18));
        angulos.setForeground(Color.white);
        panelPrincipal.add(angulos);
        
        JLabel operacionesconMatrices = new JLabel("Operaciones con matrices",SwingConstants.CENTER);//Nombro la etiqueta y alineo el texto en el centro de la misma
        operacionesconMatrices.setBounds(925,305,165,30);
        operacionesconMatrices.setFont(new Font("Agency FB",1,18));
        operacionesconMatrices.setForeground(Color.white);
        panelPrincipal.add(operacionesconMatrices);
         
    }
    
    public static void colocarBotonesVP(){
        
        //Botones de la tercera fila de la ventana principal 
        JButton calculadora = new JButton("Calculadora");
        calculadora.setBounds(20,115,160,50);
        calculadora.setFont(new Font("Agency FB",1,18));
        calculadora.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               crearVentanaCalculadora();
            }
        });
        panelPrincipal.add(calculadora);
        
        JButton ecuacionCuadratica= new JButton("Ecuación cuadrática");
        ecuacionCuadratica.setBounds(265,115,160,50);
        ecuacionCuadratica.setFont(new Font("Agency FB",1,18));
        ecuacionCuadratica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearVentanaEcuacionCuadratica();
            }
        });
        panelPrincipal.add(ecuacionCuadratica);
        
        JButton seno= new JButton("Seno");
        seno.setBounds(485,115,160,50);
        seno.setFont(new Font("Agency FB",1,18));
        seno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               crearVentanaSeno();
            }
        });
        panelPrincipal.add(seno);
        
        JButton casosDeDerivacion= new JButton("Casos de derivación");
        casosDeDerivacion.setBounds(705,115,160,50);
        casosDeDerivacion.setFont(new Font("Agency FB",1,18));
        casosDeDerivacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearVentanaCasosDeDerivacion();
               
            }
        });
        
        panelPrincipal.add(casosDeDerivacion);
        
        JButton transpuesta= new JButton("Transpuesta");
        transpuesta.setBounds(935,115,160,50);
        transpuesta.setFont(new Font("Agency FB",1,18));
        panelPrincipal.add(transpuesta);
        
        //Botones de la cuarta fila de la ventana principal 
        JButton sistemaDeEcuaciones= new JButton("Sistena de\n ecuaciones");
        sistemaDeEcuaciones.setBounds(265,175,170,50);
        sistemaDeEcuaciones.setFont(new Font("Agency FB",1,18));
        panelPrincipal.add(sistemaDeEcuaciones);
        
        JButton coseno= new JButton("Coseno");
        coseno.setBounds(485,175,160,50);
        coseno.setFont(new Font("Agency FB",1,18));
        coseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearVentanaCoseno();
            }
        });
        panelPrincipal.add(coseno);
        
        JButton inversa= new JButton("Invesa");
        inversa.setBounds(935,175,160,50);
        inversa.setFont(new Font("Agency FB",1,18));
        panelPrincipal.add(inversa);
        
        //Botones de la quinta fila de la ventana principal 
        JButton tangente= new JButton("Tangente");
        tangente.setBounds(485,245,160,50);
        tangente.setFont(new Font("Agency FB",1,18));
        tangente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearVentanaTangente();
            }
        });
        panelPrincipal.add(tangente);
        
        JButton casosDeIntegracion= new JButton("Casos de integración");
        casosDeIntegracion.setBounds(705,245,160,50);
        casosDeIntegracion.setFont(new Font("Agency FB",1,18));
        casosDeIntegracion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               crearVentanaCasosDeIntegracion();
            }
        });
        panelPrincipal.add(casosDeIntegracion);
        
        JButton determinante= new JButton("Determinante");
        determinante.setBounds(935,245,160,50);
        determinante.setFont(new Font("Agency FB",1,18));
        panelPrincipal.add(determinante);
        
        //Botones de la sexta fila de la ventana principal 
        JButton binomioCuadrado = new JButton("Binomio cuadrado");
        binomioCuadrado.setBounds(265,305,170,50);
        binomioCuadrado.setFont(new Font("Agency FB",1,18));
        binomioCuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               crearVentanaBinomioCuadrado();
            }
        });
        panelPrincipal.add(binomioCuadrado);
        
        JButton sumasDeRiemann = new JButton("Sumas de Riemann");
        sumasDeRiemann.setBounds(705,305,160,50);
        sumasDeRiemann.setFont(new Font("Agency FB",1,18));
        sumasDeRiemann.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearVentanaSumaDeRiemann();
            }
        });
        panelPrincipal.add(sumasDeRiemann);
        
        //Botones de la septima fila de la ventana principal 
        JButton diferenciaDeCuadrados = new JButton("Diferencia de cuadrados");
        diferenciaDeCuadrados.setBounds(265,365,185,50);
        diferenciaDeCuadrados.setFont(new Font("Agency FB",1,18));
        diferenciaDeCuadrados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               crearVentanaDiferenciaDeCuadrados();
            }
        });
        panelPrincipal.add(diferenciaDeCuadrados);
        
        JButton longitudDeArco = new JButton("Longitud de arco");
        longitudDeArco.setBounds(485,365,160,50);
        longitudDeArco.setFont(new Font("Agency FB",1,18));
        longitudDeArco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearVentanaLongitudDeArco();
            }
        });
        panelPrincipal.add(longitudDeArco);
        
        JButton operacionesEntreMatrices = new JButton("Operanes entre matrices ");
        operacionesEntreMatrices.setBounds(935,365,190,50);
        operacionesEntreMatrices.setFont(new Font("Agency FB",1,18));
        panelPrincipal.add(operacionesEntreMatrices);
        
        //Botones de la octava fila de la ventana principal
        JButton sumaYDiferenciaDeCubos = new JButton("Suma y diferencia de cubos");
        sumaYDiferenciaDeCubos.setBounds(265,425,200,50);
        sumaYDiferenciaDeCubos.setFont(new Font("Agency FB",1,18));
        sumaYDiferenciaDeCubos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearVentanaSumaYDiferenciaDeCubos();
            }
        });
        panelPrincipal.add(sumaYDiferenciaDeCubos);
        
        //Botones de la novena fila de la ventana principal 
        JButton favoritos = new JButton("Favoritos");
        favoritos.setBounds(725,505,220,50);
        favoritos.setFont(new Font("Agency FB",1,18));
        favoritos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearVentanaFavoritos();
            }
        });
        panelPrincipal.add(favoritos);
        
        JButton historial = new JButton("Historial");
        historial.setBounds(955,505,220,50);
        historial.setFont(new Font("Agency FB",1,18));
        historial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearVentanaHistorial();
            }
        });
        panelPrincipal.add(historial);
    }
    
    //Creando Ventana, Panel,componentes y calculos para la Calculadora
        
        //Ventana
        static void crearVentanaCalculadora(){
           ventanaCalculadora = new Ventana();
           ventanaCalculadora.setSize(450,500);
           ventanaCalculadora.setTitle("Calculadora");
           ventanaCalculadora.setLocationRelativeTo(null);
           ventanaCalculadora.setResizable(false);
           ventanaCalculadora.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
           ventanaCalculadora.setVisible(true);
           iniciarComponentesCalculadora();
        }
        
        //Iniciando componentes
        static void iniciarComponentesCalculadora(){
           colocarPanelCalculadora();
           colocarCajasDeTextoCalculadora();
           colocarBotonesCalculadora();
        }
        //Creando Panel
        static void colocarPanelCalculadora(){
           panelCalculadora = new JPanel();
           panelCalculadora.setLayout(null);
           panelCalculadora.setBackground(Color.darkGray);
           ventanaCalculadora.getContentPane().add(panelCalculadora);
        }
        
        //Creando Cajas de texto
        static void colocarCajasDeTextoCalculadora(){
           resultadoCalculadora = new JTextField();
           resultadoCalculadora.setFont(new Font("Agency FB",1,25));
           resultadoCalculadora.setHorizontalAlignment(SwingConstants.RIGHT);
           resultadoCalculadora.setBounds(10,25,250,50);
           panelCalculadora.add(resultadoCalculadora);
        } 
        
        //Creando Botones
        static void colocarBotonesCalculadora(){
           
           
            //Botones fila 2   
           limpiar = new JButton("C");
           limpiar.setBounds(320,120,65,65);
           limpiar.setFont(new Font("Agency FB",1,25));
           limpiar.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   resultadoCalculadora.setText("");
                 }
           });
           panelCalculadora.add(limpiar);
           
           n1 = new JButton("1");
           n1.setBounds(10,125,55,55);
           n1.setFont(new Font("Agency FB",1,18));
           n1.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   resultadoCalculadora.setText(resultadoCalculadora.getText()+"1");
                 }
           });
           panelCalculadora.add(n1);
           
           n2 = new JButton("2");
           n2.setBounds(75,125,55,55);
           n2.setFont(new Font("Agency FB",1,18));
           n2.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   resultadoCalculadora.setText(resultadoCalculadora.getText()+"2");
                 }
           });
           panelCalculadora.add(n2);
           
           n3 = new JButton("3");
           n3.setBounds(140,125,55,55);
           n3.setFont(new Font("Agency FB",1,18));
           n3.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   resultadoCalculadora.setText(resultadoCalculadora.getText()+"3");
                 }
           });
           panelCalculadora.add(n3);
           
           suma = new JButton("+");
           suma.setBounds(205,125,55,55);
           suma.setFont(new Font("Agency FB",1,18));
           suma.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   primerNumero = Double.parseDouble(resultadoCalculadora.getText());
                   operador = "+";
                   resultadoCalculadora.setText("");
                  }
           });
           panelCalculadora.add(suma);
           
           //Botones fila 3
           n4 = new JButton("4");
           n4.setBounds(10,190,55,55);
           n4.setFont(new Font("Agency FB",1,18));
           n4.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   resultadoCalculadora.setText(resultadoCalculadora.getText()+"4");
                 }
           });
           panelCalculadora.add(n4);
           
           n5 = new JButton("5");
           n5.setBounds(75,190,55,55);
           n5.setFont(new Font("Agency FB",1,18));
           n5.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   resultadoCalculadora.setText(resultadoCalculadora.getText()+"5");
                 }
           });
           panelCalculadora.add(n5);
           
           n6 = new JButton("6");
           n6.setBounds(140,190,55,55);
           n6.setFont(new Font("Agency FB",1,18));
           n6.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   resultadoCalculadora.setText(resultadoCalculadora.getText()+"6");
                 }
           });
           panelCalculadora.add(n6);
           
           resta = new JButton("-");
           resta.setBounds(205,190,55,55);
           resta.setFont(new Font("Agency FB",1,18));
           resta.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   primerNumero = Double.parseDouble(resultadoCalculadora.getText());
                   operador = "-";
                   resultadoCalculadora.setText("");
                 }
           });
           panelCalculadora.add(resta);
        
           //Botones fila 4
           n7 = new JButton("7");
           n7.setBounds(10,255,55,55);
           n7.setFont(new Font("Agency FB",1,18));
           n7.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   resultadoCalculadora.setText(resultadoCalculadora.getText()+"7");
                 }
           });
           panelCalculadora.add(n7);
           
           n8 = new JButton("8");
           n8.setBounds(75,255,55,55);
           n8.setFont(new Font("Agency FB",1,18));
           n8.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   resultadoCalculadora.setText(resultadoCalculadora.getText()+"8");
                 }
           });
           panelCalculadora.add(n8);
           
           n9 = new JButton("9");
           n9.setBounds(140,255,55,55);
           n9.setFont(new Font("Agency FB",1,18));
           n9.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   resultadoCalculadora.setText(resultadoCalculadora.getText()+"9");
                 }
           });
           panelCalculadora.add(n9);
           
           multiplicacion = new JButton("*");
           multiplicacion.setBounds(205,255,55,55);
           multiplicacion.setFont(new Font("Agency FB",1,18));
           multiplicacion.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   primerNumero = Double.parseDouble(resultadoCalculadora.getText());
                   operador = "*";
                   resultadoCalculadora.setText("");
                 }
           });
           panelCalculadora.add(multiplicacion);
           
           //Botones fila 5
           char a= '\u221A';
           raizn = new JButton("n"+a);
           raizn.setBounds(10,320,55,55);
           raizn.setFont(new Font("Agency FB",1,18));
           raizn.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                 }
           });
           panelCalculadora.add(raizn);
           
           n0 = new JButton("0");
           n0.setBounds(75,320,55,55);
           n0.setFont(new Font("Agency FB",1,18));
           n0.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   resultadoCalculadora.setText(resultadoCalculadora.getText()+"0");
                 }
           });
           panelCalculadora.add(n0);
           
           parentesis = new JButton("("+"-"+")");
           parentesis.setBounds(140,320,55,55);
           parentesis.setFont(new Font("Agency FB",1,18));
           parentesis.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   resultadoCalculadora.setText(resultadoCalculadora.getText()+"-");
                   
                 }
           });
           panelCalculadora.add(parentesis);
           
           division = new JButton("/");
           division.setBounds(205,320,55,55);
           division.setFont(new Font("Agency FB",1,18));
           division.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   primerNumero = Double.parseDouble(resultadoCalculadora.getText());
                   operador = "/";
                   resultadoCalculadora.setText("");
                   
                 }
           });
           panelCalculadora.add(division);
           
           //Botones fila 6
          
           potencia = new JButton("^");
           potencia.setBounds(10,385,55,55);
           potencia.setFont(new Font("Agency FB",1,18));
           potencia.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   primerNumero = Double.parseDouble(resultadoCalculadora.getText());
                   operador = "^";
                   resultadoCalculadora.setText("");
                 }
           });
           panelCalculadora.add(potencia);
           
           raiz = new JButton(""+a);
           raiz.setBounds(75,385,55,55);
           raiz.setFont(new Font("Agency FB",1,18));
           raiz.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   primerNumero = Double.parseDouble(resultadoCalculadora.getText());
                   operador = "raiz";
                 }
           });
           panelCalculadora.add(raiz);
           
           partidox = new JButton("1/x");
           partidox.setBounds(140,385,55,55);
           partidox.setFont(new Font("Agency FB",1,18));
           partidox.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   primerNumero = Double.parseDouble(resultadoCalculadora.getText());
                   operador="1/x";
                 }
           });
           panelCalculadora.add(partidox);
           
           factorial = new JButton("!");
           factorial.setBounds(205,385,55,55);
           factorial.setFont(new Font("Agency FB",1,18));
           factorial.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   primerNumero = Double.parseDouble(resultadoCalculadora.getText());
                   operador = "!";
                 }
           });
           panelCalculadora.add(factorial);
           
           calcular = new JButton("Calcular");
           calcular.setBounds(310,45,100,30);
           calcular.setFont(new Font("Agency FB",1,18));
           calcular.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   Respuesta r = new Respuesta();
                   segundoNumero = Double.parseDouble(resultadoCalculadora.getText());
                   switch(operador){
                       case "+":
                            resultadoCalculadora.setText(Double.toString(primerNumero+segundoNumero));
                             r.escribirArchivoHistorial(resultadoCalculadora.getText(),primerNumero+"+"+segundoNumero);
                           break;
                       case "-":
                           resultadoCalculadora.setText(Double.toString(primerNumero-segundoNumero));
                           r.escribirArchivoHistorial(resultadoCalculadora.getText(),primerNumero+"-"+segundoNumero);
                           break;
                       case"*":
                           resultadoCalculadora.setText(Double.toString(primerNumero*segundoNumero));
                           r.escribirArchivoHistorial(resultadoCalculadora.getText(),primerNumero+"*"+segundoNumero);
                           break;
                       case"/":
                           if(segundoNumero==0){
                               resultadoCalculadora.setText("No puedes dividir por 0");
                               break;
                           }
                           resultadoCalculadora.setText(Double.toString(primerNumero/segundoNumero));
                            r.escribirArchivoHistorial(resultadoCalculadora.getText(),primerNumero+"/"+segundoNumero);
                           break;
                       case "^":
                           double res = 1;
                           for(int i=1; i<=segundoNumero;i++){
                               res = res*primerNumero;
                           }
                           resultadoCalculadora.setText(Double.toString(res));
                            r.escribirArchivoHistorial(resultadoCalculadora.getText(),primerNumero+"^"+segundoNumero);
                           break;
                       case "!":
                           double resf=1;
                           if(primerNumero<0){
                               resultadoCalculadora.setText("Imposible calcular facotorial de negativo");
                           }else{
                               while(primerNumero!=0){
                               resf = resf * primerNumero;
                               primerNumero--;
                           }
                           resultadoCalculadora.setText(Double.toString(resf));
                            r.escribirArchivoHistorial(resultadoCalculadora.getText(),"");    
                           }
                           break;
                       case "raiz":
                           double t,resr;
                           if(primerNumero<0){
                               primerNumero *= -1;
                               resr = primerNumero/2;
                           do{
                               t=resr;
                               resr = (t+(primerNumero/t))/2;
                           }while((t-resr)!= 0);
                           char p = '\u221A';
                           resultadoCalculadora.setText(Double.toString(resr)+"+/- i");
                           r.escribirArchivoHistorial(resultadoCalculadora.getText(),String.valueOf(p)+primerNumero);
                           }else{
                               resr = primerNumero/2;
                           do{
                               t=resr;
                               resr = (t+(primerNumero/t))/2;
                           }while((t-resr)!= 0);
                           char p = '\u221A';
                           resultadoCalculadora.setText(Double.toString(resr));
                           r.escribirArchivoHistorial(resultadoCalculadora.getText(),String.valueOf(p)+primerNumero);
                           }
                            break;
                       
                       case "1/x":
                           resultadoCalculadora.setText(Double.toString(1/primerNumero));
                           r.escribirArchivoHistorial(resultadoCalculadora.getText(),primerNumero+"^(-1)");
                          break;      
                   }
                 }
           });
           panelCalculadora.add(calcular);
           
           guardarResultadoC = new JButton("Guardar resultado");
           guardarResultadoC.setBounds(300,365,140,80);
           guardarResultadoC.setFont(new Font("Agency FB",1,18));
           guardarResultadoC.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                    Respuesta r = new Respuesta();
                    switch(operador){
                      case "+":
                            r.escribirArchivoFavoritos(resultadoCalculadora.getText(),primerNumero+"+"+segundoNumero);
                           break;
                       case "-":
                           r.escribirArchivoFavoritos(resultadoCalculadora.getText(),primerNumero+"-"+segundoNumero);
                           break;
                       case"*":
                           r.escribirArchivoFavoritos(resultadoCalculadora.getText(),primerNumero+"*"+segundoNumero);
                           break;
                       case"/":
                           if(segundoNumero==0){
                               resultadoCalculadora.setText("No puedes dividir por 0");
                               break;
                           }
                           r.escribirArchivoFavoritos(resultadoCalculadora.getText(),primerNumero+"/"+segundoNumero);
                           break;
                       case "^":
                           double res = 1;
                           for(int i=1; i<=segundoNumero;i++){
                               res = res*primerNumero;
                           }
                           r.escribirArchivoFavoritos(resultadoCalculadora.getText(),primerNumero+"^"+segundoNumero);
                           break;
                       case "!":
                           double resf=1;
                           if(primerNumero<0){
                               resultadoCalculadora.setText("Imposible calcular facotorial de negativo");
                           }else{
                               while(primerNumero!=0){
                               resf = resf * primerNumero;
                               primerNumero--;
                           }
                           r.escribirArchivoFavoritos(resultadoCalculadora.getText(),"");
                               
                           }     
                           break;
                       case "raiz":
                           double t,resr;
                           if(primerNumero<0){
                               primerNumero *= -1;
                               resr = primerNumero/2;
                           do{
                               t=resr;
                               resr = (t+(primerNumero/t))/2;
                           }while((t-resr)!= 0);
                           char p = '\u221A';
                            r.escribirArchivoFavoritos(resultadoCalculadora.getText(),String.valueOf(p)+primerNumero);
                           }else{
                               resr = primerNumero/2;
                           do{
                               t=resr;
                               resr = (t+(primerNumero/t))/2;
                           }while((t-resr)!= 0);
                            char p = '\u221A';
                            r.escribirArchivoFavoritos(resultadoCalculadora.getText(),String.valueOf(p)+primerNumero);
                           }
                            break;
                       
                       case "1/x":
                           r.escribirArchivoFavoritos(resultadoCalculadora.getText(),primerNumero+"^(-1)");
                          break;      
                   }
                    
                
                 }
           });
           panelCalculadora.add(guardarResultadoC);
       }
        
    //Creando Ventana, Panel,componentes y calculos para Ecuacion Cuadratica 
    
       //Ventana
       static void crearVentanaEcuacionCuadratica(){
           ventanaEcuacionCuadratica = new Ventana();
           ventanaEcuacionCuadratica.setSize(450,500);
           ventanaEcuacionCuadratica.setTitle("Ecuación cuadrática");
           ventanaEcuacionCuadratica.setLocationRelativeTo(null);
           ventanaEcuacionCuadratica.setResizable(false);
           ventanaEcuacionCuadratica.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
           ventanaEcuacionCuadratica.setVisible(true);
           iniciarComponentesEcuacionCuadratica();
       }
       
       //Iniciando Componentes
       static void iniciarComponentesEcuacionCuadratica(){
           colocarPanelEcuacionCuadratica();
           colocarEtiquetasEcuaionCuadratica();
           colocarCajasDeTextoEcuacionCuadratica();
           colocarBotonesEcuacionCuadratica();
           
       }
       
       //Creando Panel
       static void colocarPanelEcuacionCuadratica(){
           panelEcuacionCuadratica = new JPanel();
           panelEcuacionCuadratica.setLayout(null);
           panelEcuacionCuadratica.setBackground(Color.darkGray);
           ventanaEcuacionCuadratica.getContentPane().add(panelEcuacionCuadratica);
       }
       
       //Creando Etiquetas
       static void colocarEtiquetasEcuaionCuadratica(){
           //Etiqueta fila 1
            JLabel ecuacionCuadratica = new JLabel("Ecuación cuadrática",SwingConstants.CENTER);
            ecuacionCuadratica.setBounds(20,20,150,30);
            ecuacionCuadratica.setFont(new Font("Agency FB",1,20));
            ecuacionCuadratica.setForeground(Color.white);
            panelEcuacionCuadratica.add(ecuacionCuadratica);
            
            //Etiquetas fila 2
            JLabel variableAlCuadradoe = new JLabel("x^2 +",SwingConstants.CENTER);
            variableAlCuadradoe.setBounds(105,85,45,30);
            variableAlCuadradoe.setFont(new Font("Agency FB",1,20));
            variableAlCuadradoe.setForeground(Color.white);
            panelEcuacionCuadratica.add(variableAlCuadradoe);
            
            JLabel variableLineale = new JLabel("x +",SwingConstants.CENTER);
            variableLineale.setBounds(210,85,45,30);
            variableLineale.setFont(new Font("Agency FB",1,20));
            variableLineale.setForeground(Color.white);
            panelEcuacionCuadratica.add(variableLineale);
            
            //Etiquetas fila 3
            JLabel resultado = new JLabel("Resultado",SwingConstants.CENTER);
            resultado.setBounds(20,150,150,30);
            resultado.setFont(new Font("Agency FB",1,20));
            resultado.setForeground(Color.white);
            panelEcuacionCuadratica.add(resultado);
            
            //Etiquetas fila 4 
            JLabel x1e = new JLabel("X1",SwingConstants.CENTER);
            x1e.setBounds(50,215,50,30);
            x1e.setFont(new Font("Agency FB",1,20));
            x1e.setForeground(Color.white);
            panelEcuacionCuadratica.add(x1e);
            
            //Etiqutas fila 5 
            JLabel x2 = new JLabel("X2",SwingConstants.CENTER);
            x2.setBounds(53,260,50,30);
            x2.setFont(new Font("Agency FB",1,20));
            x2.setForeground(Color.white);
            panelEcuacionCuadratica.add(x2);
            
            
       }
       
       //Creando Cajas de Texto
       static void colocarCajasDeTextoEcuacionCuadratica(){
           
           //Cajas fila 2 
           variableAlCuadrado = new JTextField();
           variableAlCuadrado.setBounds(50,70,50,50);
           variableAlCuadrado.setFont(new Font("Agency FB",1,18));
           panelEcuacionCuadratica.add(variableAlCuadrado);
           
           variableLineal = new JTextField();
           variableLineal.setBounds(155,70,50,50);
           variableLineal.setFont(new Font("Agency FB",1,18));
           panelEcuacionCuadratica.add(variableLineal);
           
           constante = new JTextField();
           constante.setBounds(260,70,50,50);
           constante.setFont(new Font("Agency FB",1,18));
           panelEcuacionCuadratica.add(constante);
           
           //Cajas fila 4 
           x1 = new JTextField();
           x1.setBounds(110,215,70,35);
           x1.setFont(new Font("Agency FB",1,18));
           panelEcuacionCuadratica.add(x1);    
           
           //Cajas fila 5 
           x2 = new JTextField();
           x2.setBounds(110,260,70,35);
           x2.setFont(new Font("Agency FB",1,18));
           panelEcuacionCuadratica.add(x2);
        
        }
       
       //Creando Botones
       static void colocarBotonesEcuacionCuadratica(){
           //Botones fila 4
           calcularEC = new JButton("Calcular");
           calcularEC.setBounds(250,215,160,50);
           calcularEC.setFont(new Font("Agency FB",1,18));
           calcularEC.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   double aux,t,resr;
                   primerNumero = Double.parseDouble(variableAlCuadrado.getText());
                   segundoNumero = Double.parseDouble(variableLineal.getText());
                   tercerNumero = Double.parseDouble(constante.getText());
                   aux = ((segundoNumero*segundoNumero)-(4*primerNumero*tercerNumero));
                   System.out.println(aux);
                   if(aux>0){
                       resr = aux/2;
                       do{
                           t = resr;
                           resr = (t+(aux/t))/2;
                       }while((t-resr)!=0);
                       x1.setText(Double.toString(((-segundoNumero)+resr)/(2*primerNumero)));
                       x2.setText(Double.toString(((-segundoNumero)-resr)/(2*primerNumero)));
                        Respuesta r = new Respuesta();
                    r.escribirArchivoHistorial("x1:"+x1.getText()+"-x2:"+x2.getText(),variableAlCuadrado.getText()+"x^2 +/-"+variableLineal.getText()+"x +/-"+constante.getText());
                   }else{
                       aux *=-1;
                       resr = aux/2;
                       do{
                           t = resr;
                           resr = (t+(aux/t))/2;
                       }while((t-resr)!=0);
                       x1.setText(Double.toString((-segundoNumero)/(2*primerNumero))+"+"+Double.toString(resr/(2*primerNumero))+"i");
                       x2.setText(Double.toString((-segundoNumero)/(2*primerNumero))+"-"+Double.toString(resr/(2*primerNumero))+"i");
                        Respuesta r = new Respuesta();
                    r.escribirArchivoHistorial("x1:"+x1.getText()+"-x2:"+x2.getText(),variableAlCuadrado.getText()+"x^2 +/-"+variableLineal.getText()+"x +/-"+constante.getText());
                   }
            }
           });
           panelEcuacionCuadratica.add(calcularEC);
           
           //Boton fila 6 
           guardarResultadoEC = new JButton("Guardar resultado ✧");
           guardarResultadoEC.setBounds(110,315,250,50);
           guardarResultadoEC.setFont(new Font("Agency FB",1,18));
           guardarResultadoEC.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                  Respuesta r = new Respuesta();
                    r.escribirArchivoFavoritos("x1:"+x1.getText()+"-x2:"+x2.getText(),variableAlCuadrado.getText()+"x^2 +/-"+variableLineal.getText()+"x +/-"+constante.getText());
               }
           });
           panelEcuacionCuadratica.add(guardarResultadoEC);
        }
    
     //Creando Ventana, Panel, compontents y calculos para Binomio al cuadrado
       
       //Ventana
       static void crearVentanaBinomioCuadrado(){
           ventanaBinomioCuadrado = new Ventana();
           ventanaBinomioCuadrado.setSize(450,500);
           ventanaBinomioCuadrado.setTitle("Binomio al Cuadrado");
           ventanaBinomioCuadrado.setLocationRelativeTo(null);
           ventanaBinomioCuadrado.setResizable(false);
           ventanaBinomioCuadrado.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
           ventanaBinomioCuadrado.setVisible(true);
           iniciarComponentesBinomioCuadrado();
       }
       
       //Iniciando Componentes
       static void iniciarComponentesBinomioCuadrado(){
           colocarPanelBinomioCuadrado();
           colocarEtiquetasBinomioCuadrado();
           colocarCajasDeTextoBinomioCuadrado();
           colocarBotonesBinomioCuadrado();
       }
       
       //Creando Panel
       static void colocarPanelBinomioCuadrado(){
           panelBinomioCuadrado = new JPanel();
           panelBinomioCuadrado.setLayout(null);
           panelBinomioCuadrado.setBackground(Color.darkGray);
           ventanaBinomioCuadrado.getContentPane().add(panelBinomioCuadrado);
       }
       
       //Creando Etiquetas
       static void colocarEtiquetasBinomioCuadrado(){
           
           //Etiquetas fila 1 
            JLabel sumaYDiferenciaDeCubos = new JLabel("Suma y diferencia de cubos",SwingConstants.CENTER);
            sumaYDiferenciaDeCubos.setBounds(20,20,190,30);
            sumaYDiferenciaDeCubos.setFont(new Font("Agency FB",1,20));
            sumaYDiferenciaDeCubos.setForeground(Color.white);
            panelBinomioCuadrado.add(sumaYDiferenciaDeCubos);
            
            //Etiquetas fila 2 
            JLabel A2 = new JLabel("A^2+",SwingConstants.CENTER);
            A2.setBounds(150,75,35,35);
            A2.setFont(new Font("Agency FB",1,20));
            A2.setForeground(Color.white);
            panelBinomioCuadrado.add(A2);
            
            JLabel AB = new JLabel("AB+",SwingConstants.CENTER);
            AB.setBounds(235,75,35,35);
            AB.setFont(new Font("Agency FB",1,20));
            AB.setForeground(Color.white);
            panelBinomioCuadrado.add(AB);
            
            JLabel B2 = new JLabel("B^2",SwingConstants.CENTER);
            B2.setBounds(320,75,35,35);
            B2.setFont(new Font("Agency FB",1,20));
            B2.setForeground(Color.white);
            panelBinomioCuadrado.add(B2);
            
            //Etiquetas fila 3 
            JLabel resultado = new JLabel("Resultado",SwingConstants.CENTER);
            resultado.setBounds(50,135,80,30);
            resultado.setFont(new Font("Agency FB",1,20));
            resultado.setForeground(Color.white);
            panelBinomioCuadrado.add(resultado);
            
            //Etiquetas fila 4 
            JLabel pi = new JLabel("(",SwingConstants.CENTER);
            pi.setBounds(120,190,35,35);
            pi.setFont(new Font("Agency FB",1,20));
            pi.setForeground(Color.white);
            panelBinomioCuadrado.add(pi);
            
            JLabel pd = new JLabel(")^2",SwingConstants.CENTER);
            pd.setBounds(345,190,35,35);
            pd.setFont(new Font("Agency FB",1,20));
            pd.setForeground(Color.white);
            panelBinomioCuadrado.add(pd);
            
            JLabel A = new JLabel("A",SwingConstants.CENTER);
            A.setBounds(195,190,35,35);
            A.setFont(new Font("Agency FB",1,20));
            A.setForeground(Color.white);
            panelBinomioCuadrado.add(A);
            
            JLabel B = new JLabel("B",SwingConstants.CENTER);
            B.setBounds(320,190,35,35);
            B.setFont(new Font("Agency FB",1,20));
            B.setForeground(Color.white);
            panelBinomioCuadrado.add(B);
            
            
            
       }
       
      
       //Creando Cajas de Texto
       static void colocarCajasDeTextoBinomioCuadrado(){
           
           //Cajas de texto fila 2 
           A2 = new JTextField();
           A2.setBounds(105,70,40,40);
           A2.setFont(new Font("Agency FB",1,18));
           panelBinomioCuadrado.add(A2);
          
           AB = new JTextField();
           AB.setBounds(190,70,40,40);
           AB.setFont(new Font("Agency FB",1,18));
           panelBinomioCuadrado.add(AB);
           
           B2 = new JTextField();
           B2.setBounds(275,70,40,40);
           B2.setFont(new Font("Agency FB",1,18));
           panelBinomioCuadrado.add(B2);
           
           //Cajas de texto fila 4
           A = new JTextField();
           A.setBounds(150,185,40,40);
           A.setFont(new Font("Agency FB",1,18));
           panelBinomioCuadrado.add(A);
           
           signo = new JTextField();
           signo.setBounds(235,186,35,35);
           signo.setFont(new Font("Agency FB",1,18));
           panelBinomioCuadrado.add(signo);
           
           B = new JTextField();
           B.setBounds(275,185,40,40);
           B.setFont(new Font("Agency FB",1,18));
           panelBinomioCuadrado.add(B); 
       }
       
       static void colocarBotonesBinomioCuadrado(){
           //Botones fila 5
            
           
           calcularBC = new JButton("Calcular");
           calcularBC.setBounds(250,340,90,40);
           calcularBC.setFont(new Font("Agency FB",1,18));
           calcularBC.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   primerNumero = Double.parseDouble(A2.getText());
                   segundoNumero = Double.parseDouble(AB.getText());
                   tercerNumero = Double.parseDouble(B2.getText());
                  if(segundoNumero<0){
                       segundoNumero *=-1;
                       signo.setText("-");
                   }else{
                       signo.setText("+");
                   }
                  double a = Double.parseDouble(raizCuadrada(primerNumero));
                  double b = Double.parseDouble(raizCuadrada(tercerNumero));
                  
                   if(segundoNumero==(2)*a*b){
                       A.setText(raizCuadrada(primerNumero));
                       B.setText(raizCuadrada(tercerNumero));
                       Respuesta r = new Respuesta();
                    r.escribirArchivoHistorial("("+A.getText()+"A"+signo.getText()+B.getText()+"B)^2",""
                            + "("+primerNumero+"A^2"+signo.getText()+segundoNumero+"AB"+tercerNumero+"B^2)");
                   }else{
                       JOptionPane.showMessageDialog(null, "Lo ingresado no es un trinomio cuadrado perfecto");
                   }     
                }
           });
           panelBinomioCuadrado.add(calcularBC);
           
           guardarResultadoBC = new JButton("Guardar resultado");
            guardarResultadoBC.setBounds(25,340,160,50);
            guardarResultadoBC.setFont(new Font("Agency FB",1,18));
            guardarResultadoBC.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Respuesta r = new Respuesta();
                    r.escribirArchivoFavoritos("("+A.getText()+"A"+signo.getText()+B.getText()+"B)^2",""
                            + "("+primerNumero+"A^2"+signo.getText()+segundoNumero+"AB"+tercerNumero+"B^2)");
                 }
            });
            panelBinomioCuadrado.add(guardarResultadoBC);
       }
       
      //Creando Ventana, Panel,componentes y calculos para Diferencia de Cuadrados
       
       //Ventana
       static void crearVentanaDiferenciaDeCuadrados(){
           ventanaDiferenciaDeCuadrados = new Ventana();
           ventanaDiferenciaDeCuadrados.setSize(450,500);
           ventanaDiferenciaDeCuadrados.setTitle("Diferencia de cuadrados");
           ventanaDiferenciaDeCuadrados.setLocationRelativeTo(null);
           ventanaDiferenciaDeCuadrados.setResizable(false);
           ventanaDiferenciaDeCuadrados.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
           ventanaDiferenciaDeCuadrados.setVisible(true);
           iniciarComponentesDiferenciaDeCuadrados();
       
} 
       
        //Iniciando Componentes
       static void iniciarComponentesDiferenciaDeCuadrados(){
           colocarPanelDiferenciaDeCuadrados();
           colocarEtiquetasDiferenciaDeCuadrados();
           colocarCajasDeTextoDiferenciaDeCuadrados();
           colocarBotonesDiferenciaDeCuadrados();
       }
       
       //Creando Panel
       static void colocarPanelDiferenciaDeCuadrados(){
           panelDiferenciaDeCuadrados = new JPanel();
           panelDiferenciaDeCuadrados.setLayout(null);
           panelDiferenciaDeCuadrados.setBackground(Color.darkGray);
           ventanaDiferenciaDeCuadrados.getContentPane().add(panelDiferenciaDeCuadrados);
       }
       
       //Creando Etiquetas 
       static void colocarEtiquetasDiferenciaDeCuadrados(){
           //Etiquetas fila 1 
            JLabel diferenciaDeCuadrados = new JLabel("Diferencia de cuadrados",SwingConstants.CENTER);
            diferenciaDeCuadrados.setBounds(20,20,190,30);
            diferenciaDeCuadrados.setFont(new Font("Agency FB",1,20));
            diferenciaDeCuadrados.setForeground(Color.white);
            panelDiferenciaDeCuadrados.add(diferenciaDeCuadrados);
            
            //Etiquetas fila 2 
            JLabel A2DC = new JLabel("A^2-",SwingConstants.CENTER);
            A2DC.setBounds(150,75,35,35);
            A2DC.setFont(new Font("Agency FB",1,20));
            A2DC.setForeground(Color.white);
            panelDiferenciaDeCuadrados.add(A2DC);
            
            JLabel B2DC = new JLabel("B^2",SwingConstants.CENTER);
            B2DC.setBounds(235,75,35,35);
            B2DC.setFont(new Font("Agency FB",1,20));
            B2DC.setForeground(Color.white);
            panelDiferenciaDeCuadrados.add(B2DC);
            
            //Etiquetas fila 3 
            JLabel resultado = new JLabel("Resultado",SwingConstants.CENTER);
            resultado.setBounds(50,135,80,30);
            resultado.setFont(new Font("Agency FB",1,20));
            resultado.setForeground(Color.white);
            panelDiferenciaDeCuadrados.add(resultado);
            
            //Etiquetas fila 4
            JLabel pi = new JLabel("(",SwingConstants.CENTER);
            pi.setBounds(50,215,10,30);
            pi.setFont(new Font("Agency FB",1,20));
            pi.setForeground(Color.white);
            panelDiferenciaDeCuadrados.add(pi);
            
            JLabel A = new JLabel("A+",SwingConstants.CENTER);
            A.setBounds(110,215,20,30);
            A.setFont(new Font("Agency FB",1,20));
            A.setForeground(Color.white);
            panelDiferenciaDeCuadrados.add(A);
            
            JLabel B = new JLabel("B )  (",SwingConstants.CENTER);
            B.setBounds(185,215,40,30);
            B.setFont(new Font("Agency FB",1,20));
            B.setForeground(Color.white);
            panelDiferenciaDeCuadrados.add(B);
            
            JLabel AXDC = new JLabel("A - ",SwingConstants.CENTER);
            AXDC.setBounds(270,215,40,30);
            AXDC.setFont(new Font("Agency FB",1,20));
            AXDC.setForeground(Color.white);
            panelDiferenciaDeCuadrados.add(AXDC);
            
            JLabel BXDC = new JLabel("B )",SwingConstants.CENTER);
            BXDC.setBounds(345,215,40,30);
            BXDC.setFont(new Font("Agency FB",1,20));
            BXDC.setForeground(Color.white);
            panelDiferenciaDeCuadrados.add(BXDC);
       }
       
       //Creando Cajas de texto
       static void colocarCajasDeTextoDiferenciaDeCuadrados(){
           //Cajas de texto fila 2 
           A2DC = new JTextField();
           A2DC.setBounds(105,70,40,40);
           A2DC.setFont(new Font("Agency FB",1,18));
           panelDiferenciaDeCuadrados.add(A2DC);
           
           B2DC = new JTextField();
           B2DC.setBounds(190,70,40,40);
           B2DC.setFont(new Font("Agency FB",1,18));
           panelDiferenciaDeCuadrados.add(B2DC);
           
           ADC = new JTextField();
           ADC.setBounds(65,205,40,40);
           ADC.setFont(new Font("Agency FB",1,18));
           panelDiferenciaDeCuadrados.add(ADC);
           
           BDC = new JTextField();
           BDC.setBounds(140,205,40,40);
           BDC.setFont(new Font("Agency FB",1,18));
           panelDiferenciaDeCuadrados.add(BDC);
           
           AXDC = new JTextField();
           AXDC.setBounds(230,205,40,40);
           AXDC.setFont(new Font("Agency FB",1,18));
           panelDiferenciaDeCuadrados.add(AXDC);
           
           BXDC = new JTextField();
           BXDC.setBounds(305,205,40,40);
           BXDC.setFont(new Font("Agency FB",1,18));
           panelDiferenciaDeCuadrados.add(BXDC);         
       }
       
       //Creando botones 
       static void colocarBotonesDiferenciaDeCuadrados(){
           //Botones fila 5
           calcularDC = new JButton("Calcular");
           calcularDC.setBounds(250,340,90,40);
           calcularDC.setFont(new Font("Agency FB",1,18));
           calcularDC.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   primerNumero = Double.parseDouble(A2DC.getText());
                   segundoNumero = Double.parseDouble(B2DC.getText());
                   if(Double.parseDouble(raizCuadrada(primerNumero))%1==0 && Double.parseDouble(raizCuadrada(segundoNumero))%1==0 ){
                    ADC.setText(raizCuadrada(primerNumero));
                    AXDC.setText(raizCuadrada(primerNumero));
                    
                    BDC.setText(raizCuadrada(segundoNumero));
                    BXDC.setText(raizCuadrada(segundoNumero));
                     Respuesta r = new Respuesta();
                    r.escribirArchivoHistorial("("+ADC.getText()+"+"+BDC.getText()+")("+AXDC.getText()+"-"+BXDC.getText()+")","("
                    + ""+primerNumero+"^2)-("+segundoNumero+"^2)");
                   }else{
                       JOptionPane.showMessageDialog(null, "Alguno o los dos numeros ingresados no tiene raiz exacta");
                   }  }
           });
           panelDiferenciaDeCuadrados.add(calcularDC);
           
           guardarResultadoDC = new JButton("Guardar resultado");
            guardarResultadoDC.setBounds(25,340,160,50);
            guardarResultadoDC.setFont(new Font("Agency FB",1,18));
            guardarResultadoDC.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Respuesta r = new Respuesta();
                    r.escribirArchivoFavoritos("("+ADC.getText()+"+"+BDC.getText()+")("+AXDC.getText()+"-"+BXDC.getText()+")","("
                    + ""+primerNumero+"^2)-("+segundoNumero+"^2)");
                 }
            });
            panelDiferenciaDeCuadrados.add(guardarResultadoDC);
           
           
       }
       
       //Creando Ventana, Panel,componentes y calculos para Suma y Diferencia de Cubos
       static void crearVentanaSumaYDiferenciaDeCubos(){
           //Ventana 
           ventanaSumaYDiferenciaDeCubos = new Ventana();
           ventanaSumaYDiferenciaDeCubos.setSize(550,350);
           ventanaSumaYDiferenciaDeCubos.setTitle("Suma y diferencia de cubos");
           ventanaSumaYDiferenciaDeCubos.setLocationRelativeTo(null);
           ventanaSumaYDiferenciaDeCubos.setResizable(false);
           ventanaSumaYDiferenciaDeCubos.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
           ventanaSumaYDiferenciaDeCubos.setVisible(true);
           
           //Panel 
           panelSumaYDiferenciaDeCubos = new JPanel();
           panelSumaYDiferenciaDeCubos.setLayout(null);
           panelSumaYDiferenciaDeCubos.setBackground(Color.darkGray);
           ventanaSumaYDiferenciaDeCubos.getContentPane().add(panelSumaYDiferenciaDeCubos);
           
           //Componentes fila 1
            JLabel sumaYDiferenciaDeCubos = new JLabel("Suma y diferencia de cubos",SwingConstants.CENTER);
            sumaYDiferenciaDeCubos.setBounds(20,20,190,30);
            sumaYDiferenciaDeCubos.setFont(new Font("Agency FB",1,20));
            sumaYDiferenciaDeCubos.setForeground(Color.white);
            panelSumaYDiferenciaDeCubos.add(sumaYDiferenciaDeCubos);
            
           //Componentes fila 2 
            A3 = new JTextField();
            A3.setBounds(105,70,40,40);
            A3.setFont(new Font("Agency FB",1,20));
            panelSumaYDiferenciaDeCubos.add(A3);
            
            JLabel A3x = new JLabel("A^3",SwingConstants.CENTER);
            A3x.setBounds(150 ,75,30,30);
            A3x.setFont(new Font("Agency FB",1,20));
            A3x.setForeground(Color.white);
            panelSumaYDiferenciaDeCubos.add(A3x);
            
            String signo[] = {"+","-"};
            signoSDC = new JComboBox(signo);
            signoSDC.setBounds(185,75,60,30);
            signoSDC.setFont(new Font("Agency FB",1,20));
            panelSumaYDiferenciaDeCubos.add(signoSDC);
            
            B3 = new JTextField();
            B3.setBounds(250,70,40,40);
            B3.setFont(new Font("Agency FB",1,20));
            panelSumaYDiferenciaDeCubos.add(B3);
            
            JLabel B3x = new JLabel("B^3",SwingConstants.CENTER);
            B3x.setBounds(295 ,75,30,30);
            B3x.setFont(new Font("Agency FB",1,20));
            B3x.setForeground(Color.white);
            panelSumaYDiferenciaDeCubos.add(B3x);
           
            JLabel resultado = new JLabel("Resultado",SwingConstants.CENTER);
            resultado.setBounds(50,135,80,30);
            resultado.setFont(new Font("Agency FB",1,20));
            resultado.setForeground(Color.white);
            panelSumaYDiferenciaDeCubos.add(resultado);
            
            JLabel PI = new JLabel("(",SwingConstants.CENTER);
            PI.setBounds(40,175,10,30);
            PI.setFont(new Font("Agency FB",1,20));
            PI.setForeground(Color.white);
            panelSumaYDiferenciaDeCubos.add(PI);
            
            ASDC = new JTextField();
            ASDC.setBounds(50,175,40,40);
            ASDC.setFont(new Font("Agency FB",1,20));
            panelSumaYDiferenciaDeCubos.add(ASDC);
            
            JLabel ASDCx = new JLabel("A",SwingConstants.CENTER);
            ASDCx.setBounds(95,175,10,30);
            ASDCx.setFont(new Font("Agency FB",1,20));
            ASDCx.setForeground(Color.white);
            panelSumaYDiferenciaDeCubos.add(ASDCx);
            
            signoSDCX = new JTextField("+");
            signoSDCX.setBounds(110,175,35,35);
            signoSDCX.setFont(new Font("Agency FB",1,20));
            panelSumaYDiferenciaDeCubos.add(signoSDCX);
            
            BSDC = new JTextField();
            BSDC.setBounds(150,175,40,40);
            BSDC.setFont(new Font("Agency FB",1,20));
            panelSumaYDiferenciaDeCubos.add(BSDC);    
            
            JLabel BSDCx = new JLabel("B )  (",SwingConstants.CENTER);
            BSDCx.setBounds(195,175,40,30);
            BSDCx.setFont(new Font("Agency FB",1,20));
            BSDCx.setForeground(Color.white);
            panelSumaYDiferenciaDeCubos.add(BSDCx);
            
            A2SDC = new JTextField();
            A2SDC.setBounds(240,175,40,40);
            A2SDC.setFont(new Font("Agency FB",1,20));
            panelSumaYDiferenciaDeCubos.add(A2SDC); 
            
            JLabel A2SDCx = new JLabel("A^2",SwingConstants.CENTER);
            A2SDCx.setBounds(285,175,35,30);
            A2SDCx.setFont(new Font("Agency FB",1,20));
            A2SDCx.setForeground(Color.white);
            panelSumaYDiferenciaDeCubos.add(A2SDCx);
            
            ABSDC = new JTextField();
            ABSDC.setBounds(325,175,40,40);
            ABSDC.setFont(new Font("Agency FB",1,20));
            panelSumaYDiferenciaDeCubos.add(ABSDC); 
            
            JLabel ABSDCx = new JLabel("AB+",SwingConstants.CENTER);
            ABSDCx.setBounds(370,175,35,30);
            ABSDCx.setFont(new Font("Agency FB",1,20));
            ABSDCx.setForeground(Color.white);
            panelSumaYDiferenciaDeCubos.add(ABSDCx);
            
            B2SDC = new JTextField();
            B2SDC.setBounds(410,175,40,40);
            B2SDC.setFont(new Font("Agency FB",1,20));
            panelSumaYDiferenciaDeCubos.add(B2SDC);
            
            JLabel B2SDCx  = new JLabel("B^2 )",SwingConstants.CENTER);
            B2SDCx.setBounds(455,175,65,30);
            B2SDCx.setFont(new Font("Agency FB",1,20));
            B2SDCx.setForeground(Color.white);
            panelSumaYDiferenciaDeCubos.add(B2SDCx);
     
            
            
           calcularSDC = new JButton("Calcular");
           calcularSDC.setBounds(250,225,90,40);
           calcularSDC.setFont(new Font("Agency FB",1,18));
           calcularSDC.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   primerNumero = Double.parseDouble(A3.getText());
                   segundoNumero = Double.parseDouble(B3.getText());
                   if(signoSDC.getSelectedIndex()==0){
                       signoSDCX.setText("+");
                   }else{
                       signoSDCX.setText("-");
                   }
                   //signoSDCX.setText(Integer.toString(signoSDC.getSelectedIndex());
                   
                   if(raizn(primerNumero,3)%1==0 && raizn(segundoNumero,3)%1==0){
                       ASDC.setText(Double.toString(raizn(primerNumero,3)));
                       BSDC.setText(Double.toString(raizn(segundoNumero,3)));
                   }
                   
                   if( raizn(primerNumero,3)== 0 && raizn(segundoNumero,3)==0){
                       JOptionPane.showMessageDialog(null, "Ninguna de los dos valores tiene raiz cubica exacta");
                   }else if(raizn(primerNumero,3)== 0 && raizn(segundoNumero,3)!=0){
                        JOptionPane.showMessageDialog(null, "Un valor no tiene raiz cubica exacta");
                   }else if(raizn(primerNumero,3)!= 0 && raizn(segundoNumero,3)==0){
                       JOptionPane.showMessageDialog(null, "Un valor no tiene raiz cubica exacta");
                   }
                   
                   A2SDC.setText(Double.toString(raizn(primerNumero,3)*raizn(primerNumero,3)));
                   
                   B2SDC.setText(Double.toString(raizn(segundoNumero,3)*raizn(segundoNumero,3)));
                    
                   if(signoSDC.getSelectedIndex()==0){
                       ABSDC.setText(Double.toString(-1*(raizn(primerNumero,3)*raizn(segundoNumero,3))));
                   }else{
                       ABSDC.setText(Double.toString(raizn(primerNumero,3)*raizn(segundoNumero,3)));
                   }
                 Respuesta r = new Respuesta();
                    r.escribirArchivoHistorial("("+ASDC.getText()+"+/-"+BSDC.getText()+")("+A2SDC.getText()+"^2 +/-"+ABSDC.getText()+"+"+B2SDC.getText()+"^2)",
                            primerNumero+"^3 +/-"+segundoNumero+"^3");
               }
           });
           panelSumaYDiferenciaDeCubos.add(calcularSDC);
           
           guardarResultadoSDC = new JButton("Guardar resultado");
            guardarResultadoSDC.setBounds(25,225,160,50);
            guardarResultadoSDC.setFont(new Font("Agency FB",1,18));
            guardarResultadoSDC.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Respuesta r = new Respuesta();
                    r.escribirArchivoFavoritos("("+ASDC.getText()+"+/-"+BSDC.getText()+")("+A2SDC.getText()+"^2 +/-"+ABSDC.getText()+"+"+B2SDC.getText()+"^2)",
                            primerNumero+"^3 +/-"+segundoNumero+"^3");
                 }
            });
            panelSumaYDiferenciaDeCubos.add(guardarResultadoSDC);
           
           
       }
       
      //Creando Ventana, Panel,componentes y calculos para SENO
       static void crearVentanaSeno(){
           //Ventana 
           ventanaSeno = new Ventana();
           ventanaSeno.setSize(350,350);
           ventanaSeno.setTitle("Seno");
           ventanaSeno.setLocationRelativeTo(null);
           ventanaSeno.setResizable(false);
           ventanaSeno.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
           ventanaSeno.setVisible(true);
           
           //Panel 
           panelSeno = new JPanel();
           panelSeno.setLayout(null);
           panelSeno.setBackground(Color.darkGray);
           ventanaSeno.getContentPane().add(panelSeno);
           
           //Agregando componentes 
            JLabel seno = new JLabel("Seno",SwingConstants.CENTER);
            seno.setBounds(20,20,100,30);
            seno.setFont(new Font("Agency FB",1,20));
            seno.setForeground(Color.white);
            panelSeno.add(seno);
            
            JLabel sin = new JLabel("Sin(             )",SwingConstants.CENTER);
            sin.setBounds(70,60,100,30);
            sin.setFont(new Font("Agency FB",1,20));
            sin.setForeground(Color.white);
            panelSeno.add(sin);
            
            sen = new JTextField();
            sen.setBounds(110,60,40,40);
            sen.setFont(new Font("Agency FB",1,18));
            panelSeno.add(sen);
            
            String unidad[] = {"Radianes","Grados"};
            usen = new JComboBox(unidad);
            usen.setBounds(220,75,100,30);
            usen.setFont(new Font("Agency FB",1,20));
            panelSeno.add(usen);
            
            JLabel resultado = new JLabel("Resultado",SwingConstants.CENTER);
            resultado.setBounds(50,130,80,30);
            resultado.setFont(new Font("Agency FB",1,20));
            resultado.setForeground(Color.white);
            panelSeno.add(resultado);
            
            rsen = new JTextField();
            rsen.setBounds(50,170,150,40);
            rsen.setFont(new Font("Agency FB",1,18));
            panelSeno.add(rsen);
            
            calcularSeno = new JButton("Calcular");
            calcularSeno.setBounds(230,170,90,40);
            calcularSeno.setFont(new Font("Agency FB",1,18));
            calcularSeno.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   
                   primerNumero = Double.parseDouble(sen.getText());
                   if(usen.getSelectedIndex()==1){
                       primerNumero = (primerNumero*3.1415926535897932)/180;
                   }
                   rsen.setText(Double.toString(calculoSeno(primerNumero)));
                   Respuesta r = new Respuesta();
                    r.escribirArchivoHistorial(rsen.getText(),"Sen("+primerNumero+")");
                }
            });
            panelSeno.add(calcularSeno);
           
            guardarResultadoSeno = new JButton("Guardar resultado");
            guardarResultadoSeno.setBounds(25,225,160,50);
            guardarResultadoSeno.setFont(new Font("Agency FB",1,18));
            guardarResultadoSeno.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Respuesta r = new Respuesta();
                    r.escribirArchivoFavoritos( rsen.getText(),"Sen("+primerNumero+")");
                 }
            });
            panelSeno.add(guardarResultadoSeno);           
       }
       
       //Creando Ventana, Panel,componentes y calculos para COSENO
       static void crearVentanaCoseno(){
           //Ventana 
           ventanaCoseno = new Ventana();
           ventanaCoseno.setSize(350,350);
           ventanaCoseno.setTitle("Coseno");
           ventanaCoseno.setLocationRelativeTo(null);
           ventanaCoseno.setResizable(false);
           ventanaCoseno.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
           ventanaCoseno.setVisible(true);
           
           //Panel 
           panelCoseno = new JPanel();
           panelCoseno.setLayout(null);
           panelCoseno.setBackground(Color.darkGray);
           ventanaCoseno.getContentPane().add(panelCoseno);
           
           //Agregando componentes 
            JLabel coseno = new JLabel("Coseno",SwingConstants.CENTER);
            coseno.setBounds(20,20,100,30);
            coseno.setFont(new Font("Agency FB",1,20));
            coseno.setForeground(Color.white);
            panelCoseno.add(coseno);
            
            JLabel cose = new JLabel("Cos(             )",SwingConstants.CENTER);
            cose.setBounds(70,60,100,30);
            cose.setFont(new Font("Agency FB",1,20));
            cose.setForeground(Color.white);
            panelCoseno.add(cose);
            
            cos = new JTextField();
            cos.setBounds(110,60,40,40);
            cos.setFont(new Font("Agency FB",1,18));
            panelCoseno.add(cos);
            
            String unidad[] = {"Radianes","Grados"};
            ucos = new JComboBox(unidad);
            ucos .setBounds(220,75,100,30);
            ucos .setFont(new Font("Agency FB",1,20));
            panelCoseno.add(ucos );
            
            JLabel resultado = new JLabel("Resultado",SwingConstants.CENTER);
            resultado.setBounds(50,130,80,30);
            resultado.setFont(new Font("Agency FB",1,20));
            resultado.setForeground(Color.white);
            panelCoseno.add(resultado);
            
            rcos = new JTextField();
            rcos.setBounds(50,170,150,40);
            rcos.setFont(new Font("Agency FB",1,18));
            panelCoseno.add(rcos);
            
            calcularCoseno = new JButton("Calcular");
            calcularCoseno.setBounds(230,170,90,40);
            calcularCoseno.setFont(new Font("Agency FB",1,18));
            calcularCoseno.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   primerNumero = Double.parseDouble(cos.getText());
                   if(ucos.getSelectedIndex()==1){
                       primerNumero = (primerNumero*3.1415926535897932)/180;
                   }
                   rcos.setText(Double.toString(calculoCoseno(primerNumero)));
                   Respuesta r = new Respuesta();
                    r.escribirArchivoHistorial(rcos.getText(),"Cos("+primerNumero+")");
                   
                   
                }
            });
            panelCoseno.add(calcularCoseno);
           
            guardarResultadoCoseno = new JButton("Guardar resultado");
            guardarResultadoCoseno.setBounds(25,225,160,50);
            guardarResultadoCoseno.setFont(new Font("Agency FB",1,18));
            guardarResultadoCoseno.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Respuesta r = new Respuesta();
                    r.escribirArchivoFavoritos( rcos.getText(),"Cos("+primerNumero+")");
                 }
            });
            panelCoseno.add(guardarResultadoCoseno);           
       }
       
       //Creando Ventana, Panel,componentes y calculos para COSENO
        static void crearVentanaTangente(){
           //Ventana 
           ventanaTangente = new Ventana();
           ventanaTangente.setSize(350,350);
           ventanaTangente.setTitle("Tangente");
           ventanaTangente.setLocationRelativeTo(null);
           ventanaTangente.setResizable(false);
           ventanaTangente.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
           ventanaTangente.setVisible(true);
           
           //Panel 
           panelTangente = new JPanel();
           panelTangente.setLayout(null);
           panelTangente.setBackground(Color.darkGray);
           ventanaTangente.getContentPane().add(panelTangente);
           
           //Agregando componentes 
            JLabel tangente = new JLabel("Tangente",SwingConstants.CENTER);
            tangente.setBounds(20,20,100,30);
            tangente.setFont(new Font("Agency FB",1,20));
            tangente.setForeground(Color.white);
            panelTangente.add(tangente);
            
            JLabel tane = new JLabel("Tan(             )",SwingConstants.CENTER);
            tane.setBounds(70,60,100,30);
            tane.setFont(new Font("Agency FB",1,20));
            tane.setForeground(Color.white);
            panelTangente.add(tane);
            
            tan = new JTextField();
            tan.setBounds(110,60,40,40);
            tan.setFont(new Font("Agency FB",1,18));
            panelTangente.add(tan );
            
            String unidad[] = {"Radianes","Grados"};
            utan = new JComboBox(unidad);
            utan .setBounds(220,75,100,30);
            utan .setFont(new Font("Agency FB",1,20));
            panelTangente.add(utan );
            
            JLabel resultado = new JLabel("Resultado",SwingConstants.CENTER);
            resultado.setBounds(50,130,80,30);
            resultado.setFont(new Font("Agency FB",1,20));
            resultado.setForeground(Color.white);
            panelTangente.add(resultado);
            
            rtan = new JTextField();
            rtan.setBounds(50,170,150,40);
            rtan.setFont(new Font("Agency FB",1,18));
            panelTangente.add(rtan);
            
            calcularTangente = new JButton("Calcular");
            calcularTangente.setBounds(230,170,90,40);
            calcularTangente.setFont(new Font("Agency FB",1,18));
            calcularTangente.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   primerNumero = Double.parseDouble(tan.getText());
                   if(utan.getSelectedIndex()==1){
                       primerNumero = (primerNumero*3.1415926535897932)/180;
                   }
                   double a = calculoSeno(primerNumero);
                   double b = calculoCoseno(primerNumero);
                   rtan.setText(Double.toString(a/b));
                   Respuesta r = new Respuesta();
                    r.escribirArchivoHistorial(rtan.getText(),"Tan("+primerNumero+")");
                 }
            });
            panelTangente.add(calcularTangente);
           
            guardarResultadoTangente = new JButton("Guardar resultado");
            guardarResultadoTangente.setBounds(25,225,160,50);
            guardarResultadoTangente.setFont(new Font("Agency FB",1,18));
            guardarResultadoTangente.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Respuesta r = new Respuesta();
                    r.escribirArchivoFavoritos( rtan.getText(),"Tan("+primerNumero+")");
                 }
            });
            panelTangente.add(guardarResultadoTangente);           
       }
        
        //Creando ventaa, panel componentes y calculos para Longitud de arco
        static void crearVentanaLongitudDeArco(){
            //Ventana 
           ventanaLongitudDeArco = new Ventana();
           ventanaLongitudDeArco.setSize(350,350);
           ventanaLongitudDeArco.setTitle("Longitud de arco");
           ventanaLongitudDeArco.setLocationRelativeTo(null);
           ventanaLongitudDeArco.setResizable(false);
           ventanaLongitudDeArco.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
           ventanaLongitudDeArco.setVisible(true);
           
           //Panel 
           panelLongitudDeArco = new JPanel();
           panelLongitudDeArco.setLayout(null);
           panelLongitudDeArco.setBackground(Color.darkGray);
           ventanaLongitudDeArco.getContentPane().add(panelLongitudDeArco);
           
           //Agregando componentes 
            JLabel longitudDeArco = new JLabel("Longitud de arco",SwingConstants.CENTER);
            longitudDeArco.setBounds(20,20,100,30);
            longitudDeArco.setFont(new Font("Agency FB",1,20));
            longitudDeArco.setForeground(Color.white);
            panelLongitudDeArco.add(longitudDeArco);
            
            JLabel angulox = new JLabel("Ángulo",SwingConstants.CENTER);
            angulox.setBounds(30,70,50,30);
            angulox.setFont(new Font("Agency FB",1,20));
            angulox.setForeground(Color.white);
            panelLongitudDeArco.add(angulox);
            
            angulo = new JTextField();
            angulo.setBounds(80,70,60,30);
            angulo.setFont(new Font("Agency FB",1,18));
            panelLongitudDeArco.add(angulo );
            
            String unidad[] = {"Radianes","Grados"};
            uLongitudDeArco = new JComboBox(unidad);
            uLongitudDeArco .setBounds(160,70,100,30);
            uLongitudDeArco .setFont(new Font("Agency FB",1,20));
            panelLongitudDeArco.add(uLongitudDeArco );
            
            JLabel radiox = new JLabel("Radio",SwingConstants.CENTER);
            radiox.setBounds(30,110,50,30);
            radiox.setFont(new Font("Agency FB",1,20));
            radiox.setForeground(Color.white);
            panelLongitudDeArco.add(radiox);
            
            radio = new JTextField();
            radio.setBounds(80,110,60,30);
            radio.setFont(new Font("Agency FB",1,18));
            panelLongitudDeArco.add(radio );
            
            JLabel resultado = new JLabel("Resultado",SwingConstants.CENTER);
            resultado.setBounds(15,160,90,30);
            resultado.setFont(new Font("Agency FB",1,20));
            resultado.setForeground(Color.white);
            panelLongitudDeArco.add(resultado);
            
            resultadoLongitudDeArco = new JTextField();
            resultadoLongitudDeArco.setBounds(110,160,100,30);
            resultadoLongitudDeArco.setFont(new Font("Agency FB",1,18));
            panelLongitudDeArco.add(resultadoLongitudDeArco );
            
            
            calcularLongitudDeArco = new JButton("Calcular");
            calcularLongitudDeArco.setBounds(230,160,90,30);
            calcularLongitudDeArco.setFont(new Font("Agency FB",1,18));
            calcularLongitudDeArco.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   
                   primerNumero = Double.parseDouble(angulo.getText());
                   segundoNumero = Double.parseDouble(radio.getText());
                   
                   if(uLongitudDeArco.getSelectedIndex()==0){
                       resultadoLongitudDeArco.setText(Double.toString(primerNumero*segundoNumero));
                   }else if(uLongitudDeArco.getSelectedIndex()==1){
                       resultadoLongitudDeArco.setText(Double.toString((primerNumero/360)*(2)*(3.14159265358979323)*(segundoNumero)));
                   }
                   Respuesta r = new Respuesta();
                    r.escribirArchivoHistorial(resultadoLongitudDeArco.getText(),angulo.getText()+"*"+radio.getText());
                }
            });
            panelLongitudDeArco.add(calcularLongitudDeArco);
           
            guardarResultadoLongitudDeArco = new JButton("Guardar resultado");
            guardarResultadoLongitudDeArco.setBounds(25,225,160,50);
            guardarResultadoLongitudDeArco.setFont(new Font("Agency FB",1,18));
            guardarResultadoLongitudDeArco.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Respuesta r = new Respuesta();
                    r.escribirArchivoFavoritos(resultadoLongitudDeArco.getText(),angulo.getText()+"*"+radio.getText());
                 }
            });
            panelLongitudDeArco.add(guardarResultadoLongitudDeArco); 
        }
        
        //Creando ventaa, panel componentes y calculos para Suma de Riemann
        static void crearVentanaSumaDeRiemann(){
            //Ventana 
           ventanaSumaDeRiemann = new Ventana();
           ventanaSumaDeRiemann.setSize(275,440);
           ventanaSumaDeRiemann.setTitle("Suma de Riemann");
           ventanaSumaDeRiemann.setLocationRelativeTo(null);
           ventanaSumaDeRiemann.setResizable(false);
           ventanaSumaDeRiemann.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
           ventanaSumaDeRiemann.setVisible(true);
           
           //Panel 
           panelSumaDeRiemann = new JPanel();
           panelSumaDeRiemann.setLayout(null);
           panelSumaDeRiemann.setBackground(Color.darkGray);
           ventanaSumaDeRiemann.getContentPane().add(panelSumaDeRiemann);
           
            //Agregando componentes 
            JLabel sumasdeRiemann = new JLabel("Suma de Riemann",SwingConstants.CENTER);
            sumasdeRiemann.setBounds(20,20,130,30);
            sumasdeRiemann.setFont(new Font("Agency FB",1,20));
            sumasdeRiemann.setForeground(Color.white);
            panelSumaDeRiemann.add(sumasdeRiemann);
            
            JLabel limiteInferiorx = new JLabel("Límite inferior",SwingConstants.CENTER);
            limiteInferiorx.setBounds(10,70,110,30);
            limiteInferiorx.setFont(new Font("Agency FB",1,20));
            limiteInferiorx.setForeground(Color.white);
            panelSumaDeRiemann.add(limiteInferiorx  );
            
            limiteInferior = new JTextField();
            limiteInferior.setBounds(120,70,120,30);
            limiteInferior.setFont(new Font("Agency FB",1,18));
            panelSumaDeRiemann.add(limiteInferior); 
            
            JLabel limiteSuperiorx = new JLabel("Límite superior",SwingConstants.CENTER);
            limiteSuperiorx.setBounds(12,105,110,30);
            limiteSuperiorx.setFont(new Font("Agency FB",1,20));
            limiteSuperiorx.setForeground(Color.white);
            panelSumaDeRiemann.add(limiteSuperiorx);
            
            limiteSuperior = new JTextField();
            limiteSuperior.setBounds(120,105,120,30);
            limiteSuperior.setFont(new Font("Agency FB",1,18));
            panelSumaDeRiemann.add(limiteSuperior);
            
            JLabel funcionx = new JLabel("Función",SwingConstants.CENTER);
            funcionx.setBounds(10,140,80,30);
            funcionx.setFont(new Font("Agency FB",1,20));
            funcionx.setForeground(Color.white);
            panelSumaDeRiemann.add(funcionx);
            
            String tipoFuncion[] = {"Exponencial","Cuadrática","Cúbica"};
            funcion = new JComboBox(tipoFuncion);
            funcion .setBounds(120,140,120,30);
            funcion .setFont(new Font("Agency FB",1,20));
            panelSumaDeRiemann.add(funcion);
            
            JLabel diferencialx = new JLabel("Diferencial",SwingConstants.CENTER);
            diferencialx.setBounds(14,175,80,30);
            diferencialx.setFont(new Font("Agency FB",1,20));
            diferencialx.setForeground(Color.white);
            panelSumaDeRiemann.add(diferencialx);
            
            diferencial = new JTextField();
            diferencial.setBounds(120,175,120,30);
            diferencial.setFont(new Font("Agency FB",1,18));
            panelSumaDeRiemann.add(diferencial);
            
            JLabel resultado = new JLabel("Resultado",SwingConstants.CENTER);
            resultado.setBounds(10,250,80,30);
            resultado.setFont(new Font("Agency FB",1,20));
            resultado.setForeground(Color.white);
            panelSumaDeRiemann.add(resultado);
            
            resultadoSR = new JTextField();
            resultadoSR.setBounds(120,250,120,30);
            resultadoSR.setFont(new Font("Agency FB",1,18));
            panelSumaDeRiemann.add(resultadoSR);
            
            calcularSR = new JButton("Calcular");
            calcularSR.setBounds(80,305,90,30);
            calcularSR.setFont(new Font("Agency FB",1,18));
            calcularSR.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   primerNumero = Double.parseDouble(limiteInferior.getText());
                   segundoNumero = Double.parseDouble(limiteSuperior.getText());
                   if("".equals(diferencial.getText())){
                       JOptionPane.showMessageDialog(null, "No ha ingresado numero de diferencial");
                       resultadoSR.setText("");
                   }
                   else if(funcion.getSelectedIndex()==0){
                      resultadoSR.setText(Double.toString(potencia(2.718281828459,segundoNumero)-potencia(2.718281828459,primerNumero)));
                   }
                   else if(funcion.getSelectedIndex()==1){
                      resultadoSR.setText(Double.toString((potencia(segundoNumero,3))/3-(potencia(primerNumero,3)/3)));
                  }
                   else if(funcion.getSelectedIndex()==2){
                      resultadoSR.setText(Double.toString((potencia(segundoNumero,4))/4-(potencia(primerNumero,4)/4)));
                  }
                   Respuesta r = new Respuesta();
                    r.escribirArchivoHistorial(resultadoSR.getText(),"Suma de Riemann");
                   
                }
            });
            panelSumaDeRiemann.add(calcularSR);
            
            guardarResultadoSR = new JButton("Guardar Resultado");
            guardarResultadoSR.setBounds(60,340,160,50);
            guardarResultadoSR.setFont(new Font("Agency FB",1,18));
            guardarResultadoSR.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   Respuesta r = new Respuesta();
                    r.escribirArchivoFavoritos(resultadoSR.getText(),"Suma de Riemann");
                }
            });
            panelSumaDeRiemann.add(guardarResultadoSR);
        }
        //Creando ventaa, panel componentes y calculos para Favoritos
        static void crearVentanaFavoritos(){
            //Ventana 
           ventanaFavoritos = new Ventana();
           ventanaFavoritos.setSize(600,650);
           ventanaFavoritos.setTitle("Favoritos");
           ventanaFavoritos.setLocationRelativeTo(null);
           ventanaFavoritos.setResizable(false);
           ventanaFavoritos.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
           ventanaFavoritos.setVisible(true);
           
         //Panel 
           panelFavoritos = new JPanel();
           panelFavoritos.setLayout(null);
           panelFavoritos.setBackground(Color.darkGray);
           ventanaFavoritos.getContentPane().add(panelFavoritos);
           
           //Componentes
            JLabel favoritos = new JLabel("Favoritos",SwingConstants.CENTER);
            favoritos.setBounds(20,20,130,30);
            favoritos.setFont(new Font("Agency FB",1,20));
            favoritos.setForeground(Color.white);
            panelFavoritos.add(favoritos);
         
           
            String ordenarpor[] = {"Resultado","Fecha"};
            resultado = new JComboBox(ordenarpor);
            resultado .setBounds(300,60,120,30);
            resultado .setFont(new Font("Agency FB",1,20));
            panelFavoritos.add(resultado);
            
            ordenar = new JButton("Ordenar");
            ordenar.setBounds(420,60,120,30);
            ordenar.setFont(new Font("Agency FB",1,18));
            ordenar.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                 }
            });
             panelFavoritos.add(ordenar);
             
             
             //Programando lectura de datos del archivo
             
             
            File archivo = null;
            FileReader fr=null;
            BufferedReader br= null;
             try{
                //Apertura del archivo
                archivo = new File("Datos.txt");
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                String FilaLeidaArchivo;
                String[] CadenaSeparada;
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.addColumn("Resultado");
                 modelo.addColumn("Operación");
                 modelo.addColumn("Fecha");
                while((FilaLeidaArchivo = br.readLine())!= null){
                    CadenaSeparada=FilaLeidaArchivo.split(",");
                    String p1[] = {CadenaSeparada[0],CadenaSeparada[1],CadenaSeparada[2]};
                    modelo.addRow(p1);
                       }
                JTable tabla = new JTable(modelo);
                tabla.setBounds(0, 120, 600, 560);
                tabla.setFont(new Font("Agency FB",1,15));
                panelFavoritos.add(tabla);
                JScrollPane scroll =  new JScrollPane(tabla);
                 scroll.setBounds(0, 120, 600, 560);
                panelFavoritos.add(scroll);
          }catch(Exception e ){
             }
             
        }
        
         //Creando ventaa, panel componentes y calculos para Favoritos
        static void crearVentanaHistorial(){
            //Ventana 
           ventanaHistorial = new Ventana();
           ventanaHistorial.setSize(600,650);
           ventanaHistorial.setTitle("Historial");
           ventanaHistorial.setLocationRelativeTo(null);
           ventanaHistorial.setResizable(false);
           ventanaHistorial.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
           ventanaHistorial.setVisible(true);
           
         //Panel 
           panelHistorial = new JPanel();
           panelHistorial.setLayout(null);
           panelHistorial.setBackground(Color.darkGray);
           ventanaHistorial.getContentPane().add(panelHistorial);
           
           //Componentes
            JLabel favoritos = new JLabel("Historial",SwingConstants.CENTER);
            favoritos.setBounds(20,20,130,30);
            favoritos.setFont(new Font("Agency FB",1,20));
            favoritos.setForeground(Color.white);
            panelHistorial.add(favoritos);
         
           
            String ordenarpor[] = {"Resultado","Fecha"};
            resultadoh = new JComboBox(ordenarpor);
            resultadoh .setBounds(300,60,120,30);
            resultadoh .setFont(new Font("Agency FB",1,20));
            panelHistorial.add(resultadoh);
            
            ordenarh = new JButton("Ordenar");
            ordenarh.setBounds(420,60,120,30);
            ordenarh.setFont(new Font("Agency FB",1,18));
            ordenarh.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                 }
            });
             panelHistorial.add(ordenarh);
             
             
             //Programando lectura de datos del archivo
            File archivo = null;
            FileReader fr=null;
            BufferedReader br= null;
             try{
                //Apertura del archivo
                archivo = new File("Datos1.txt");
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                String FilaLeidaArchivo;
                String[] CadenaSeparada;
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.addColumn("Resultado");
                 modelo.addColumn("Operación");
                 modelo.addColumn("Fecha");
                while((FilaLeidaArchivo = br.readLine())!= null){
                    CadenaSeparada=FilaLeidaArchivo.split(",");
                    String p1[] = {CadenaSeparada[0],CadenaSeparada[1],CadenaSeparada[2]};
                    modelo.addRow(p1);
                       }
                JTable tabla = new JTable(modelo);
                tabla.setFont(new Font("Agency FB",1,15));
                tabla.setBounds(0, 120, 600, 560);
                panelHistorial.add(tabla);
                JScrollPane scroll =  new JScrollPane(tabla);
                 scroll.setBounds(0, 120, 600, 560);
                panelHistorial.add(scroll);
          }catch(Exception e ){
             }
             
        }
        
        static String raizCuadrada(double num){
            double resr,t;
                           if(num<0){
                               num *= -1;
                               resr = num/2;
                           do{
                               t=resr;
                               resr = (t+(num/t))/2;
                           }while((t-resr)!= 0);
                           return Double.toString(resr)+"+/- i";
                           }else{
                               resr = num/2;
                           do{
                               t=resr;
                               resr = (t+(num/t))/2;
                           }while((t-resr)!= 0);
                           return Double.toString(resr);
                           }
            
        }
        
        static double raizn(double base,double nraiz){
           double respuesta=1;
            for(int i =1;i<base/3;i++){
                if(potencia(i,nraiz)==base){
                    respuesta = i;
                    }
             }
            if(respuesta==1){
                respuesta = 0;
            }
            return respuesta;
        }
        
        static double potencia(double a,double b){
            double res = 1;
                           for(int i=1; i<=b;i++){
                               res = res*a;
                           }
                          return res;
        }
        
        static double calculoSeno(double primerNumero){
            double numerador,denominador,signo;
        
                   for(int i = 0; i <= n; i++){
                    numerador = 1;
                    for(int j = 0; j < 2*i+1; j++){
                numerador = numerador * primerNumero;
            }
            denominador = 1;
            for(int c = 1; c <= 2*i+1; c++){
                denominador = denominador *c;
            }
            if(i%2==0){
                signo=1;
            }
            else{
                signo=-1;
            }
            senoa = senoa +(numerador/denominador)*signo;
        }
                  return senoa;
        }
        
        static double calculoCoseno(double primerNumero){
            double numerador,denominador,signo;
        
        for(int i = 0; i <= n; i++){
            numerador=1;
            for(int j = 0; j < 2*i; j++){
                numerador = numerador*primerNumero;
            }
            denominador=1;
            for(int w=1; w<=2*i; w++){
                denominador = denominador*w;
            }
            if(i%2==0){
                signo=1;
            }
            else{
                signo=-1;
            }
            cosenoa = cosenoa +(numerador/denominador)*signo;
        }
               return cosenoa;
        } 
        
        static void crearVentanaCasosDeDerivacion(){
           //Ventana 
           ventanaCasosDeDerivacion = new Ventana();
           ventanaCasosDeDerivacion.setSize(1000,800);
           ventanaCasosDeDerivacion.setTitle("Casos de derivacion");
           ventanaCasosDeDerivacion.setLocationRelativeTo(null);
           ventanaCasosDeDerivacion.setResizable(false);
           ventanaCasosDeDerivacion.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
           ventanaCasosDeDerivacion.setVisible(true);
           //Panel
           panelCasosDeDerivacion = new JPanel();
           panelCasosDeDerivacion.setLayout(null);
           panelCasosDeDerivacion.setBackground(Color.darkGray);
           panelCasosDeDerivacion.setBounds(0, 0, 1000, 70);
           ventanaCasosDeDerivacion.getContentPane().add(panelCasosDeDerivacion);
           
            String casos[] = {"Derivada de función de grado n","Derivada del producto de una constante por una función","Derivada de una suma","Derivada de un producto","Derivada de un cociente","Regla de la cadena"};
            casosDeDerivacion = new JComboBox(casos);
            casosDeDerivacion .setBounds(50,20,370,30);
            casosDeDerivacion .setFont(new Font("Agency FB",1,20));
            panelCasosDeDerivacion.add(casosDeDerivacion );
           
           panelprueba = new JPanel();
           panelprueba.setLayout(null);
           panelprueba.setBackground(Color.blue);
           panelprueba.setBounds(20,90,1000 ,670);
           ventanaCasosDeDerivacion.getContentPane().add(panelprueba);
           
           def1 = new JTextArea();
           def1.setBounds(20,90,960,100);
           def1.setEditable(false);
            def1.setFont(new Font("Agency FB",1,18));
            
            JLabel img = new JLabel();
            
                  
           
            ver = new JButton("Ver");
            ver.setBounds(425,20,90,30);
            ver.setFont(new Font("Agency FB",1,18));
            ver.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                  if(casosDeDerivacion.getSelectedIndex()==0){
                  def1.setText("En una función polinómica de grado n f(x)=x^n,donde n es un entero positivo, su derivada es f'(x)=nx^{n-1}.Cabe hablar de la derivada de una función potencial de "
                          + "\nexponente real sin mencionar grado.Por ejemplo  y=x^{sqrt {7}}}  que es más fácil considerando lny=sqrt {7}*lnx\nAlgunos tipos de este tipo de funciones son:"
                          + " Función cuadrática, función cúbica, entre otras.\n Ilustracion de ejemplo:");
                  panelprueba.add(def1);
                  Image imge = new ImageIcon("caso0deri.jpg").getImage();
                  ImageIcon img2 = new ImageIcon(imge.getScaledInstance(700, 500, Image.SCALE_SMOOTH));
                  img.setIcon(img2);
                  img.setBounds(20, 200, 700, 600);
                  panelprueba.add(img);
                 }else if(casosDeDerivacion.getSelectedIndex()==1){
                   def1.setText("Derivada del producto de una constante por una función");
                  panelprueba.add(def1);
                  Image imge = new ImageIcon("caso1deri.jpg").getImage();
                  ImageIcon img2 = new ImageIcon(imge.getScaledInstance(700, 500, Image.SCALE_SMOOTH));
                  img.setIcon(img2);
                  img.setBounds(20, 200, 700, 600);
                  panelprueba.add(img);  
                 }else if(casosDeDerivacion.getSelectedIndex()==2){
                   def1.setText("Derivada de una suma");
                  panelprueba.add(def1);
                  Image imge = new ImageIcon("caso2deri.jpg").getImage();
                  ImageIcon img2 = new ImageIcon(imge.getScaledInstance(700, 500, Image.SCALE_SMOOTH));
                  img.setIcon(img2);
                  img.setBounds(20, 200, 700, 600);
                  panelprueba.add(img);  
                 }else if(casosDeDerivacion.getSelectedIndex()==3){
                   def1.setText("Derivada de un producto");
                  panelprueba.add(def1);
                  Image imge = new ImageIcon("caso3deri.jpg").getImage();
                  ImageIcon img2 = new ImageIcon(imge.getScaledInstance(700, 500, Image.SCALE_SMOOTH));
                  img.setIcon(img2);
                  img.setBounds(20, 200, 700, 600);
                  panelprueba.add(img);  
                 }else if(casosDeDerivacion.getSelectedIndex()==4){
                   def1.setText("Derivada de un cociente");
                  panelprueba.add(def1);
                  Image imge = new ImageIcon("caso4deri.jpg").getImage();
                  ImageIcon img2 = new ImageIcon(imge.getScaledInstance(700, 500, Image.SCALE_SMOOTH));
                  img.setIcon(img2);
                  img.setBounds(20, 200, 700, 600);
                  panelprueba.add(img);  
                 }else if(casosDeDerivacion.getSelectedIndex()==5){
                   def1.setText("Regla de la cadena");
                  panelprueba.add(def1);
                  Image imge = new ImageIcon("caso5deri.jpg").getImage();
                  ImageIcon img2 = new ImageIcon(imge.getScaledInstance(700, 500, Image.SCALE_SMOOTH));
                  img.setIcon(img2);
                  img.setBounds(20, 200, 700, 600);
                  panelprueba.add(img);  
                 }
                }
            });
            panelCasosDeDerivacion.add(ver);
           
        }
        
        static void crearVentanaCasosDeIntegracion(){
           //Ventana 
           ventanaCasosDeIntegracion = new Ventana();
           ventanaCasosDeIntegracion.setSize(1000,800);
           ventanaCasosDeIntegracion.setTitle("Casos de integracion");
           ventanaCasosDeIntegracion.setLocationRelativeTo(null);
           ventanaCasosDeIntegracion.setResizable(false);
           ventanaCasosDeIntegracion.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
           ventanaCasosDeIntegracion.setVisible(true);
           //Panel
           panelCasosDeIntegracion = new JPanel();
           panelCasosDeIntegracion.setLayout(null);
           panelCasosDeIntegracion.setBackground(Color.darkGray);
           panelCasosDeIntegracion.setBounds(0, 0, 1000, 70);
           ventanaCasosDeIntegracion.getContentPane().add(panelCasosDeIntegracion);
           
            String casos1[] = {"Método de integración por sustitución","Método de integración por partes","Método de integración por cambio de variables"};
            casosDeIntegracion = new JComboBox(casos1);
            casosDeIntegracion .setBounds(50,20,370,30);
            casosDeIntegracion .setFont(new Font("Agency FB",1,20));
            panelCasosDeIntegracion.add(casosDeIntegracion );
           
           panelprueba1 = new JPanel();
           panelprueba1.setLayout(null);
           panelprueba1.setBackground(Color.blue);
           panelprueba1.setBounds(20,90,1000 ,670);
           ventanaCasosDeIntegracion.getContentPane().add(panelprueba1);
           
           def2 = new JTextArea();
           def2.setBounds(20,90,960,100);
           def2.setEditable(false);
           def2.setFont(new Font("Agency FB",1,18));
            
            JLabel img = new JLabel();
            
                  
           
            ver1 = new JButton("Ver");
            ver1.setBounds(425,20,90,30);
            ver1.setFont(new Font("Agency FB",1,18));
            ver1.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                  if(casosDeIntegracion.getSelectedIndex()==0){
                  def2.setText("Método de integración por sustitución");
                  panelprueba1.add(def2);
                  Image imge = new ImageIcon("caso0int.jpg").getImage();
                  ImageIcon img2 = new ImageIcon(imge.getScaledInstance(700, 500, Image.SCALE_SMOOTH));
                  img.setIcon(img2);
                  img.setBounds(20, 200, 700, 600);
                  panelprueba1.add(img);
                 }else if(casosDeIntegracion.getSelectedIndex()==1){
                   def2.setText("Método de integración por partes");
                  panelprueba1.add(def2);
                  Image imge = new ImageIcon("caso1int.jpg").getImage();
                  ImageIcon img2 = new ImageIcon(imge.getScaledInstance(700, 500, Image.SCALE_SMOOTH));
                  img.setIcon(img2);
                  img.setBounds(20, 200, 700, 600);
                  panelprueba1.add(img);  
                 }else if(casosDeIntegracion.getSelectedIndex()==2){
                   def2.setText("Método de integración por cambio de variables");
                  panelprueba1.add(def2);
                  Image imge = new ImageIcon("caso2int.jpg").getImage();
                  ImageIcon img2 = new ImageIcon(imge.getScaledInstance(700, 500, Image.SCALE_SMOOTH));
                  img.setIcon(img2);
                  img.setBounds(20, 200, 700, 600);
                  panelprueba1.add(img);  
                 }
                }
            });
            panelCasosDeIntegracion.add(ver1);
           
        }

}


       
       

        
