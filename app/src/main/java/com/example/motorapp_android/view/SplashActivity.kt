import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.motorapp_android.R
import com.example.motorapp_android.contract.SplashContract
import com.example.motorapp_android.presenter.SplashPresenter
import com.example.motorapp_android.view.MainActivity

class SplashActivity : AppCompatActivity(), SplashContract {
    private lateinit var presenter: SplashPresenter

    // Agregar la propiedad context como se espera en la interfaz SplashContract
    override val context: Context
        get() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        presenter = SplashPresenter(this)
        presenter.init()
    }

    override fun showLoading() {
        Toast.makeText(this, "Cargando", Toast.LENGTH_SHORT).show()
    }

    override fun hideLoading() {
        Toast.makeText(this, "Ocultando", Toast.LENGTH_SHORT).show()
    }

    override fun navigateToNextScreen() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}
