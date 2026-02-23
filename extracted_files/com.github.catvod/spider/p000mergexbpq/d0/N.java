package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.c;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0015;

/* loaded from: classes.dex */
abstract class N extends O {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f219short = {2564, 2602, 2609, 2604, 2618, 2603, 2562};
    protected String b;
    protected String c;
    private String d;
    private String f;
    c j;
    private StringBuilder e = new StringBuilder();
    private boolean g = false;
    private boolean h = false;
    boolean i = false;

    N() {
    }

    private void p() {
        this.h = true;
        String strM2488 = m2488(this);
        if (strM2488 != null) {
            C0018.m3933(m2479(this), strM2488);
            this.f = null;
        }
    }

    /* renamed from: ۟ۢۨۧ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m2479(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((N) obj).e;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۥۣ, reason: not valid java name and contains not printable characters */
    public static N m2480(Object obj) {
        if (C0057.m9017() > 0) {
            return ((N) obj).v();
        }
        return null;
    }

    /* renamed from: ۟ۤۦۨۡ, reason: not valid java name and contains not printable characters */
    public static c m2481(Object obj) {
        if (C0059.m9257() < 0) {
            return ((N) obj).j;
        }
        return null;
    }

    /* renamed from: ۟ۤۨۡۢ, reason: not valid java name and contains not printable characters */
    public static void m2482(Object obj) {
        if (C0040.m6582() >= 0) {
            ((N) obj).u();
        }
    }

    /* renamed from: ۟ۥ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static void m2483(Object obj, Object obj2) {
        if (C0028.m5152() <= 0) {
            ((N) obj).o((String) obj2);
        }
    }

    /* renamed from: ۟ۥۥۡۢ, reason: not valid java name and contains not printable characters */
    public static String m2484(Object obj) {
        if (C0001.m1164() <= 0) {
            return ((N) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۦۣۤۧ, reason: not valid java name and contains not printable characters */
    public static void m2485(Object obj) {
        if (C0037.m6350() < 0) {
            ((N) obj).p();
        }
    }

    /* renamed from: ۟ۦۨ۟۠, reason: not valid java name and contains not printable characters */
    public static void m2486(Object obj) {
        if (C0060.m9355() >= 0) {
            O.h((StringBuilder) obj);
        }
    }

    /* renamed from: ۠۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static String m2487(Object obj) {
        if (C0007.m1886() >= 0) {
            return ((N) obj).b;
        }
        return null;
    }

    /* renamed from: ۢ۠, reason: not valid java name and contains not printable characters */
    public static String m2488(Object obj) {
        if (C0004.m1557() < 0) {
            return ((N) obj).f;
        }
        return null;
    }

    /* renamed from: ۢۡۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2489(Object obj) {
        if (C0004.m1557() < 0) {
            return ((N) obj).h;
        }
        return false;
    }

    /* renamed from: ۣ۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2490(Object obj) {
        if (C0026.m4977() < 0) {
            return ((N) obj).g;
        }
        return false;
    }

    /* renamed from: ۥۥۤ۟, reason: contains not printable characters */
    public static short[] m2491() {
        if (C0006.m1726() <= 0) {
            return f219short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.O
    /* bridge */ /* synthetic */ O g() {
        return m2480(this);
    }

    final void i(char c) {
        String strM8763 = C0055.m8763(c);
        String strM2484 = m2484(this);
        if (strM2484 != null) {
            strM8763 = C0050.m8125(strM2484, strM8763);
        }
        this.d = strM8763;
    }

    final void j(String str) {
        String strM8125 = str;
        String strM2484 = m2484(this);
        if (strM2484 != null) {
            strM8125 = C0050.m8125(strM2484, strM8125);
        }
        this.d = strM8125;
    }

    final void k(char c) {
        m2485(this);
        C0062.m9399(m2479(this), c);
    }

    final void l(String str) {
        m2485(this);
        if (C0006.m1693(m2479(this)) == 0) {
            this.f = str;
        } else {
            C0018.m3933(m2479(this), str);
        }
    }

    final void m(int[] iArr) {
        m2485(this);
        for (int i : iArr) {
            C0035.m6149(m2479(this), i);
        }
    }

    final void n(char c) {
        m2483(this, C0055.m8763(c));
    }

    final void o(String str) {
        String strM8125 = str;
        String strM2487 = m2487(this);
        if (strM2487 != null) {
            strM8125 = C0050.m8125(strM2487, strM8125);
        }
        this.b = strM8125;
        this.c = C0055.m8795(strM8125);
    }

    final void q() {
        if (m2484(this) != null) {
            m2482(this);
        }
    }

    final boolean r() {
        return m2481(this) != null;
    }

    final N s(String str) {
        this.b = str;
        this.c = C0055.m8795(str);
        return this;
    }

    final String t() {
        String strM2487 = m2487(this);
        C0012.m3033(strM2487 == null || C0004.m1584(strM2487) == 0);
        return m2487(this);
    }

    final void u() {
        if (m2481(this) == null) {
            this.j = new c();
        }
        String strM2484 = m2484(this);
        if (strM2484 != null) {
            String strM9640 = C0064.m9640(strM2484);
            this.d = strM9640;
            if (C0004.m1584(strM9640) > 0) {
                C0056.m8932(m2481(this), m2484(this), m2489(this) ? C0006.m1693(m2479(this)) > 0 ? C0047.m7763(m2479(this)) : m2488(this) : m2490(this) ? C0007.m1840() : null);
            }
        }
        this.d = null;
        this.g = false;
        this.h = false;
        m2486(m2479(this));
        this.f = null;
    }

    N v() {
        this.b = null;
        this.c = null;
        this.d = null;
        m2486(m2479(this));
        this.f = null;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = null;
        return this;
    }

    final void w() {
        this.g = true;
    }

    final String x() {
        String strM2487 = m2487(this);
        return strM2487 != null ? strM2487 : C0030.m5362(m2491(), 0, 7, 2655);
    }
}