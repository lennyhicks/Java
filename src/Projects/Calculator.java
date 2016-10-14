package Projects;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;


/**
 * Created by lennyhicks on 10/10/16.
 */
public class Calculator {
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTextField result;
    private JButton clearButton;
    private JButton seven;
    private JButton divide;
    private JButton four;
    private JButton eight;
    private JButton one;
    private JButton two;
    private JButton five;
    private JButton nine;
    private JButton six;
    private JButton multiply;
    private JButton subtract;
    private JButton three;
    private JButton add;
    private JButton period;
    private JButton equals;
    private JButton zero;
    private JTabbedPane tabbedPane2;
    private JLabel equation;
    private JTable Groceries;
    private JScrollPane tableHolder;
    private JTextField groceryName;
    private JTextField GroceryPrice;
    private JButton addGroceryButton;
    private JLabel total;
    private JTable calcHist;
    private JButton clearAllHistoryButton;
    private JTable grocHistory;
    private JTable tipHistory;
    private JTextField billAmount;
    private JComboBox serviceRating;
    private JTextField comments;
    private JLabel feedback;
    private JButton calculateTipButton;
    private String text = "";
    public int firstInt;
    public int secondInt;
    public boolean firstIntSet = false;
    public String expression;
    Double fullPrice;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Projects/toDoList/Calculator");

        frame.setContentPane(new Calculator().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }





    public Calculator() {

        DecimalFormat df = new DecimalFormat("0.00");
        serviceRating.setSelectedIndex(0);
        DefaultTableModel model = new DefaultTableModel();

        Groceries.setAutoCreateRowSorter(true);
        Groceries.setFillsViewportHeight(true);
        model.addColumn("Grocery");
        model.addColumn("Price");
        Groceries.setModel(model);


        DefaultTableModel grocHis = new DefaultTableModel();
        grocHis.addColumn("Grocery");
        grocHis.addColumn("Price");
        grocHistory.setAutoCreateRowSorter(true);
        grocHistory.setFillsViewportHeight(true);
        grocHistory.setModel(model);



        DefaultTableModel calcHis = new DefaultTableModel();

        calcHist.setAutoCreateRowSorter(true);
        calcHist.setFillsViewportHeight(true);
        calcHis.addColumn("Calculator History");
        calcHist.setModel(calcHis);


        DefaultTableModel tipHis = new DefaultTableModel();

        tipHistory.setAutoCreateRowSorter(true);
        tipHis.addColumn("Tip Amount");
        tipHis.addColumn("Service");
        tipHis.addColumn("Additional Comments");
        tipHistory.setModel(tipHis);






        clearButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                text = "";
                result.setText(text);
                firstIntSet = false;
            }
        });


        one.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                text += "1";
                result.setText(text);
            }
        });

        two.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                text += "2";
                result.setText(text);
            }
        });

        three.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                text += "3";
                result.setText(text);
            }
        });

        four.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                text += "4";
                result.setText(text);
            }
        });

        five.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                text += "5";
                result.setText(text);
            }
        });

        six.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                text += "6";
                result.setText(text);
            }
        });

        seven.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                text += "7";
                result.setText(text);
            }
        });

        eight.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                text += "8";
                result.setText(text);
            }
        });

        nine.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                text += "9";
                result.setText(text);
            }
        });

        zero.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                text += "0";
                result.setText(text);
            }
        });

        divide.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (!firstIntSet) {
                    firstInt = Integer.parseInt(text);
                    text = "";
                    result.setText(text);
                    expression = "/";
                    firstIntSet = true;
                }else {
                    expression = "/";
                    equation.setText("Results = " +firstInt + " "+expression+" ");
                    if (result.getText().length() > 0){
                        secondInt = Integer.parseInt(text);
                        text = "";
                        result.setText(text);

                        save(new String[]{"Results = " +firstInt + " "+expression+" "+secondInt+ " = " +doMath()}, "calc");
                        equation.setText("Results: " +firstInt + " "+expression+" "+secondInt+ " = " +doMath());
                        firstInt = doMath();
                    }
                }
            }
        });

        multiply.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (!firstIntSet) {
                    firstInt = Integer.parseInt(text);
                    text = "";
                    result.setText(text);
                    expression = "*";
                    firstIntSet = true;
                }else {
                    expression = "*";
                    equation.setText("Results = " +firstInt + " "+expression+" ");
                    if (result.getText().length() > 0){
                        secondInt = Integer.parseInt(text);
                        text = "";
                        result.setText(text);
                        calcHis.addRow(new Object[]{firstInt + " "+expression+" "+secondInt+ " = " +doMath()});
                        save(new String[]{"Results = " +firstInt + " "+expression+" "+secondInt+ " = " +doMath()}, "calc");
                        equation.setText("Results = " +firstInt + " "+expression+" "+secondInt+ " = " +doMath());
                        firstInt = doMath();
                    }
                }
            }
        });

        subtract.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (!firstIntSet) {
                    firstInt = Integer.parseInt(text);
                    text = "";
                    result.setText(text);
                    expression = "-";
                    firstIntSet = true;
                }else {
                    expression = "-";
                    equation.setText("Results = " +firstInt + " "+expression+" ");
                    if (result.getText().length() > 0){
                        secondInt = Integer.parseInt(text);
                        text = "";
                        result.setText(text);
                        calcHis.addRow(new Object[]{firstInt + " "+expression+" "+secondInt+ " = " +doMath()});
                        save(new String[]{"Results = " +firstInt + " "+expression+" "+secondInt+ " = " +doMath()}, "calc");
                        equation.setText("Results = " +firstInt + " "+expression+" "+secondInt+ " = " +doMath());
                        firstInt = doMath();
                    }
                }
            }
        });

        equals.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (!firstIntSet) {
                    firstInt = Integer.parseInt(text);
                    result.setText(text);
                }else {
                    if (result.getText().length() != 0) {
                        secondInt = Integer.parseInt(text);
                        result.setText("" + doMath());
                        text = "";
                        result.setText(text);

                        if (firstInt == 2 && secondInt ==2 && expression == "+"){
                            equation.setText("Results = " +firstInt + " "+expression+" "+secondInt+ " = Fish");
                        } else {
                            firstInt = doMath();
                            calcHis.addRow(new Object[]{firstInt + " " + expression + " " + secondInt + " = " + doMath()});
                            save(new String[]{"Results = " + firstInt + " " + expression + " " + secondInt + " = " + doMath()}, "calc");
                            equation.setText("Results = " + firstInt + " " + expression + " " + secondInt + " = " + doMath());
                        }
                    }else {
                            calcHis.addRow(new Object[]{firstInt + " " + expression + " " + secondInt + " = " + doMath()});
                            save(new String[]{"Results = " + firstInt + " " + expression + " " + secondInt + " = " + doMath()}, "calc");
                            equation.setText("Results = " + firstInt + " " + expression + " " + secondInt + " = " + doMath());

                            firstInt = doMath();

                    }
                }
            }
        });

        add.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (!firstIntSet) {
                    firstInt = Integer.parseInt(text);
                    text = "";
                    result.setText(text);
                    expression = "+";
                    firstIntSet = true;
                } else {
                    expression = "+";
                    equation.setText("Results = " + firstInt + " " + expression + " ");
                }
                    if (result.getText().length() > 0) {
                        secondInt = Integer.parseInt(text);
                        text = "";
                        result.setText(text);
                        calcHis.addRow(new Object[]{firstInt + " " + expression + " " + secondInt + " = " + doMath()});
                        save(new String[]{"Results = " + firstInt + " " + expression + " " + secondInt + " = " + doMath()}, "calc");
                        equation.setText("Results = " + firstInt + " " + expression + " " + secondInt + " = " + doMath());
                        firstInt = doMath();
                    }
                }

        });

        addGroceryButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                try {
                    if (Double.parseDouble(GroceryPrice.getText()) > 0) {
                        save(new String[]{groceryName.getText(), df.format(Double.parseDouble(GroceryPrice.getText()))}, "groceries");
                        model.addRow(new Object[]{groceryName.getText(), df.format(Double.parseDouble(GroceryPrice.getText()))});
                        grocHis.addRow(new Object[]{groceryName.getText(), df.format(Double.parseDouble(GroceryPrice.getText()))});

                        Groceries.setModel(model);
                        grocHistory.setModel(grocHis);
                        double amount = 0;
                        for (int i = 0; i < Groceries.getRowCount(); i++) {
                            amount += Double.parseDouble((String) Groceries.getValueAt(i, 1));
                        }
                        total.setText("Subtotal: $" + df.format(amount) + " Total Tax Rate of 6% is $" + df.format(amount + 1.06));
                    }
                }catch (NumberFormatException e1){
                    total.setText("Please enter valid fields. ex. 10.50");
                }


            }
        });
        calculateTipButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                DecimalFormat df = new DecimalFormat("0.00");
                Double tip = getTip();
try {


    billAmount.setText(df.format(Double.parseDouble(billAmount.getText())));
    double amount = Double.parseDouble(billAmount.getText()) * tip;
    tipHis.addRow(new Object[]{df.format(amount), getService(), comments.getText()});
    tipHistory.setModel(tipHis);
    save(new String[]{"Tipped: " + df.format(amount), " - Service: " + getService(), " - Comments: " + comments.getText()}, "tips");
    feedback.setText("Thank you for the Feedback. Tip Total is $" + df.format(amount));
    billAmount.setText(null);
    comments.setText("");
    serviceRating.setSelectedIndex(0);
}
catch (NumberFormatException b){
            feedback.setText("Please fill out all fields correctly");
    }

            }
        });
        clearAllHistoryButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                tipHis.setRowCount(0);
                calcHis.setRowCount(0);
                grocHis.setRowCount(0);
                tipHistory.setModel(tipHis);
                calcHist.setModel(calcHis);
                grocHistory.setModel(grocHis);
                clearHistory();
            }
        });
    }
    public String getService(){
        switch (serviceRating.getSelectedIndex()){
            case 0: return serviceRating.getItemAt(0).toString();
            case 1: return serviceRating.getItemAt(1).toString();
            case 2: return serviceRating.getItemAt(2).toString();
            case 3: return serviceRating.getItemAt(3).toString();
            case 4: return serviceRating.getItemAt(4).toString();
            case 5: return serviceRating.getItemAt(5).toString();
            default: return serviceRating.getItemAt(0).toString();
        }
    }

    public double getTip(){
        switch ((serviceRating.getSelectedIndex())){
            case 0: return .25;
            case 1: return .20;
            case 2: return .15;
            case 3: return .10;
            case 4: return .05;
            case 5: return .00;
            default: return .25;
        }
    }


    public void save(String args[], String name){

        String concat ="";
        FileWriter save = null;
        try {
            save = new FileWriter(name+".txt", true);
            for (int i = 0; i < args.length; i++){
                concat += args[i] + " ";
            }
            save.write(concat+"\n");
            save.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void clearHistory(){
        String[] names = {"calc", "groceries", "tips"};
        for (int i = 0; i < names.length; i++) {


            try {
                FileWriter erase = new FileWriter(names[i]+".txt");
                erase.flush();
                erase.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public int doMath(){

        switch (expression){

            case "*": return firstInt * secondInt;
            case "/": return firstInt / secondInt;
            case "+": return firstInt + secondInt;
            case "-": return firstInt - secondInt;
            case "=": return firstInt = secondInt;
            default: return 0;
        }
    }
}
