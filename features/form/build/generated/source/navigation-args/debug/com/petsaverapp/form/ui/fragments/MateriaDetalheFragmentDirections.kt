package com.petsaverapp.form.ui.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.petsaverapp.form.R

public class MateriaDetalheFragmentDirections private constructor() {
  public companion object {
    public fun actionMateriaDetalheFragmentToHome(): NavDirections =
        ActionOnlyNavDirections(R.id.action_materiaDetalheFragment_to_home)
  }
}
