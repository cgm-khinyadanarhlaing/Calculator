package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.isDigitsOnly
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var strNumber: String = ""
    private var strNumber2:String = ""
    private var number1:Double = 0.0
    private var number2:Double = 0.0
    private var result:Double = 0.0
    private var operator:Boolean = false
    private var operatorSign:String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val tvDisplay1: TextView = findViewById(R.id.tvDisplay1)

        val button0:Button = findViewById(R.id.button0)
        val button1:Button = findViewById(R.id.button1)
        val button2:Button = findViewById(R.id.button2)
        val button3:Button = findViewById(R.id.button3)
        val button4:Button = findViewById(R.id.button4)
        val button5:Button = findViewById(R.id.button5)
        val button6:Button = findViewById(R.id.button6)
        val button7:Button = findViewById(R.id.button7)
        val button8:Button = findViewById(R.id.button8)
        val button9:Button = findViewById(R.id.button9)
        val clrBtn:Button = findViewById(R.id.clrBtn)
        val delBtn:Button = findViewById(R.id.delBtn)
        val addBtn:Button = findViewById(R.id.addBtn)
        val subBtn:Button = findViewById(R.id.subBtn)
        val mulBtn:Button = findViewById(R.id.mulBtn)
        val divBtn:Button = findViewById(R.id.divBtn)
        val resultBtn:Button = findViewById(R.id.resultBtn)
        val eqlBtn:Button = findViewById(R.id.eqlBtn)

        clrBtn.setOnClickListener {
            tvDisplay1.clearComposingText();
            tvDisplay1.text = "0"
            strNumber = ""
            strNumber2 = ""
            operatorSign =""
        }
        delBtn.setOnClickListener {
            operator = lastElementOperator(strNumber)
            if (operator) {
                operatorSign = ""
            }
            strNumber = delete (strNumber)
            tvDisplay1.text = strNumber
        }
        addBtn.setOnClickListener {
            if (strNumber.isNotEmpty() && strNumber.isDigitsOnly()) {
                number1 = strNumber.toDouble()
                strNumber += "+"
            }
            operatorSign = "+";
            tvDisplay1.text = strNumber
            strNumber2 = ""
        }
        subBtn.setOnClickListener {
            if (strNumber.isNotEmpty() && strNumber.isDigitsOnly()) {
                number1 = strNumber.toDouble()
                strNumber += "-"
            }
            operatorSign = "-";
            tvDisplay1.text = strNumber
            strNumber2 = ""
        }
        mulBtn.setOnClickListener {
            if (strNumber.isNotEmpty() && strNumber.isDigitsOnly()) {
                number1 = strNumber.toDouble()
                strNumber += "*"
            }
            operatorSign = "*";
            tvDisplay1.text = strNumber
            strNumber2 = ""
        }
        divBtn.setOnClickListener {
            if (strNumber.isNotEmpty() && strNumber.isDigitsOnly()) {
                number1 = strNumber.toDouble()
                strNumber += "/"
            }
            operatorSign = "/";
            tvDisplay1.text = strNumber
            strNumber2 = ""
        }
        resultBtn.setOnClickListener {
            if (strNumber.isNotEmpty() && strNumber.isDigitsOnly()) {
                number1 = strNumber.toDouble()
                strNumber += "%"
            }
            operatorSign = "%";
            tvDisplay1.text = strNumber
            strNumber2 = ""
        }
        eqlBtn.setOnClickListener {
            if (strNumber2.isNotEmpty() && strNumber2.isDigitsOnly()) {
                number2 = strNumber2.toDouble();
                if (operatorSign == "+") {
                    result = addition(number1, number2)
                    tvDisplay1.text = result.toString()
                } else if (operatorSign == "-") {
                    result = subtraction(number1, number2)
                    tvDisplay1.text = result.toString()
                } else if (operatorSign == "/") {
                    result = division(number1, number2)
                    tvDisplay1.text = result.toString()
                } else if (operatorSign == "*") {
                    result = multiply(number1, number2)
                    tvDisplay1.text = result.toString()
                } else {
                    result = resultByDiv(number1, number2)
                    tvDisplay1.text = result.toString()
                }
            }
            strNumber = ""
            strNumber2 = ""
            operatorSign = ""
        }
        button0.setOnClickListener {
            strNumber += "0"
            tvDisplay1.text = strNumber
            operator = lastElementOperator(strNumber)
            if (operator || operatorSign.isNotEmpty()) {
                strNumber2 += "0"
            }
        }
        button1.setOnClickListener {
            strNumber += "1"
            tvDisplay1.text = strNumber
            operator = lastElementOperator(strNumber)
            if (operator || operatorSign.isNotEmpty()) {
                strNumber2 += "1"
            }
        }
        button2.setOnClickListener {
            strNumber += "2"
            tvDisplay1.text = strNumber
            operator = lastElementOperator(strNumber)
            if (operator || operatorSign.isNotEmpty()) {
                strNumber2 += "2"
            }
        }
        button3.setOnClickListener {
            strNumber += "3"
            tvDisplay1.text = strNumber
            operator = lastElementOperator(strNumber)
            if (operator || operatorSign.isNotEmpty()) {
                strNumber2 += "3"
            }
        }
        button4.setOnClickListener {
            strNumber += "4"
            tvDisplay1.text = strNumber
            operator = lastElementOperator(strNumber)
            if (operator || operatorSign.isNotEmpty()) {
                strNumber2 += "4"
            }
        }
        button5.setOnClickListener {
            strNumber += "5"
            tvDisplay1.text = strNumber
            operator = lastElementOperator(strNumber)
            if (operator || operatorSign.isNotEmpty()) {
                strNumber2 += "5"
            }
        }
        button6.setOnClickListener {
            strNumber += "6"
            tvDisplay1.text = strNumber
            operator = lastElementOperator(strNumber)
            if (operator || operatorSign.isNotEmpty()) {
                strNumber2 += "6"
            }
        }
        button7.setOnClickListener {
            strNumber += "7"
            tvDisplay1.text = strNumber
            operator = lastElementOperator(strNumber)
            if (operator || operatorSign.isNotEmpty()) {
                strNumber2 += "7"
            }
        }
        button8.setOnClickListener {
            strNumber += "8"
            tvDisplay1.text = strNumber
            operator = lastElementOperator(strNumber)
            if (operator || operatorSign.isNotEmpty()) {
                strNumber2 += "8"
            }
        }
        button9.setOnClickListener {
            strNumber += "9"
            tvDisplay1.text = strNumber
            operator = lastElementOperator(strNumber)
            if (operator || operatorSign.isNotEmpty()) {
                strNumber2 += "9"
            }
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun delete(inputString: String): String {
        return if (inputString.isNotEmpty()) {
            inputString.dropLast(1)
        } else {
            inputString
        }
    }

    fun lastElementOperator(inputString:String): Boolean {
        if (inputString.isNotEmpty()) {
            val lastElement = inputString.last()
            return when (lastElement) {
                '+', '-', '*', '%', '/' -> true
                else -> false
            }
        } else {
            return false
        }
    }
    fun addition(num1:Double , num2:Double) : Double {
        val answer:Double = num1 + num2;
        return answer;
    }

    fun subtraction(num1:Double , num2:Double) : Double {
        val answer:Double = num1 - num2;
        return answer;
    }

    fun division(num1:Double , num2:Double) : Double {
        val answer:Double = num1 / num2;
        return answer;
    }
    fun multiply(num1:Double , num2:Double) : Double {
        val answer:Double = num1 * num2;
        return answer;
    }

    fun resultByDiv(num1:Double , num2:Double) : Double {
        val answer:Double = num1 % num2;
        return answer;
    }
}