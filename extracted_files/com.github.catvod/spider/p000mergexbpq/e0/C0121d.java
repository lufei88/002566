package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.github.catvod.spider.merge-xbpq.e0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0121d extends AbstractC0123f {
    C0121d(Collection<N> collection) {
        C0034.m6012(m2692(this), collection);
        m2694(this);
    }

    C0121d(N... nArr) {
        this(C0001.m1203(nArr));
    }

    /* renamed from: ۟ۦ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m2692(Object obj) {
        if (C0058.m9131() < 0) {
            return ((AbstractC0123f) obj).a;
        }
        return null;
    }

    /* renamed from: ۡۢۨۡ, reason: not valid java name and contains not printable characters */
    public static int m2693(Object obj) {
        if (C0030.m5375() >= 0) {
            return ((AbstractC0123f) obj).b;
        }
        return 0;
    }

    /* renamed from: ۨۡۨۤ, reason: not valid java name and contains not printable characters */
    public static void m2694(Object obj) {
        if (C0003.m1463() < 0) {
            ((AbstractC0123f) obj).b();
        }
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        for (int iM2693 = m2693(this) - 1; iM2693 >= 0; iM2693--) {
            if (!C0007.m1805((N) C0028.m5167(m2692(this), iM2693), lVar, lVar2)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return C0044.m7450(m2692(this), C0007.m1840());
    }
}