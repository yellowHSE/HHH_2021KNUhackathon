// Generated by view binder compiler. Do not edit!
package com.example.staff_reservation.databinding;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.viewbinding.ViewBinding;
import android.widget.TextView;
import com.example.staff_reservation.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final FloatingActionButton fab;

  @NonNull
  public final TabLayout tabs;

  @NonNull
  public final TextView title;

  @NonNull
  public final ViewPager viewPager;

  private ActivityMainBinding(@NonNull CoordinatorLayout rootView,
      @NonNull FloatingActionButton fab, @NonNull TabLayout tabs, @NonNull TextView title,
      @NonNull ViewPager viewPager) {
    this.rootView = rootView;
    this.fab = fab;
    this.tabs = tabs;
    this.title = title;
    this.viewPager = viewPager;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fab;
      FloatingActionButton fab = rootView.findViewById(id);
      if (fab == null) {
        break missingId;
      }

      id = R.id.tabs;
      TabLayout tabs = rootView.findViewById(id);
      if (tabs == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = rootView.findViewById(id);
      if (title == null) {
        break missingId;
      }

      id = R.id.view_pager;
      ViewPager viewPager = rootView.findViewById(id);
      if (viewPager == null) {
        break missingId;
      }

      return new ActivityMainBinding((CoordinatorLayout) rootView, fab, tabs, title, viewPager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
