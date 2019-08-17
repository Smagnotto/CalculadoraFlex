package br.com.br.com.saraiva.br.com.saraiva.ui.form

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.br.com.saraiva.watachers.DecimalTextWatcher
import br.com.heiderlopes.calculadoraflex.R
import br.com.br.com.saraiva.br.com.saraiva.ui.result.ResultActivity
import kotlinx.android.synthetic.main.activity_form.*

class FormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        etGasPrice.addTextChangedListener(DecimalTextWatcher(etGasPrice))
        etEthanolPrice.addTextChangedListener(DecimalTextWatcher(etEthanolPrice))
        etGasAverage.addTextChangedListener(DecimalTextWatcher(etGasAverage))
        etEthanolAverage.addTextChangedListener(DecimalTextWatcher(etEthanolAverage))

        btCalculate.setOnClickListener {
            val proximaTela = Intent(this@FormActivity, ResultActivity::class.java)
            proximaTela.putExtra("GAS_PRICE", etGasPrice.text.toString().toDouble())
            proximaTela.putExtra("ETHANOL_PRICE", etEthanolPrice.text.toString().toDouble())
            proximaTela.putExtra("GAS_AVERAGE", etGasAverage.text.toString().toDouble())
            proximaTela.putExtra("ETHANOL_AVERAGE", etEthanolAverage.text.toString().toDouble())
            startActivity(proximaTela)

        }
    }
}
