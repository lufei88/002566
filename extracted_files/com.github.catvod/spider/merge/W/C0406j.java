package com.github.catvod.spider.merge.w;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.h.C0054;

/* renamed from: com.github.catvod.spider.merge.w.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0406j implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ViewPropertyAnimatorUpdateListener a;
    public final /* synthetic */ View b;

    public /* synthetic */ C0406j(ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener, View view) {
        this.a = viewPropertyAnimatorUpdateListener;
        this.b = view;
    }

    /* renamed from: ۟ۤ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m9451(Object obj, Object obj2, Object obj3) {
        if (C0054.m8557() <= 0) {
            ViewPropertyAnimatorCompat.a((ViewPropertyAnimatorUpdateListener) obj, (View) obj2, (ValueAnimator) obj3);
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        m9451(C0027.m5052(this), C0044.m7453(this), valueAnimator);
    }
}