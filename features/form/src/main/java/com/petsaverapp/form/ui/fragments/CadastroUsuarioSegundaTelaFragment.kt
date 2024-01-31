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
import androidx.core.content.ContextCompat
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.petsaverapp.form.R
import com.petsaverapp.form.databinding.FragmentCadastroUsuarioSegundaTelaBinding
import java.lang.Exception

class CadastroUsuarioSegundaTelaFragment : Fragment() {
    private var _binding: FragmentCadastroUsuarioSegundaTelaBinding? = null
    private val textoPoliticaPrivacidade =
        "Ao criar uma conta, você concorda com a Política de Privacidade e com os Termos de Uso da PetSaver."
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCadastroUsuarioSegundaTelaBinding.inflate(inflater, container, false)

        //Voltar para primeira tela de cadastro
        binding.btnSairTelaLogin2.setOnClickListener {
            findNavController().navigateUp()
        }
        //Faz o index dos docuemntos de privacidade e dos termos de uso.
        clickLinksPrivacidadeSeguranca(textoPoliticaPrivacidade)

        //Cadastra Usuario
        binding.btnJunteseNosTelaCadastroUsuario2.setOnClickListener {
            if (validaCampos())
                criarAlertaErro(it, "Preencha corretamente o formulário!")
        }

        retiraErro()

        return binding.root
    }

    private fun validaCampos(): Boolean {
        var error: Boolean = false
        var primeiroEmailValido = Patterns.EMAIL_ADDRESS.toRegex().matches(binding.emailEditTextCadastroUsuario2.text.toString())


        if (binding.emailEditTextCadastroUsuario2.text!!.isEmpty() || !primeiroEmailValido) {
            binding.emailLayoutCadastroUsuario2.error = "Digite um email valido!"
            error = true
        }

        if (binding.emailNovamenteEditTextCadastroUsuario2.text!!.isEmpty() ||
            binding.emailNovamenteEditTextCadastroUsuario2.text?.toString() != binding.emailEditTextCadastroUsuario2.text?.toString()
        ) {
            binding.emailNovamenteLayoutCadastroUsuario2.error =
                "Email digitado é inválido ou divergente do anterior!"
            error = true
        }

        if (binding.editeTextLoginSenha2.text!!.isEmpty() ||
            binding.editeTextLoginSenha2.text!!.toString().length < 8
        ) {
            binding.layoutLoginSenha2.error = "Senha deve ter no mínimo 8 caracteres!"
            error = true
        }

        if (binding.senhaNovamenteCadastroUsuario2.text!!.isEmpty() ||
            binding.editeTextLoginSenha2.text!!.toString() != binding.senhaNovamenteCadastroUsuario2.text!!.toString()
        ) {
            binding.layoutSenhaNovamenteCadastroUsuario2.error =
                "Senha digitada é inválida ou diferente a anterior!"
            error = true
        }

        if (!binding.receberNovidadesCadastroUsuario2.isChecked)
            binding.receberNovidadesCadastroUsuario2.error = ""

        if (!binding.concordoReceberNotificacoesCadastroUsuaio2.isChecked)
            binding.concordoReceberNotificacoesCadastroUsuaio2.error = ""

        return error
    }

    private fun retiraErro() {
        binding.emailEditTextCadastroUsuario2.addTextChangedListener {
            binding.emailLayoutCadastroUsuario2.error = null
        }

        binding.emailNovamenteEditTextCadastroUsuario2.addTextChangedListener {
            binding.emailNovamenteLayoutCadastroUsuario2.error = null
        }

        binding.editeTextLoginSenha2.addTextChangedListener {
            binding.layoutLoginSenha2.error = null
        }

        binding.senhaNovamenteCadastroUsuario2.addTextChangedListener {
            binding.layoutSenhaNovamenteCadastroUsuario2.error = null
        }

        binding.receberNovidadesCadastroUsuario2.setOnClickListener {
            binding.receberNovidadesCadastroUsuario2.error = null
        }
        binding.concordoReceberNotificacoesCadastroUsuaio2.setOnClickListener {
            binding.concordoReceberNotificacoesCadastroUsuaio2.error = null
        }
    }

    private fun clickLinksPrivacidadeSeguranca(textoCompleto: String) {
        try {
            val spanned = SpannableString(textoCompleto)
            val matcher = Patterns.WEB_URL.matcher(textoCompleto)
            var matchStart: Int
            var matchEnd: Int

            val politicaPrivacidadeLink: ClickableSpan = object : ClickableSpan() {
                override fun onClick(widget: View) {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"))
                    startActivity(intent)
                }

                override fun updateDrawState(ds: TextPaint) {
                    super.updateDrawState(ds)
                    ds.isUnderlineText = true
                }
            }

            val termosUsoLink: ClickableSpan = object : ClickableSpan() {
                override fun onClick(widget: View) {
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
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun criarAlertaErro(view: View, mensagem: String) {
        Snackbar.make(view, mensagem, Snackbar.LENGTH_SHORT).setBackgroundTint(
            ContextCompat.getColor(requireContext(), R.color.red)
        ).show()
    }

}