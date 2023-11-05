package com.petsaverapp.form.ui.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.petsaverapp.form.ui.dataEntities.Materia
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class MateriaDetalheFragmentArgs(
  public val materia: Materia? = null,
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Materia::class.java)) {
      result.putParcelable("materia", this.materia as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Materia::class.java)) {
      result.putSerializable("materia", this.materia as Serializable?)
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Materia::class.java)) {
      result.set("materia", this.materia as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Materia::class.java)) {
      result.set("materia", this.materia as Serializable?)
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): MateriaDetalheFragmentArgs {
      bundle.setClassLoader(MateriaDetalheFragmentArgs::class.java.classLoader)
      val __materia : Materia?
      if (bundle.containsKey("materia")) {
        if (Parcelable::class.java.isAssignableFrom(Materia::class.java) ||
            Serializable::class.java.isAssignableFrom(Materia::class.java)) {
          __materia = bundle.get("materia") as Materia?
        } else {
          throw UnsupportedOperationException(Materia::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __materia = null
      }
      return MateriaDetalheFragmentArgs(__materia)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        MateriaDetalheFragmentArgs {
      val __materia : Materia?
      if (savedStateHandle.contains("materia")) {
        if (Parcelable::class.java.isAssignableFrom(Materia::class.java) ||
            Serializable::class.java.isAssignableFrom(Materia::class.java)) {
          __materia = savedStateHandle.get<Materia?>("materia")
        } else {
          throw UnsupportedOperationException(Materia::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __materia = null
      }
      return MateriaDetalheFragmentArgs(__materia)
    }
  }
}
