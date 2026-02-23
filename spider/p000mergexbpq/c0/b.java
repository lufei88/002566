package com.github.catvod.spider.p000mergexbpq.c0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import java.util.Iterator;

/* loaded from: classes.dex */
final class b implements Iterator<a> {
    int a = 0;
    final /* synthetic */ c b;

    b(c cVar) {
        this.b = cVar;
    }

    /* renamed from: ۟ۡ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static void m2153(Object obj, int i) {
        if (C0037.m6350() <= 0) {
            c.m2167((c) obj, i);
        }
    }

    /* renamed from: ۟ۥ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m2154(Object obj) {
        if (C0030.m5375() >= 0) {
            return ((b) obj).a;
        }
        return 0;
    }

    /* renamed from: ۡۡۧۦ, reason: not valid java name and contains not printable characters */
    public static c m2155(Object obj) {
        if (C0018.m3956() > 0) {
            return ((b) obj).b;
        }
        return null;
    }

    /* renamed from: ۢۦۣۢ, reason: not valid java name and contains not printable characters */
    public static String[] m2156(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((c) obj).d;
        }
        return null;
    }

    /* renamed from: ۣۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m2157(Object obj) {
        if (C0007.m1886() > 0) {
            return c.m2160((c) obj);
        }
        return 0;
    }

    /* renamed from: ۣۤۡۦ, reason: not valid java name and contains not printable characters */
    public static String[] m2158(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((c) obj).e;
        }
        return null;
    }

    /* renamed from: ۤۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2159(Object obj, Object obj2) {
        if (C0008.m1975() >= 0) {
            return c.m2168((c) obj, (String) obj2);
        }
        return false;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (m2154(this) < m2157(m2155(this))) {
            c cVarM2155 = m2155(this);
            if (!m2159(cVarM2155, m2156(cVarM2155)[m2154(this)])) {
                break;
            }
            this.a = m2154(this) + 1;
        }
        return m2154(this) < m2157(m2155(this));
    }

    @Override // java.util.Iterator
    public final a next() {
        c cVarM2155 = m2155(this);
        String[] strArrM2156 = m2156(cVarM2155);
        int iM2154 = m2154(this);
        a aVar = new a(strArrM2156[iM2154], m2158(cVarM2155)[iM2154], cVarM2155);
        this.a = m2154(this) + 1;
        return aVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        c cVarM2155 = m2155(this);
        int iM2154 = m2154(this) - 1;
        this.a = iM2154;
        m2153(cVarM2155, iM2154);
    }
}