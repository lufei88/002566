package com.github.catvod.spider.p000mergexbpq.Q;

import com.github.catvod.spider.merge-xbpq.S.f;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.P.C;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.S.j;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f150short = {727, 752, 744, 767, 754, 759, 762, 702, 749, 746, 767, 746, 763, 702, 752, 747, 755, 764, 763, 748, 688};
    public final List<m> a = new ArrayList();
    public final List<v> b = new ArrayList();
    public d0[] c;
    public e0[] d;
    public final int e;
    public final int f;
    public int[] g;
    public C[] h;
    public final List<r0> i;

    public a(int i, int i2) {
        new LinkedHashMap();
        this.i = new ArrayList();
        this.e = i;
        this.f = i2;
    }

    /* renamed from: ۟۟ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static a m975(Object obj) {
        if (C0053.m8389() > 0) {
            return ((m) obj).a;
        }
        return null;
    }

    /* renamed from: ۟۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static j m976(Object obj, Object obj2) {
        if (C0040.m6582() >= 0) {
            return ((j) obj).c((f) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥۤۥۧ, reason: not valid java name and contains not printable characters */
    public static X m977(Object obj, Object obj2) {
        if (C0009.m2047() >= 0) {
            return X.a((a) obj, (C) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧۦۨۢ, reason: not valid java name and contains not printable characters */
    public static j m978(Object obj) {
        if (C0005.m1599() < 0) {
            return ((m) obj).f;
        }
        return null;
    }

    /* renamed from: ۡۤۢۥ, reason: not valid java name and contains not printable characters */
    public static t0 m979(Object obj, int i) {
        if (C0015.m3433() > 0) {
            return ((m) obj).d(i);
        }
        return null;
    }

    /* renamed from: ۣۢۦ۠, reason: not valid java name and contains not printable characters */
    public static void m980(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0010.m2320() <= 0) {
            ((y) obj).a((m) obj2, (X) obj3, (j) obj4, (Set) obj5, (BitSet) obj6);
        }
    }

    /* renamed from: ۢۥۡۢ, reason: not valid java name and contains not printable characters */
    public static m m981(Object obj) {
        if (C0028.m5152() <= 0) {
            return ((f0) obj).c;
        }
        return null;
    }

    /* renamed from: ۦۣۣ۟, reason: contains not printable characters */
    public static short[] m982() {
        if (C0063.m9589() < 0) {
            return f150short;
        }
        return null;
    }

    /* renamed from: ۦۧۤۢ, reason: contains not printable characters */
    public static j m983(Object obj, Object obj2, Object obj3) {
        if (C0052.m8320() >= 0) {
            return ((a) obj).f((m) obj2, (C) obj3);
        }
        return null;
    }

    /* renamed from: ۧ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static j m984(Object obj, Object obj2) {
        if (C0047.m7837() > 0) {
            return ((a) obj).e((m) obj2);
        }
        return null;
    }

    public final void a(m mVar) {
        if (mVar != null) {
            mVar.a = this;
            mVar.b = C0009.m2139(C0006.m1708(this));
        }
        C0004.m1532(C0006.m1708(this), mVar);
    }

    public final v b(int i) {
        if (C0007.m1817(C0024.m4644(this))) {
            return null;
        }
        return (v) C0028.m5167(C0024.m4644(this), i);
    }

    public final j c(int i, C c) {
        if (i < 0 || i >= C0009.m2139(C0006.m1708(this))) {
            throw new IllegalArgumentException(C0011.m2805(m982(), 0, 21, 670));
        }
        j jVarM984 = m984(this, (m) C0028.m5167(C0006.m1708(this), i));
        if (!C0020.m4222(jVarM984, -2)) {
            return jVarM984;
        }
        j jVar = new j(new int[0]);
        m976(jVar, jVarM984);
        C0044.m7495(jVar);
        for (C cM8410 = c; cM8410 != null && C0029.m5298(cM8410) >= 0 && C0020.m4222(jVarM984, -2); cM8410 = C0053.m8410(cM8410)) {
            jVarM984 = m984(this, m981(m979((m) C0028.m5167(C0006.m1708(this), C0029.m5298(cM8410)), 0)));
            m976(jVar, jVarM984);
            C0044.m7495(jVar);
        }
        if (C0020.m4222(jVarM984, -2)) {
            C0021.m4321(jVar, -1);
        }
        return jVar;
    }

    public final int d() {
        return C0009.m2139(C0024.m4644(this));
    }

    public final j e(m mVar) {
        j jVarM978 = m978(mVar);
        if (jVarM978 != null) {
            return jVarM978;
        }
        j jVarM983 = m983(this, mVar, null);
        mVar.f = jVarM983;
        C0035.m6156(jVarM983);
        return m978(mVar);
    }

    public final j f(m mVar, C c) {
        y yVar = new y(this);
        j jVar = new j(new int[0]);
        m980(yVar, mVar, c != null ? m977(m975(mVar), c) : null, jVar, new HashSet(), new BitSet());
        return jVar;
    }
}