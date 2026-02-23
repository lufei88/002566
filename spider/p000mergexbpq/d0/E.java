package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.c0.h;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import java.io.Reader;
import java.io.StringReader;

/* loaded from: classes.dex */
public final class E {
    private i1 a;
    private C b = new C();

    public E(i1 i1Var) {
        this.a = i1Var;
    }

    public static h c(String str) {
        O oM2436;
        C0069b c0069b = new C0069b();
        m2439(c0069b, new StringReader(str), new E(c0069b));
        Q qM2442 = m2442(c0069b);
        do {
            oM2436 = m2436(qM2442);
            m2433(c0069b, oM2436);
            m2438(oM2436);
        } while (m2434(oM2436) != 6);
        C0024.m4717(m2437(c0069b));
        c0069b.b = null;
        c0069b.c = null;
        c0069b.e = null;
        return m2441(c0069b);
    }

    /* renamed from: ۟۠۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static C m2432(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((E) obj).b;
        }
        return null;
    }

    /* renamed from: ۟۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2433(Object obj, Object obj2) {
        if (C0032.m5686() <= 0) {
            return ((C0069b) obj).c((O) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۢۥۣ۠, reason: not valid java name and contains not printable characters */
    public static int m2434(Object obj) {
        if (C0064.m9659() <= 0) {
            return ((O) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۢۦۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2435(Object obj, Object obj2) {
        if (C0064.m9659() < 0) {
            return ((i1) obj).b((String) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۤۡۡۨ, reason: not valid java name and contains not printable characters */
    public static O m2436(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((Q) obj).t();
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۧۥ, reason: not valid java name and contains not printable characters */
    public static C0067a m2437(Object obj) {
        if (C0003.m1463() < 0) {
            return ((i1) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static O m2438(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((O) obj).g();
        }
        return null;
    }

    /* renamed from: ۢۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m2439(Object obj, Object obj2, Object obj3) {
        if (C0029.m5282() >= 0) {
            ((C0069b) obj).C((Reader) obj2, (E) obj3);
        }
    }

    /* renamed from: ۥۡۤۧ, reason: contains not printable characters */
    public static i1 m2440(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((E) obj).a;
        }
        return null;
    }

    /* renamed from: ۧۢ۠۠, reason: not valid java name and contains not printable characters */
    public static h m2441(Object obj) {
        if (C0022.m4497() > 0) {
            return ((i1) obj).d;
        }
        return null;
    }

    /* renamed from: ۣۨۧۥ, reason: not valid java name and contains not printable characters */
    public static Q m2442(Object obj) {
        if (C0060.m9355() > 0) {
            return ((i1) obj).c;
        }
        return null;
    }

    public final C a() {
        return m2432(this);
    }

    public final boolean b(String str) {
        return m2435(m2440(this), str);
    }
}