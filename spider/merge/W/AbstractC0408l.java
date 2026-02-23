package com.github.catvod.spider.merge.w;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* renamed from: com.github.catvod.spider.merge.w.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0408l {
    public static /* bridge */ /* synthetic */ WindowInsetsController.OnControllableInsetsChangedListener e(Object obj) {
        return (WindowInsetsController.OnControllableInsetsChangedListener) obj;
    }

    /* renamed from: ۣ۟۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static Insets m9452(Object obj, int i) {
        if (C0032.m5686() < 0) {
            return ((WindowInsets) obj).getInsetsIgnoringVisibility(i);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۤۧ, reason: not valid java name and contains not printable characters */
    public static int m9453(Object obj) {
        if (C0055.m8740() >= 0) {
            return ((WindowInsetsController) obj).getSystemBarsBehavior();
        }
        return 0;
    }

    /* renamed from: ۟ۡۤۢ, reason: not valid java name and contains not printable characters */
    public static CharSequence m9454(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((AccessibilityNodeInfo) obj).getStateDescription();
        }
        return null;
    }

    /* renamed from: ۟ۢۥۣۢ, reason: not valid java name and contains not printable characters */
    public static void m9455(Object obj, int i, int i2) {
        if (C0008.m1975() >= 0) {
            ((WindowInsetsController) obj).setSystemBarsAppearance(i, i2);
        }
    }

    /* renamed from: ۟ۢۨۨ۠, reason: not valid java name and contains not printable characters */
    public static int m9456() {
        if (C0006.m1726() < 0) {
            return WindowInsets.Type.statusBars();
        }
        return 0;
    }

    /* renamed from: ۣ۟ۡۦۧ, reason: not valid java name and contains not printable characters */
    public static int m9457(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((WindowInsetsController) obj).getSystemBarsAppearance();
        }
        return 0;
    }

    /* renamed from: ۟ۤ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m9458(Object obj, Object obj2) {
        if (C0016.m3596() < 0) {
            ((WindowInsetsController) obj).addOnControllableInsetsChangedListener((WindowInsetsController.OnControllableInsetsChangedListener) obj2);
        }
    }

    /* renamed from: ۟ۤ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static void m9459(Object obj, Object obj2) {
        if (C0046.m7701() >= 0) {
            ((WindowInsetsController) obj).removeOnControllableInsetsChangedListener((WindowInsetsController.OnControllableInsetsChangedListener) obj2);
        }
    }

    /* renamed from: ۟ۥ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m9460(Object obj, Object obj2) {
        if (C0020.m4210() <= 0) {
            ((AccessibilityNodeInfo) obj).setStateDescription((CharSequence) obj2);
        }
    }

    /* renamed from: ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static void m9461(Object obj, int i) {
        if (C0050.m8121() < 0) {
            ((WindowInsetsController) obj).setSystemBarsBehavior(i);
        }
    }

    /* renamed from: ۢۤۤۡ, reason: not valid java name and contains not printable characters */
    public static int m9462() {
        if (C0048.m7971() >= 0) {
            return WindowInsets.Type.navigationBars();
        }
        return 0;
    }

    /* renamed from: ۤۡۡۨ, reason: not valid java name and contains not printable characters */
    public static WindowInsets.Builder m9463(Object obj, int i, Object obj2) {
        if (C0017.m3633() < 0) {
            return ((WindowInsets.Builder) obj).setInsetsIgnoringVisibility(i, (Insets) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣۤۨ, reason: not valid java name and contains not printable characters */
    public static void m9464(Object obj, int i, long j, Object obj2, Object obj3, Object obj4) {
        if (C0039.m6529() < 0) {
            ((WindowInsetsController) obj).controlWindowInsetsAnimation(i, j, (Interpolator) obj2, (CancellationSignal) obj3, (WindowInsetsAnimationControlListener) obj4);
        }
    }

    /* renamed from: ۦۣۡۢ, reason: contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m9465() {
        if (C0008.m1975() > 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        }
        return null;
    }

    /* renamed from: ۦۥۢۡ, reason: contains not printable characters */
    public static int m9466() {
        if (C0001.m1164() < 0) {
            return WindowInsets.Type.captionBar();
        }
        return 0;
    }

    /* renamed from: ۦۧۤۢ, reason: contains not printable characters */
    public static int m9467() {
        if (C0032.m5686() < 0) {
            return WindowInsets.Type.displayCutout();
        }
        return 0;
    }
}