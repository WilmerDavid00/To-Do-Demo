// Generated by view binder compiler. Do not edit!
package com.example.tododemo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.tododemo.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignupBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnSignup;

  @NonNull
  public final ConstraintLayout constraintLayout2;

  @NonNull
  public final TextInputEditText firstName;

  @NonNull
  public final TextInputEditText lastName;

  @NonNull
  public final Button loginRedirect;

  @NonNull
  public final TextInputEditText signupMail;

  @NonNull
  public final TextInputEditText signupPassword;

  @NonNull
  public final TextInputLayout textInputLayout;

  @NonNull
  public final TextInputLayout textInputLayout2;

  @NonNull
  public final TextInputLayout textInputLayout3;

  @NonNull
  public final TextInputLayout textInputLayout4;

  @NonNull
  public final TextView textView;

  private ActivitySignupBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnSignup,
      @NonNull ConstraintLayout constraintLayout2, @NonNull TextInputEditText firstName,
      @NonNull TextInputEditText lastName, @NonNull Button loginRedirect,
      @NonNull TextInputEditText signupMail, @NonNull TextInputEditText signupPassword,
      @NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2,
      @NonNull TextInputLayout textInputLayout3, @NonNull TextInputLayout textInputLayout4,
      @NonNull TextView textView) {
    this.rootView = rootView;
    this.btnSignup = btnSignup;
    this.constraintLayout2 = constraintLayout2;
    this.firstName = firstName;
    this.lastName = lastName;
    this.loginRedirect = loginRedirect;
    this.signupMail = signupMail;
    this.signupPassword = signupPassword;
    this.textInputLayout = textInputLayout;
    this.textInputLayout2 = textInputLayout2;
    this.textInputLayout3 = textInputLayout3;
    this.textInputLayout4 = textInputLayout4;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_signup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSignup;
      Button btnSignup = ViewBindings.findChildViewById(rootView, id);
      if (btnSignup == null) {
        break missingId;
      }

      id = R.id.constraintLayout2;
      ConstraintLayout constraintLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout2 == null) {
        break missingId;
      }

      id = R.id.firstName;
      TextInputEditText firstName = ViewBindings.findChildViewById(rootView, id);
      if (firstName == null) {
        break missingId;
      }

      id = R.id.lastName;
      TextInputEditText lastName = ViewBindings.findChildViewById(rootView, id);
      if (lastName == null) {
        break missingId;
      }

      id = R.id.loginRedirect;
      Button loginRedirect = ViewBindings.findChildViewById(rootView, id);
      if (loginRedirect == null) {
        break missingId;
      }

      id = R.id.signupMail;
      TextInputEditText signupMail = ViewBindings.findChildViewById(rootView, id);
      if (signupMail == null) {
        break missingId;
      }

      id = R.id.signupPassword;
      TextInputEditText signupPassword = ViewBindings.findChildViewById(rootView, id);
      if (signupPassword == null) {
        break missingId;
      }

      id = R.id.textInputLayout;
      TextInputLayout textInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout == null) {
        break missingId;
      }

      id = R.id.textInputLayout2;
      TextInputLayout textInputLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout2 == null) {
        break missingId;
      }

      id = R.id.textInputLayout3;
      TextInputLayout textInputLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout3 == null) {
        break missingId;
      }

      id = R.id.textInputLayout4;
      TextInputLayout textInputLayout4 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout4 == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivitySignupBinding((ConstraintLayout) rootView, btnSignup, constraintLayout2,
          firstName, lastName, loginRedirect, signupMail, signupPassword, textInputLayout,
          textInputLayout2, textInputLayout3, textInputLayout4, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
