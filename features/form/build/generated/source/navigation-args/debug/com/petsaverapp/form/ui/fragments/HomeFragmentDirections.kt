package com.petsaverapp.form.ui.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.petsaverapp.form.R
import com.petsaverapp.form.ui.dataEntities.Materia
import java.io.Serializable
import kotlin.Int
import kotlin.Suppress

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeToMateriaDetalheFragment(
    public val materia: Materia? = null,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_home_to_materiaDetalheFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Materia::class.java)) {
          result.putParcelable("materia", this.materia as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(Materia::class.java)) {
          result.putSerializable("materia", this.materia as Serializable?)
        }
        return result
      }
  }

  public companion object {
    public fun actionHome2ToBemVindoFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_home2_to_bemVindoFragment)

    public fun actionHomeToMateriaDetalheFragment(materia: Materia? = null): NavDirections =
        ActionHomeToMateriaDetalheFragment(materia)
  }
}
