package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0166x;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f395short = {336, 297, 291, 298, 338, 2788, 2731, 2720, 2729, 2726, 2726, 2733, 2724, 2805, 1702, 1763, 1745, 2949, 1225, 1255, 795, 2125, 2149, 808, 890, 891, 820, 864, 881, 876, 864, 810, 2886, 2909, 1876, 2072, 664, 642, 447, 436, 420, 1597, 1176};
    public final int a;
    public int b;
    public int c;
    public final int d;
    public final com.github.catvod.spider.merge.H0.h e;
    public String f;
    public int g = -1;
    public final int h;
    public final int i;

    public d(com.github.catvod.spider.merge.H0.h hVar, int i, int i2, int i3, int i4) {
        this.c = -1;
        this.e = hVar;
        this.a = i;
        this.d = i2;
        this.h = i3;
        this.i = i4;
        Object objM1698 = C0006.m1698(hVar);
        if (objM1698 != null) {
            this.b = C0007.m1835((C0166x) C0039.m6519((k) ((t) objM1698)));
            this.c = C0022.m4431((C0166x) C0039.m6519((k) ((t) objM1698)));
        }
    }

    /* renamed from: ۣ۟ۢۧۦ, reason: not valid java name and contains not printable characters */
    public static short[] m3780() {
        if (C0063.m9589() < 0) {
            return f395short;
        }
        return null;
    }

    public final String a() {
        int iM6641;
        String strM6226 = C0036.m6226(this);
        if (strM6226 != null) {
            return strM6226;
        }
        c cVar = (c) C0013.m3170(C0054.m8633(this));
        if (cVar == null) {
            return null;
        }
        int iM6461 = C0038.m6461(this);
        int iM5001 = C0027.m5001(cVar);
        return (iM6461 >= iM5001 || (iM6641 = C0040.m6641(this)) >= iM5001) ? C0030.m5362(m3780(), 0, 5, 364) : C0051.m8179(cVar, C0059.m9209(iM6461, iM6641));
    }

    public final String toString() {
        int iM8403 = C0053.m8403(this);
        String strM6632 = iM8403 > 0 ? C0040.m6632(iM8403, C0037.m6307(m3780(), 5, 9, 2760)) : C0007.m1840();
        String strM4730 = C0024.m4730(this);
        String strM3446 = strM4730 != null ? C0015.m3446(C0015.m3446(C0015.m3446(strM4730, C0032.m5708(m3780(), 14, 1, 1708), C0063.m9585(m3780(), 15, 2, 1727)), C0047.m7833(m3780(), 17, 1, 2952), C0022.m4403(m3780(), 18, 2, 1173)), C0009.m2037(m3780(), 20, 1, 786), C0060.m9352(m3780(), 21, 2, 2065)) : C0037.m6307(m3780(), 23, 9, 788);
        String strM8599 = C0054.m8599(C0022.m4461(this));
        StringBuilder sb = new StringBuilder(C0019.m4107(m3780(), 32, 2, 2845));
        C0036.m6177(sb, C0031.m5657(this));
        String strM4951 = C0026.m4951(m3780(), 34, 1, 1912);
        C0018.m3933(sb, strM4951);
        C0036.m6177(sb, C0038.m6461(this));
        String strM9106 = C0058.m9106(m3780(), 35, 1, 2082);
        C0018.m3933(sb, strM9106);
        C0036.m6177(sb, C0040.m6641(this));
        C0018.m3933(sb, C0057.m8978(m3780(), 36, 2, 677));
        C0018.m3933(sb, strM3446);
        C0018.m3933(sb, C0026.m4951(m3780(), 38, 3, 408));
        C0011.m2747(sb, strM8599, C0048.m7902(m3780(), 41, 1, 1539), strM6632, strM4951);
        C0036.m6177(sb, C0014.m3286(this));
        C0018.m3933(sb, strM9106);
        C0036.m6177(sb, C0031.m5666(this));
        C0018.m3933(sb, C0047.m7833(m3780(), 42, 1, 1221));
        return C0047.m7763(sb);
    }
}