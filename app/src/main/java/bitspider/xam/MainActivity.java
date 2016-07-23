package bitspider.xam;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText inputProductPrice,inputVat,inputDiscount;
    Button calculate;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //input
        inputProductPrice=(EditText)findViewById(R.id.inputProductPrice);
        inputVat=(EditText)findViewById(R.id.inputVat);
        inputDiscount=(EditText)findViewById(R.id.inputDiscont);
        //calulate
        calculate=(Button)findViewById(R.id.calculate);
        //result
        result=(TextView)findViewById(R.id.resultText);


    }


    public void calculate(View view) {
        double productPrice=Double.parseDouble(inputProductPrice.getText().toString());
        double productVat=Double.parseDouble(inputVat.getText().toString());
        double productDiscount=Double.parseDouble(inputDiscount.getText().toString());

//        double res;
////       productPrice=productPrice+(productPrice*(productVat/100));
////
////          res=productPrice-(productPrice*(productDiscount/100));

        ProductPrice pp = new ProductPrice();

        pp.setInputProductPrice(productPrice);
        pp.setInputVat(productVat);
        pp.setInputDiscount(productDiscount);

        result.setText(String.valueOf(pp.calculation()));
    }
}
