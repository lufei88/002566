package com.github.catvod.spider.merge.h0;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.Button;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* renamed from: com.github.catvod.spider.merge.h0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0326f implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Button b;
    public final /* synthetic */ GradientDrawable c;
    public final /* synthetic */ GradientDrawable d;

    public /* synthetic */ ViewOnFocusChangeListenerC0326f(Button button, GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, int i) {
        this.a = i;
        this.b = button;
        this.c = gradientDrawable;
        this.d = gradientDrawable2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (C0053.m8449(this)) {
            case 0:
                C0018.m3985(C0014.m3342(this), z ? C0009.m2049(this) : C0059.m9262(this));
                break;
            default:
                C0018.m3985(C0014.m3342(this), z ? C0009.m2049(this) : C0059.m9262(this));
                break;
        }
    }
}