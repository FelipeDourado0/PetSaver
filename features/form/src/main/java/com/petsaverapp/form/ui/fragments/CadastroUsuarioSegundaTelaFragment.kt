package com.petsaverapp.form.ui.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.util.Log
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.petsaverapp.form.R
import com.petsaverapp.form.databinding.FragmentCadastroUsuarioSegundaTelaBinding
import com.petsaverapp.form.ui.dataEntities.Usuario
import java.lang.Exception

class CadastroUsuarioSegundaTelaFragment : Fragment() {
    private var _binding: FragmentCadastroUsuarioSegundaTelaBinding? = null
    private val bancoDados by lazy {
        FirebaseFirestore.getInstance()
    }
    private val auth by lazy {
        FirebaseAuth.getInstance()
    }
    private val args: CadastroUsuarioSegundaTelaFragmentArgs by navArgs()

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCadastroUsuarioSegundaTelaBinding.inflate(inflater, container, false)

        //Voltar para primeira tela de cadastro
        binding.btnSairTelaLogin2.setOnClickListener {
            findNavController().navigateUp()
        }
        //Faz o index dos docuemntos de privacidade e dos termos de uso.
        clickLinksPrivacidadeSeguranca()

        //Cadastra Usuario
        binding.btnJunteseNosTelaCadastroUsuario2.setOnClickListener {
            if (validaCampos())
                criarAlertaErro(it, "Preencha corretamente o formulário!")
            else {
                val usuario = args.usuario!!
                usuario.apply {
                    this.email = binding.emailEditTextCadastroUsuario2.text.toString()
                    this.senha = binding.senhaNovamenteCadastroUsuario2.text.toString()
                    this.concordouEmReceberNotificacoesSobreVacinacao =
                        binding.concordoReceberNotificacoesCadastroUsuaio2.isChecked
                    this.concordouEmReceberNovidades =
                        binding.receberNovidadesCadastroUsuario2.isChecked
                }
                salvarUsuario(usuario)

            }

        }

        //Função para retirar erro da UI do form
        retiraErro()

        return binding.root
    }

    private fun salvarUsuario(usuario: Usuario){

        auth.createUserWithEmailAndPassword(
            usuario.email!!, usuario.senha!!
        ).addOnSuccessListener { authResult ->
            salvarDados(usuario)
        }.addOnFailureListener { exception ->
            exception.message?.let { exibirMensagem(it) }
        }
    }

    private fun salvarDados(usuario: Usuario) {
        bancoDados
            .collection("Usuarios")
            .document(auth.currentUser?.uid ?: "")
            .set(usuario)
            .addOnSuccessListener {
                exibirMensagem("Usuario salvo com sucesso!")
                findNavController().navigate(R.id.pefilFragment)
            }.addOnFailureListener {
                exibirMensagem("Erro ao salvar usuário!")
            }
    }

    private fun validaCampos(): Boolean {
        var error: Boolean = false
        val primeiroEmailValido = Patterns.EMAIL_ADDRESS.toRegex()
            .matches(binding.emailEditTextCadastroUsuario2.text.toString())

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

    private fun clickLinksPrivacidadeSeguranca() {
        val textoCompleto =
            "Ao criar uma conta, você concorda com a Política de Privacidade e com os Termos de Uso da PetSaver."
        try {
            val spanned = SpannableString(textoCompleto)

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

    private fun exibirMensagem(mensagem: String) {
        Toast.makeText(requireContext(), mensagem, Toast.LENGTH_SHORT).show()
    }

}