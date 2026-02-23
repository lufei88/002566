package com.github.catvod.spider.merge.i;

import android.content.ClipData;
import android.content.ComponentName;
import android.net.Uri;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;

/* renamed from: com.github.catvod.spider.merge.i.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0345e implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ C0345e(int i) {
        this.a = i;
    }

    /* renamed from: ۟۟۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8685(Object obj) {
        if (C0024.m4693() < 0) {
            return IntentSanitizer.Builder.m((Uri) obj);
        }
        return false;
    }

    /* renamed from: ۟۟ۤۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8686(Object obj) {
        if (C0031.m5628() >= 0) {
            return IntentSanitizer.Builder.f((String) obj);
        }
        return false;
    }

    /* renamed from: ۣ۟۠۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m8687(Object obj) {
        if (C0054.m8557() <= 0) {
            return IntentSanitizer.Builder.o(obj);
        }
        return false;
    }

    /* renamed from: ۟ۢۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8688(Object obj) {
        if (C0048.m7971() >= 0) {
            return IntentSanitizer.Builder.l((Uri) obj);
        }
        return false;
    }

    /* renamed from: ۣۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8689(Object obj) {
        if (C0008.m1975() > 0) {
            return IntentSanitizer.Builder.q((ClipData) obj);
        }
        return false;
    }

    /* renamed from: ۣۣ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8690(Object obj) {
        if (C0053.m8389() > 0) {
            return IntentSanitizer.Builder.a((ComponentName) obj);
        }
        return false;
    }

    /* renamed from: ۟ۤۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8691(Object obj) {
        if (C0018.m3956() > 0) {
            return IntentSanitizer.Builder.i(obj);
        }
        return false;
    }

    /* renamed from: ۟ۥ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8692(Object obj) {
        if (C0003.m1463() < 0) {
            return IntentSanitizer.Builder.b((String) obj);
        }
        return false;
    }

    /* renamed from: ۢۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8693(Object obj) {
        if (C0007.m1886() >= 0) {
            return IntentSanitizer.Builder.p((String) obj);
        }
        return false;
    }

    /* renamed from: ۣۨ۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m8694(Object obj) {
        if (C0033.m5872() >= 0) {
            return IntentSanitizer.Builder.k((String) obj);
        }
        return false;
    }

    /* renamed from: ۣۤۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8695(Object obj) {
        if (C0064.m9659() <= 0) {
            return IntentSanitizer.Builder.j((ComponentName) obj);
        }
        return false;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        C0049.m8001(this);
        return C0026.m4937(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (C0049.m8001(this)) {
        }
        return C0009.m2117(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        C0049.m8001(this);
        return C0028.m5120(this, predicate);
    }

    public final boolean test(Object obj) {
        switch (C0049.m8001(this)) {
            case 0:
                return m8695((ComponentName) obj);
            case 1:
                return m8691(obj);
            case 2:
                return m8693((String) obj);
            case 3:
                return m8688((Uri) obj);
            case 4:
                return m8692((String) obj);
            case 5:
                return m8694((String) obj);
            case 6:
                return m8686((String) obj);
            case 7:
                return m8690((ComponentName) obj);
            case 8:
                return m8685((Uri) obj);
            case 9:
                return m8689((ClipData) obj);
            case 10:
                return m8687(obj);
            default:
                return C0062.m9397(obj);
        }
    }
}