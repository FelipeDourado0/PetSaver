package com.petsaverapp.form.ui.fragments
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.SpannedString
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.petsaverapp.form.R
import com.petsaverapp.form.databinding.FragmentCadastroUsuarioSegundaTelaBinding
import java.lang.Exception

class CadastroUsuarioSegundaTelaFragment : Fragment() {
    private var _binding: FragmentCadastroUsuarioSegundaTelaBinding? = null
    private val textoPoliticaPrivacidade = "Ao criar uma conta, você concorda com a Política de Privacidade e com os Termos de Uso da PetSaver."
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCadastroUsuarioSegundaTelaBinding.inflate(inflater, container, false)
        clickLinksPrivacidadeSeguranca(textoPoliticaPrivacidade)
        return binding.root
    }

    private fun clickLinksPrivacidadeSeguranca(textoCompleto: String){
        try{
            val spanned = SpannableString(textoCompleto)
            val matcher = Patterns.WEB_URL.matcher(textoCompleto)
            var matchStart: Int
            var matchEnd: Int

            val politicaPrivacidadeLink: ClickableSpan = object: ClickableSpan(){
                override fun onClick(widget: View){
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"))
                    startActivity(intent)
                }

                override fun updateDrawState(ds: TextPaint) {
                    super.updateDrawState(ds)
                    ds.isUnderlineText = true
                }
            }

            val termosUsoLink : ClickableSpan = object: ClickableSpan(){
                override fun onClick(widget: View){
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://wps.com"))
                    startActivity(intent)
                }

                override fun updateDrawState(ds: TextPaint) {
                    super.updateDrawState(ds)
                    ds.isUnderlineText = true
                }
            }
            spanned.setSpan(politicaPrivacidadeLink, 40, 63, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            spanned.setSpan(termosUsoLink, 73, 86, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

            binding.textoPoliticaPrivacidade.text = spanned
            binding.textoPoliticaPrivacidade.movementMethod = LinkMovementMethod.getInstance()
        } catch (e: Exception){
            e.printStackTrace()
        }
    }


}