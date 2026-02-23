package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge-xbpq.e0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0122e extends AbstractC0123f {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f324short = {1033, 1029};

    C0122e() {
    }

    C0122e(N... nArr) {
        List listM1203 = C0001.m1203(nArr);
        if (m2696(this) > 1) {
            C0004.m1532(m2697(this), new C0121d(listM1203));
        } else {
            C0034.m6012(m2697(this), listM1203);
        }
        m2695(this);
    }

    /* renamed from: ۟۠ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static void m2695(Object obj) {
        if (C0056.m8886() < 0) {
            ((AbstractC0123f) obj).b();
        }
    }

    /* renamed from: ۟ۦۤۡۢ, reason: not valid java name and contains not printable characters */
    public static int m2696(Object obj) {
        if (C0038.m6471() > 0) {
            return ((AbstractC0123f) obj).b;
        }
        return 0;
    }

    /* renamed from: ۟ۧۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static ArrayList m2697(Object obj) {
        if (C0001.m1164() < 0) {
            return ((AbstractC0123f) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۧۨۨ, reason: not valid java name and contains not printable characters */
    public static short[] m2698() {
        if (C0015.m3433() >= 0) {
            return f324short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        for (int i = 0; i < m2696(this); i++) {
            if (C0007.m1805((N) C0028.m5167(m2697(this), i), lVar, lVar2)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return C0044.m7450(m2697(this), C0053.m8477(m2698(), 0, 2, 1061));
    }
}