package com.github.catvod.spider.merge.j;

import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Insets;
import android.os.ext.SdkExtensions;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimationController;
import android.view.animation.Interpolator;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.j.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0348b {
    public static /* bridge */ /* synthetic */ WindowInsetsAnimation i(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    /* renamed from: ۟۟ۡۡۧ, reason: not valid java name and contains not printable characters */
    public static Insets m8819(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((WindowInsetsAnimation.Bounds) obj).getLowerBound();
        }
        return null;
    }

    /* renamed from: ۣۣ۟۟۟, reason: not valid java name and contains not printable characters */
    public static void m8820(Object obj, Object obj2) {
        if (C0064.m9659() <= 0) {
            ((ShortcutManager) obj).removeLongLivedShortcuts((List) obj2);
        }
    }

    /* renamed from: ۣ۟۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static int m8821(Object obj) {
        if (C0007.m1886() > 0) {
            return ((WindowInsetsAnimation) obj).getTypeMask();
        }
        return 0;
    }

    /* renamed from: ۟۠ۥۥۡ, reason: not valid java name and contains not printable characters */
    public static long m8822(Object obj) {
        if (C0003.m1463() < 0) {
            return ((WindowInsetsAnimation) obj).getDurationMillis();
        }
        return 0L;
    }

    /* renamed from: ۟۠ۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static float m8823(Object obj) {
        if (C0018.m3956() > 0) {
            return ((WindowInsetsAnimationController) obj).getCurrentAlpha();
        }
        return 0.0f;
    }

    /* renamed from: ۟ۡۡۥۨ, reason: not valid java name and contains not printable characters */
    public static float m8824(Object obj) {
        if (C0058.m9131() < 0) {
            return ((WindowInsetsAnimation) obj).getFraction();
        }
        return 0.0f;
    }

    /* renamed from: ۣ۟ۡ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m8825(Object obj) {
        if (C0047.m7837() > 0) {
            return ((ShortcutInfo) obj).isCached();
        }
        return false;
    }

    /* renamed from: ۟ۦۤۡ۠, reason: not valid java name and contains not printable characters */
    public static float m8826(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((WindowInsetsAnimation) obj).getInterpolatedFraction();
        }
        return 0.0f;
    }

    /* renamed from: ۟ۧۢۥ۟, reason: not valid java name and contains not printable characters */
    public static void m8827(Object obj, boolean z) {
        if (C0015.m3433() > 0) {
            ((WindowInsetsAnimationController) obj).finish(z);
        }
    }

    /* renamed from: ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static Interpolator m8828(Object obj) {
        if (C0005.m1599() < 0) {
            return ((WindowInsetsAnimation) obj).getInterpolator();
        }
        return null;
    }

    /* renamed from: ۡۥۨ۟, reason: not valid java name and contains not printable characters */
    public static List m8829(Object obj, int i) {
        if (C0027.m5017() > 0) {
            return ((ShortcutManager) obj).getShortcuts(i);
        }
        return null;
    }

    /* renamed from: ۢ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static void m8830(Object obj, Object obj2) {
        if (C0005.m1599() < 0) {
            ((View) obj).setWindowInsetsAnimationCallback((WindowInsetsAnimation.Callback) obj2);
        }
    }

    /* renamed from: ۢۡۡۦ, reason: not valid java name and contains not printable characters */
    public static void m8831(Object obj, float f) {
        if (C0064.m9659() <= 0) {
            ((WindowInsetsAnimation) obj).setFraction(f);
        }
    }

    /* renamed from: ۢۤۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8832(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((WindowInsetsAnimationController) obj).isCancelled();
        }
        return false;
    }

    /* renamed from: ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static void m8833(Object obj, Object obj2) {
        if (C0060.m9355() > 0) {
            ((ShortcutManager) obj).pushDynamicShortcut((ShortcutInfo) obj2);
        }
    }

    /* renamed from: ۣۥۣۡ, reason: not valid java name and contains not printable characters */
    public static int m8834(int i) {
        if (C0045.m7538() <= 0) {
            return SdkExtensions.getExtensionVersion(i);
        }
        return 0;
    }

    /* renamed from: ۦۢۦۦ, reason: contains not printable characters */
    public static boolean m8835(Object obj) {
        if (C0003.m1463() < 0) {
            return ((WindowInsetsAnimationController) obj).isFinished();
        }
        return false;
    }

    /* renamed from: ۦۤۦۧ, reason: contains not printable characters */
    public static void m8836(Object obj, Object obj2, float f, float f2) {
        if (C0018.m3956() > 0) {
            ((WindowInsetsAnimationController) obj).setInsetsAndAlpha((Insets) obj2, f, f2);
        }
    }

    /* renamed from: ۣۧۤۥ, reason: not valid java name and contains not printable characters */
    public static Insets m8837(Object obj) {
        if (C0021.m4379() > 0) {
            return ((WindowInsetsAnimation.Bounds) obj).getUpperBound();
        }
        return null;
    }

    /* renamed from: ۨۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static float m8838(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((WindowInsetsAnimationController) obj).getCurrentFraction();
        }
        return 0.0f;
    }
}