package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.ImageButton; // Added import

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private String currentDisplay = "0";
    private String previousValue = null;
    private String operation = null;
    private boolean newNumber = true;
    private double memoryValue = 0;

    // Claves para guardar el estado
    private static final String KEY_DISPLAY = "display";
    private static final String KEY_PREVIOUS = "previous";
    private static final String KEY_OPERATION = "operation";
    private static final String KEY_NEW_NUMBER = "newNumber";
    private static final String KEY_MEMORY = "memoryValue";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);

        // Restaurar estado si existe
        if (savedInstanceState != null) {
            currentDisplay = savedInstanceState.getString(KEY_DISPLAY, "0");
            previousValue = savedInstanceState.getString(KEY_PREVIOUS);
            operation = savedInstanceState.getString(KEY_OPERATION);
            newNumber = savedInstanceState.getBoolean(KEY_NEW_NUMBER, true);
            memoryValue = savedInstanceState.getDouble(KEY_MEMORY, 0);
            updateDisplay();
        }

        setupButtons();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_DISPLAY, currentDisplay);
        outState.putString(KEY_PREVIOUS, previousValue);
        outState.putString(KEY_OPERATION, operation);
        outState.putBoolean(KEY_NEW_NUMBER, newNumber);
        outState.putDouble(KEY_MEMORY, memoryValue);
    }

    private void setupButtons() {
        // Botones numéricos
        setNumberButtonListener(R.id.btn0, "0");
        setNumberButtonListener(R.id.btn1, "1");
        setNumberButtonListener(R.id.btn2, "2");
        setNumberButtonListener(R.id.btn3, "3");
        setNumberButtonListener(R.id.btn4, "4");
        setNumberButtonListener(R.id.btn5, "5");
        setNumberButtonListener(R.id.btn6, "6");
        setNumberButtonListener(R.id.btn7, "7");
        setNumberButtonListener(R.id.btn8, "8");
        setNumberButtonListener(R.id.btn9, "9");

        // Botones de operaciones
        setOperationButtonListener(R.id.btnAdd, "+");
        setOperationButtonListener(R.id.btnSubtract, "-");
        setOperationButtonListener(R.id.btnMultiply, "×");
        setOperationButtonListener(R.id.btnDivide, "÷");

        // Botón decimal
        Button btnDecimal = findViewById(R.id.btnDecimal);
        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleDecimal();
            }
        });

        // Botón igual
        Button btnEquals = findViewById(R.id.btnEquals);
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });

        // Botón Clear
        Button btnClear = findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });

        // Botón AC (mismo comportamiento que C)
        Button btnA = findViewById(R.id.btnA);
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });

        // Botón Backspace
        ImageButton btnBackspace = findViewById(R.id.btnBackspace);
        btnBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backspace();
            }
        });

        // Botón raíz cuadrada
        ImageButton btnSquareRoot = findViewById(R.id.btnSquareRoot);
        btnSquareRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleSquareRoot();
            }
        });

        // Botón elevar al cuadrado
        Button btnSquare = findViewById(R.id.btnSquare);
        btnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleSquare();
            }
        });

        // Botón porcentaje
        Button btnPercent = findViewById(R.id.btnPercent);
        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handlePercent();
            }
        });

        // Botones de Memoria
        Button btnMPlus = findViewById(R.id.btnMPlus);
        btnMPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleMemory(true);
            }
        });

        Button btnMMinus = findViewById(R.id.btnMMinus);
        btnMMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleMemory(false);
            }
        });
    }

    private void setNumberButtonListener(int buttonId, final String number) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleNumber(number);
            }
        });
    }

    private void setOperationButtonListener(int buttonId, final String op) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleOperation(op);
            }
        });
    }

    private void handleNumber(String num) {
        if (newNumber) {
            currentDisplay = num;
            newNumber = false;
        } else {
            currentDisplay = currentDisplay.equals("0") ? num : currentDisplay + num;
        }
        updateDisplay();
    }

    private void handleDecimal() {
        if (newNumber) {
            currentDisplay = "0.";
            newNumber = false;
        } else if (!currentDisplay.contains(".")) {
            currentDisplay = currentDisplay + ".";
        }
        updateDisplay();
    }

    private void handleOperation(String op) {
        if (previousValue != null && operation != null && !newNumber) {
            calculate();
        }

        previousValue = currentDisplay;
        operation = op;
        newNumber = true;
    }

    private void handleSquareRoot() {
        double current = Double.parseDouble(currentDisplay);
        double result = Math.sqrt(current);
        formatAndDisplayResult(result);
    }

    private void handleSquare() {
        double current = Double.parseDouble(currentDisplay);
        double result = current * current;
        formatAndDisplayResult(result);
    }

    private void handlePercent() {
        double current = Double.parseDouble(currentDisplay);
        double result = current / 100;
        formatAndDisplayResult(result);
    }

    private void handleMemory(boolean add) {
        double current = Double.parseDouble(currentDisplay);
        if (add) {
            memoryValue += current;
            Toast.makeText(this, "Sumado a la memoria: " + current, Toast.LENGTH_SHORT).show();
        } else {
            memoryValue -= current;
            Toast.makeText(this, "Restado de la memoria: " + current, Toast.LENGTH_SHORT).show();
        }
        newNumber = true; // Despues de guardar en memoria, el siguiente input empieza numero nuevo
    }

    private void calculate() {
        if (previousValue == null || operation == null)
            return;

        double prev = Double.parseDouble(previousValue);
        double current = Double.parseDouble(currentDisplay);
        double result = 0;

        switch (operation) {
            case "+":
                result = prev + current;
                break;
            case "-":
                result = prev - current;
                break;
            case "×":
                result = prev * current;
                break;
            case "÷":
                result = current != 0 ? prev / current : 0;
                break;
        }

        formatAndDisplayResult(result);
        previousValue = null;
        operation = null;
    }

    private void formatAndDisplayResult(double result) {
        if (result == (long) result) {
            currentDisplay = String.valueOf((long) result);
        } else {
            currentDisplay = String.valueOf(result);
        }
        newNumber = true;
        updateDisplay();
    }

    private void clear() {
        currentDisplay = "0";
        previousValue = null;
        operation = null;
        newNumber = true;
        updateDisplay();
    }

    private void backspace() {
        if (currentDisplay.length() > 1) {
            currentDisplay = currentDisplay.substring(0, currentDisplay.length() - 1);
        } else {
            currentDisplay = "0";
            newNumber = true;
        }
        updateDisplay();
    }

    private void updateDisplay() {
        display.setText(currentDisplay);
    }
}
