package com.github.catvod.spider.p000mergexbpq.c0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.List;

/* loaded from: classes.dex */
abstract class p extends r {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f191short = {2526, 2457, 2450, 2462, 2441, 2436, 2445, 2456};
    Object f;

    p() {
    }

    private void J() {
        Object objM2249 = m2249(this);
        if (objM2249 instanceof c) {
            return;
        }
        c cVar = new c();
        this.f = cVar;
        if (objM2249 != null) {
            C0038.m6446(cVar, C0024.m4670(this), (String) objM2249);
        }
    }

    /* renamed from: ۣ۟ۢۤۡ, reason: not valid java name and contains not printable characters */
    public static short[] m2246() {
        if (C0008.m1975() > 0) {
            return f191short;
        }
        return null;
    }

    /* renamed from: ۣۣۢۤ, reason: not valid java name and contains not printable characters */
    public static String m2247(Object obj, Object obj2) {
        if (C0060.m9355() >= 0) {
            return ((p) obj).c((String) obj2);
        }
        return null;
    }

    /* renamed from: ۤۢۦۣ, reason: not valid java name and contains not printable characters */
    public static List m2248() {
        if (C0016.m3596() <= 0) {
            return r.e;
        }
        return null;
    }

    /* renamed from: ۦۣۦ, reason: contains not printable characters */
    public static Object m2249(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((p) obj).f;
        }
        return null;
    }

    /* renamed from: ۦۥۣۣ, reason: contains not printable characters */
    public static void m2250(Object obj) {
        if (C0062.m9429() > 0) {
            ((p) obj).J();
        }
    }

    /* renamed from: ۧۢۡ۟, reason: not valid java name and contains not printable characters */
    public static r m2251(Object obj) {
        if (C0001.m1164() <= 0) {
            return ((r) obj).c;
        }
        return null;
    }

    final String I() {
        return m2247(this, C0024.m4670(this));
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public String a(String str) {
        m2250(this);
        return super.a(str);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public r b(String str, String str2) {
        if ((m2249(this) instanceof c) || !C0007.m1815(str, C0014.m3332(m2246(), 0, 8, 2557))) {
            m2250(this);
            super.b(str, str2);
        } else {
            this.f = str2;
        }
        return this;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public String c(String str) {
        C0023.m4613(str);
        return !(m2249(this) instanceof c) ? C0007.m1815(str, C0024.m4670(this)) ? (String) m2249(this) : C0007.m1840() : super.c(str);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public final c d() {
        m2250(this);
        return (c) m2249(this);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public String e() {
        r rVarM2251 = m2251(this);
        return rVarM2251 != null ? C0005.m1592(rVarM2251) : C0007.m1840();
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public int h() {
        return 0;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    protected final r k(r rVar) {
        p pVar = (p) super.k(rVar);
        Object objM2249 = m2249(this);
        if (objM2249 instanceof c) {
            pVar.f = C0018.m3888((c) objM2249);
        }
        return pVar;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    protected final void l(String str) {
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public r m() {
        return this;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    protected final List<r> n() {
        return m2248();
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    protected final boolean p() {
        return m2249(this) instanceof c;
    }
}