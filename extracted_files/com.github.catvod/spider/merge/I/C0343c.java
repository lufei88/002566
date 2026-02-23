package com.github.catvod.spider.merge.i;

import android.content.ComponentName;
import android.net.Uri;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;

/* renamed from: com.github.catvod.spider.merge.i.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0343c implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ C0343c(String str, int i) {
        this.a = i;
        this.b = str;
    }

    /* renamed from: ۟ۡۤۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8679(Object obj, Object obj2) {
        if (C0045.m7538() < 0) {
            return IntentSanitizer.Builder.c((String) obj, (ComponentName) obj2);
        }
        return false;
    }

    /* renamed from: ۢۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8680(Object obj, Object obj2) {
        if (C0059.m9257() < 0) {
            return IntentSanitizer.Builder.h((String) obj, (Uri) obj2);
        }
        return false;
    }

    /* renamed from: ۢۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8681(Object obj, Object obj2) {
        if (C0057.m9017() >= 0) {
            return IntentSanitizer.Builder.d((String) obj, (Uri) obj2);
        }
        return false;
    }

    /* renamed from: ۣۣۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8682(Object obj, Object obj2) {
        if (C0038.m6471() >= 0) {
            return IntentSanitizer.Builder.n((String) obj, (Uri) obj2);
        }
        return false;
    }

    /* renamed from: ۤۧۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8683(Object obj, Object obj2) {
        if (C0058.m9131() < 0) {
            return IntentSanitizer.Builder.g((String) obj, (Uri) obj2);
        }
        return false;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        C0007.m1804(this);
        return C0026.m4937(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (C0007.m1804(this)) {
        }
        return C0009.m2117(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        C0007.m1804(this);
        return C0028.m5120(this, predicate);
    }

    public final boolean test(Object obj) {
        switch (C0007.m1804(this)) {
            case 0:
                return m8683(C0022.m4446(this), (Uri) obj);
            case 1:
                return C0007.m1815(C0022.m4446(this), (String) obj);
            case 2:
                return m8679(C0022.m4446(this), (ComponentName) obj);
            case 3:
                return m8682(C0022.m4446(this), (Uri) obj);
            case 4:
                return m8681(C0022.m4446(this), (Uri) obj);
            default:
                return m8680(C0022.m4446(this), (Uri) obj);
        }
    }
}