// Generated by view binder compiler. Do not edit!
package com.petsaverapp.form.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.petsaverapp.form.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMateriaDetalheBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnVoltarMateriaTela;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final TextView dataMateria;

  @NonNull
  public final Guideline guideline7;

  @NonNull
  public final Guideline guideline8;

  @NonNull
  public final ShapeableImageView imgAuthorMateria;

  @NonNull
  public final ImageView imgPrincipalMateria;

  @NonNull
  public final TextView temaMateria;

  @NonNull
  public final TextView textoPrincipal;

  @NonNull
  public final TextView tituloMateria;

  private FragmentMateriaDetalheBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnVoltarMateriaTela, @NonNull ConstraintLayout constraintLayout,
      @NonNull TextView dataMateria, @NonNull Guideline guideline7, @NonNull Guideline guideline8,
      @NonNull ShapeableImageView imgAuthorMateria, @NonNull ImageView imgPrincipalMateria,
      @NonNull TextView temaMateria, @NonNull TextView textoPrincipal,
      @NonNull TextView tituloMateria) {
    this.rootView = rootView;
    this.btnVoltarMateriaTela = btnVoltarMateriaTela;
    this.constraintLayout = constraintLayout;
    this.dataMateria = dataMateria;
    this.guideline7 = guideline7;
    this.guideline8 = guideline8;
    this.imgAuthorMateria = imgAuthorMateria;
    this.imgPrincipalMateria = imgPrincipalMateria;
    this.temaMateria = temaMateria;
    this.textoPrincipal = textoPrincipal;
    this.tituloMateria = tituloMateria;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMateriaDetalheBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMateriaDetalheBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_materia_detalhe, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMateriaDetalheBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnVoltarMateriaTela;
      Button btnVoltarMateriaTela = ViewBindings.findChildViewById(rootView, id);
      if (btnVoltarMateriaTela == null) {
        break missingId;
      }

      id = R.id.constraintLayout;
      ConstraintLayout constraintLayout = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout == null) {
        break missingId;
      }

      id = R.id.dataMateria;
      TextView dataMateria = ViewBindings.findChildViewById(rootView, id);
      if (dataMateria == null) {
        break missingId;
      }

      id = R.id.guideline7;
      Guideline guideline7 = ViewBindings.findChildViewById(rootView, id);
      if (guideline7 == null) {
        break missingId;
      }

      id = R.id.guideline8;
      Guideline guideline8 = ViewBindings.findChildViewById(rootView, id);
      if (guideline8 == null) {
        break missingId;
      }

      id = R.id.imgAuthorMateria;
      ShapeableImageView imgAuthorMateria = ViewBindings.findChildViewById(rootView, id);
      if (imgAuthorMateria == null) {
        break missingId;
      }

      id = R.id.imgPrincipalMateria;
      ImageView imgPrincipalMateria = ViewBindings.findChildViewById(rootView, id);
      if (imgPrincipalMateria == null) {
        break missingId;
      }

      id = R.id.temaMateria;
      TextView temaMateria = ViewBindings.findChildViewById(rootView, id);
      if (temaMateria == null) {
        break missingId;
      }

      id = R.id.textoPrincipal;
      TextView textoPrincipal = ViewBindings.findChildViewById(rootView, id);
      if (textoPrincipal == null) {
        break missingId;
      }

      id = R.id.tituloMateria;
      TextView tituloMateria = ViewBindings.findChildViewById(rootView, id);
      if (tituloMateria == null) {
        break missingId;
      }

      return new FragmentMateriaDetalheBinding((ConstraintLayout) rootView, btnVoltarMateriaTela,
          constraintLayout, dataMateria, guideline7, guideline8, imgAuthorMateria,
          imgPrincipalMateria, temaMateria, textoPrincipal, tituloMateria);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
