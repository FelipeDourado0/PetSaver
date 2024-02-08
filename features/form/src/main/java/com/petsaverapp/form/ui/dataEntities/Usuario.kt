package com.petsaverapp.form.ui.dataEntities

import android.os.Parcel
import android.os.Parcelable

data class Usuario(
    var nome: String?,
    var dataNascimento: String?,
    var cpf: String?,
    var cep: String?,
    var endereco: String?,
    var numeroEndereco: String?,
    var estado: String?,
    var complemento: String?,
    var email: String?,
    var senha: String?,
    var concordouEmReceberNovidades: Boolean,
    var concordouEmReceberNotificacoesSobreVacinacao: Boolean
): Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readByte() != 0.toByte(),
        parcel.readByte() != 0.toByte()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nome)
        parcel.writeString(dataNascimento)
        parcel.writeString(cpf)
        parcel.writeString(cep)
        parcel.writeString(endereco)
        parcel.writeString(numeroEndereco)
        parcel.writeString(estado)
        parcel.writeString(complemento)
        parcel.writeString(email)
        parcel.writeString(senha)
        parcel.writeByte(if (concordouEmReceberNovidades) 1 else 0)
        parcel.writeByte(if (concordouEmReceberNotificacoesSobreVacinacao) 1 else 0)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Usuario> {
        override fun createFromParcel(parcel: Parcel): Usuario {
            return Usuario(parcel)
        }

        override fun newArray(size: Int): Array<Usuario?> {
            return arrayOfNulls(size)
        }
    }
}
